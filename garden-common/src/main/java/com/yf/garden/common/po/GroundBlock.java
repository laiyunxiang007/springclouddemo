package com.yf.garden.common.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;
@ApiModel("地块信息")
@Deprecated
public class GroundBlock {
    @ApiModelProperty("地块ID")
    private long id;
    @ApiModelProperty("地块名称")
    private String name;
    @ApiModelProperty("地块面积")
    private String area;
    @ApiModelProperty("种植作物(包括作物名称、类型、种植时间)")
    private List<Map<String, String>> crops;
    @ApiModelProperty("设备编号，即设备序列号")
    private List<String> deviceNOes;
    @ApiModelProperty("地块图片")
    private List<String> pictures;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Map<String, String>> getCrops() {
        return crops;
    }

    public void setCrops(List<Map<String, String>> crops) {
        this.crops = crops;
    }

    public List<String> getDeviceNOes() {
        return deviceNOes;
    }

    public void setDeviceNOes(List<String> deviceNOes) {
        this.deviceNOes = deviceNOes;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }
}
