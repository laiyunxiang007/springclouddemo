package com.yf.garden.common.po;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrchardSuggestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public OrchardSuggestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSuggestIdIsNull() {
            addCriterion("orchard_suggest.suggest_id is null");
            return (Criteria) this;
        }

        public Criteria andSuggestIdIsNotNull() {
            addCriterion("orchard_suggest.suggest_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestIdEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_id =", value, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdNotEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_id <>", value, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdGreaterThan(Long value) {
            addCriterion("orchard_suggest.suggest_id >", value, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_id >=", value, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdLessThan(Long value) {
            addCriterion("orchard_suggest.suggest_id <", value, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdLessThanOrEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_id <=", value, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdIn(List<Long> values) {
            addCriterion("orchard_suggest.suggest_id in", values, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdNotIn(List<Long> values) {
            addCriterion("orchard_suggest.suggest_id not in", values, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdBetween(Long value1, Long value2) {
            addCriterion("orchard_suggest.suggest_id between", value1, value2, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestIdNotBetween(Long value1, Long value2) {
            addCriterion("orchard_suggest.suggest_id not between", value1, value2, "suggestId");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeIsNull() {
            addCriterion("orchard_suggest.suggest_type is null");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeIsNotNull() {
            addCriterion("orchard_suggest.suggest_type is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeEqualTo(Integer value) {
            addCriterion("orchard_suggest.suggest_type =", value, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeNotEqualTo(Integer value) {
            addCriterion("orchard_suggest.suggest_type <>", value, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeGreaterThan(Integer value) {
            addCriterion("orchard_suggest.suggest_type >", value, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orchard_suggest.suggest_type >=", value, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeLessThan(Integer value) {
            addCriterion("orchard_suggest.suggest_type <", value, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orchard_suggest.suggest_type <=", value, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeIn(List<Integer> values) {
            addCriterion("orchard_suggest.suggest_type in", values, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeNotIn(List<Integer> values) {
            addCriterion("orchard_suggest.suggest_type not in", values, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeBetween(Integer value1, Integer value2) {
            addCriterion("orchard_suggest.com.yf.garden.pc.model.LabelParameter between", value1, value2, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orchard_suggest.suggest_type not between", value1, value2, "suggestType");
            return (Criteria) this;
        }

        public Criteria andSuggestContentIsNull() {
            addCriterion("orchard_suggest.suggest_content is null");
            return (Criteria) this;
        }

        public Criteria andSuggestContentIsNotNull() {
            addCriterion("orchard_suggest.suggest_content is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestContentEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_content =", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentNotEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_content <>", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentGreaterThan(String value) {
            addCriterion("orchard_suggest.suggest_content >", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentGreaterThanOrEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_content >=", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentLessThan(String value) {
            addCriterion("orchard_suggest.suggest_content <", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentLessThanOrEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_content <=", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentLike(String value) {
            addCriterion("orchard_suggest.suggest_content like", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentNotLike(String value) {
            addCriterion("orchard_suggest.suggest_content not like", value, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentIn(List<String> values) {
            addCriterion("orchard_suggest.suggest_content in", values, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentNotIn(List<String> values) {
            addCriterion("orchard_suggest.suggest_content not in", values, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentBetween(String value1, String value2) {
            addCriterion("orchard_suggest.suggest_content between", value1, value2, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestContentNotBetween(String value1, String value2) {
            addCriterion("orchard_suggest.suggest_content not between", value1, value2, "suggestContent");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesIsNull() {
            addCriterion("orchard_suggest.suggest_pictures is null");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesIsNotNull() {
            addCriterion("orchard_suggest.suggest_pictures is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_pictures =", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesNotEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_pictures <>", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesGreaterThan(String value) {
            addCriterion("orchard_suggest.suggest_pictures >", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesGreaterThanOrEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_pictures >=", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesLessThan(String value) {
            addCriterion("orchard_suggest.suggest_pictures <", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesLessThanOrEqualTo(String value) {
            addCriterion("orchard_suggest.suggest_pictures <=", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesLike(String value) {
            addCriterion("orchard_suggest.suggest_pictures like", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesNotLike(String value) {
            addCriterion("orchard_suggest.suggest_pictures not like", value, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesIn(List<String> values) {
            addCriterion("orchard_suggest.suggest_pictures in", values, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesNotIn(List<String> values) {
            addCriterion("orchard_suggest.suggest_pictures not in", values, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesBetween(String value1, String value2) {
            addCriterion("orchard_suggest.suggest_pictures between", value1, value2, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestPicturesNotBetween(String value1, String value2) {
            addCriterion("orchard_suggest.suggest_pictures not between", value1, value2, "suggestPictures");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByIsNull() {
            addCriterion("orchard_suggest.suggest_create_by is null");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByIsNotNull() {
            addCriterion("orchard_suggest.suggest_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_create_by =", value, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByNotEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_create_by <>", value, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByGreaterThan(Long value) {
            addCriterion("orchard_suggest.suggest_create_by >", value, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_create_by >=", value, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByLessThan(Long value) {
            addCriterion("orchard_suggest.suggest_create_by <", value, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByLessThanOrEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_create_by <=", value, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByIn(List<Long> values) {
            addCriterion("orchard_suggest.suggest_create_by in", values, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByNotIn(List<Long> values) {
            addCriterion("orchard_suggest.suggest_create_by not in", values, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByBetween(Long value1, Long value2) {
            addCriterion("orchard_suggest.suggest_create_by between", value1, value2, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCreateByNotBetween(Long value1, Long value2) {
            addCriterion("orchard_suggest.suggest_create_by not between", value1, value2, "suggestCreateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeIsNull() {
            addCriterion("orchard_suggest.suggest_cret_time is null");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeIsNotNull() {
            addCriterion("orchard_suggest.suggest_cret_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_cret_time =", value, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeNotEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_cret_time <>", value, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeGreaterThan(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_cret_time >", value, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_cret_time >=", value, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeLessThan(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_cret_time <", value, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_cret_time <=", value, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeIn(List<LocalDateTime> values) {
            addCriterion("orchard_suggest.suggest_cret_time in", values, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeNotIn(List<LocalDateTime> values) {
            addCriterion("orchard_suggest.suggest_cret_time not in", values, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("orchard_suggest.suggest_cret_time between", value1, value2, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestCretTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("orchard_suggest.suggest_cret_time not between", value1, value2, "suggestCretTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeIsNull() {
            addCriterion("orchard_suggest.suggest_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeIsNotNull() {
            addCriterion("orchard_suggest.suggest_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_update_time =", value, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_update_time <>", value, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_update_time >", value, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_update_time >=", value, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_update_time <", value, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("orchard_suggest.suggest_update_time <=", value, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("orchard_suggest.suggest_update_time in", values, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("orchard_suggest.suggest_update_time not in", values, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("orchard_suggest.suggest_update_time between", value1, value2, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("orchard_suggest.suggest_update_time not between", value1, value2, "suggestUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByIsNull() {
            addCriterion("orchard_suggest.suggest_update_by is null");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByIsNotNull() {
            addCriterion("orchard_suggest.suggest_update_by is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_update_by =", value, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByNotEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_update_by <>", value, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByGreaterThan(Long value) {
            addCriterion("orchard_suggest.suggest_update_by >", value, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_update_by >=", value, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByLessThan(Long value) {
            addCriterion("orchard_suggest.suggest_update_by <", value, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("orchard_suggest.suggest_update_by <=", value, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByIn(List<Long> values) {
            addCriterion("orchard_suggest.suggest_update_by in", values, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByNotIn(List<Long> values) {
            addCriterion("orchard_suggest.suggest_update_by not in", values, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByBetween(Long value1, Long value2) {
            addCriterion("orchard_suggest.suggest_update_by between", value1, value2, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("orchard_suggest.suggest_update_by not between", value1, value2, "suggestUpdateBy");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagIsNull() {
            addCriterion("orchard_suggest.suggest_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagIsNotNull() {
            addCriterion("orchard_suggest.suggest_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_delete_flag =", value, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_delete_flag <>", value, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagGreaterThan(Boolean value) {
            addCriterion("orchard_suggest.suggest_delete_flag >", value, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_delete_flag >=", value, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagLessThan(Boolean value) {
            addCriterion("orchard_suggest.suggest_delete_flag <", value, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_delete_flag <=", value, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagIn(List<Boolean> values) {
            addCriterion("orchard_suggest.suggest_delete_flag in", values, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("orchard_suggest.suggest_delete_flag not in", values, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("orchard_suggest.suggest_delete_flag between", value1, value2, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("orchard_suggest.suggest_delete_flag not between", value1, value2, "suggestDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusIsNull() {
            addCriterion("orchard_suggest.suggest_status is null");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusIsNotNull() {
            addCriterion("orchard_suggest.suggest_status is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_status =", value, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusNotEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_status <>", value, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusGreaterThan(Boolean value) {
            addCriterion("orchard_suggest.suggest_status >", value, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_status >=", value, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusLessThan(Boolean value) {
            addCriterion("orchard_suggest.suggest_status <", value, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("orchard_suggest.suggest_status <=", value, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusIn(List<Boolean> values) {
            addCriterion("orchard_suggest.suggest_status in", values, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusNotIn(List<Boolean> values) {
            addCriterion("orchard_suggest.suggest_status not in", values, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("orchard_suggest.suggest_status between", value1, value2, "suggestStatus");
            return (Criteria) this;
        }

        public Criteria andSuggestStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("orchard_suggest.suggest_status not between", value1, value2, "suggestStatus");
            return (Criteria) this;
        }
    }

    /**
     *
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}