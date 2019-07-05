package com.yf.garden.common.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;
@ApiModel("农事信息")
@Deprecated
public class AgricultureWork {
    @ApiModelProperty("农事ID")
    private long id;
    @ApiModelProperty("作物")
    private List<Map<String, String>> crops;
    @ApiModelProperty("化肥")
    private List<Map<String, String>> fertilizers;
    @ApiModelProperty("开始时间")
    private Date startTime;
    @ApiModelProperty("结束时间")
    private Date endTime;
    @ApiModelProperty("图片")
    private List<String> pictures;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Map<String, String>> getCrops() {
        return crops;
    }

    public void setCrops(List<Map<String, String>> crops) {
        this.crops = crops;
    }

    public List<Map<String, String>> getFertilizers() {
        return fertilizers;
    }

    public void setFertilizers(List<Map<String, String>> fertilizers) {
        this.fertilizers = fertilizers;
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
