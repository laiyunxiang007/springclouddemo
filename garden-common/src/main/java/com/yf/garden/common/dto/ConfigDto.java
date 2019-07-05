package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/4/30 10:57
 */
@Getter
@Setter
public class ConfigDto {
    @ApiModelProperty("⽤户配置")
    private String custom;
}
