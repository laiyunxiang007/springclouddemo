package com.yf.garden.common.intercept;

import com.yf.garden.common.constant.Constants;
import com.yf.garden.common.error.BaseErrorType;
import com.yf.garden.common.error.ServiceException;
import com.yf.garden.common.session.SessionManager;
import com.yf.garden.common.session.UserSession;
import com.yf.garden.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

/**
 * 登录拦截器
 *
 * @author 张继生
 * @date 2019/4/17 8:30
 */
public class ApiInterceptor implements HandlerInterceptor {
    private static Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);
    private static final String authType = "YF_AUTH";
    @Value("${session.timeout}")
    private long timeOut;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

	/*@PostConstruct
	public void init(){
		if(AuthUtil.validAuthCode()){
			logger.info("认证通过");
		} else {
			logger.error("认证失败，服务退出。。。");
			System.exit(-1);
		}
	}*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        String authorization = request.getHeader("Authorization");
        logger.debug("authorization:" + authorization);
        if (StringUtil.isEmpty(authorization)) {

            throw new ServiceException(BaseErrorType.SYSTEM_AUTH_HEADER_ERROR);
        }
        String token = authorization.substring(authorization.lastIndexOf("=") + 1);
        logger.debug("token:" + token);
        if (StringUtil.isEmpty(token)) {
            throw new ServiceException(BaseErrorType.SYSTEM_AUTH_PARAM_MISS);
        }

        UserSession userSession = (UserSession) redisTemplate.opsForValue().get(Constants.SESSION_KEY + token);

        if (userSession == null) {
            throw new ServiceException(BaseErrorType.SYSTEM_UNLOGIN_ERROR);
        }

        //认证成功后，刷新用户缓存时间
        //失效时间
        redisTemplate.expire(Constants.SESSION_KEY + token, timeOut, TimeUnit.DAYS);

        //认证成功，将信息存储到UserSession中,方便后台直接获取
        SessionManager.setUserSession(userSession);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
    }

    /*public static Map<String, String> parserHeader(String authorization) {
        Map<String, String> headerMap = new HashMap<String, String>();
        String[] auths = authorization.split("\\s");
        if (auths.length < 2) {
            throw new RuntimeException("Authorization格式不对，格式为YF_AUTH auth_key=9a17f0248f15d466a75c09d4d9cf28e9");
        }
        headerMap.put("authType", auths[0]);
        String[] headerList = auths[1].split(";");//将所有;符号截取出来变成一个数组
        String header = null;//获取每个&之内的内容
        String[] headerItem = null;//获取每个=号的内容
        for (int i = 0; i < headerList.length; i++) {
            header = headerList[i];//获取每个;的内容
            headerItem = header.split("=");//拆分=号
            headerMap.put(headerItem[0], headerItem[1]);
            //key = headerItem[0];//=号前面的值
            // value = headerItem[1];//=号后面的值
        }
        return headerMap;
    }*/

}
