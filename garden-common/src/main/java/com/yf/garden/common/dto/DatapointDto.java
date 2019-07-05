package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/4/30 11:38
 */
@Getter
@Setter
public class DatapointDto {
    @ApiModelProperty("类型型号")
    private Integer created_at;
    @ApiModelProperty("类型名称")
    private Integer type;
    @ApiModelProperty("型号名称")
    private String data;
    @ApiModelProperty("定位信息")
    private LocationDto location;
}
