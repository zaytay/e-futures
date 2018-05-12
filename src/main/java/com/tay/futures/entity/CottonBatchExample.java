package com.tay.futures.entity;

import java.util.ArrayList;
import java.util.List;

public class CottonBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CottonBatchExample() {
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

        public Criteria andProductionCodeIsNull() {
            addCriterion("production_code is null");
            return (Criteria) this;
        }

        public Criteria andProductionCodeIsNotNull() {
            addCriterion("production_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductionCodeEqualTo(Long value) {
            addCriterion("production_code =", value, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeNotEqualTo(Long value) {
            addCriterion("production_code <>", value, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeGreaterThan(Long value) {
            addCriterion("production_code >", value, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("production_code >=", value, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeLessThan(Long value) {
            addCriterion("production_code <", value, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeLessThanOrEqualTo(Long value) {
            addCriterion("production_code <=", value, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeIn(List<Long> values) {
            addCriterion("production_code in", values, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeNotIn(List<Long> values) {
            addCriterion("production_code not in", values, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeBetween(Long value1, Long value2) {
            addCriterion("production_code between", value1, value2, "productionCode");
            return (Criteria) this;
        }

        public Criteria andProductionCodeNotBetween(Long value1, Long value2) {
            addCriterion("production_code not between", value1, value2, "productionCode");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProductionAreaIsNull() {
            addCriterion("production_area is null");
            return (Criteria) this;
        }

        public Criteria andProductionAreaIsNotNull() {
            addCriterion("production_area is not null");
            return (Criteria) this;
        }

        public Criteria andProductionAreaEqualTo(String value) {
            addCriterion("production_area =", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaNotEqualTo(String value) {
            addCriterion("production_area <>", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaGreaterThan(String value) {
            addCriterion("production_area >", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaGreaterThanOrEqualTo(String value) {
            addCriterion("production_area >=", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaLessThan(String value) {
            addCriterion("production_area <", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaLessThanOrEqualTo(String value) {
            addCriterion("production_area <=", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaLike(String value) {
            addCriterion("production_area like", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaNotLike(String value) {
            addCriterion("production_area not like", value, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaIn(List<String> values) {
            addCriterion("production_area in", values, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaNotIn(List<String> values) {
            addCriterion("production_area not in", values, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaBetween(String value1, String value2) {
            addCriterion("production_area between", value1, value2, "productionArea");
            return (Criteria) this;
        }

        public Criteria andProductionAreaNotBetween(String value1, String value2) {
            addCriterion("production_area not between", value1, value2, "productionArea");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andAvgLengthIsNull() {
            addCriterion("avg_length is null");
            return (Criteria) this;
        }

        public Criteria andAvgLengthIsNotNull() {
            addCriterion("avg_length is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLengthEqualTo(Integer value) {
            addCriterion("avg_length =", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthNotEqualTo(Integer value) {
            addCriterion("avg_length <>", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthGreaterThan(Integer value) {
            addCriterion("avg_length >", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_length >=", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthLessThan(Integer value) {
            addCriterion("avg_length <", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthLessThanOrEqualTo(Integer value) {
            addCriterion("avg_length <=", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthIn(List<Integer> values) {
            addCriterion("avg_length in", values, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthNotIn(List<Integer> values) {
            addCriterion("avg_length not in", values, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthBetween(Integer value1, Integer value2) {
            addCriterion("avg_length between", value1, value2, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_length not between", value1, value2, "avgLength");
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

        public Criteria andAvgMicronaireIsNull() {
            addCriterion("avg_micronaire is null");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireIsNotNull() {
            addCriterion("avg_micronaire is not null");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireEqualTo(Integer value) {
            addCriterion("avg_micronaire =", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireNotEqualTo(Integer value) {
            addCriterion("avg_micronaire <>", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireGreaterThan(Integer value) {
            addCriterion("avg_micronaire >", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_micronaire >=", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireLessThan(Integer value) {
            addCriterion("avg_micronaire <", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireLessThanOrEqualTo(Integer value) {
            addCriterion("avg_micronaire <=", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireIn(List<Integer> values) {
            addCriterion("avg_micronaire in", values, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireNotIn(List<Integer> values) {
            addCriterion("avg_micronaire not in", values, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireBetween(Integer value1, Integer value2) {
            addCriterion("avg_micronaire between", value1, value2, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_micronaire not between", value1, value2, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andMoistureIsNull() {
            addCriterion("moisture is null");
            return (Criteria) this;
        }

        public Criteria andMoistureIsNotNull() {
            addCriterion("moisture is not null");
            return (Criteria) this;
        }

        public Criteria andMoistureEqualTo(Integer value) {
            addCriterion("moisture =", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotEqualTo(Integer value) {
            addCriterion("moisture <>", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureGreaterThan(Integer value) {
            addCriterion("moisture >", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureGreaterThanOrEqualTo(Integer value) {
            addCriterion("moisture >=", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureLessThan(Integer value) {
            addCriterion("moisture <", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureLessThanOrEqualTo(Integer value) {
            addCriterion("moisture <=", value, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureIn(List<Integer> values) {
            addCriterion("moisture in", values, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotIn(List<Integer> values) {
            addCriterion("moisture not in", values, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureBetween(Integer value1, Integer value2) {
            addCriterion("moisture between", value1, value2, "moisture");
            return (Criteria) this;
        }

        public Criteria andMoistureNotBetween(Integer value1, Integer value2) {
            addCriterion("moisture not between", value1, value2, "moisture");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousIsNull() {
            addCriterion("miscellaneous is null");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousIsNotNull() {
            addCriterion("miscellaneous is not null");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousEqualTo(Integer value) {
            addCriterion("miscellaneous =", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousNotEqualTo(Integer value) {
            addCriterion("miscellaneous <>", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousGreaterThan(Integer value) {
            addCriterion("miscellaneous >", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousGreaterThanOrEqualTo(Integer value) {
            addCriterion("miscellaneous >=", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousLessThan(Integer value) {
            addCriterion("miscellaneous <", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousLessThanOrEqualTo(Integer value) {
            addCriterion("miscellaneous <=", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousIn(List<Integer> values) {
            addCriterion("miscellaneous in", values, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousNotIn(List<Integer> values) {
            addCriterion("miscellaneous not in", values, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousBetween(Integer value1, Integer value2) {
            addCriterion("miscellaneous between", value1, value2, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousNotBetween(Integer value1, Integer value2) {
            addCriterion("miscellaneous not between", value1, value2, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessIsNull() {
            addCriterion("avg_evenness is null");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessIsNotNull() {
            addCriterion("avg_evenness is not null");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessEqualTo(Integer value) {
            addCriterion("avg_evenness =", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessNotEqualTo(Integer value) {
            addCriterion("avg_evenness <>", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessGreaterThan(Integer value) {
            addCriterion("avg_evenness >", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_evenness >=", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessLessThan(Integer value) {
            addCriterion("avg_evenness <", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessLessThanOrEqualTo(Integer value) {
            addCriterion("avg_evenness <=", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessIn(List<Integer> values) {
            addCriterion("avg_evenness in", values, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessNotIn(List<Integer> values) {
            addCriterion("avg_evenness not in", values, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessBetween(Integer value1, Integer value2) {
            addCriterion("avg_evenness between", value1, value2, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_evenness not between", value1, value2, "avgEvenness");
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

        public Criteria andGinningQualityEqualTo(String value) {
            addCriterion("ginning_quality =", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotEqualTo(String value) {
            addCriterion("ginning_quality <>", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityGreaterThan(String value) {
            addCriterion("ginning_quality >", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityGreaterThanOrEqualTo(String value) {
            addCriterion("ginning_quality >=", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityLessThan(String value) {
            addCriterion("ginning_quality <", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityLessThanOrEqualTo(String value) {
            addCriterion("ginning_quality <=", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityLike(String value) {
            addCriterion("ginning_quality like", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotLike(String value) {
            addCriterion("ginning_quality not like", value, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityIn(List<String> values) {
            addCriterion("ginning_quality in", values, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotIn(List<String> values) {
            addCriterion("ginning_quality not in", values, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityBetween(String value1, String value2) {
            addCriterion("ginning_quality between", value1, value2, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andGinningQualityNotBetween(String value1, String value2) {
            addCriterion("ginning_quality not between", value1, value2, "ginningQuality");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWeightNumberIsNull() {
            addCriterion("weight_number is null");
            return (Criteria) this;
        }

        public Criteria andWeightNumberIsNotNull() {
            addCriterion("weight_number is not null");
            return (Criteria) this;
        }

        public Criteria andWeightNumberEqualTo(String value) {
            addCriterion("weight_number =", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberNotEqualTo(String value) {
            addCriterion("weight_number <>", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberGreaterThan(String value) {
            addCriterion("weight_number >", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberGreaterThanOrEqualTo(String value) {
            addCriterion("weight_number >=", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberLessThan(String value) {
            addCriterion("weight_number <", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberLessThanOrEqualTo(String value) {
            addCriterion("weight_number <=", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberLike(String value) {
            addCriterion("weight_number like", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberNotLike(String value) {
            addCriterion("weight_number not like", value, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberIn(List<String> values) {
            addCriterion("weight_number in", values, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberNotIn(List<String> values) {
            addCriterion("weight_number not in", values, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberBetween(String value1, String value2) {
            addCriterion("weight_number between", value1, value2, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andWeightNumberNotBetween(String value1, String value2) {
            addCriterion("weight_number not between", value1, value2, "weightNumber");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("`standard` is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("`standard` is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("`standard` =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("`standard` <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("`standard` >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("`standard` >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("`standard` <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("`standard` <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("`standard` like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("`standard` not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("`standard` in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("`standard` not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("`standard` between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("`standard` not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(Integer value) {
            addCriterion("gross_weight =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(Integer value) {
            addCriterion("gross_weight <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(Integer value) {
            addCriterion("gross_weight >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("gross_weight >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(Integer value) {
            addCriterion("gross_weight <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(Integer value) {
            addCriterion("gross_weight <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<Integer> values) {
            addCriterion("gross_weight in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<Integer> values) {
            addCriterion("gross_weight not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(Integer value1, Integer value2) {
            addCriterion("gross_weight between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("gross_weight not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNull() {
            addCriterion("net_weight is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNotNull() {
            addCriterion("net_weight is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightEqualTo(Integer value) {
            addCriterion("net_weight =", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotEqualTo(Integer value) {
            addCriterion("net_weight <>", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThan(Integer value) {
            addCriterion("net_weight >", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_weight >=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThan(Integer value) {
            addCriterion("net_weight <", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThanOrEqualTo(Integer value) {
            addCriterion("net_weight <=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIn(List<Integer> values) {
            addCriterion("net_weight in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotIn(List<Integer> values) {
            addCriterion("net_weight not in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightBetween(Integer value1, Integer value2) {
            addCriterion("net_weight between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("net_weight not between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightIsNull() {
            addCriterion("tare_weight is null");
            return (Criteria) this;
        }

        public Criteria andTareWeightIsNotNull() {
            addCriterion("tare_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTareWeightEqualTo(Integer value) {
            addCriterion("tare_weight =", value, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightNotEqualTo(Integer value) {
            addCriterion("tare_weight <>", value, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightGreaterThan(Integer value) {
            addCriterion("tare_weight >", value, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("tare_weight >=", value, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightLessThan(Integer value) {
            addCriterion("tare_weight <", value, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightLessThanOrEqualTo(Integer value) {
            addCriterion("tare_weight <=", value, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightIn(List<Integer> values) {
            addCriterion("tare_weight in", values, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightNotIn(List<Integer> values) {
            addCriterion("tare_weight not in", values, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightBetween(Integer value1, Integer value2) {
            addCriterion("tare_weight between", value1, value2, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andTareWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("tare_weight not between", value1, value2, "tareWeight");
            return (Criteria) this;
        }

        public Criteria andQualityNumberIsNull() {
            addCriterion("quality_number is null");
            return (Criteria) this;
        }

        public Criteria andQualityNumberIsNotNull() {
            addCriterion("quality_number is not null");
            return (Criteria) this;
        }

        public Criteria andQualityNumberEqualTo(String value) {
            addCriterion("quality_number =", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberNotEqualTo(String value) {
            addCriterion("quality_number <>", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberGreaterThan(String value) {
            addCriterion("quality_number >", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("quality_number >=", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberLessThan(String value) {
            addCriterion("quality_number <", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberLessThanOrEqualTo(String value) {
            addCriterion("quality_number <=", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberLike(String value) {
            addCriterion("quality_number like", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberNotLike(String value) {
            addCriterion("quality_number not like", value, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberIn(List<String> values) {
            addCriterion("quality_number in", values, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberNotIn(List<String> values) {
            addCriterion("quality_number not in", values, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberBetween(String value1, String value2) {
            addCriterion("quality_number between", value1, value2, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andQualityNumberNotBetween(String value1, String value2) {
            addCriterion("quality_number not between", value1, value2, "qualityNumber");
            return (Criteria) this;
        }

        public Criteria andCoreLengthIsNull() {
            addCriterion("core_length is null");
            return (Criteria) this;
        }

        public Criteria andCoreLengthIsNotNull() {
            addCriterion("core_length is not null");
            return (Criteria) this;
        }

        public Criteria andCoreLengthEqualTo(Integer value) {
            addCriterion("core_length =", value, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthNotEqualTo(Integer value) {
            addCriterion("core_length <>", value, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthGreaterThan(Integer value) {
            addCriterion("core_length >", value, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("core_length >=", value, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthLessThan(Integer value) {
            addCriterion("core_length <", value, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthLessThanOrEqualTo(Integer value) {
            addCriterion("core_length <=", value, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthIn(List<Integer> values) {
            addCriterion("core_length in", values, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthNotIn(List<Integer> values) {
            addCriterion("core_length not in", values, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthBetween(Integer value1, Integer value2) {
            addCriterion("core_length between", value1, value2, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("core_length not between", value1, value2, "coreLength");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireIsNull() {
            addCriterion("core_micronaire is null");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireIsNotNull() {
            addCriterion("core_micronaire is not null");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireEqualTo(String value) {
            addCriterion("core_micronaire =", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireNotEqualTo(String value) {
            addCriterion("core_micronaire <>", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireGreaterThan(String value) {
            addCriterion("core_micronaire >", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireGreaterThanOrEqualTo(String value) {
            addCriterion("core_micronaire >=", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireLessThan(String value) {
            addCriterion("core_micronaire <", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireLessThanOrEqualTo(String value) {
            addCriterion("core_micronaire <=", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireLike(String value) {
            addCriterion("core_micronaire like", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireNotLike(String value) {
            addCriterion("core_micronaire not like", value, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireIn(List<String> values) {
            addCriterion("core_micronaire in", values, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireNotIn(List<String> values) {
            addCriterion("core_micronaire not in", values, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireBetween(String value1, String value2) {
            addCriterion("core_micronaire between", value1, value2, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andCoreMicronaireNotBetween(String value1, String value2) {
            addCriterion("core_micronaire not between", value1, value2, "coreMicronaire");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessIsNull() {
            addCriterion("max_evenness is null");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessIsNotNull() {
            addCriterion("max_evenness is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessEqualTo(Integer value) {
            addCriterion("max_evenness =", value, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessNotEqualTo(Integer value) {
            addCriterion("max_evenness <>", value, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessGreaterThan(Integer value) {
            addCriterion("max_evenness >", value, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_evenness >=", value, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessLessThan(Integer value) {
            addCriterion("max_evenness <", value, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessLessThanOrEqualTo(Integer value) {
            addCriterion("max_evenness <=", value, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessIn(List<Integer> values) {
            addCriterion("max_evenness in", values, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessNotIn(List<Integer> values) {
            addCriterion("max_evenness not in", values, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessBetween(Integer value1, Integer value2) {
            addCriterion("max_evenness between", value1, value2, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMaxEvennessNotBetween(Integer value1, Integer value2) {
            addCriterion("max_evenness not between", value1, value2, "maxEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessIsNull() {
            addCriterion("min_evenness is null");
            return (Criteria) this;
        }

        public Criteria andMinEvennessIsNotNull() {
            addCriterion("min_evenness is not null");
            return (Criteria) this;
        }

        public Criteria andMinEvennessEqualTo(Integer value) {
            addCriterion("min_evenness =", value, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessNotEqualTo(Integer value) {
            addCriterion("min_evenness <>", value, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessGreaterThan(Integer value) {
            addCriterion("min_evenness >", value, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_evenness >=", value, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessLessThan(Integer value) {
            addCriterion("min_evenness <", value, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessLessThanOrEqualTo(Integer value) {
            addCriterion("min_evenness <=", value, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessIn(List<Integer> values) {
            addCriterion("min_evenness in", values, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessNotIn(List<Integer> values) {
            addCriterion("min_evenness not in", values, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessBetween(Integer value1, Integer value2) {
            addCriterion("min_evenness between", value1, value2, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andMinEvennessNotBetween(Integer value1, Integer value2) {
            addCriterion("min_evenness not between", value1, value2, "minEvenness");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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