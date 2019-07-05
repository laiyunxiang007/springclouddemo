package com.yf.garden.common.dto;

import com.yf.garden.common.constant.Constants;
import com.yf.garden.common.error.BaseErrorType;
/**
 * 统一返回结果外层封装
 * @author 张继生
 */
public class ResponseResult<T> {
    private String status;
    private String msg;
    private T data;

    public ResponseResult() {
        this.status = Constants.SUCCESS_CODE;
        this.msg = "请求成功";
    }
    public ResponseResult(String msg) {
        this.status = Constants.SUCCESS_CODE;
        this.msg = msg;
    }
    public ResponseResult(T data) {
        this();
        this.data = data;
    }

    public ResponseResult(BaseErrorType errorType) {
        this.status = errorType.getCode();
        this.msg = errorType.getMsg();
    }

    public ResponseResult(BaseErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }
    public ResponseResult(String msg, T data) {
        super();
        this.status = Constants.SUCCESS_CODE;
        this.msg = msg;
        this.data = data;
    }
    public ResponseResult(String status, String msg, T data) {
        super();
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
