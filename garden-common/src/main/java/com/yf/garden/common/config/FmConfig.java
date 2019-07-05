package com.yf.garden.common.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 张继生
 * @date 2019/4/30 10:34
 */
public class FmConfig {
    private static Logger logger = LoggerFactory.getLogger(FmConfig.class);
    private static String url;
    private static String clientId;
    private static String secret;
    private static String account;
    private static String password;
    static {
        try {
            Properties properties = new Properties();
            properties.load(FmConfig.class.getResourceAsStream("/fm.properties"));
            url = properties.getProperty("url");
            clientId = properties.getProperty("client.id");
            secret = properties.getProperty("secret");
            account = properties.getProperty("account");
            password = properties.getProperty("password");
            logger.info("fm配置信息 url={}, clientId={}, secret={}, account={}, password={}", url, clientId, secret, account, password);
        } catch (IOException e) {
            logger.error("init fm config exception", e);
        }
    }
    public static String getUrl() {
        return url;
    }
    public static String getClientId() {
        return clientId;
    }
    public static String getSecret() {
        return secret;
    }
    public static String getAccount() {
        return account;
    }
    public static String getPassword() {
        return password;
    }
}
