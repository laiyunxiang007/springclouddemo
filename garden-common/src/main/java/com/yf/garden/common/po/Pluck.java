package com.yf.garden.common.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel("采摘信息")
@Deprecated
public class Pluck extends BasePo {
    @ApiModelProperty("作物ID")
    private long cropId;
    @ApiModelProperty("采摘重量")
    private int weight;
    @ApiModelProperty("开始时间")
    private Date startTime;
    @ApiModelProperty("结束数据")
    private Date endTime;
    @ApiModelProperty("采摘图集")
    private List<String> pictures;

    public long getCropId() {
        return cropId;
    }

    public void setCropId(long cropId) {
        this.cropId = cropId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }
}
