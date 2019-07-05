package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/4/30 10:55
 */
@Getter
@Setter
public class LocationDto {
    @ApiModelProperty("海拔")
    private Integer altitude;
    @ApiModelProperty("纬度   ")
    private Float latitude;
    @ApiModelProperty("经度")
    private Float longitude;
    @ApiModelProperty("定位精度")
    private Integer precision;
}
