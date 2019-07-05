package com.yf.garden.common.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
@ApiModel("建议反馈")
@Deprecated
public class Suggest {
    @ApiModelProperty("用户账号")
    private String userId;
    @ApiModelProperty("建议类型(1-产品建议,2-程序错误,3-页面建议)")
    private String type;
    @ApiModelProperty("建议")
    private String suggest;
    @ApiModelProperty("图片")
    private List<String> pictures;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }
}
