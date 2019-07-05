package com.yf.garden.common.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yf.garden.common.dto.InterfaceCallLog;
import com.yf.garden.common.error.ServiceException;
import com.yf.garden.common.session.SessionManager;
import com.yf.garden.common.util.JacksonUtil;
import com.yf.garden.common.util.StringUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
/**
 * 接口调用日志切面
 * @author 张继生
 * @date 2019/4/18 8:26
 */
@Aspect
@Component
public class InterfaceCallLogAspect {

    private final static Logger logger= LoggerFactory.getLogger(InterfaceCallLogAspect.class);

    private static long startTime;
    private static long endTime;

    private InterfaceCallLog interfaceCallLog;

    @Autowired
    private HttpServletRequest request;

    /**
     * 切点
     */
    @Pointcut("execution(* com.yf.garden..controller..*.*(..))")
    private void log(){//声明com一个切入点

    }

    /**
     * 前置通知，在代理对象调用目标对象方法之前调用该方法，括号中的字符串为切入点
     */
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) throws Exception {
        interfaceCallLog = new InterfaceCallLog();
        //获取日志记录的一些参数
        //method
        String method = request.getMethod();
        //接口地址
        String address = request.getRequestURI();
        //接口类型
        String interfaceType = address.split("/")[2];
        //用户
        String userAcct = SessionManager.getUserSession() != null ? SessionManager.getUserSession().getUser().getAccount() : null;
        //系统编码
        String authorization = request.getHeader("Authorization");
        Map<String, String> headerMap;
        String sysCode = null;
        if(!StringUtil.isEmpty(authorization) && (address.contains("/api/") || address.contains("/sysapi/"))){
            /*headerMap = parserHeader(authorization);
            if("api".equals(interfaceType)){
                sysCode = headerMap.get("from");
            }else {
                sysCode = headerMap.get("sys_id");
            }*/
        }

        //ip
        String ip = getRealIP(request);
        //请求参数
        //Object[] args = joinPoint.getArgs();
        Map<String, String[]> parameterMap = request.getParameterMap();
        ObjectMapper om = new ObjectMapper();
        String reqParam = om.writeValueAsString(parameterMap);
        //接口调用开始时间
        startTime = System.currentTimeMillis();

        interfaceCallLog.setMethod(method);
        interfaceCallLog.setPath(address);
        interfaceCallLog.setType(interfaceType);
        interfaceCallLog.setUserAcct(userAcct);
        interfaceCallLog.setSysCode(sysCode);
        interfaceCallLog.setIp(ip);
        interfaceCallLog.setReqParam(reqParam);
        logger.info(om.writeValueAsString(interfaceCallLog));
    }

    /**
     * 后置通知，在代理对象调用目标对象方法之后调用该方法，括号中的字符串为切入点,
     * 如果想要获得返回的结果，这个时候就要采用下面的形式：@AfterReturning(pointcut="log()",returning="object"),后置通知方法中的参数表示的是返回参数，
     * 如果发生异常，后置通知就不会被调用。
     */
    @AfterReturning(pointcut="log()",returning="object")
    public void doAfterReturning(Object object) throws Exception {
        ObjectMapper om = new ObjectMapper();
        Map<?, ?> map = null;
        String resp = "";
        //返回数据
        if(object instanceof String){
            map = JacksonUtil.json2Map((String)object);
            resp = (String)object;
        } else if (object instanceof Boolean) {
            resp = "请求成功";
        } else if (object instanceof Integer) {
            if (Integer.parseInt(String.valueOf(object)) == 200) {
                resp = "请求成功";
            }
        } else {
            map = om.convertValue(object, Map.class); //将接口返回的ResultEntity对象转化为Map
            resp = om.writeValueAsString(object);
        }

        //String s = map.get("data") != null ? map.get("data").toString() : "";
        String respData = resp.length() > 200 ? resp.substring(0,200) : resp;

        //接口调用结果
        String result = "失败";
        if (map == null || "200".equals(String.valueOf(map.get("status")))) {
            result = "成功";
        }
        /*if("200".equals(String.valueOf(map.get("status"))) || ( "1".equals(String.valueOf(map.get("status"))) )){
            if((map != null && "0".equals(String.valueOf(map.get("code")))) || (map != null && ( "1".equals(String.valueOf(map.get("status")))))){
                result = "成功";
            }
        }*/

        //接口调用结束时间
        endTime = System.currentTimeMillis();

        interfaceCallLog.setResult(result);
        interfaceCallLog.setSpendTime(endTime-startTime);
        interfaceCallLog.setRespData(respData);

        //记录日志
        logger.info(om.writeValueAsString(interfaceCallLog));
    }

    /**
     * 例外通知，catch块中的代码，出现异常时执行，括号中的字符串为切入点，
     * 如果想要将捕获到的异常输出，可以这么做：@AfterThrowing(pointcut="anyMethod()",throwing="e"),例外通知方法中参数为捕获到的异常,
     * 只有在有异常的时候，例外通知才会被调用。
     */
    @AfterThrowing(pointcut="log()",throwing="e")
    public void doAfterThrowing(Exception e) throws Exception {//例外通知
        endTime = System.currentTimeMillis();
        String respData = null;

        if(e instanceof ServiceException){
            String errorTypeStr = ((ServiceException) e).getErrorType().toString();
            respData = errorTypeStr.length() > 200 ? errorTypeStr.substring(0,200) : errorTypeStr;
        }else if(e.getMessage() != null){
            respData= e.getMessage().length() > 200 ? e.getMessage().substring(0,200) : e.getMessage();
        }
        interfaceCallLog.setSpendTime(endTime-startTime);
        interfaceCallLog.setResult("失败");
        interfaceCallLog.setRespData(respData);

        //记录日志
        ObjectMapper om = new ObjectMapper();
        logger.info(om.writeValueAsString(interfaceCallLog));
    }

    public static Map<String,String> parserHeader(String authorization){
        Map<String,String> headerMap = new HashMap<String,String>();
        String[] auths = authorization.split("\\s");
        headerMap.put("authType", auths[0]);
        //将所有;符号截取出来变成一个数组
        String [] headerList = auths[1].split(";");
        String header = null;//获取每个&之内的内容
        String [] headerItem = null;//获取每个=号的内容
        for (int i = 0; i < headerList.length; i++) {
            header = headerList[i];//获取每个;的内容
            headerItem = header.split("=");//拆分=号
            headerMap.put(headerItem[0], headerItem[1]);
        }
        return headerMap;
    }

    /**
     * 获得当前系统ip
     * @param request
     * @return 当前系统ip
     */
    public static String getRealIP(HttpServletRequest request){
        String ipStr = request.getHeader("x-forwarded-for");
        if(ipStr == null || ipStr.length() == 0 || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("Proxy-Client-IP");
        }
        if(ipStr == null || ipStr.length() == 0 || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ipStr == null || ipStr.length() == 0 || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getRemoteAddr();
        }
        return ipStr;
    }
}
