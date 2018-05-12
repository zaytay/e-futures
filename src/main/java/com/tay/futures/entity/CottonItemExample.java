package com.tay.futures.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CottonItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CottonItemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Long value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Long value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Long value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Long value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Long> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Long> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Long value1, Long value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBarcodIsNull() {
            addCriterion("barcod is null");
            return (Criteria) this;
        }

        public Criteria andBarcodIsNotNull() {
            addCriterion("barcod is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodEqualTo(Long value) {
            addCriterion("barcod =", value, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodNotEqualTo(Long value) {
            addCriterion("barcod <>", value, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodGreaterThan(Long value) {
            addCriterion("barcod >", value, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodGreaterThanOrEqualTo(Long value) {
            addCriterion("barcod >=", value, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodLessThan(Long value) {
            addCriterion("barcod <", value, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodLessThanOrEqualTo(Long value) {
            addCriterion("barcod <=", value, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodIn(List<Long> values) {
            addCriterion("barcod in", values, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodNotIn(List<Long> values) {
            addCriterion("barcod not in", values, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodBetween(Long value1, Long value2) {
            addCriterion("barcod between", value1, value2, "barcod");
            return (Criteria) this;
        }

        public Criteria andBarcodNotBetween(Long value1, Long value2) {
            addCriterion("barcod not between", value1, value2, "barcod");
            return (Criteria) this;
        }

        public Criteria andColourLevelIsNull() {
            addCriterion("colour_level is null");
            return (Criteria) this;
        }

        public Criteria andColourLevelIsNotNull() {
            addCriterion("colour_level is not null");
            return (Criteria) this;
        }

        public Criteria andColourLevelEqualTo(String value) {
            addCriterion("colour_level =", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelNotEqualTo(String value) {
            addCriterion("colour_level <>", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelGreaterThan(String value) {
            addCriterion("colour_level >", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelGreaterThanOrEqualTo(String value) {
            addCriterion("colour_level >=", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelLessThan(String value) {
            addCriterion("colour_level <", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelLessThanOrEqualTo(String value) {
            addCriterion("colour_level <=", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelLike(String value) {
            addCriterion("colour_level like", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelNotLike(String value) {
            addCriterion("colour_level not like", value, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelIn(List<String> values) {
            addCriterion("colour_level in", values, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelNotIn(List<String> values) {
            addCriterion("colour_level not in", values, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelBetween(String value1, String value2) {
            addCriterion("colour_level between", value1, value2, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andColourLevelNotBetween(String value1, String value2) {
            addCriterion("colour_level not between", value1, value2, "colourLevel");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("`length` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`length` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("`length` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("`length` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("`length` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("`length` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("`length` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("`length` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("`length` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("`length` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("`length` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("`length` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andStrengthIsNull() {
            addCriterion("strength is null");
            return (Criteria) this;
        }

        public Criteria andStrengthIsNotNull() {
            addCriterion("strength is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthEqualTo(Integer value) {
            addCriterion("strength =", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotEqualTo(Integer value) {
            addCriterion("strength <>", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThan(Integer value) {
            addCriterion("strength >", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("strength >=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThan(Integer value) {
            addCriterion("strength <", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThanOrEqualTo(Integer value) {
            addCriterion("strength <=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthIn(List<Integer> values) {
            addCriterion("strength in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotIn(List<Integer> values) {
            addCriterion("strength not in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthBetween(Integer value1, Integer value2) {
            addCriterion("strength between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotBetween(Integer value1, Integer value2) {
            addCriterion("strength not between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andMicronaireIsNull() {
            addCriterion("micronaire is null");
            return (Criteria) this;
        }

        public Criteria andMicronaireIsNotNull() {
            addCriterion("micronaire is not null");
            return (Criteria) this;
        }

        public Criteria andMicronaireEqualTo(Integer value) {
            addCriterion("micronaire =", value, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireNotEqualTo(Integer value) {
            addCriterion("micronaire <>", value, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireGreaterThan(Integer value) {
            addCriterion("micronaire >", value, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireGreaterThanOrEqualTo(Integer value) {
            addCriterion("micronaire >=", value, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireLessThan(Integer value) {
            addCriterion("micronaire <", value, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireLessThanOrEqualTo(Integer value) {
            addCriterion("micronaire <=", value, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireIn(List<Integer> values) {
            addCriterion("micronaire in", values, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireNotIn(List<Integer> values) {
            addCriterion("micronaire not in", values, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireBetween(Integer value1, Integer value2) {
            addCriterion("micronaire between", value1, value2, "micronaire");
            return (Criteria) this;
        }

        public Criteria andMicronaireNotBetween(Integer value1, Integer value2) {
            addCriterion("micronaire not between", value1, value2, "micronaire");
            return (Criteria) this;
        }

        public Criteria andEvennessIsNull() {
            addCriterion("evenness is null");
            return (Criteria) this;
        }

        public Criteria andEvennessIsNotNull() {
            addCriterion("evenness is not null");
            return (Criteria) this;
        }

        public Criteria andEvennessEqualTo(Integer value) {
            addCriterion("evenness =", value, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessNotEqualTo(Integer value) {
            addCriterion("evenness <>", value, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessGreaterThan(Integer value) {
            addCriterion("evenness >", value, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessGreaterThanOrEqualTo(Integer value) {
            addCriterion("evenness >=", value, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessLessThan(Integer value) {
            addCriterion("evenness <", value, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessLessThanOrEqualTo(Integer value) {
            addCriterion("evenness <=", value, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessIn(List<Integer> values) {
            addCriterion("evenness in", values, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessNotIn(List<Integer> values) {
            addCriterion("evenness not in", values, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessBetween(Integer value1, Integer value2) {
            addCriterion("evenness between", value1, value2, "evenness");
            return (Criteria) this;
        }

        public Criteria andEvennessNotBetween(Integer value1, Integer value2) {
            addCriterion("evenness not between", value1, value2, "evenness");
            return (Criteria) this;
        }

        public Criteria andGinningQualityIsNull() {
            addCriterion("ginning_quality is null");
            return (Criteria) this;
        }

        public Criteria andGinningQualityIsNotNull() {
            addCriterion("ginning_quality is not null");
            return (Criteria) this;
        }

        public Criteria andGinningQualityEqualTo(Integer value) {
            addCriterion("ginning_quality =", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotEqualTo(Integer value) {
            addCriterion("ginning_quality <>", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityGreaterThan(Integer value) {
            addCriterion("ginning_quality >", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ginning_quality >=", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityLessThan(Integer value) {
            addCriterion("ginning_quality <", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityLessThanOrEqualTo(Integer value) {
            addCriterion("ginning_quality <=", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityIn(List<Integer> values) {
            addCriterion("ginning_quality in", values, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotIn(List<Integer> values) {
            addCriterion("ginning_quality not in", values, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityBetween(Integer value1, Integer value2) {
            addCriterion("ginning_quality between", value1, value2, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("ginning_quality not between", value1, value2, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andYellowLevelIsNull() {
            addCriterion("yellow_level is null");
            return (Criteria) this;
        }

        public Criteria andYellowLevelIsNotNull() {
            addCriterion("yellow_level is not null");
            return (Criteria) this;
        }

        public Criteria andYellowLevelEqualTo(Integer value) {
            addCriterion("yellow_level =", value, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelNotEqualTo(Integer value) {
            addCriterion("yellow_level <>", value, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelGreaterThan(Integer value) {
            addCriterion("yellow_level >", value, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("yellow_level >=", value, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelLessThan(Integer value) {
            addCriterion("yellow_level <", value, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelLessThanOrEqualTo(Integer value) {
            addCriterion("yellow_level <=", value, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelIn(List<Integer> values) {
            addCriterion("yellow_level in", values, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelNotIn(List<Integer> values) {
            addCriterion("yellow_level not in", values, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelBetween(Integer value1, Integer value2) {
            addCriterion("yellow_level between", value1, value2, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andYellowLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("yellow_level not between", value1, value2, "yellowLevel");
            return (Criteria) this;
        }

        public Criteria andReflectivityIsNull() {
            addCriterion("reflectivity is null");
            return (Criteria) this;
        }

        public Criteria andReflectivityIsNotNull() {
            addCriterion("reflectivity is not null");
            return (Criteria) this;
        }

        public Criteria andReflectivityEqualTo(Integer value) {
            addCriterion("reflectivity =", value, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityNotEqualTo(Integer value) {
            addCriterion("reflectivity <>", value, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityGreaterThan(Integer value) {
            addCriterion("reflectivity >", value, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("reflectivity >=", value, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityLessThan(Integer value) {
            addCriterion("reflectivity <", value, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityLessThanOrEqualTo(Integer value) {
            addCriterion("reflectivity <=", value, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityIn(List<Integer> values) {
            addCriterion("reflectivity in", values, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityNotIn(List<Integer> values) {
            addCriterion("reflectivity not in", values, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityBetween(Integer value1, Integer value2) {
            addCriterion("reflectivity between", value1, value2, "reflectivity");
            return (Criteria) this;
        }

        public Criteria andReflectivityNotBetween(Integer value1, Integer value2) {
            addCriterion("reflectivity not between", value1, value2, "reflectivity");
            return (Criteria) this;
        }
    }

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