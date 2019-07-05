package com.yf.garden.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class WarehouseVo {
    private long id;
    private long crop_id;
    private long block_id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_Time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(long crop_id) {
        this.crop_id = crop_id;
    }

    public long getBlock_id() {
        return block_id;
    }

    public void setBlock_id(long block_id) {
        this.block_id = block_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate_Time() {
        return create_Time;
    }

    public void setCreate_Time(Date create_Time) {
        this.create_Time = create_Time;
    }
}
