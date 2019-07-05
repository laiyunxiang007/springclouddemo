package com.yf.garden.common.config;

import com.yf.garden.common.dto.ResponseResult;
import com.yf.garden.common.error.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器
 * @author 张继生
 * @date 2019/4/19 8:24
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult exceptionHandler(Exception e, HttpServletResponse response) {
        ResponseResult resp = new ResponseResult();
        if (e instanceof ServiceException) {
            ServiceException serviceException = (ServiceException)e;
            resp.setStatus(serviceException.getErrorType().getCode());
            resp.setMsg(serviceException.getErrorType().getMsg());
        } else {
            resp.setStatus("500");
            resp.setMsg("发生未知异常，请联系管理员");
            logger.error(e.getMessage(), e);
        }
        return resp;
    }
}
