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

        public Criteria andColourW1IsNull() {
            addCriterion("colour_w1 is null");
            return (Criteria) this;
        }

        public Criteria andColourW1IsNotNull() {
            addCriterion("colour_w1 is not null");
            return (Criteria) this;
        }

        public Criteria andColourW1EqualTo(Double value) {
            addCriterion("colour_w1 =", value, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1NotEqualTo(Double value) {
            addCriterion("colour_w1 <>", value, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1GreaterThan(Double value) {
            addCriterion("colour_w1 >", value, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_w1 >=", value, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1LessThan(Double value) {
            addCriterion("colour_w1 <", value, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1LessThanOrEqualTo(Double value) {
            addCriterion("colour_w1 <=", value, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1In(List<Double> values) {
            addCriterion("colour_w1 in", values, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1NotIn(List<Double> values) {
            addCriterion("colour_w1 not in", values, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1Between(Double value1, Double value2) {
            addCriterion("colour_w1 between", value1, value2, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW1NotBetween(Double value1, Double value2) {
            addCriterion("colour_w1 not between", value1, value2, "colourW1");
            return (Criteria) this;
        }

        public Criteria andColourW2IsNull() {
            addCriterion("colour_w2 is null");
            return (Criteria) this;
        }

        public Criteria andColourW2IsNotNull() {
            addCriterion("colour_w2 is not null");
            return (Criteria) this;
        }

        public Criteria andColourW2EqualTo(Double value) {
            addCriterion("colour_w2 =", value, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2NotEqualTo(Double value) {
            addCriterion("colour_w2 <>", value, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2GreaterThan(Double value) {
            addCriterion("colour_w2 >", value, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_w2 >=", value, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2LessThan(Double value) {
            addCriterion("colour_w2 <", value, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2LessThanOrEqualTo(Double value) {
            addCriterion("colour_w2 <=", value, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2In(List<Double> values) {
            addCriterion("colour_w2 in", values, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2NotIn(List<Double> values) {
            addCriterion("colour_w2 not in", values, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2Between(Double value1, Double value2) {
            addCriterion("colour_w2 between", value1, value2, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW2NotBetween(Double value1, Double value2) {
            addCriterion("colour_w2 not between", value1, value2, "colourW2");
            return (Criteria) this;
        }

        public Criteria andColourW3IsNull() {
            addCriterion("colour_w3 is null");
            return (Criteria) this;
        }

        public Criteria andColourW3IsNotNull() {
            addCriterion("colour_w3 is not null");
            return (Criteria) this;
        }

        public Criteria andColourW3EqualTo(Double value) {
            addCriterion("colour_w3 =", value, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3NotEqualTo(Double value) {
            addCriterion("colour_w3 <>", value, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3GreaterThan(Double value) {
            addCriterion("colour_w3 >", value, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_w3 >=", value, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3LessThan(Double value) {
            addCriterion("colour_w3 <", value, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3LessThanOrEqualTo(Double value) {
            addCriterion("colour_w3 <=", value, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3In(List<Double> values) {
            addCriterion("colour_w3 in", values, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3NotIn(List<Double> values) {
            addCriterion("colour_w3 not in", values, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3Between(Double value1, Double value2) {
            addCriterion("colour_w3 between", value1, value2, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW3NotBetween(Double value1, Double value2) {
            addCriterion("colour_w3 not between", value1, value2, "colourW3");
            return (Criteria) this;
        }

        public Criteria andColourW4IsNull() {
            addCriterion("colour_w4 is null");
            return (Criteria) this;
        }

        public Criteria andColourW4IsNotNull() {
            addCriterion("colour_w4 is not null");
            return (Criteria) this;
        }

        public Criteria andColourW4EqualTo(Double value) {
            addCriterion("colour_w4 =", value, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4NotEqualTo(Double value) {
            addCriterion("colour_w4 <>", value, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4GreaterThan(Double value) {
            addCriterion("colour_w4 >", value, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_w4 >=", value, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4LessThan(Double value) {
            addCriterion("colour_w4 <", value, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4LessThanOrEqualTo(Double value) {
            addCriterion("colour_w4 <=", value, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4In(List<Double> values) {
            addCriterion("colour_w4 in", values, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4NotIn(List<Double> values) {
            addCriterion("colour_w4 not in", values, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4Between(Double value1, Double value2) {
            addCriterion("colour_w4 between", value1, value2, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW4NotBetween(Double value1, Double value2) {
            addCriterion("colour_w4 not between", value1, value2, "colourW4");
            return (Criteria) this;
        }

        public Criteria andColourW5IsNull() {
            addCriterion("colour_w5 is null");
            return (Criteria) this;
        }

        public Criteria andColourW5IsNotNull() {
            addCriterion("colour_w5 is not null");
            return (Criteria) this;
        }

        public Criteria andColourW5EqualTo(Double value) {
            addCriterion("colour_w5 =", value, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5NotEqualTo(Double value) {
            addCriterion("colour_w5 <>", value, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5GreaterThan(Double value) {
            addCriterion("colour_w5 >", value, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_w5 >=", value, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5LessThan(Double value) {
            addCriterion("colour_w5 <", value, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5LessThanOrEqualTo(Double value) {
            addCriterion("colour_w5 <=", value, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5In(List<Double> values) {
            addCriterion("colour_w5 in", values, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5NotIn(List<Double> values) {
            addCriterion("colour_w5 not in", values, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5Between(Double value1, Double value2) {
            addCriterion("colour_w5 between", value1, value2, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourW5NotBetween(Double value1, Double value2) {
            addCriterion("colour_w5 not between", value1, value2, "colourW5");
            return (Criteria) this;
        }

        public Criteria andColourL1IsNull() {
            addCriterion("colour_l1 is null");
            return (Criteria) this;
        }

        public Criteria andColourL1IsNotNull() {
            addCriterion("colour_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andColourL1EqualTo(Double value) {
            addCriterion("colour_l1 =", value, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1NotEqualTo(Double value) {
            addCriterion("colour_l1 <>", value, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1GreaterThan(Double value) {
            addCriterion("colour_l1 >", value, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_l1 >=", value, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1LessThan(Double value) {
            addCriterion("colour_l1 <", value, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1LessThanOrEqualTo(Double value) {
            addCriterion("colour_l1 <=", value, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1In(List<Double> values) {
            addCriterion("colour_l1 in", values, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1NotIn(List<Double> values) {
            addCriterion("colour_l1 not in", values, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1Between(Double value1, Double value2) {
            addCriterion("colour_l1 between", value1, value2, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL1NotBetween(Double value1, Double value2) {
            addCriterion("colour_l1 not between", value1, value2, "colourL1");
            return (Criteria) this;
        }

        public Criteria andColourL2IsNull() {
            addCriterion("colour_l2 is null");
            return (Criteria) this;
        }

        public Criteria andColourL2IsNotNull() {
            addCriterion("colour_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andColourL2EqualTo(Double value) {
            addCriterion("colour_l2 =", value, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2NotEqualTo(Double value) {
            addCriterion("colour_l2 <>", value, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2GreaterThan(Double value) {
            addCriterion("colour_l2 >", value, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_l2 >=", value, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2LessThan(Double value) {
            addCriterion("colour_l2 <", value, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2LessThanOrEqualTo(Double value) {
            addCriterion("colour_l2 <=", value, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2In(List<Double> values) {
            addCriterion("colour_l2 in", values, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2NotIn(List<Double> values) {
            addCriterion("colour_l2 not in", values, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2Between(Double value1, Double value2) {
            addCriterion("colour_l2 between", value1, value2, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL2NotBetween(Double value1, Double value2) {
            addCriterion("colour_l2 not between", value1, value2, "colourL2");
            return (Criteria) this;
        }

        public Criteria andColourL3IsNull() {
            addCriterion("colour_l3 is null");
            return (Criteria) this;
        }

        public Criteria andColourL3IsNotNull() {
            addCriterion("colour_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andColourL3EqualTo(Double value) {
            addCriterion("colour_l3 =", value, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3NotEqualTo(Double value) {
            addCriterion("colour_l3 <>", value, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3GreaterThan(Double value) {
            addCriterion("colour_l3 >", value, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_l3 >=", value, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3LessThan(Double value) {
            addCriterion("colour_l3 <", value, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3LessThanOrEqualTo(Double value) {
            addCriterion("colour_l3 <=", value, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3In(List<Double> values) {
            addCriterion("colour_l3 in", values, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3NotIn(List<Double> values) {
            addCriterion("colour_l3 not in", values, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3Between(Double value1, Double value2) {
            addCriterion("colour_l3 between", value1, value2, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourL3NotBetween(Double value1, Double value2) {
            addCriterion("colour_l3 not between", value1, value2, "colourL3");
            return (Criteria) this;
        }

        public Criteria andColourLy1IsNull() {
            addCriterion("colour_ly1 is null");
            return (Criteria) this;
        }

        public Criteria andColourLy1IsNotNull() {
            addCriterion("colour_ly1 is not null");
            return (Criteria) this;
        }

        public Criteria andColourLy1EqualTo(Double value) {
            addCriterion("colour_ly1 =", value, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1NotEqualTo(Double value) {
            addCriterion("colour_ly1 <>", value, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1GreaterThan(Double value) {
            addCriterion("colour_ly1 >", value, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_ly1 >=", value, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1LessThan(Double value) {
            addCriterion("colour_ly1 <", value, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1LessThanOrEqualTo(Double value) {
            addCriterion("colour_ly1 <=", value, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1In(List<Double> values) {
            addCriterion("colour_ly1 in", values, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1NotIn(List<Double> values) {
            addCriterion("colour_ly1 not in", values, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1Between(Double value1, Double value2) {
            addCriterion("colour_ly1 between", value1, value2, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy1NotBetween(Double value1, Double value2) {
            addCriterion("colour_ly1 not between", value1, value2, "colourLy1");
            return (Criteria) this;
        }

        public Criteria andColourLy2IsNull() {
            addCriterion("colour_ly2 is null");
            return (Criteria) this;
        }

        public Criteria andColourLy2IsNotNull() {
            addCriterion("colour_ly2 is not null");
            return (Criteria) this;
        }

        public Criteria andColourLy2EqualTo(Double value) {
            addCriterion("colour_ly2 =", value, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2NotEqualTo(Double value) {
            addCriterion("colour_ly2 <>", value, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2GreaterThan(Double value) {
            addCriterion("colour_ly2 >", value, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_ly2 >=", value, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2LessThan(Double value) {
            addCriterion("colour_ly2 <", value, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2LessThanOrEqualTo(Double value) {
            addCriterion("colour_ly2 <=", value, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2In(List<Double> values) {
            addCriterion("colour_ly2 in", values, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2NotIn(List<Double> values) {
            addCriterion("colour_ly2 not in", values, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2Between(Double value1, Double value2) {
            addCriterion("colour_ly2 between", value1, value2, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy2NotBetween(Double value1, Double value2) {
            addCriterion("colour_ly2 not between", value1, value2, "colourLy2");
            return (Criteria) this;
        }

        public Criteria andColourLy3IsNull() {
            addCriterion("colour_ly3 is null");
            return (Criteria) this;
        }

        public Criteria andColourLy3IsNotNull() {
            addCriterion("colour_ly3 is not null");
            return (Criteria) this;
        }

        public Criteria andColourLy3EqualTo(Double value) {
            addCriterion("colour_ly3 =", value, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3NotEqualTo(Double value) {
            addCriterion("colour_ly3 <>", value, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3GreaterThan(Double value) {
            addCriterion("colour_ly3 >", value, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_ly3 >=", value, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3LessThan(Double value) {
            addCriterion("colour_ly3 <", value, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3LessThanOrEqualTo(Double value) {
            addCriterion("colour_ly3 <=", value, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3In(List<Double> values) {
            addCriterion("colour_ly3 in", values, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3NotIn(List<Double> values) {
            addCriterion("colour_ly3 not in", values, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3Between(Double value1, Double value2) {
            addCriterion("colour_ly3 between", value1, value2, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourLy3NotBetween(Double value1, Double value2) {
            addCriterion("colour_ly3 not between", value1, value2, "colourLy3");
            return (Criteria) this;
        }

        public Criteria andColourY1IsNull() {
            addCriterion("colour_y1 is null");
            return (Criteria) this;
        }

        public Criteria andColourY1IsNotNull() {
            addCriterion("colour_y1 is not null");
            return (Criteria) this;
        }

        public Criteria andColourY1EqualTo(Double value) {
            addCriterion("colour_y1 =", value, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1NotEqualTo(Double value) {
            addCriterion("colour_y1 <>", value, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1GreaterThan(Double value) {
            addCriterion("colour_y1 >", value, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_y1 >=", value, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1LessThan(Double value) {
            addCriterion("colour_y1 <", value, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1LessThanOrEqualTo(Double value) {
            addCriterion("colour_y1 <=", value, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1In(List<Double> values) {
            addCriterion("colour_y1 in", values, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1NotIn(List<Double> values) {
            addCriterion("colour_y1 not in", values, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1Between(Double value1, Double value2) {
            addCriterion("colour_y1 between", value1, value2, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY1NotBetween(Double value1, Double value2) {
            addCriterion("colour_y1 not between", value1, value2, "colourY1");
            return (Criteria) this;
        }

        public Criteria andColourY2IsNull() {
            addCriterion("colour_y2 is null");
            return (Criteria) this;
        }

        public Criteria andColourY2IsNotNull() {
            addCriterion("colour_y2 is not null");
            return (Criteria) this;
        }

        public Criteria andColourY2EqualTo(Double value) {
            addCriterion("colour_y2 =", value, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2NotEqualTo(Double value) {
            addCriterion("colour_y2 <>", value, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2GreaterThan(Double value) {
            addCriterion("colour_y2 >", value, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2GreaterThanOrEqualTo(Double value) {
            addCriterion("colour_y2 >=", value, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2LessThan(Double value) {
            addCriterion("colour_y2 <", value, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2LessThanOrEqualTo(Double value) {
            addCriterion("colour_y2 <=", value, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2In(List<Double> values) {
            addCriterion("colour_y2 in", values, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2NotIn(List<Double> values) {
            addCriterion("colour_y2 not in", values, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2Between(Double value1, Double value2) {
            addCriterion("colour_y2 between", value1, value2, "colourY2");
            return (Criteria) this;
        }

        public Criteria andColourY2NotBetween(Double value1, Double value2) {
            addCriterion("colour_y2 not between", value1, value2, "colourY2");
            return (Criteria) this;
        }

        public Criteria andGinningP1IsNull() {
            addCriterion("ginning_p1 is null");
            return (Criteria) this;
        }

        public Criteria andGinningP1IsNotNull() {
            addCriterion("ginning_p1 is not null");
            return (Criteria) this;
        }

        public Criteria andGinningP1EqualTo(Double value) {
            addCriterion("ginning_p1 =", value, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1NotEqualTo(Double value) {
            addCriterion("ginning_p1 <>", value, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1GreaterThan(Double value) {
            addCriterion("ginning_p1 >", value, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1GreaterThanOrEqualTo(Double value) {
            addCriterion("ginning_p1 >=", value, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1LessThan(Double value) {
            addCriterion("ginning_p1 <", value, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1LessThanOrEqualTo(Double value) {
            addCriterion("ginning_p1 <=", value, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1In(List<Double> values) {
            addCriterion("ginning_p1 in", values, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1NotIn(List<Double> values) {
            addCriterion("ginning_p1 not in", values, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1Between(Double value1, Double value2) {
            addCriterion("ginning_p1 between", value1, value2, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP1NotBetween(Double value1, Double value2) {
            addCriterion("ginning_p1 not between", value1, value2, "ginningP1");
            return (Criteria) this;
        }

        public Criteria andGinningP2IsNull() {
            addCriterion("ginning_p2 is null");
            return (Criteria) this;
        }

        public Criteria andGinningP2IsNotNull() {
            addCriterion("ginning_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andGinningP2EqualTo(Double value) {
            addCriterion("ginning_p2 =", value, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2NotEqualTo(Double value) {
            addCriterion("ginning_p2 <>", value, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2GreaterThan(Double value) {
            addCriterion("ginning_p2 >", value, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2GreaterThanOrEqualTo(Double value) {
            addCriterion("ginning_p2 >=", value, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2LessThan(Double value) {
            addCriterion("ginning_p2 <", value, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2LessThanOrEqualTo(Double value) {
            addCriterion("ginning_p2 <=", value, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2In(List<Double> values) {
            addCriterion("ginning_p2 in", values, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2NotIn(List<Double> values) {
            addCriterion("ginning_p2 not in", values, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2Between(Double value1, Double value2) {
            addCriterion("ginning_p2 between", value1, value2, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP2NotBetween(Double value1, Double value2) {
            addCriterion("ginning_p2 not between", value1, value2, "ginningP2");
            return (Criteria) this;
        }

        public Criteria andGinningP3IsNull() {
            addCriterion("ginning_p3 is null");
            return (Criteria) this;
        }

        public Criteria andGinningP3IsNotNull() {
            addCriterion("ginning_p3 is not null");
            return (Criteria) this;
        }

        public Criteria andGinningP3EqualTo(Double value) {
            addCriterion("ginning_p3 =", value, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3NotEqualTo(Double value) {
            addCriterion("ginning_p3 <>", value, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3GreaterThan(Double value) {
            addCriterion("ginning_p3 >", value, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3GreaterThanOrEqualTo(Double value) {
            addCriterion("ginning_p3 >=", value, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3LessThan(Double value) {
            addCriterion("ginning_p3 <", value, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3LessThanOrEqualTo(Double value) {
            addCriterion("ginning_p3 <=", value, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3In(List<Double> values) {
            addCriterion("ginning_p3 in", values, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3NotIn(List<Double> values) {
            addCriterion("ginning_p3 not in", values, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3Between(Double value1, Double value2) {
            addCriterion("ginning_p3 between", value1, value2, "ginningP3");
            return (Criteria) this;
        }

        public Criteria andGinningP3NotBetween(Double value1, Double value2) {
            addCriterion("ginning_p3 not between", value1, value2, "ginningP3");
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

        public Criteria andAvgLengthEqualTo(Double value) {
            addCriterion("avg_length =", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthNotEqualTo(Double value) {
            addCriterion("avg_length <>", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthGreaterThan(Double value) {
            addCriterion("avg_length >", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_length >=", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthLessThan(Double value) {
            addCriterion("avg_length <", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthLessThanOrEqualTo(Double value) {
            addCriterion("avg_length <=", value, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthIn(List<Double> values) {
            addCriterion("avg_length in", values, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthNotIn(List<Double> values) {
            addCriterion("avg_length not in", values, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthBetween(Double value1, Double value2) {
            addCriterion("avg_length between", value1, value2, "avgLength");
            return (Criteria) this;
        }

        public Criteria andAvgLengthNotBetween(Double value1, Double value2) {
            addCriterion("avg_length not between", value1, value2, "avgLength");
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

        public Criteria andAvgMicronaireEqualTo(Double value) {
            addCriterion("avg_micronaire =", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireNotEqualTo(Double value) {
            addCriterion("avg_micronaire <>", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireGreaterThan(Double value) {
            addCriterion("avg_micronaire >", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_micronaire >=", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireLessThan(Double value) {
            addCriterion("avg_micronaire <", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireLessThanOrEqualTo(Double value) {
            addCriterion("avg_micronaire <=", value, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireIn(List<Double> values) {
            addCriterion("avg_micronaire in", values, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireNotIn(List<Double> values) {
            addCriterion("avg_micronaire not in", values, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireBetween(Double value1, Double value2) {
            addCriterion("avg_micronaire between", value1, value2, "avgMicronaire");
            return (Criteria) this;
        }

        public Criteria andAvgMicronaireNotBetween(Double value1, Double value2) {
            addCriterion("avg_micronaire not between", value1, value2, "avgMicronaire");
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

        public Criteria andAvgEvennessEqualTo(Double value) {
            addCriterion("avg_evenness =", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessNotEqualTo(Double value) {
            addCriterion("avg_evenness <>", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessGreaterThan(Double value) {
            addCriterion("avg_evenness >", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_evenness >=", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessLessThan(Double value) {
            addCriterion("avg_evenness <", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessLessThanOrEqualTo(Double value) {
            addCriterion("avg_evenness <=", value, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessIn(List<Double> values) {
            addCriterion("avg_evenness in", values, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessNotIn(List<Double> values) {
            addCriterion("avg_evenness not in", values, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessBetween(Double value1, Double value2) {
            addCriterion("avg_evenness between", value1, value2, "avgEvenness");
            return (Criteria) this;
        }

        public Criteria andAvgEvennessNotBetween(Double value1, Double value2) {
            addCriterion("avg_evenness not between", value1, value2, "avgEvenness");
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

        public Criteria andStrengthEqualTo(Double value) {
            addCriterion("strength =", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotEqualTo(Double value) {
            addCriterion("strength <>", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThan(Double value) {
            addCriterion("strength >", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThanOrEqualTo(Double value) {
            addCriterion("strength >=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThan(Double value) {
            addCriterion("strength <", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThanOrEqualTo(Double value) {
            addCriterion("strength <=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthIn(List<Double> values) {
            addCriterion("strength in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotIn(List<Double> values) {
            addCriterion("strength not in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthBetween(Double value1, Double value2) {
            addCriterion("strength between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotBetween(Double value1, Double value2) {
            addCriterion("strength not between", value1, value2, "strength");
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

        public Criteria andMiscellaneousEqualTo(Double value) {
            addCriterion("miscellaneous =", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousNotEqualTo(Double value) {
            addCriterion("miscellaneous <>", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousGreaterThan(Double value) {
            addCriterion("miscellaneous >", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousGreaterThanOrEqualTo(Double value) {
            addCriterion("miscellaneous >=", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousLessThan(Double value) {
            addCriterion("miscellaneous <", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousLessThanOrEqualTo(Double value) {
            addCriterion("miscellaneous <=", value, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousIn(List<Double> values) {
            addCriterion("miscellaneous in", values, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousNotIn(List<Double> values) {
            addCriterion("miscellaneous not in", values, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousBetween(Double value1, Double value2) {
            addCriterion("miscellaneous between", value1, value2, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andMiscellaneousNotBetween(Double value1, Double value2) {
            addCriterion("miscellaneous not between", value1, value2, "miscellaneous");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
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