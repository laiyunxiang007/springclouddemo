package com.example.provider.pojo;

import java.io.Serializable;
import java.util.Date;

public class Garden implements Serializable {
    private Integer gardenId;

    private String gardenName;

    private String gardenDesc;

    private String gardenOwner;

    private String addressId;

    private String gardenStatus;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getGardenId() {
        return gardenId;
    }

    public void setGardenId(Integer gardenId) {
        this.gardenId = gardenId;
    }

    public String getGardenName() {
        return gardenName;
    }

    public void setGardenName(String gardenName) {
        this.gardenName = gardenName == null ? null : gardenName.trim();
    }

    public String getGardenDesc() {
        return gardenDesc;
    }

    public void setGardenDesc(String gardenDesc) {
        this.gardenDesc = gardenDesc == null ? null : gardenDesc.trim();
    }

    public String getGardenOwner() {
        return gardenOwner;
    }

    public void setGardenOwner(String gardenOwner) {
        this.gardenOwner = gardenOwner == null ? null : gardenOwner.trim();
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    public String getGardenStatus() {
        return gardenStatus;
    }

    public void setGardenStatus(String gardenStatus) {
        this.gardenStatus = gardenStatus == null ? null : gardenStatus.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gardenId=").append(gardenId);
        sb.append(", gardenName=").append(gardenName);
        sb.append(", gardenDesc=").append(gardenDesc);
        sb.append(", gardenOwner=").append(gardenOwner);
        sb.append(", addressId=").append(addressId);
        sb.append(", gardenStatus=").append(gardenStatus);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}