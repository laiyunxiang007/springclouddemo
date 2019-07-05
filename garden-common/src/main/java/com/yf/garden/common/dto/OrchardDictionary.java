package com.yf.garden.common.dto;

import com.yf.garden.common.cache.DataCache;
import com.yf.garden.common.constant.Constants;

import java.io.Serializable;

/**
 * orchard_dictionary
 * @author 
 */
public class OrchardDictionary implements Serializable {
    /**
     * ID
     */
    private Long dicId;

    /**
     * 即类型
     */
    private String dicTypeCode;

    private String cropName;

    /**
     * 代码
     */
    private String dicCode;

    /**
     * 值
     */
    private String dicVal;

    /**
     * 排序
     */
    private Integer dicDisplayOrder;

    /**
     * 备注
     */
    private String dicRemark;

    /**
     * 0无效，1有效，默认1
     */
    private Integer dicDeleteFlag;

    private static final long serialVersionUID = 1L;

    public Long getDicId() {
        return dicId;
    }

    public void setDicId(Long dicId) {
        this.dicId = dicId;
    }

    public String getDicTypeCode() {
        return dicTypeCode;
    }

    public void setDicTypeCode(String dicTypeCode) {
        this.dicTypeCode = dicTypeCode;
        String[] sourceStrArray = dicTypeCode.split("\\"+ Constants.SPLIT_CHAR);
        if(sourceStrArray.length >= 2){
            String crop = DataCache.getCropNameAndPhoto(Long.parseLong(sourceStrArray[1]));
            if (crop != null) {
                String[] cropArry = crop.split("\\"+ Constants.SPLIT_CHAR);
                this.cropName = cropArry[0];
            }
        }
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

    public String getDicVal() {
        return dicVal;
    }

    public void setDicVal(String dicVal) {
        this.dicVal = dicVal;
    }

    public Integer getDicDisplayOrder() {
        return dicDisplayOrder;
    }

    public void setDicDisplayOrder(Integer dicDisplayOrder) {
        this.dicDisplayOrder = dicDisplayOrder;
    }

    public String getDicRemark() {
        return dicRemark;
    }

    public void setDicRemark(String dicRemark) {
        this.dicRemark = dicRemark;
    }

    public Integer getDicDeleteFlag() {
        return dicDeleteFlag;
    }

    public void setDicDeleteFlag(Integer dicDeleteFlag) {
        this.dicDeleteFlag = dicDeleteFlag;
    }
}