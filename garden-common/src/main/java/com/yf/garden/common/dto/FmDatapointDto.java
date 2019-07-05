package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/4/30 11:33
 */
@Getter
@Setter
public class FmDatapointDto {
    @ApiModelProperty("开始位置")
    private Integer offset;
    @ApiModelProperty("查询数量")
    private Integer num;
    @ApiModelProperty("总数")
    private Integer total;
    @ApiModelProperty("当前软件版本")
    private DatapointDto datapoints;
}
