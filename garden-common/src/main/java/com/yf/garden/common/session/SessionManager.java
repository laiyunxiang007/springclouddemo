package com.yf.garden.common.session;
/**
 * 会话管理器
 * @author 张继生
 */
public class SessionManager {

    /**
     * 操作session
     */
    private static ThreadLocal<UserSession> userSession = new ThreadLocal<UserSession>();

    /**
     * 设置session
     */
    public static void setUserSession(UserSession userSession) {
        SessionManager.userSession.set(userSession);
    }

    /**
     * 获取session
     */
    public static UserSession getUserSession() {
        return userSession.get();
    }
}
