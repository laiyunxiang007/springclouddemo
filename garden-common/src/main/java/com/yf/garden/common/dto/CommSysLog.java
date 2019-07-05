package com.yf.garden.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
/**
 * 操作日志实体
 * @author 张继生
 */
public class CommSysLog implements Serializable {
    private Long logId;

    private String sysCode;

    private String operModule;

    private String operType;

    private String operModuleCode;

    private String operDataPid;

    private Long userId;

    private String userAcct;

    private String userName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date operDate;

    private String operInfo;

    private String operUrl;

    private String operResult;

    private String loginIp;

    private static final long serialVersionUID = 1L;

    public CommSysLog() {
    }

    public CommSysLog(String sysCode, String operModule, String operType, String operModuleCode, String operDataPid, Long userId, String userAcct, String userName, String operInfo, String operResult) {
        this.sysCode = sysCode;
        this.operModule = operModule;
        this.operType = operType;
        this.operModuleCode = operModuleCode;
        this.operDataPid = operDataPid;
        this.userId = userId;
        this.userAcct = userAcct;
        this.userName = userName;
        this.operInfo = operInfo;
        this.operResult = operResult;
    }

    /*public CommSysLog(String operModule, String operType, String operModuleCode, String operDataPid, String operInfo) {
        this.operModule = operModule;
        this.operType = operType;
        this.operModuleCode = operModuleCode;
        this.operDataPid = operDataPid;
        this.operInfo = operInfo;
    }*/

    public CommSysLog(String sysCode, Long userId, String userAcct, String userName, String operUrl, String loginIp) {
        this.sysCode = sysCode;
        this.userId = userId;
        this.userAcct = userAcct;
        this.userName = userName;
        this.operUrl = operUrl;
        this.loginIp = loginIp;
    }

    public CommSysLog(String operModuleCode, String operType, String operDataPid, String operInfo) {
        this.operModuleCode = operModuleCode;
        this.operType = operType;
        this.operDataPid = operDataPid;
        this.operInfo = operInfo;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getOperModule() {
        return operModule;
    }

    public void setOperModule(String operModule) {
        this.operModule = operModule;
    }

    public String getOperType() {
        return operType;
    }

    public String getOperModuleCode() {
        return operModuleCode;
    }

    public void setOperModuleCode(String operModuleCode) {
        this.operModuleCode = operModuleCode;
    }

    public String getOperDataPid() {
        return operDataPid;
    }

    public void setOperDataPid(String operDataPid) {
        this.operDataPid = operDataPid;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public String getOperInfo() {
        return operInfo;
    }

    public void setOperInfo(String operInfo) {
        this.operInfo = operInfo;
    }

    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    public String getOperResult() {
        return operResult;
    }

    public void setOperResult(String operResult) {
        this.operResult = operResult;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommSysLog other = (CommSysLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
                && (this.getSysCode() == null ? other.getSysCode() == null : this.getSysCode().equals(other.getSysCode()))
                && (this.getOperModule() == null ? other.getOperModule() == null : this.getOperModule().equals(other.getOperModule()))
                && (this.getOperType() == null ? other.getOperType() == null : this.getOperType().equals(other.getOperType()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserAcct() == null ? other.getUserAcct() == null : this.getUserAcct().equals(other.getUserAcct()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getOperDate() == null ? other.getOperDate() == null : this.getOperDate().equals(other.getOperDate()))
                && (this.getOperInfo() == null ? other.getOperInfo() == null : this.getOperInfo().equals(other.getOperInfo()))
                && (this.getOperUrl() == null ? other.getOperUrl() == null : this.getOperUrl().equals(other.getOperUrl()))
                && (this.getOperResult() == null ? other.getOperResult() == null : this.getOperResult().equals(other.getOperResult()))
                && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getSysCode() == null) ? 0 : getSysCode().hashCode());
        result = prime * result + ((getOperModule() == null) ? 0 : getOperModule().hashCode());
        result = prime * result + ((getOperType() == null) ? 0 : getOperType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserAcct() == null) ? 0 : getUserAcct().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOperDate() == null) ? 0 : getOperDate().hashCode());
        result = prime * result + ((getOperInfo() == null) ? 0 : getOperInfo().hashCode());
        result = prime * result + ((getOperUrl() == null) ? 0 : getOperUrl().hashCode());
        result = prime * result + ((getOperResult() == null) ? 0 : getOperResult().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", operModule=").append(operModule);
        sb.append(", operType=").append(operType);
        sb.append(", userId=").append(userId);
        sb.append(", userAcct=").append(userAcct);
        sb.append(", userName=").append(userName);
        sb.append(", operDate=").append(operDate);
        sb.append(", operInfo=").append(operInfo);
        sb.append(", operUrl=").append(operUrl);
        sb.append(", operResult=").append(operResult);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}