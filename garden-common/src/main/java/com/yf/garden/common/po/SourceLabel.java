package com.yf.garden.common.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

@ApiModel("溯源标签")
@Deprecated
public class SourceLabel extends BasePo {
    @ApiModelProperty("标签名称")
    private String name;
    @ApiModelProperty("品种")
    private List<Map<String, String>> crops;
    @ApiModelProperty("包装质量")
    private int packQuality;
    @ApiModelProperty("包装规格")
    private int packStandard;
    @ApiModelProperty("果品大小")
    private int fruitSize;
    @ApiModelProperty("果品甜度")
    private int fruitSweet;
    @ApiModelProperty("果品等级")
    private int fruitGrade;
    @ApiModelProperty("申领数量")
    private int applyCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<String, String>> getCrops() {
        return crops;
    }

    public void setCrops(List<Map<String, String>> crops) {
        this.crops = crops;
    }

    public int getPackQuality() {
        return packQuality;
    }

    public void setPackQuality(int packQuality) {
        this.packQuality = packQuality;
    }

    public int getPackStandard() {
        return packStandard;
    }

    public void setPackStandard(int packStandard) {
        this.packStandard = packStandard;
    }

    public int getFruitSize() {
        return fruitSize;
    }

    public void setFruitSize(int fruitSize) {
        this.fruitSize = fruitSize;
    }

    public int getFruitSweet() {
        return fruitSweet;
    }

    public void setFruitSweet(int fruitSweet) {
        this.fruitSweet = fruitSweet;
    }

    public int getFruitGrade() {
        return fruitGrade;
    }

    public void setFruitGrade(int fruitGrade) {
        this.fruitGrade = fruitGrade;
    }

    public int getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(int applyCount) {
        this.applyCount = applyCount;
    }
}
