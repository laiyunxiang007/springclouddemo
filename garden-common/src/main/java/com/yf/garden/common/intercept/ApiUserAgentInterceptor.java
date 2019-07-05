package com.yf.garden.common.intercept;

import com.yf.garden.common.error.BaseErrorType;
import com.yf.garden.common.session.SessionManager;
import com.yf.garden.common.util.StringUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 模块间调用拦截器
 *
 * @author 张继生
 */
@Component("apiUserAgentInterceptor")
public class ApiUserAgentInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        HttpHeaders headers = request.getHeaders();
        if (SessionManager.getUserSession() == null) {
            throw new UserNotLoginException(BaseErrorType.SYSTEM_UNLOGIN_ERROR);
        }
        String authKey = SessionManager.getUserSession().getUser().getAuthKey();
        String sysId = "100";
        headers.add(HttpHeaders.AUTHORIZATION, ApiUserAgentInterceptor.getAuthHeader(authKey, sysId));
        return execution.execute(request, body);
    }

    public static String getAuthHeader(String authKey, String sysId) {
        StringBuffer authHeadBuffer = new StringBuffer();
        authHeadBuffer.append("YF_AUTH ");
        authHeadBuffer.append("auth_key=").append(authKey).append(";from=").append(sysId);
        return authHeadBuffer.toString();
    }

    /**
     * 内部类：自定义异常，用户未登录异常（为了解决该拦截器userSession空指针问题）
     */
    @SuppressWarnings("serial")
    class UserNotLoginException extends IOException {
        private BaseErrorType errorType;

        public BaseErrorType getErrorType() {
            return errorType;
        }

        /**
         * 自定义异常传枚举
         *
         * @param errorType
         */
        public UserNotLoginException(BaseErrorType errorType) {
            super(errorType.getMsg());
            this.errorType = errorType;
        }

        /**
         * 自定义异常传枚举及错误信息
         *
         * @param errorType
         * @param message
         */
        public UserNotLoginException(BaseErrorType errorType, String message) {
            super(errorType.getMsg());
            if (!StringUtil.isEmpty(message)) {
                errorType.setMsg(errorType.getMsg() + ":" + message);
            }
            this.errorType = errorType;
        }
    }
}
