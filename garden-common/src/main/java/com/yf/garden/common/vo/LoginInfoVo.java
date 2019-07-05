package com.yf.garden.common.vo;

import com.yf.garden.common.po.OrchardAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 张继生
 * @date 2019/5/13 17:06
 */
@Getter@Setter
public class LoginInfoVo implements Serializable {
    private static final long serialVersionUID = 2229657001084456144L;
    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty("头像URL")
    private String headUrl;
    @ApiModelProperty("账号")
    private String account;
    @ApiModelProperty("姓名")
    private String realName;
    @ApiModelProperty("手机号")
    private String mobile;
    @ApiModelProperty("员工ID")
    private Long employeeId;
    //果园ID
    private Long orchardId;
    //果园状态
    private String orchardStatus;
    //authKey
    private String authKey;
    /**
     * 短信验证码
     */
    private String smsCode;
    @ApiModelProperty("是否存在地块")
    private boolean hasGroundBlock;
    @ApiModelProperty("设备数量")
    private Integer deviceCount;
    @ApiModelProperty("地址数量")
    private Integer groundBlockCount;
    @ApiModelProperty("果园面积")
    private String orchardArea;
    @ApiModelProperty("驳回原因")
    private String rejectReason;
    @ApiModelProperty("用户角色(0-农场主,1-工人,2-施工,3-后台管理员)")
    private int userRole;
    @ApiModelProperty("地址")
    private OrchardAddress address;
    @ApiModelProperty("微信openid")
    private String openId;
    @ApiModelProperty("微信昵称")
    private String nickName;
}
