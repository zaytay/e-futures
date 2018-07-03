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

        public Criteria andLength32IsNull() {
            addCriterion("length_32 is null");
            return (Criteria) this;
        }

        public Criteria andLength32IsNotNull() {
            addCriterion("length_32 is not null");
            return (Criteria) this;
        }

        public Criteria andLength32EqualTo(Double value) {
            addCriterion("length_32 =", value, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32NotEqualTo(Double value) {
            addCriterion("length_32 <>", value, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32GreaterThan(Double value) {
            addCriterion("length_32 >", value, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32GreaterThanOrEqualTo(Double value) {
            addCriterion("length_32 >=", value, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32LessThan(Double value) {
            addCriterion("length_32 <", value, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32LessThanOrEqualTo(Double value) {
            addCriterion("length_32 <=", value, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32In(List<Double> values) {
            addCriterion("length_32 in", values, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32NotIn(List<Double> values) {
            addCriterion("length_32 not in", values, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32Between(Double value1, Double value2) {
            addCriterion("length_32 between", value1, value2, "length32");
            return (Criteria) this;
        }

        public Criteria andLength32NotBetween(Double value1, Double value2) {
            addCriterion("length_32 not between", value1, value2, "length32");
            return (Criteria) this;
        }

        public Criteria andLength31IsNull() {
            addCriterion("length_31 is null");
            return (Criteria) this;
        }

        public Criteria andLength31IsNotNull() {
            addCriterion("length_31 is not null");
            return (Criteria) this;
        }

        public Criteria andLength31EqualTo(Double value) {
            addCriterion("length_31 =", value, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31NotEqualTo(Double value) {
            addCriterion("length_31 <>", value, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31GreaterThan(Double value) {
            addCriterion("length_31 >", value, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31GreaterThanOrEqualTo(Double value) {
            addCriterion("length_31 >=", value, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31LessThan(Double value) {
            addCriterion("length_31 <", value, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31LessThanOrEqualTo(Double value) {
            addCriterion("length_31 <=", value, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31In(List<Double> values) {
            addCriterion("length_31 in", values, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31NotIn(List<Double> values) {
            addCriterion("length_31 not in", values, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31Between(Double value1, Double value2) {
            addCriterion("length_31 between", value1, value2, "length31");
            return (Criteria) this;
        }

        public Criteria andLength31NotBetween(Double value1, Double value2) {
            addCriterion("length_31 not between", value1, value2, "length31");
            return (Criteria) this;
        }

        public Criteria andLength30IsNull() {
            addCriterion("length_30 is null");
            return (Criteria) this;
        }

        public Criteria andLength30IsNotNull() {
            addCriterion("length_30 is not null");
            return (Criteria) this;
        }

        public Criteria andLength30EqualTo(Double value) {
            addCriterion("length_30 =", value, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30NotEqualTo(Double value) {
            addCriterion("length_30 <>", value, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30GreaterThan(Double value) {
            addCriterion("length_30 >", value, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30GreaterThanOrEqualTo(Double value) {
            addCriterion("length_30 >=", value, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30LessThan(Double value) {
            addCriterion("length_30 <", value, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30LessThanOrEqualTo(Double value) {
            addCriterion("length_30 <=", value, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30In(List<Double> values) {
            addCriterion("length_30 in", values, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30NotIn(List<Double> values) {
            addCriterion("length_30 not in", values, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30Between(Double value1, Double value2) {
            addCriterion("length_30 between", value1, value2, "length30");
            return (Criteria) this;
        }

        public Criteria andLength30NotBetween(Double value1, Double value2) {
            addCriterion("length_30 not between", value1, value2, "length30");
            return (Criteria) this;
        }

        public Criteria andLength29IsNull() {
            addCriterion("length_29 is null");
            return (Criteria) this;
        }

        public Criteria andLength29IsNotNull() {
            addCriterion("length_29 is not null");
            return (Criteria) this;
        }

        public Criteria andLength29EqualTo(Double value) {
            addCriterion("length_29 =", value, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29NotEqualTo(Double value) {
            addCriterion("length_29 <>", value, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29GreaterThan(Double value) {
            addCriterion("length_29 >", value, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29GreaterThanOrEqualTo(Double value) {
            addCriterion("length_29 >=", value, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29LessThan(Double value) {
            addCriterion("length_29 <", value, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29LessThanOrEqualTo(Double value) {
            addCriterion("length_29 <=", value, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29In(List<Double> values) {
            addCriterion("length_29 in", values, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29NotIn(List<Double> values) {
            addCriterion("length_29 not in", values, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29Between(Double value1, Double value2) {
            addCriterion("length_29 between", value1, value2, "length29");
            return (Criteria) this;
        }

        public Criteria andLength29NotBetween(Double value1, Double value2) {
            addCriterion("length_29 not between", value1, value2, "length29");
            return (Criteria) this;
        }

        public Criteria andLength28IsNull() {
            addCriterion("length_28 is null");
            return (Criteria) this;
        }

        public Criteria andLength28IsNotNull() {
            addCriterion("length_28 is not null");
            return (Criteria) this;
        }

        public Criteria andLength28EqualTo(Double value) {
            addCriterion("length_28 =", value, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28NotEqualTo(Double value) {
            addCriterion("length_28 <>", value, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28GreaterThan(Double value) {
            addCriterion("length_28 >", value, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28GreaterThanOrEqualTo(Double value) {
            addCriterion("length_28 >=", value, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28LessThan(Double value) {
            addCriterion("length_28 <", value, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28LessThanOrEqualTo(Double value) {
            addCriterion("length_28 <=", value, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28In(List<Double> values) {
            addCriterion("length_28 in", values, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28NotIn(List<Double> values) {
            addCriterion("length_28 not in", values, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28Between(Double value1, Double value2) {
            addCriterion("length_28 between", value1, value2, "length28");
            return (Criteria) this;
        }

        public Criteria andLength28NotBetween(Double value1, Double value2) {
            addCriterion("length_28 not between", value1, value2, "length28");
            return (Criteria) this;
        }

        public Criteria andLength27IsNull() {
            addCriterion("length_27 is null");
            return (Criteria) this;
        }

        public Criteria andLength27IsNotNull() {
            addCriterion("length_27 is not null");
            return (Criteria) this;
        }

        public Criteria andLength27EqualTo(Double value) {
            addCriterion("length_27 =", value, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27NotEqualTo(Double value) {
            addCriterion("length_27 <>", value, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27GreaterThan(Double value) {
            addCriterion("length_27 >", value, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27GreaterThanOrEqualTo(Double value) {
            addCriterion("length_27 >=", value, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27LessThan(Double value) {
            addCriterion("length_27 <", value, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27LessThanOrEqualTo(Double value) {
            addCriterion("length_27 <=", value, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27In(List<Double> values) {
            addCriterion("length_27 in", values, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27NotIn(List<Double> values) {
            addCriterion("length_27 not in", values, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27Between(Double value1, Double value2) {
            addCriterion("length_27 between", value1, value2, "length27");
            return (Criteria) this;
        }

        public Criteria andLength27NotBetween(Double value1, Double value2) {
            addCriterion("length_27 not between", value1, value2, "length27");
            return (Criteria) this;
        }

        public Criteria andLength26IsNull() {
            addCriterion("length_26 is null");
            return (Criteria) this;
        }

        public Criteria andLength26IsNotNull() {
            addCriterion("length_26 is not null");
            return (Criteria) this;
        }

        public Criteria andLength26EqualTo(Double value) {
            addCriterion("length_26 =", value, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26NotEqualTo(Double value) {
            addCriterion("length_26 <>", value, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26GreaterThan(Double value) {
            addCriterion("length_26 >", value, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26GreaterThanOrEqualTo(Double value) {
            addCriterion("length_26 >=", value, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26LessThan(Double value) {
            addCriterion("length_26 <", value, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26LessThanOrEqualTo(Double value) {
            addCriterion("length_26 <=", value, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26In(List<Double> values) {
            addCriterion("length_26 in", values, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26NotIn(List<Double> values) {
            addCriterion("length_26 not in", values, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26Between(Double value1, Double value2) {
            addCriterion("length_26 between", value1, value2, "length26");
            return (Criteria) this;
        }

        public Criteria andLength26NotBetween(Double value1, Double value2) {
            addCriterion("length_26 not between", value1, value2, "length26");
            return (Criteria) this;
        }

        public Criteria andLength25IsNull() {
            addCriterion("length_25 is null");
            return (Criteria) this;
        }

        public Criteria andLength25IsNotNull() {
            addCriterion("length_25 is not null");
            return (Criteria) this;
        }

        public Criteria andLength25EqualTo(Double value) {
            addCriterion("length_25 =", value, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25NotEqualTo(Double value) {
            addCriterion("length_25 <>", value, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25GreaterThan(Double value) {
            addCriterion("length_25 >", value, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25GreaterThanOrEqualTo(Double value) {
            addCriterion("length_25 >=", value, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25LessThan(Double value) {
            addCriterion("length_25 <", value, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25LessThanOrEqualTo(Double value) {
            addCriterion("length_25 <=", value, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25In(List<Double> values) {
            addCriterion("length_25 in", values, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25NotIn(List<Double> values) {
            addCriterion("length_25 not in", values, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25Between(Double value1, Double value2) {
            addCriterion("length_25 between", value1, value2, "length25");
            return (Criteria) this;
        }

        public Criteria andLength25NotBetween(Double value1, Double value2) {
            addCriterion("length_25 not between", value1, value2, "length25");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1IsNull() {
            addCriterion("micronaire_c1 is null");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1IsNotNull() {
            addCriterion("micronaire_c1 is not null");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1EqualTo(Double value) {
            addCriterion("micronaire_c1 =", value, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1NotEqualTo(Double value) {
            addCriterion("micronaire_c1 <>", value, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1GreaterThan(Double value) {
            addCriterion("micronaire_c1 >", value, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1GreaterThanOrEqualTo(Double value) {
            addCriterion("micronaire_c1 >=", value, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1LessThan(Double value) {
            addCriterion("micronaire_c1 <", value, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1LessThanOrEqualTo(Double value) {
            addCriterion("micronaire_c1 <=", value, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1In(List<Double> values) {
            addCriterion("micronaire_c1 in", values, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1NotIn(List<Double> values) {
            addCriterion("micronaire_c1 not in", values, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1Between(Double value1, Double value2) {
            addCriterion("micronaire_c1 between", value1, value2, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireC1NotBetween(Double value1, Double value2) {
            addCriterion("micronaire_c1 not between", value1, value2, "micronaireC1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1IsNull() {
            addCriterion("micronaire_b1 is null");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1IsNotNull() {
            addCriterion("micronaire_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1EqualTo(Double value) {
            addCriterion("micronaire_b1 =", value, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1NotEqualTo(Double value) {
            addCriterion("micronaire_b1 <>", value, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1GreaterThan(Double value) {
            addCriterion("micronaire_b1 >", value, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1GreaterThanOrEqualTo(Double value) {
            addCriterion("micronaire_b1 >=", value, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1LessThan(Double value) {
            addCriterion("micronaire_b1 <", value, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1LessThanOrEqualTo(Double value) {
            addCriterion("micronaire_b1 <=", value, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1In(List<Double> values) {
            addCriterion("micronaire_b1 in", values, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1NotIn(List<Double> values) {
            addCriterion("micronaire_b1 not in", values, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1Between(Double value1, Double value2) {
            addCriterion("micronaire_b1 between", value1, value2, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireB1NotBetween(Double value1, Double value2) {
            addCriterion("micronaire_b1 not between", value1, value2, "micronaireB1");
            return (Criteria) this;
        }

        public Criteria andMicronaireAIsNull() {
            addCriterion("micronaire_a is null");
            return (Criteria) this;
        }

        public Criteria andMicronaireAIsNotNull() {
            addCriterion("micronaire_a is not null");
            return (Criteria) this;
        }

        public Criteria andMicronaireAEqualTo(Double value) {
            addCriterion("micronaire_a =", value, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireANotEqualTo(Double value) {
            addCriterion("micronaire_a <>", value, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireAGreaterThan(Double value) {
            addCriterion("micronaire_a >", value, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireAGreaterThanOrEqualTo(Double value) {
            addCriterion("micronaire_a >=", value, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireALessThan(Double value) {
            addCriterion("micronaire_a <", value, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireALessThanOrEqualTo(Double value) {
            addCriterion("micronaire_a <=", value, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireAIn(List<Double> values) {
            addCriterion("micronaire_a in", values, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireANotIn(List<Double> values) {
            addCriterion("micronaire_a not in", values, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireABetween(Double value1, Double value2) {
            addCriterion("micronaire_a between", value1, value2, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireANotBetween(Double value1, Double value2) {
            addCriterion("micronaire_a not between", value1, value2, "micronaireA");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2IsNull() {
            addCriterion("micronaire_b2 is null");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2IsNotNull() {
            addCriterion("micronaire_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2EqualTo(Double value) {
            addCriterion("micronaire_b2 =", value, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2NotEqualTo(Double value) {
            addCriterion("micronaire_b2 <>", value, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2GreaterThan(Double value) {
            addCriterion("micronaire_b2 >", value, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2GreaterThanOrEqualTo(Double value) {
            addCriterion("micronaire_b2 >=", value, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2LessThan(Double value) {
            addCriterion("micronaire_b2 <", value, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2LessThanOrEqualTo(Double value) {
            addCriterion("micronaire_b2 <=", value, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2In(List<Double> values) {
            addCriterion("micronaire_b2 in", values, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2NotIn(List<Double> values) {
            addCriterion("micronaire_b2 not in", values, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2Between(Double value1, Double value2) {
            addCriterion("micronaire_b2 between", value1, value2, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireB2NotBetween(Double value1, Double value2) {
            addCriterion("micronaire_b2 not between", value1, value2, "micronaireB2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2IsNull() {
            addCriterion("micronaire_c2 is null");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2IsNotNull() {
            addCriterion("micronaire_c2 is not null");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2EqualTo(Double value) {
            addCriterion("micronaire_c2 =", value, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2NotEqualTo(Double value) {
            addCriterion("micronaire_c2 <>", value, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2GreaterThan(Double value) {
            addCriterion("micronaire_c2 >", value, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2GreaterThanOrEqualTo(Double value) {
            addCriterion("micronaire_c2 >=", value, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2LessThan(Double value) {
            addCriterion("micronaire_c2 <", value, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2LessThanOrEqualTo(Double value) {
            addCriterion("micronaire_c2 <=", value, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2In(List<Double> values) {
            addCriterion("micronaire_c2 in", values, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2NotIn(List<Double> values) {
            addCriterion("micronaire_c2 not in", values, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2Between(Double value1, Double value2) {
            addCriterion("micronaire_c2 between", value1, value2, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andMicronaireC2NotBetween(Double value1, Double value2) {
            addCriterion("micronaire_c2 not between", value1, value2, "micronaireC2");
            return (Criteria) this;
        }

        public Criteria andHuichaoIsNull() {
            addCriterion("huichao is null");
            return (Criteria) this;
        }

        public Criteria andHuichaoIsNotNull() {
            addCriterion("huichao is not null");
            return (Criteria) this;
        }

        public Criteria andHuichaoEqualTo(Double value) {
            addCriterion("huichao =", value, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoNotEqualTo(Double value) {
            addCriterion("huichao <>", value, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoGreaterThan(Double value) {
            addCriterion("huichao >", value, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoGreaterThanOrEqualTo(Double value) {
            addCriterion("huichao >=", value, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoLessThan(Double value) {
            addCriterion("huichao <", value, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoLessThanOrEqualTo(Double value) {
            addCriterion("huichao <=", value, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoIn(List<Double> values) {
            addCriterion("huichao in", values, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoNotIn(List<Double> values) {
            addCriterion("huichao not in", values, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoBetween(Double value1, Double value2) {
            addCriterion("huichao between", value1, value2, "huichao");
            return (Criteria) this;
        }

        public Criteria andHuichaoNotBetween(Double value1, Double value2) {
            addCriterion("huichao not between", value1, value2, "huichao");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxIsNull() {
            addCriterion("strength_max is null");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxIsNotNull() {
            addCriterion("strength_max is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxEqualTo(Double value) {
            addCriterion("strength_max =", value, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxNotEqualTo(Double value) {
            addCriterion("strength_max <>", value, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxGreaterThan(Double value) {
            addCriterion("strength_max >", value, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("strength_max >=", value, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxLessThan(Double value) {
            addCriterion("strength_max <", value, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxLessThanOrEqualTo(Double value) {
            addCriterion("strength_max <=", value, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxIn(List<Double> values) {
            addCriterion("strength_max in", values, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxNotIn(List<Double> values) {
            addCriterion("strength_max not in", values, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxBetween(Double value1, Double value2) {
            addCriterion("strength_max between", value1, value2, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMaxNotBetween(Double value1, Double value2) {
            addCriterion("strength_max not between", value1, value2, "strengthMax");
            return (Criteria) this;
        }

        public Criteria andStrengthMinIsNull() {
            addCriterion("strength_min is null");
            return (Criteria) this;
        }

        public Criteria andStrengthMinIsNotNull() {
            addCriterion("strength_min is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthMinEqualTo(Double value) {
            addCriterion("strength_min =", value, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinNotEqualTo(Double value) {
            addCriterion("strength_min <>", value, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinGreaterThan(Double value) {
            addCriterion("strength_min >", value, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinGreaterThanOrEqualTo(Double value) {
            addCriterion("strength_min >=", value, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinLessThan(Double value) {
            addCriterion("strength_min <", value, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinLessThanOrEqualTo(Double value) {
            addCriterion("strength_min <=", value, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinIn(List<Double> values) {
            addCriterion("strength_min in", values, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinNotIn(List<Double> values) {
            addCriterion("strength_min not in", values, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinBetween(Double value1, Double value2) {
            addCriterion("strength_min between", value1, value2, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andStrengthMinNotBetween(Double value1, Double value2) {
            addCriterion("strength_min not between", value1, value2, "strengthMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxIsNull() {
            addCriterion("evenness_max is null");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxIsNotNull() {
            addCriterion("evenness_max is not null");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxEqualTo(Double value) {
            addCriterion("evenness_max =", value, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxNotEqualTo(Double value) {
            addCriterion("evenness_max <>", value, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxGreaterThan(Double value) {
            addCriterion("evenness_max >", value, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("evenness_max >=", value, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxLessThan(Double value) {
            addCriterion("evenness_max <", value, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxLessThanOrEqualTo(Double value) {
            addCriterion("evenness_max <=", value, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxIn(List<Double> values) {
            addCriterion("evenness_max in", values, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxNotIn(List<Double> values) {
            addCriterion("evenness_max not in", values, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxBetween(Double value1, Double value2) {
            addCriterion("evenness_max between", value1, value2, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMaxNotBetween(Double value1, Double value2) {
            addCriterion("evenness_max not between", value1, value2, "evennessMax");
            return (Criteria) this;
        }

        public Criteria andEvennessMinIsNull() {
            addCriterion("evenness_min is null");
            return (Criteria) this;
        }

        public Criteria andEvennessMinIsNotNull() {
            addCriterion("evenness_min is not null");
            return (Criteria) this;
        }

        public Criteria andEvennessMinEqualTo(Double value) {
            addCriterion("evenness_min =", value, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinNotEqualTo(Double value) {
            addCriterion("evenness_min <>", value, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinGreaterThan(Double value) {
            addCriterion("evenness_min >", value, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinGreaterThanOrEqualTo(Double value) {
            addCriterion("evenness_min >=", value, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinLessThan(Double value) {
            addCriterion("evenness_min <", value, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinLessThanOrEqualTo(Double value) {
            addCriterion("evenness_min <=", value, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinIn(List<Double> values) {
            addCriterion("evenness_min in", values, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinNotIn(List<Double> values) {
            addCriterion("evenness_min not in", values, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinBetween(Double value1, Double value2) {
            addCriterion("evenness_min between", value1, value2, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andEvennessMinNotBetween(Double value1, Double value2) {
            addCriterion("evenness_min not between", value1, value2, "evennessMin");
            return (Criteria) this;
        }

        public Criteria andWeightGrossIsNull() {
            addCriterion("weight_gross is null");
            return (Criteria) this;
        }

        public Criteria andWeightGrossIsNotNull() {
            addCriterion("weight_gross is not null");
            return (Criteria) this;
        }

        public Criteria andWeightGrossEqualTo(Double value) {
            addCriterion("weight_gross =", value, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossNotEqualTo(Double value) {
            addCriterion("weight_gross <>", value, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossGreaterThan(Double value) {
            addCriterion("weight_gross >", value, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossGreaterThanOrEqualTo(Double value) {
            addCriterion("weight_gross >=", value, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossLessThan(Double value) {
            addCriterion("weight_gross <", value, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossLessThanOrEqualTo(Double value) {
            addCriterion("weight_gross <=", value, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossIn(List<Double> values) {
            addCriterion("weight_gross in", values, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossNotIn(List<Double> values) {
            addCriterion("weight_gross not in", values, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossBetween(Double value1, Double value2) {
            addCriterion("weight_gross between", value1, value2, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightGrossNotBetween(Double value1, Double value2) {
            addCriterion("weight_gross not between", value1, value2, "weightGross");
            return (Criteria) this;
        }

        public Criteria andWeightTareIsNull() {
            addCriterion("weight_tare is null");
            return (Criteria) this;
        }

        public Criteria andWeightTareIsNotNull() {
            addCriterion("weight_tare is not null");
            return (Criteria) this;
        }

        public Criteria andWeightTareEqualTo(Double value) {
            addCriterion("weight_tare =", value, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareNotEqualTo(Double value) {
            addCriterion("weight_tare <>", value, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareGreaterThan(Double value) {
            addCriterion("weight_tare >", value, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareGreaterThanOrEqualTo(Double value) {
            addCriterion("weight_tare >=", value, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareLessThan(Double value) {
            addCriterion("weight_tare <", value, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareLessThanOrEqualTo(Double value) {
            addCriterion("weight_tare <=", value, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareIn(List<Double> values) {
            addCriterion("weight_tare in", values, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareNotIn(List<Double> values) {
            addCriterion("weight_tare not in", values, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareBetween(Double value1, Double value2) {
            addCriterion("weight_tare between", value1, value2, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightTareNotBetween(Double value1, Double value2) {
            addCriterion("weight_tare not between", value1, value2, "weightTare");
            return (Criteria) this;
        }

        public Criteria andWeightNetIsNull() {
            addCriterion("weight_net is null");
            return (Criteria) this;
        }

        public Criteria andWeightNetIsNotNull() {
            addCriterion("weight_net is not null");
            return (Criteria) this;
        }

        public Criteria andWeightNetEqualTo(Double value) {
            addCriterion("weight_net =", value, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetNotEqualTo(Double value) {
            addCriterion("weight_net <>", value, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetGreaterThan(Double value) {
            addCriterion("weight_net >", value, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetGreaterThanOrEqualTo(Double value) {
            addCriterion("weight_net >=", value, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetLessThan(Double value) {
            addCriterion("weight_net <", value, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetLessThanOrEqualTo(Double value) {
            addCriterion("weight_net <=", value, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetIn(List<Double> values) {
            addCriterion("weight_net in", values, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetNotIn(List<Double> values) {
            addCriterion("weight_net not in", values, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetBetween(Double value1, Double value2) {
            addCriterion("weight_net between", value1, value2, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightNetNotBetween(Double value1, Double value2) {
            addCriterion("weight_net not between", value1, value2, "weightNet");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedIsNull() {
            addCriterion("weight_conditoned is null");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedIsNotNull() {
            addCriterion("weight_conditoned is not null");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedEqualTo(Double value) {
            addCriterion("weight_conditoned =", value, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedNotEqualTo(Double value) {
            addCriterion("weight_conditoned <>", value, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedGreaterThan(Double value) {
            addCriterion("weight_conditoned >", value, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedGreaterThanOrEqualTo(Double value) {
            addCriterion("weight_conditoned >=", value, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedLessThan(Double value) {
            addCriterion("weight_conditoned <", value, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedLessThanOrEqualTo(Double value) {
            addCriterion("weight_conditoned <=", value, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedIn(List<Double> values) {
            addCriterion("weight_conditoned in", values, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedNotIn(List<Double> values) {
            addCriterion("weight_conditoned not in", values, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedBetween(Double value1, Double value2) {
            addCriterion("weight_conditoned between", value1, value2, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andWeightConditonedNotBetween(Double value1, Double value2) {
            addCriterion("weight_conditoned not between", value1, value2, "weightConditoned");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingIsNull() {
            addCriterion("jiagongleixing is null");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingIsNotNull() {
            addCriterion("jiagongleixing is not null");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingEqualTo(String value) {
            addCriterion("jiagongleixing =", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingNotEqualTo(String value) {
            addCriterion("jiagongleixing <>", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingGreaterThan(String value) {
            addCriterion("jiagongleixing >", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingGreaterThanOrEqualTo(String value) {
            addCriterion("jiagongleixing >=", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingLessThan(String value) {
            addCriterion("jiagongleixing <", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingLessThanOrEqualTo(String value) {
            addCriterion("jiagongleixing <=", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingLike(String value) {
            addCriterion("jiagongleixing like", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingNotLike(String value) {
            addCriterion("jiagongleixing not like", value, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingIn(List<String> values) {
            addCriterion("jiagongleixing in", values, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingNotIn(List<String> values) {
            addCriterion("jiagongleixing not in", values, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingBetween(String value1, String value2) {
            addCriterion("jiagongleixing between", value1, value2, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andJiagongleixingNotBetween(String value1, String value2) {
            addCriterion("jiagongleixing not between", value1, value2, "jiagongleixing");
            return (Criteria) this;
        }

        public Criteria andPackageNumIsNull() {
            addCriterion("package_num is null");
            return (Criteria) this;
        }

        public Criteria andPackageNumIsNotNull() {
            addCriterion("package_num is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNumEqualTo(String value) {
            addCriterion("package_num =", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotEqualTo(String value) {
            addCriterion("package_num <>", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumGreaterThan(String value) {
            addCriterion("package_num >", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumGreaterThanOrEqualTo(String value) {
            addCriterion("package_num >=", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumLessThan(String value) {
            addCriterion("package_num <", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumLessThanOrEqualTo(String value) {
            addCriterion("package_num <=", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumLike(String value) {
            addCriterion("package_num like", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotLike(String value) {
            addCriterion("package_num not like", value, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumIn(List<String> values) {
            addCriterion("package_num in", values, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotIn(List<String> values) {
            addCriterion("package_num not in", values, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumBetween(String value1, String value2) {
            addCriterion("package_num between", value1, value2, "packageNum");
            return (Criteria) this;
        }

        public Criteria andPackageNumNotBetween(String value1, String value2) {
            addCriterion("package_num not between", value1, value2, "packageNum");
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