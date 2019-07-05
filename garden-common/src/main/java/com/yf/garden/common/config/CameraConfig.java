package com.yf.garden.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 张继生
 * @date 2019/4/30 10:34
 */
public class CameraConfig {
    private static Logger logger = LoggerFactory.getLogger(CameraConfig.class);
    private static String appKey;
    private static String appSecret;
    private static String defaultVerifyCode;
    static {
        try {
            Properties properties = new Properties();
            properties.load(CameraConfig.class.getResourceAsStream("/camera.properties"));
            appKey = properties.getProperty("app.key");
            appSecret = properties.getProperty("app.secret");
            logger.info("fm配置信息 appKey={}, appSecret={}", appKey, appSecret);
        } catch (IOException e) {
            logger.error("init fm config exception", e);
        }
    }
    public static String getAppKey() {
        return appKey;
    }
    public static String getAppSecret() {
        return appSecret;
    }
    public static String getDefaultVerifyCode() {
        return defaultVerifyCode;
    }
}
