package com.yf.garden.common.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * orchard_address
 * @author 
 */
public class OrchardAddress implements Serializable {
    /**
     * 地址主键
     */
    private Long addressId;

    /**
     * 地址省
     */
    private String addressProv;

    /**
     * 地址市
     */
    private String addressCity;

    /**
     * 地址县
     */
    private String addressCounty;

    /**
     * 地址镇
     */
    private String addressTown;

    /**
     * 村
     */
    private String addressVillage;

    /**
     * 地址详细
     */
    private String addressInfo;

    /**
     * 地址经度
     */
    private BigDecimal addressGislong;

    /**
     * 地址纬度
     */
    private BigDecimal addressGislatd;

    /**
     * 状态
     */
    private String addressStatus;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime = new Date();

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime = createTime;

    /**
     * 地址类型（A:用户，B、茶园，C：山场，D：摄像头，E：fm1，F:fm2，G:EM1）
     */
    private String addressType;

    private static final long serialVersionUID = 1L;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressProv() {
        return addressProv;
    }

    public void setAddressProv(String addressProv) {
        this.addressProv = addressProv;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public String getAddressVillage() {
        return addressVillage;
    }

    public void setAddressVillage(String addressVillage) {
        this.addressVillage = addressVillage;
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public BigDecimal getAddressGislong() {
        return addressGislong;
    }

    public void setAddressGislong(BigDecimal addressGislong) {
        this.addressGislong = addressGislong;
    }

    public BigDecimal getAddressGislatd() {
        return addressGislatd;
    }

    public void setAddressGislatd(BigDecimal addressGislatd) {
        this.addressGislatd = addressGislatd;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
}