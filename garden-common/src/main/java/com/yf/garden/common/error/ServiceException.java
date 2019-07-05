package com.yf.garden.common.error;

import com.yf.garden.common.util.StringUtil;
/**
 * 自定义业务异常
 * @author 张继生
 *
 */
public class ServiceException extends Exception{

	private static final long serialVersionUID = 1L;

	public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
        this.errorType =new BaseErrorType("999999", message, message);

    }

    private BaseErrorType errorType;

    /**
     * 自定义异常传枚举
     * @param errorType
     */
    public ServiceException(BaseErrorType errorType) {
        super(errorType.getMsg());
        this.errorType = errorType;
    }

    /**
     * 自定义异常传枚举及错误信息
     * @param errorType
     * @param message
     */
    public ServiceException(BaseErrorType errorType, String message) {
    	errorType.setAddMsg("");
        if (!StringUtil.isEmpty(message)) {
            errorType.setAddMsg(message);
        }
        this.errorType = errorType;
    }

    public BaseErrorType getErrorType() {
        return errorType;
    }
}
