package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 张继生
 * @date 2019/4/30 10:46
 */
@Getter@Setter
public class FmInfoDto {
    @ApiModelProperty("设备ID")
    private String id;
    @ApiModelProperty("设备生产序列号")
    private String sn;
    @ApiModelProperty("设备名称")
    private String name;
    @ApiModelProperty("设备类型")
    private Integer type;
    @ApiModelProperty("类型名称")
    private String type_name;
    @ApiModelProperty("类型型号")
    private Integer model;
    @ApiModelProperty("型号名称")
    private String model_name;
    @ApiModelProperty("当前软件版本")
    private String software;
    @ApiModelProperty("最后活跃时间")
    private Integer activity;
    @ApiModelProperty("信号强度")
    private Integer rssi;
    @ApiModelProperty("电池百分比")
    private Integer battery;
    @ApiModelProperty("是否在充电")
    private boolean charging;
    @ApiModelProperty("0:未激活，1:在线，2:离线")
    private Integer status;
    @ApiModelProperty("定位时间")
    private Integer positioning;
    @ApiModelProperty("定位信息")
    private LocationDto location;
    @ApiModelProperty("设备配置")
    private ConfigDto config;
    @ApiModelProperty("⽹关信息")
    private List<GatewayDto> gateways;
}
