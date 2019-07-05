package com.yf.garden.common.vo;

import com.yf.garden.common.po.OrchardAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/5/13 17:00
 */
@Getter@Setter
public class UserInfoVo {
    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty("头像URL")
    private String headUrl;
    @ApiModelProperty("账号")
    private String account;
    @ApiModelProperty("姓名")
    private String realName;
    @ApiModelProperty("地址")
    private OrchardAddress address;
}
