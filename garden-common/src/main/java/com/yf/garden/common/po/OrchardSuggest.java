package com.yf.garden.common.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * orchard_suggest
 * @author
 */
public class OrchardSuggest implements Serializable {
    /**
     * ID
     */
    private Long suggestId;

    /**
     * 建议类型(1-产品建议,2-程序错误,3-页面建议)
     */
    private Integer suggestType;

    /**
     * 内容
     */
    private String suggestContent;

    private String photoUrl;

    /**
     * 图集
     */
    private String photoPath;

    /**
     * 创建人
     */
    private Long suggestCreateBy;

    /**
     * 更新时间yyyy-MM-DD HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime suggestUpdateTime = LocalDateTime.now();

    /**
     * 创建时间yyyy-MM-DD HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime suggestCretTime = suggestUpdateTime;

    /**
     * 更新人关联用户表ID
     */
    private Long suggestUpdateBy;

    /**
     * 0无效，1有效，默认1
     */
    private Boolean suggestDeleteFlag;

    /**
     * 状态(0-待处理,1-已处理)
     */
    private Boolean suggestStatus;

    private static final long serialVersionUID = 1L;

    public Long getSuggestId() {
        return suggestId;
    }

    public void setSuggestId(Long suggestId) {
        this.suggestId = suggestId;
    }

    public Integer getSuggestType() {
        return suggestType;
    }

    public void setSuggestType(Integer suggestType) {
        this.suggestType = suggestType;
    }

    public String getSuggestContent() {
        return suggestContent;
    }

    public void setSuggestContent(String suggestContent) {
        this.suggestContent = suggestContent;
    }

    public Long getSuggestCreateBy() {
        return suggestCreateBy;
    }

    public void setSuggestCreateBy(Long suggestCreateBy) {
        this.suggestCreateBy = suggestCreateBy;
    }

    public LocalDateTime getSuggestCretTime() {
        return suggestCretTime;
    }

    public void setSuggestCretTime(LocalDateTime suggestCretTime) {
        this.suggestCretTime = suggestCretTime;
    }

    public LocalDateTime getSuggestUpdateTime() {
        return suggestUpdateTime;
    }

    public void setSuggestUpdateTime(LocalDateTime suggestUpdateTime) {
        this.suggestUpdateTime = suggestUpdateTime;
    }

    public Long getSuggestUpdateBy() {
        return suggestUpdateBy;
    }

    public void setSuggestUpdateBy(Long suggestUpdateBy) {
        this.suggestUpdateBy = suggestUpdateBy;
    }

    public Boolean getSuggestDeleteFlag() {
        return suggestDeleteFlag;
    }

    public void setSuggestDeleteFlag(Boolean suggestDeleteFlag) {
        this.suggestDeleteFlag = suggestDeleteFlag;
    }

    public Boolean getSuggestStatus() {
        return suggestStatus;
    }

    public void setSuggestStatus(Boolean suggestStatus) {
        this.suggestStatus = suggestStatus;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}