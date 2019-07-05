package com.yf.garden.common.dto;

import java.io.Serializable;
/**
 * 接口调用日志实体
 * @author 张继生
 */
public class InterfaceCallLog implements Serializable {

	private static final long serialVersionUID = 1L;

	//接口类型
    private String type;

    //method
    private String method;

    //接口地址
    private String path;

    //用户
    private String userAcct;

    //系统编码
    private String sysCode;

    //ip
    private String ip;

    //请求参数
    private String reqParam;

    //返回数据
    private String respData;

    //接口调用耗时(毫秒)
    private Long spendTime;

    //接口调用结果
    private String result;

    public InterfaceCallLog() {
    }

    public InterfaceCallLog(String type, String method, String path, String userAcct, String sysCode, String ip, String reqParam, String respData, Long spendTime, String result) {
        this.type = type;
        this.method = method;
        this.path = path;
        this.userAcct = userAcct;
        this.sysCode = sysCode;
        this.ip = ip;
        this.reqParam = reqParam;
        this.respData = respData;
        this.spendTime = spendTime;
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReqParam() {
        return reqParam;
    }

    public void setReqParam(String reqParam) {
        this.reqParam = reqParam;
    }

    public String getRespData() {
        return respData;
    }

    public void setRespData(String respData) {
        this.respData = respData;
    }

    public Long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Long spendTime) {
        this.spendTime = spendTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
