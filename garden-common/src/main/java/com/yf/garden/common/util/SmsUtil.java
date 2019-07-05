package com.yf.garden.common.util;

import com.alibaba.fastjson.JSONObject;
import com.yf.garden.common.error.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

/**
 * @author 张继生
 * @date 2019/4/25 14:10
 */
public class SmsUtil {
    private static Logger logger = LoggerFactory.getLogger(SmsUtil.class);
    private static String url;
    private static String appCode;
    static {
        Properties properties = new Properties();
        try {
            properties.load(SmsUtil.class.getResourceAsStream("/sms.properties"));
            url = properties.getProperty("send.url") + properties.getProperty("send.path");
            appCode = properties.getProperty("app.code");
            logger.info("url={} appcode{}", url, appCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发短信验证码
     * @param mobile 手机号
     * @param content 内容
     * @param type 类型
     * 1.登陆 ，（是，提示（没用当前用户））
     * 2.找回密码 没用当前用户
     * 3.更换手机号 没用当前用户
     * 4.加入我们 此用户已存在用户 我这边需要的就一个通用的模板
     * 5.加入我们成功后把账号和密码发给用户
     * 6.审核通过
     * 7.审核驳回 这几个功能是单独的模板
     * @throws IOException
     * @throws ServiceException
     */
    public static String sendSms(String mobile, String content, int type) throws IOException, ServiceException {
        String skin = null;
        /*switch (type) {
            case 0:
                skin = "34782";
                break;
            case 1:
            case 3:
                skin = "900123";
                break;
            case 2:
                skin = "71372";
                break;
            case 4:
                skin = "71363";
                break;
            case 5:
                skin = "71768";
                break;
            default:
                skin = "900458";
        }*/

        switch (type) {
            case 5:
                skin = "71768";
                break;
            case 6:
                skin = "71336";
                break;
            case 7:
                skin = "71345";
                break;
            case 8:
                skin = "80453";
                break;
            case 9:
                skin = "80444";
                break;
            case 10:
                skin = "80435";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                skin = "900458";
        }

        String urlSend = url + "?param="+content+"&phone=" + mobile + "&sign=45711&skin="+skin;   //【6】拼接请求链接
        URL url = new URL(urlSend);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("Authorization", "APPCODE " + appCode);//格式Authorization:APPCODE (中间是英文空格)
        int httpCode = httpURLConnection.getResponseCode();
        String json = read(httpURLConnection.getInputStream());
        logger.debug("/* 获取服务器响应状态码 200 正常；400 权限错误 ； 403 次数用完； */ ");
        logger.info(httpCode + "");
        String code = JSONObject.parseObject(json).getString("Code");
        logger.debug("/* 获取返回的json   */ ");
        logger.info(json);
        return code;
    }

    /*
     *  读取返回结果
     */
    public static String read(InputStream is) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null) {
            line = new String(line.getBytes(), "utf-8");
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}