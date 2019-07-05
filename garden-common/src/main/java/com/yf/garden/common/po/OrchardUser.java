package com.yf.garden.common.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@ApiModel("用户信息")
@Getter
@Setter
public class OrchardUser {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 姓名
     */
    private String userRealName;

    /**
     * 身份(0-农场主,1-工人,2-施工,3-后台管理员)
     */
    private Integer userRole;

    /**
     * 联系方式
     */
    private String userMobile;

    /**
     * 地址ID
     */
    private Long userAddrId;

    /**
     * 状态(0-冻结,1-激活,2-禁用,3-锁定)
     */
    private Integer userStatus;

    /**
     * 头像
     */
    private String userHead;

    /**
     * 创建人
     */
    private Long userCreateBy;

    /**
     * 更新时间yyyy-MM-DD HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime userUpdateTime = LocalDateTime.now();

    /**
     * 创建时间yyyy-MM-DD HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime userCretTime = userUpdateTime;


    /**
     * 更新人关联用户表id
     */
    private Long userUpdateBy;

    /**
     * 0无效，1有效，默认1
     */
    private Integer userDeleteFlag;

    /**
     * 加入时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date userJoinDate;

    /**
     * 微信OPEN ID
     */
    private String userWchatOpenId;

    /**
     * 账号类型(0-app,1-PC)
     */
    private Integer userType;

    /**
     * 微信昵称
     */
    private String userWchartNickName;

    /**
     * 邮箱
     */
    private String userEmail;
    //果园ID
    private Long orchardId;
    //果园状态
    private String orchardStatus;

    private Long userGardenId;
    //
    private String addrInfo;
    //authKey
    private String authKey;

    /**
     * 短信验证码
     */
    private String smsCode;

    private boolean hasGroundBlock;

    private Integer deviceCount;

    private Integer groundBlockCount;

    private Double orchardArea;

    private Long employeeId;

    private String address;
}
