package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/4/30 10:59
 */
@Getter
@Setter
public class GatewayDto {
    @ApiModelProperty("⽹关 id")
    private String id;
    @ApiModelProperty("SIM 卡标识")
    private String iccid;
    @ApiModelProperty("基站信息（ MNC,MCC,LAC,CI ）")
    private String station;
    @ApiModelProperty("定位时间")
    private Integer activity;
    @ApiModelProperty("信号强度 dBm")
    private Integer rssi;
}
