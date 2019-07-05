package com.yf.garden.common.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测数据")
@Deprecated
public class DetectData extends BasePo {
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("设备编号")
    private String deviceNO;
    @ApiModelProperty("地块ID")
    private long blockId;
    @ApiModelProperty("是否开放(true-开放)")
    private boolean isOpen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceNO() {
        return deviceNO;
    }

    public void setDeviceNO(String deviceNO) {
        this.deviceNO = deviceNO;
    }

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(long blockId) {
        this.blockId = blockId;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
