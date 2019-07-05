package com.yf.garden.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 查询条件扩展
 * @author 张继生
 */
@ApiModel("查询条件")
@Getter@Setter
@Deprecated
public class QueryCondition extends BaseCondition {
    @ApiModelProperty("果园ID")
    private Long orchardId;
    @ApiModelProperty("地块ID")
    private Long blockId;
    @ApiModelProperty("品种")
    private String crops;

    @ApiModelProperty("果园名称")
    private String gardenName;

    @ApiModelProperty("果园id")
    private Long gardenId;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户类型")
    private Long userRole;
    @ApiModelProperty("开始日期")
    private LocalDate startDate;
    @ApiModelProperty("结束日期")
    private LocalDate endDate;

    private String dateRange;
    @ApiModelProperty("作物ID")
    private Long cropId;
    @ApiModelProperty("作物类型")
    private Integer cropType;

    @ApiModelProperty("作物名称")
    private String cropName;

    @ApiModelProperty("建议类型")
    private Long suggestType;

    @ApiModelProperty("出入库类型")
    private String whType;

    @ApiModelProperty("出入库id")
    private Long houseId;

    @ApiModelProperty("摄像头序号")
    private String cameraSno;

    @ApiModelProperty("摄像头类型")
    private String cameraType;

    @ApiModelProperty("摄像头名称")
    private String cameraName;

    @ApiModelProperty("地块id")
    private Long gbId;

    @ApiModelProperty("农事id")
    private Long farmId;

    @ApiModelProperty("农事类型")
    private String farmType;

    @ApiModelProperty("二维码溯源id")
    private Long sourceId;

    @ApiModelProperty("采摘id")
    private Long pluckId;

    @ApiModelProperty("消息id")
    private Long msgId;

    @ApiModelProperty("消息类型")
    private String msgType;

    @ApiModelProperty("资讯id")
    private Long infoId;

    @ApiModelProperty("资讯类型")
    private Long infoType;

    @ApiModelProperty("设备汇总表id")
    private Long Id;

    @ApiModelProperty("设备编号")
    private String deviceSn;

    @ApiModelProperty("设备编号")
    private String deviceType;

    @ApiModelProperty("设备id")
    private Long deviceId;

    @ApiModelProperty("作物百科 id")
    private Long encyclopediaCropId;

    @ApiModelProperty("作物百科 物种类别id")
    private Long encyclopediaTypeId;

    @ApiModelProperty("标签参数id")
    private Long LabelParamId;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date startTime1;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date endTime1;

    @ApiModelProperty("包装品质")
    private String slPackQuality;
}
