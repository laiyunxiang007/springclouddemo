package com.yf.garden.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 公共查询条件封装
 * @author 张继生
 */
@ApiModel("查询条件")
@Deprecated
public class BaseCondition {
    @ApiModelProperty("是否分页,默认true(分页)")
    private boolean needPage = true;
    @ApiModelProperty("页码,默认首页")
    private int pageNum = 1;
    @ApiModelProperty("页大小,默认10条")
    private int pageSize = 10;
    private Integer type;
    public boolean isNeedPage() {
        return needPage;
    }

    public void setNeedPage(boolean needPage) {
        this.needPage = needPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
