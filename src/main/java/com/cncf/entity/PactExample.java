package com.cncf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PactExample() {
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

        public Criteria andPactIdIsNull() {
            addCriterion("pact_id is null");
            return (Criteria) this;
        }

        public Criteria andPactIdIsNotNull() {
            addCriterion("pact_id is not null");
            return (Criteria) this;
        }

        public Criteria andPactIdEqualTo(String value) {
            addCriterion("pact_id =", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdNotEqualTo(String value) {
            addCriterion("pact_id <>", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdGreaterThan(String value) {
            addCriterion("pact_id >", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdGreaterThanOrEqualTo(String value) {
            addCriterion("pact_id >=", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdLessThan(String value) {
            addCriterion("pact_id <", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdLessThanOrEqualTo(String value) {
            addCriterion("pact_id <=", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdLike(String value) {
            addCriterion("pact_id like", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdNotLike(String value) {
            addCriterion("pact_id not like", value, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdIn(List<String> values) {
            addCriterion("pact_id in", values, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdNotIn(List<String> values) {
            addCriterion("pact_id not in", values, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdBetween(String value1, String value2) {
            addCriterion("pact_id between", value1, value2, "pactId");
            return (Criteria) this;
        }

        public Criteria andPactIdNotBetween(String value1, String value2) {
            addCriterion("pact_id not between", value1, value2, "pactId");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rid like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rid not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberIsNull() {
            addCriterion("pact_year_number is null");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberIsNotNull() {
            addCriterion("pact_year_number is not null");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberEqualTo(String value) {
            addCriterion("pact_year_number =", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberNotEqualTo(String value) {
            addCriterion("pact_year_number <>", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberGreaterThan(String value) {
            addCriterion("pact_year_number >", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pact_year_number >=", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberLessThan(String value) {
            addCriterion("pact_year_number <", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberLessThanOrEqualTo(String value) {
            addCriterion("pact_year_number <=", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberLike(String value) {
            addCriterion("pact_year_number like", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberNotLike(String value) {
            addCriterion("pact_year_number not like", value, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberIn(List<String> values) {
            addCriterion("pact_year_number in", values, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberNotIn(List<String> values) {
            addCriterion("pact_year_number not in", values, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberBetween(String value1, String value2) {
            addCriterion("pact_year_number between", value1, value2, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactYearNumberNotBetween(String value1, String value2) {
            addCriterion("pact_year_number not between", value1, value2, "pactYearNumber");
            return (Criteria) this;
        }

        public Criteria andPactFromIsNull() {
            addCriterion("pact_from is null");
            return (Criteria) this;
        }

        public Criteria andPactFromIsNotNull() {
            addCriterion("pact_from is not null");
            return (Criteria) this;
        }

        public Criteria andPactFromEqualTo(String value) {
            addCriterion("pact_from =", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromNotEqualTo(String value) {
            addCriterion("pact_from <>", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromGreaterThan(String value) {
            addCriterion("pact_from >", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromGreaterThanOrEqualTo(String value) {
            addCriterion("pact_from >=", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromLessThan(String value) {
            addCriterion("pact_from <", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromLessThanOrEqualTo(String value) {
            addCriterion("pact_from <=", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromLike(String value) {
            addCriterion("pact_from like", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromNotLike(String value) {
            addCriterion("pact_from not like", value, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromIn(List<String> values) {
            addCriterion("pact_from in", values, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromNotIn(List<String> values) {
            addCriterion("pact_from not in", values, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromBetween(String value1, String value2) {
            addCriterion("pact_from between", value1, value2, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactFromNotBetween(String value1, String value2) {
            addCriterion("pact_from not between", value1, value2, "pactFrom");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeIsNull() {
            addCriterion("pact_check_type is null");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeIsNotNull() {
            addCriterion("pact_check_type is not null");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeEqualTo(String value) {
            addCriterion("pact_check_type =", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeNotEqualTo(String value) {
            addCriterion("pact_check_type <>", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeGreaterThan(String value) {
            addCriterion("pact_check_type >", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pact_check_type >=", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeLessThan(String value) {
            addCriterion("pact_check_type <", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("pact_check_type <=", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeLike(String value) {
            addCriterion("pact_check_type like", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeNotLike(String value) {
            addCriterion("pact_check_type not like", value, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeIn(List<String> values) {
            addCriterion("pact_check_type in", values, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeNotIn(List<String> values) {
            addCriterion("pact_check_type not in", values, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeBetween(String value1, String value2) {
            addCriterion("pact_check_type between", value1, value2, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andPactCheckTypeNotBetween(String value1, String value2) {
            addCriterion("pact_check_type not between", value1, value2, "pactCheckType");
            return (Criteria) this;
        }

        public Criteria andStandardFlagIsNull() {
            addCriterion("standard_flag is null");
            return (Criteria) this;
        }

        public Criteria andStandardFlagIsNotNull() {
            addCriterion("standard_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStandardFlagEqualTo(String value) {
            addCriterion("standard_flag =", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagNotEqualTo(String value) {
            addCriterion("standard_flag <>", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagGreaterThan(String value) {
            addCriterion("standard_flag >", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagGreaterThanOrEqualTo(String value) {
            addCriterion("standard_flag >=", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagLessThan(String value) {
            addCriterion("standard_flag <", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagLessThanOrEqualTo(String value) {
            addCriterion("standard_flag <=", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagLike(String value) {
            addCriterion("standard_flag like", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagNotLike(String value) {
            addCriterion("standard_flag not like", value, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagIn(List<String> values) {
            addCriterion("standard_flag in", values, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagNotIn(List<String> values) {
            addCriterion("standard_flag not in", values, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagBetween(String value1, String value2) {
            addCriterion("standard_flag between", value1, value2, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andStandardFlagNotBetween(String value1, String value2) {
            addCriterion("standard_flag not between", value1, value2, "standardFlag");
            return (Criteria) this;
        }

        public Criteria andApplyLevelIsNull() {
            addCriterion("apply_level is null");
            return (Criteria) this;
        }

        public Criteria andApplyLevelIsNotNull() {
            addCriterion("apply_level is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLevelEqualTo(String value) {
            addCriterion("apply_level =", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotEqualTo(String value) {
            addCriterion("apply_level <>", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelGreaterThan(String value) {
            addCriterion("apply_level >", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("apply_level >=", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelLessThan(String value) {
            addCriterion("apply_level <", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelLessThanOrEqualTo(String value) {
            addCriterion("apply_level <=", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelLike(String value) {
            addCriterion("apply_level like", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotLike(String value) {
            addCriterion("apply_level not like", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelIn(List<String> values) {
            addCriterion("apply_level in", values, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotIn(List<String> values) {
            addCriterion("apply_level not in", values, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelBetween(String value1, String value2) {
            addCriterion("apply_level between", value1, value2, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotBetween(String value1, String value2) {
            addCriterion("apply_level not between", value1, value2, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(String value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(String value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(String value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(String value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(String value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLike(String value) {
            addCriterion("product_type_id like", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotLike(String value) {
            addCriterion("product_type_id not like", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<String> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<String> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(String value1, String value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(String value1, String value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductAliasIsNull() {
            addCriterion("product_alias is null");
            return (Criteria) this;
        }

        public Criteria andProductAliasIsNotNull() {
            addCriterion("product_alias is not null");
            return (Criteria) this;
        }

        public Criteria andProductAliasEqualTo(String value) {
            addCriterion("product_alias =", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasNotEqualTo(String value) {
            addCriterion("product_alias <>", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasGreaterThan(String value) {
            addCriterion("product_alias >", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasGreaterThanOrEqualTo(String value) {
            addCriterion("product_alias >=", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasLessThan(String value) {
            addCriterion("product_alias <", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasLessThanOrEqualTo(String value) {
            addCriterion("product_alias <=", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasLike(String value) {
            addCriterion("product_alias like", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasNotLike(String value) {
            addCriterion("product_alias not like", value, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasIn(List<String> values) {
            addCriterion("product_alias in", values, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasNotIn(List<String> values) {
            addCriterion("product_alias not in", values, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasBetween(String value1, String value2) {
            addCriterion("product_alias between", value1, value2, "productAlias");
            return (Criteria) this;
        }

        public Criteria andProductAliasNotBetween(String value1, String value2) {
            addCriterion("product_alias not between", value1, value2, "productAlias");
            return (Criteria) this;
        }

        public Criteria andTestCycleIsNull() {
            addCriterion("test_cycle is null");
            return (Criteria) this;
        }

        public Criteria andTestCycleIsNotNull() {
            addCriterion("test_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andTestCycleEqualTo(String value) {
            addCriterion("test_cycle =", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleNotEqualTo(String value) {
            addCriterion("test_cycle <>", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleGreaterThan(String value) {
            addCriterion("test_cycle >", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleGreaterThanOrEqualTo(String value) {
            addCriterion("test_cycle >=", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleLessThan(String value) {
            addCriterion("test_cycle <", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleLessThanOrEqualTo(String value) {
            addCriterion("test_cycle <=", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleLike(String value) {
            addCriterion("test_cycle like", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleNotLike(String value) {
            addCriterion("test_cycle not like", value, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleIn(List<String> values) {
            addCriterion("test_cycle in", values, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleNotIn(List<String> values) {
            addCriterion("test_cycle not in", values, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleBetween(String value1, String value2) {
            addCriterion("test_cycle between", value1, value2, "testCycle");
            return (Criteria) this;
        }

        public Criteria andTestCycleNotBetween(String value1, String value2) {
            addCriterion("test_cycle not between", value1, value2, "testCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleIsNull() {
            addCriterion("ext_test_cycle is null");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleIsNotNull() {
            addCriterion("ext_test_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleEqualTo(Integer value) {
            addCriterion("ext_test_cycle =", value, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleNotEqualTo(Integer value) {
            addCriterion("ext_test_cycle <>", value, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleGreaterThan(Integer value) {
            addCriterion("ext_test_cycle >", value, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_test_cycle >=", value, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleLessThan(Integer value) {
            addCriterion("ext_test_cycle <", value, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleLessThanOrEqualTo(Integer value) {
            addCriterion("ext_test_cycle <=", value, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleIn(List<Integer> values) {
            addCriterion("ext_test_cycle in", values, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleNotIn(List<Integer> values) {
            addCriterion("ext_test_cycle not in", values, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleBetween(Integer value1, Integer value2) {
            addCriterion("ext_test_cycle between", value1, value2, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_test_cycle not between", value1, value2, "extTestCycle");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoIsNull() {
            addCriterion("ext_test_cycle_info is null");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoIsNotNull() {
            addCriterion("ext_test_cycle_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoEqualTo(String value) {
            addCriterion("ext_test_cycle_info =", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoNotEqualTo(String value) {
            addCriterion("ext_test_cycle_info <>", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoGreaterThan(String value) {
            addCriterion("ext_test_cycle_info >", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ext_test_cycle_info >=", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoLessThan(String value) {
            addCriterion("ext_test_cycle_info <", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoLessThanOrEqualTo(String value) {
            addCriterion("ext_test_cycle_info <=", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoLike(String value) {
            addCriterion("ext_test_cycle_info like", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoNotLike(String value) {
            addCriterion("ext_test_cycle_info not like", value, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoIn(List<String> values) {
            addCriterion("ext_test_cycle_info in", values, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoNotIn(List<String> values) {
            addCriterion("ext_test_cycle_info not in", values, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoBetween(String value1, String value2) {
            addCriterion("ext_test_cycle_info between", value1, value2, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andExtTestCycleInfoNotBetween(String value1, String value2) {
            addCriterion("ext_test_cycle_info not between", value1, value2, "extTestCycleInfo");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeIsNull() {
            addCriterion("check_product_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeIsNotNull() {
            addCriterion("check_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeEqualTo(String value) {
            addCriterion("check_product_type =", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeNotEqualTo(String value) {
            addCriterion("check_product_type <>", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeGreaterThan(String value) {
            addCriterion("check_product_type >", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("check_product_type >=", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeLessThan(String value) {
            addCriterion("check_product_type <", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeLessThanOrEqualTo(String value) {
            addCriterion("check_product_type <=", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeLike(String value) {
            addCriterion("check_product_type like", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeNotLike(String value) {
            addCriterion("check_product_type not like", value, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeIn(List<String> values) {
            addCriterion("check_product_type in", values, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeNotIn(List<String> values) {
            addCriterion("check_product_type not in", values, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeBetween(String value1, String value2) {
            addCriterion("check_product_type between", value1, value2, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andCheckProductTypeNotBetween(String value1, String value2) {
            addCriterion("check_product_type not between", value1, value2, "checkProductType");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdIsNull() {
            addCriterion("consign_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdIsNotNull() {
            addCriterion("consign_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdEqualTo(String value) {
            addCriterion("consign_customer_id =", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdNotEqualTo(String value) {
            addCriterion("consign_customer_id <>", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdGreaterThan(String value) {
            addCriterion("consign_customer_id >", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("consign_customer_id >=", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdLessThan(String value) {
            addCriterion("consign_customer_id <", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("consign_customer_id <=", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdLike(String value) {
            addCriterion("consign_customer_id like", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdNotLike(String value) {
            addCriterion("consign_customer_id not like", value, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdIn(List<String> values) {
            addCriterion("consign_customer_id in", values, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdNotIn(List<String> values) {
            addCriterion("consign_customer_id not in", values, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdBetween(String value1, String value2) {
            addCriterion("consign_customer_id between", value1, value2, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerIdNotBetween(String value1, String value2) {
            addCriterion("consign_customer_id not between", value1, value2, "consignCustomerId");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameIsNull() {
            addCriterion("consign_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameIsNotNull() {
            addCriterion("consign_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameEqualTo(String value) {
            addCriterion("consign_customer_name =", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameNotEqualTo(String value) {
            addCriterion("consign_customer_name <>", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameGreaterThan(String value) {
            addCriterion("consign_customer_name >", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("consign_customer_name >=", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameLessThan(String value) {
            addCriterion("consign_customer_name <", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("consign_customer_name <=", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameLike(String value) {
            addCriterion("consign_customer_name like", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameNotLike(String value) {
            addCriterion("consign_customer_name not like", value, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameIn(List<String> values) {
            addCriterion("consign_customer_name in", values, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameNotIn(List<String> values) {
            addCriterion("consign_customer_name not in", values, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameBetween(String value1, String value2) {
            addCriterion("consign_customer_name between", value1, value2, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andConsignCustomerNameNotBetween(String value1, String value2) {
            addCriterion("consign_customer_name not between", value1, value2, "consignCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdIsNull() {
            addCriterion("product_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdIsNotNull() {
            addCriterion("product_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdEqualTo(String value) {
            addCriterion("product_customer_id =", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdNotEqualTo(String value) {
            addCriterion("product_customer_id <>", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdGreaterThan(String value) {
            addCriterion("product_customer_id >", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_customer_id >=", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdLessThan(String value) {
            addCriterion("product_customer_id <", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("product_customer_id <=", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdLike(String value) {
            addCriterion("product_customer_id like", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdNotLike(String value) {
            addCriterion("product_customer_id not like", value, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdIn(List<String> values) {
            addCriterion("product_customer_id in", values, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdNotIn(List<String> values) {
            addCriterion("product_customer_id not in", values, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdBetween(String value1, String value2) {
            addCriterion("product_customer_id between", value1, value2, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerIdNotBetween(String value1, String value2) {
            addCriterion("product_customer_id not between", value1, value2, "productCustomerId");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagIsNull() {
            addCriterion("product_customer_flag is null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagIsNotNull() {
            addCriterion("product_customer_flag is not null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagEqualTo(Integer value) {
            addCriterion("product_customer_flag =", value, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagNotEqualTo(Integer value) {
            addCriterion("product_customer_flag <>", value, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagGreaterThan(Integer value) {
            addCriterion("product_customer_flag >", value, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_customer_flag >=", value, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagLessThan(Integer value) {
            addCriterion("product_customer_flag <", value, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagLessThanOrEqualTo(Integer value) {
            addCriterion("product_customer_flag <=", value, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagIn(List<Integer> values) {
            addCriterion("product_customer_flag in", values, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagNotIn(List<Integer> values) {
            addCriterion("product_customer_flag not in", values, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagBetween(Integer value1, Integer value2) {
            addCriterion("product_customer_flag between", value1, value2, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("product_customer_flag not between", value1, value2, "productCustomerFlag");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameIsNull() {
            addCriterion("product_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameIsNotNull() {
            addCriterion("product_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameEqualTo(String value) {
            addCriterion("product_customer_name =", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameNotEqualTo(String value) {
            addCriterion("product_customer_name <>", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameGreaterThan(String value) {
            addCriterion("product_customer_name >", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_customer_name >=", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameLessThan(String value) {
            addCriterion("product_customer_name <", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("product_customer_name <=", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameLike(String value) {
            addCriterion("product_customer_name like", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameNotLike(String value) {
            addCriterion("product_customer_name not like", value, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameIn(List<String> values) {
            addCriterion("product_customer_name in", values, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameNotIn(List<String> values) {
            addCriterion("product_customer_name not in", values, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameBetween(String value1, String value2) {
            addCriterion("product_customer_name between", value1, value2, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerNameNotBetween(String value1, String value2) {
            addCriterion("product_customer_name not between", value1, value2, "productCustomerName");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonIsNull() {
            addCriterion("product_customer_legal_person is null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonIsNotNull() {
            addCriterion("product_customer_legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonEqualTo(String value) {
            addCriterion("product_customer_legal_person =", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonNotEqualTo(String value) {
            addCriterion("product_customer_legal_person <>", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonGreaterThan(String value) {
            addCriterion("product_customer_legal_person >", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("product_customer_legal_person >=", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonLessThan(String value) {
            addCriterion("product_customer_legal_person <", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("product_customer_legal_person <=", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonLike(String value) {
            addCriterion("product_customer_legal_person like", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonNotLike(String value) {
            addCriterion("product_customer_legal_person not like", value, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonIn(List<String> values) {
            addCriterion("product_customer_legal_person in", values, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonNotIn(List<String> values) {
            addCriterion("product_customer_legal_person not in", values, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonBetween(String value1, String value2) {
            addCriterion("product_customer_legal_person between", value1, value2, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andProductCustomerLegalPersonNotBetween(String value1, String value2) {
            addCriterion("product_customer_legal_person not between", value1, value2, "productCustomerLegalPerson");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdIsNull() {
            addCriterion("check_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdIsNotNull() {
            addCriterion("check_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdEqualTo(String value) {
            addCriterion("check_customer_id =", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdNotEqualTo(String value) {
            addCriterion("check_customer_id <>", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdGreaterThan(String value) {
            addCriterion("check_customer_id >", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_customer_id >=", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdLessThan(String value) {
            addCriterion("check_customer_id <", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("check_customer_id <=", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdLike(String value) {
            addCriterion("check_customer_id like", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdNotLike(String value) {
            addCriterion("check_customer_id not like", value, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdIn(List<String> values) {
            addCriterion("check_customer_id in", values, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdNotIn(List<String> values) {
            addCriterion("check_customer_id not in", values, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdBetween(String value1, String value2) {
            addCriterion("check_customer_id between", value1, value2, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerIdNotBetween(String value1, String value2) {
            addCriterion("check_customer_id not between", value1, value2, "checkCustomerId");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameIsNull() {
            addCriterion("check_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameIsNotNull() {
            addCriterion("check_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameEqualTo(String value) {
            addCriterion("check_customer_name =", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameNotEqualTo(String value) {
            addCriterion("check_customer_name <>", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameGreaterThan(String value) {
            addCriterion("check_customer_name >", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_customer_name >=", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameLessThan(String value) {
            addCriterion("check_customer_name <", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("check_customer_name <=", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameLike(String value) {
            addCriterion("check_customer_name like", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameNotLike(String value) {
            addCriterion("check_customer_name not like", value, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameIn(List<String> values) {
            addCriterion("check_customer_name in", values, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameNotIn(List<String> values) {
            addCriterion("check_customer_name not in", values, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameBetween(String value1, String value2) {
            addCriterion("check_customer_name between", value1, value2, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerNameNotBetween(String value1, String value2) {
            addCriterion("check_customer_name not between", value1, value2, "checkCustomerName");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressIsNull() {
            addCriterion("check_customer_address is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressIsNotNull() {
            addCriterion("check_customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressEqualTo(String value) {
            addCriterion("check_customer_address =", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressNotEqualTo(String value) {
            addCriterion("check_customer_address <>", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressGreaterThan(String value) {
            addCriterion("check_customer_address >", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("check_customer_address >=", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressLessThan(String value) {
            addCriterion("check_customer_address <", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("check_customer_address <=", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressLike(String value) {
            addCriterion("check_customer_address like", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressNotLike(String value) {
            addCriterion("check_customer_address not like", value, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressIn(List<String> values) {
            addCriterion("check_customer_address in", values, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressNotIn(List<String> values) {
            addCriterion("check_customer_address not in", values, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressBetween(String value1, String value2) {
            addCriterion("check_customer_address between", value1, value2, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("check_customer_address not between", value1, value2, "checkCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeIsNull() {
            addCriterion("check_customer_postalcode is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeIsNotNull() {
            addCriterion("check_customer_postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeEqualTo(String value) {
            addCriterion("check_customer_postalcode =", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeNotEqualTo(String value) {
            addCriterion("check_customer_postalcode <>", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeGreaterThan(String value) {
            addCriterion("check_customer_postalcode >", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("check_customer_postalcode >=", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeLessThan(String value) {
            addCriterion("check_customer_postalcode <", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("check_customer_postalcode <=", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeLike(String value) {
            addCriterion("check_customer_postalcode like", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeNotLike(String value) {
            addCriterion("check_customer_postalcode not like", value, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeIn(List<String> values) {
            addCriterion("check_customer_postalcode in", values, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeNotIn(List<String> values) {
            addCriterion("check_customer_postalcode not in", values, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeBetween(String value1, String value2) {
            addCriterion("check_customer_postalcode between", value1, value2, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerPostalcodeNotBetween(String value1, String value2) {
            addCriterion("check_customer_postalcode not between", value1, value2, "checkCustomerPostalcode");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelIsNull() {
            addCriterion("check_customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelIsNotNull() {
            addCriterion("check_customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelEqualTo(String value) {
            addCriterion("check_customer_tel =", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelNotEqualTo(String value) {
            addCriterion("check_customer_tel <>", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelGreaterThan(String value) {
            addCriterion("check_customer_tel >", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("check_customer_tel >=", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelLessThan(String value) {
            addCriterion("check_customer_tel <", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("check_customer_tel <=", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelLike(String value) {
            addCriterion("check_customer_tel like", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelNotLike(String value) {
            addCriterion("check_customer_tel not like", value, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelIn(List<String> values) {
            addCriterion("check_customer_tel in", values, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelNotIn(List<String> values) {
            addCriterion("check_customer_tel not in", values, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelBetween(String value1, String value2) {
            addCriterion("check_customer_tel between", value1, value2, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerTelNotBetween(String value1, String value2) {
            addCriterion("check_customer_tel not between", value1, value2, "checkCustomerTel");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxIsNull() {
            addCriterion("check_customer_fax is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxIsNotNull() {
            addCriterion("check_customer_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxEqualTo(String value) {
            addCriterion("check_customer_fax =", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxNotEqualTo(String value) {
            addCriterion("check_customer_fax <>", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxGreaterThan(String value) {
            addCriterion("check_customer_fax >", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxGreaterThanOrEqualTo(String value) {
            addCriterion("check_customer_fax >=", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxLessThan(String value) {
            addCriterion("check_customer_fax <", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxLessThanOrEqualTo(String value) {
            addCriterion("check_customer_fax <=", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxLike(String value) {
            addCriterion("check_customer_fax like", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxNotLike(String value) {
            addCriterion("check_customer_fax not like", value, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxIn(List<String> values) {
            addCriterion("check_customer_fax in", values, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxNotIn(List<String> values) {
            addCriterion("check_customer_fax not in", values, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxBetween(String value1, String value2) {
            addCriterion("check_customer_fax between", value1, value2, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andCheckCustomerFaxNotBetween(String value1, String value2) {
            addCriterion("check_customer_fax not between", value1, value2, "checkCustomerFax");
            return (Criteria) this;
        }

        public Criteria andLinkMan1IsNull() {
            addCriterion("link_man1 is null");
            return (Criteria) this;
        }

        public Criteria andLinkMan1IsNotNull() {
            addCriterion("link_man1 is not null");
            return (Criteria) this;
        }

        public Criteria andLinkMan1EqualTo(String value) {
            addCriterion("link_man1 =", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1NotEqualTo(String value) {
            addCriterion("link_man1 <>", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1GreaterThan(String value) {
            addCriterion("link_man1 >", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1GreaterThanOrEqualTo(String value) {
            addCriterion("link_man1 >=", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1LessThan(String value) {
            addCriterion("link_man1 <", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1LessThanOrEqualTo(String value) {
            addCriterion("link_man1 <=", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1Like(String value) {
            addCriterion("link_man1 like", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1NotLike(String value) {
            addCriterion("link_man1 not like", value, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1In(List<String> values) {
            addCriterion("link_man1 in", values, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1NotIn(List<String> values) {
            addCriterion("link_man1 not in", values, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1Between(String value1, String value2) {
            addCriterion("link_man1 between", value1, value2, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkMan1NotBetween(String value1, String value2) {
            addCriterion("link_man1 not between", value1, value2, "linkMan1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1IsNull() {
            addCriterion("link_phone1 is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1IsNotNull() {
            addCriterion("link_phone1 is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1EqualTo(String value) {
            addCriterion("link_phone1 =", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1NotEqualTo(String value) {
            addCriterion("link_phone1 <>", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1GreaterThan(String value) {
            addCriterion("link_phone1 >", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("link_phone1 >=", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1LessThan(String value) {
            addCriterion("link_phone1 <", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1LessThanOrEqualTo(String value) {
            addCriterion("link_phone1 <=", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1Like(String value) {
            addCriterion("link_phone1 like", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1NotLike(String value) {
            addCriterion("link_phone1 not like", value, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1In(List<String> values) {
            addCriterion("link_phone1 in", values, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1NotIn(List<String> values) {
            addCriterion("link_phone1 not in", values, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1Between(String value1, String value2) {
            addCriterion("link_phone1 between", value1, value2, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkPhone1NotBetween(String value1, String value2) {
            addCriterion("link_phone1 not between", value1, value2, "linkPhone1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1IsNull() {
            addCriterion("link_memo1 is null");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1IsNotNull() {
            addCriterion("link_memo1 is not null");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1EqualTo(String value) {
            addCriterion("link_memo1 =", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1NotEqualTo(String value) {
            addCriterion("link_memo1 <>", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1GreaterThan(String value) {
            addCriterion("link_memo1 >", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1GreaterThanOrEqualTo(String value) {
            addCriterion("link_memo1 >=", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1LessThan(String value) {
            addCriterion("link_memo1 <", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1LessThanOrEqualTo(String value) {
            addCriterion("link_memo1 <=", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1Like(String value) {
            addCriterion("link_memo1 like", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1NotLike(String value) {
            addCriterion("link_memo1 not like", value, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1In(List<String> values) {
            addCriterion("link_memo1 in", values, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1NotIn(List<String> values) {
            addCriterion("link_memo1 not in", values, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1Between(String value1, String value2) {
            addCriterion("link_memo1 between", value1, value2, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andLinkMemo1NotBetween(String value1, String value2) {
            addCriterion("link_memo1 not between", value1, value2, "linkMemo1");
            return (Criteria) this;
        }

        public Criteria andSampleAddressIsNull() {
            addCriterion("sample_address is null");
            return (Criteria) this;
        }

        public Criteria andSampleAddressIsNotNull() {
            addCriterion("sample_address is not null");
            return (Criteria) this;
        }

        public Criteria andSampleAddressEqualTo(String value) {
            addCriterion("sample_address =", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressNotEqualTo(String value) {
            addCriterion("sample_address <>", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressGreaterThan(String value) {
            addCriterion("sample_address >", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sample_address >=", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressLessThan(String value) {
            addCriterion("sample_address <", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressLessThanOrEqualTo(String value) {
            addCriterion("sample_address <=", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressLike(String value) {
            addCriterion("sample_address like", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressNotLike(String value) {
            addCriterion("sample_address not like", value, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressIn(List<String> values) {
            addCriterion("sample_address in", values, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressNotIn(List<String> values) {
            addCriterion("sample_address not in", values, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressBetween(String value1, String value2) {
            addCriterion("sample_address between", value1, value2, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleAddressNotBetween(String value1, String value2) {
            addCriterion("sample_address not between", value1, value2, "sampleAddress");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberIsNull() {
            addCriterion("sample_base_number is null");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberIsNotNull() {
            addCriterion("sample_base_number is not null");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberEqualTo(String value) {
            addCriterion("sample_base_number =", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberNotEqualTo(String value) {
            addCriterion("sample_base_number <>", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberGreaterThan(String value) {
            addCriterion("sample_base_number >", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sample_base_number >=", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberLessThan(String value) {
            addCriterion("sample_base_number <", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberLessThanOrEqualTo(String value) {
            addCriterion("sample_base_number <=", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberLike(String value) {
            addCriterion("sample_base_number like", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberNotLike(String value) {
            addCriterion("sample_base_number not like", value, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberIn(List<String> values) {
            addCriterion("sample_base_number in", values, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberNotIn(List<String> values) {
            addCriterion("sample_base_number not in", values, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberBetween(String value1, String value2) {
            addCriterion("sample_base_number between", value1, value2, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleBaseNumberNotBetween(String value1, String value2) {
            addCriterion("sample_base_number not between", value1, value2, "sampleBaseNumber");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeIsNull() {
            addCriterion("sample_employee is null");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeIsNotNull() {
            addCriterion("sample_employee is not null");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeEqualTo(String value) {
            addCriterion("sample_employee =", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeNotEqualTo(String value) {
            addCriterion("sample_employee <>", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeGreaterThan(String value) {
            addCriterion("sample_employee >", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeGreaterThanOrEqualTo(String value) {
            addCriterion("sample_employee >=", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeLessThan(String value) {
            addCriterion("sample_employee <", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeLessThanOrEqualTo(String value) {
            addCriterion("sample_employee <=", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeLike(String value) {
            addCriterion("sample_employee like", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeNotLike(String value) {
            addCriterion("sample_employee not like", value, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeIn(List<String> values) {
            addCriterion("sample_employee in", values, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeNotIn(List<String> values) {
            addCriterion("sample_employee not in", values, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeBetween(String value1, String value2) {
            addCriterion("sample_employee between", value1, value2, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andSampleEmployeeNotBetween(String value1, String value2) {
            addCriterion("sample_employee not between", value1, value2, "sampleEmployee");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagIsNull() {
            addCriterion("locale_check_flag is null");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagIsNotNull() {
            addCriterion("locale_check_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagEqualTo(String value) {
            addCriterion("locale_check_flag =", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagNotEqualTo(String value) {
            addCriterion("locale_check_flag <>", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagGreaterThan(String value) {
            addCriterion("locale_check_flag >", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("locale_check_flag >=", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagLessThan(String value) {
            addCriterion("locale_check_flag <", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("locale_check_flag <=", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagLike(String value) {
            addCriterion("locale_check_flag like", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagNotLike(String value) {
            addCriterion("locale_check_flag not like", value, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagIn(List<String> values) {
            addCriterion("locale_check_flag in", values, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagNotIn(List<String> values) {
            addCriterion("locale_check_flag not in", values, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagBetween(String value1, String value2) {
            addCriterion("locale_check_flag between", value1, value2, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLocaleCheckFlagNotBetween(String value1, String value2) {
            addCriterion("locale_check_flag not between", value1, value2, "localeCheckFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagIsNull() {
            addCriterion("check_in_flag is null");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagIsNotNull() {
            addCriterion("check_in_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagEqualTo(String value) {
            addCriterion("check_in_flag =", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagNotEqualTo(String value) {
            addCriterion("check_in_flag <>", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagGreaterThan(String value) {
            addCriterion("check_in_flag >", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagGreaterThanOrEqualTo(String value) {
            addCriterion("check_in_flag >=", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagLessThan(String value) {
            addCriterion("check_in_flag <", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagLessThanOrEqualTo(String value) {
            addCriterion("check_in_flag <=", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagLike(String value) {
            addCriterion("check_in_flag like", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagNotLike(String value) {
            addCriterion("check_in_flag not like", value, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagIn(List<String> values) {
            addCriterion("check_in_flag in", values, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagNotIn(List<String> values) {
            addCriterion("check_in_flag not in", values, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagBetween(String value1, String value2) {
            addCriterion("check_in_flag between", value1, value2, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andCheckInFlagNotBetween(String value1, String value2) {
            addCriterion("check_in_flag not between", value1, value2, "checkInFlag");
            return (Criteria) this;
        }

        public Criteria andSampleServerIsNull() {
            addCriterion("sample_server is null");
            return (Criteria) this;
        }

        public Criteria andSampleServerIsNotNull() {
            addCriterion("sample_server is not null");
            return (Criteria) this;
        }

        public Criteria andSampleServerEqualTo(String value) {
            addCriterion("sample_server =", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerNotEqualTo(String value) {
            addCriterion("sample_server <>", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerGreaterThan(String value) {
            addCriterion("sample_server >", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerGreaterThanOrEqualTo(String value) {
            addCriterion("sample_server >=", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerLessThan(String value) {
            addCriterion("sample_server <", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerLessThanOrEqualTo(String value) {
            addCriterion("sample_server <=", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerLike(String value) {
            addCriterion("sample_server like", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerNotLike(String value) {
            addCriterion("sample_server not like", value, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerIn(List<String> values) {
            addCriterion("sample_server in", values, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerNotIn(List<String> values) {
            addCriterion("sample_server not in", values, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerBetween(String value1, String value2) {
            addCriterion("sample_server between", value1, value2, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleServerNotBetween(String value1, String value2) {
            addCriterion("sample_server not between", value1, value2, "sampleServer");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNull() {
            addCriterion("sample_number is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNotNull() {
            addCriterion("sample_number is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberEqualTo(String value) {
            addCriterion("sample_number =", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotEqualTo(String value) {
            addCriterion("sample_number <>", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThan(String value) {
            addCriterion("sample_number >", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sample_number >=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThan(String value) {
            addCriterion("sample_number <", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThanOrEqualTo(String value) {
            addCriterion("sample_number <=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLike(String value) {
            addCriterion("sample_number like", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotLike(String value) {
            addCriterion("sample_number not like", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIn(List<String> values) {
            addCriterion("sample_number in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotIn(List<String> values) {
            addCriterion("sample_number not in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberBetween(String value1, String value2) {
            addCriterion("sample_number between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotBetween(String value1, String value2) {
            addCriterion("sample_number not between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNull() {
            addCriterion("manufacture_date is null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNotNull() {
            addCriterion("manufacture_date is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateEqualTo(Date value) {
            addCriterion("manufacture_date =", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotEqualTo(Date value) {
            addCriterion("manufacture_date <>", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThan(Date value) {
            addCriterion("manufacture_date >", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThanOrEqualTo(Date value) {
            addCriterion("manufacture_date >=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThan(Date value) {
            addCriterion("manufacture_date <", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThanOrEqualTo(Date value) {
            addCriterion("manufacture_date <=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIn(List<Date> values) {
            addCriterion("manufacture_date in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotIn(List<Date> values) {
            addCriterion("manufacture_date not in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateBetween(Date value1, Date value2) {
            addCriterion("manufacture_date between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotBetween(Date value1, Date value2) {
            addCriterion("manufacture_date not between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateIsNull() {
            addCriterion("sample_date is null");
            return (Criteria) this;
        }

        public Criteria andSampleDateIsNotNull() {
            addCriterion("sample_date is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDateEqualTo(Date value) {
            addCriterion("sample_date =", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateNotEqualTo(Date value) {
            addCriterion("sample_date <>", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateGreaterThan(Date value) {
            addCriterion("sample_date >", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sample_date >=", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateLessThan(Date value) {
            addCriterion("sample_date <", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateLessThanOrEqualTo(Date value) {
            addCriterion("sample_date <=", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateIn(List<Date> values) {
            addCriterion("sample_date in", values, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateNotIn(List<Date> values) {
            addCriterion("sample_date not in", values, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateBetween(Date value1, Date value2) {
            addCriterion("sample_date between", value1, value2, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateNotBetween(Date value1, Date value2) {
            addCriterion("sample_date not between", value1, value2, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateIsNull() {
            addCriterion("sample_arrive_date is null");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateIsNotNull() {
            addCriterion("sample_arrive_date is not null");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateEqualTo(Date value) {
            addCriterion("sample_arrive_date =", value, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateNotEqualTo(Date value) {
            addCriterion("sample_arrive_date <>", value, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateGreaterThan(Date value) {
            addCriterion("sample_arrive_date >", value, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sample_arrive_date >=", value, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateLessThan(Date value) {
            addCriterion("sample_arrive_date <", value, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateLessThanOrEqualTo(Date value) {
            addCriterion("sample_arrive_date <=", value, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateIn(List<Date> values) {
            addCriterion("sample_arrive_date in", values, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateNotIn(List<Date> values) {
            addCriterion("sample_arrive_date not in", values, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateBetween(Date value1, Date value2) {
            addCriterion("sample_arrive_date between", value1, value2, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andSampleArriveDateNotBetween(Date value1, Date value2) {
            addCriterion("sample_arrive_date not between", value1, value2, "sampleArriveDate");
            return (Criteria) this;
        }

        public Criteria andProvideDataIsNull() {
            addCriterion("provide_data is null");
            return (Criteria) this;
        }

        public Criteria andProvideDataIsNotNull() {
            addCriterion("provide_data is not null");
            return (Criteria) this;
        }

        public Criteria andProvideDataEqualTo(String value) {
            addCriterion("provide_data =", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataNotEqualTo(String value) {
            addCriterion("provide_data <>", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataGreaterThan(String value) {
            addCriterion("provide_data >", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataGreaterThanOrEqualTo(String value) {
            addCriterion("provide_data >=", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataLessThan(String value) {
            addCriterion("provide_data <", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataLessThanOrEqualTo(String value) {
            addCriterion("provide_data <=", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataLike(String value) {
            addCriterion("provide_data like", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataNotLike(String value) {
            addCriterion("provide_data not like", value, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataIn(List<String> values) {
            addCriterion("provide_data in", values, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataNotIn(List<String> values) {
            addCriterion("provide_data not in", values, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataBetween(String value1, String value2) {
            addCriterion("provide_data between", value1, value2, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideDataNotBetween(String value1, String value2) {
            addCriterion("provide_data not between", value1, value2, "provideData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataIsNull() {
            addCriterion("provide_other_data is null");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataIsNotNull() {
            addCriterion("provide_other_data is not null");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataEqualTo(String value) {
            addCriterion("provide_other_data =", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataNotEqualTo(String value) {
            addCriterion("provide_other_data <>", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataGreaterThan(String value) {
            addCriterion("provide_other_data >", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataGreaterThanOrEqualTo(String value) {
            addCriterion("provide_other_data >=", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataLessThan(String value) {
            addCriterion("provide_other_data <", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataLessThanOrEqualTo(String value) {
            addCriterion("provide_other_data <=", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataLike(String value) {
            addCriterion("provide_other_data like", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataNotLike(String value) {
            addCriterion("provide_other_data not like", value, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataIn(List<String> values) {
            addCriterion("provide_other_data in", values, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataNotIn(List<String> values) {
            addCriterion("provide_other_data not in", values, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataBetween(String value1, String value2) {
            addCriterion("provide_other_data between", value1, value2, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andProvideOtherDataNotBetween(String value1, String value2) {
            addCriterion("provide_other_data not between", value1, value2, "provideOtherData");
            return (Criteria) this;
        }

        public Criteria andDrawTypeIsNull() {
            addCriterion("draw_type is null");
            return (Criteria) this;
        }

        public Criteria andDrawTypeIsNotNull() {
            addCriterion("draw_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrawTypeEqualTo(String value) {
            addCriterion("draw_type =", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeNotEqualTo(String value) {
            addCriterion("draw_type <>", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeGreaterThan(String value) {
            addCriterion("draw_type >", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeGreaterThanOrEqualTo(String value) {
            addCriterion("draw_type >=", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeLessThan(String value) {
            addCriterion("draw_type <", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeLessThanOrEqualTo(String value) {
            addCriterion("draw_type <=", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeLike(String value) {
            addCriterion("draw_type like", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeNotLike(String value) {
            addCriterion("draw_type not like", value, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeIn(List<String> values) {
            addCriterion("draw_type in", values, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeNotIn(List<String> values) {
            addCriterion("draw_type not in", values, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeBetween(String value1, String value2) {
            addCriterion("draw_type between", value1, value2, "drawType");
            return (Criteria) this;
        }

        public Criteria andDrawTypeNotBetween(String value1, String value2) {
            addCriterion("draw_type not between", value1, value2, "drawType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeIsNull() {
            addCriterion("sample_dispose_type is null");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeIsNotNull() {
            addCriterion("sample_dispose_type is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeEqualTo(String value) {
            addCriterion("sample_dispose_type =", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeNotEqualTo(String value) {
            addCriterion("sample_dispose_type <>", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeGreaterThan(String value) {
            addCriterion("sample_dispose_type >", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sample_dispose_type >=", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeLessThan(String value) {
            addCriterion("sample_dispose_type <", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeLessThanOrEqualTo(String value) {
            addCriterion("sample_dispose_type <=", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeLike(String value) {
            addCriterion("sample_dispose_type like", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeNotLike(String value) {
            addCriterion("sample_dispose_type not like", value, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeIn(List<String> values) {
            addCriterion("sample_dispose_type in", values, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeNotIn(List<String> values) {
            addCriterion("sample_dispose_type not in", values, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeBetween(String value1, String value2) {
            addCriterion("sample_dispose_type between", value1, value2, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andSampleDisposeTypeNotBetween(String value1, String value2) {
            addCriterion("sample_dispose_type not between", value1, value2, "sampleDisposeType");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNull() {
            addCriterion("mail_address is null");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNotNull() {
            addCriterion("mail_address is not null");
            return (Criteria) this;
        }

        public Criteria andMailAddressEqualTo(String value) {
            addCriterion("mail_address =", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotEqualTo(String value) {
            addCriterion("mail_address <>", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThan(String value) {
            addCriterion("mail_address >", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mail_address >=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThan(String value) {
            addCriterion("mail_address <", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThanOrEqualTo(String value) {
            addCriterion("mail_address <=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLike(String value) {
            addCriterion("mail_address like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotLike(String value) {
            addCriterion("mail_address not like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressIn(List<String> values) {
            addCriterion("mail_address in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotIn(List<String> values) {
            addCriterion("mail_address not in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressBetween(String value1, String value2) {
            addCriterion("mail_address between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotBetween(String value1, String value2) {
            addCriterion("mail_address not between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalcode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalcode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNull() {
            addCriterion("consignee_tel is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNotNull() {
            addCriterion("consignee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelEqualTo(String value) {
            addCriterion("consignee_tel =", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotEqualTo(String value) {
            addCriterion("consignee_tel <>", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThan(String value) {
            addCriterion("consignee_tel >", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_tel >=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThan(String value) {
            addCriterion("consignee_tel <", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThanOrEqualTo(String value) {
            addCriterion("consignee_tel <=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLike(String value) {
            addCriterion("consignee_tel like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotLike(String value) {
            addCriterion("consignee_tel not like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIn(List<String> values) {
            addCriterion("consignee_tel in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotIn(List<String> values) {
            addCriterion("consignee_tel not in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelBetween(String value1, String value2) {
            addCriterion("consignee_tel between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotBetween(String value1, String value2) {
            addCriterion("consignee_tel not between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andCriterionIdIsNull() {
            addCriterion("criterion_id is null");
            return (Criteria) this;
        }

        public Criteria andCriterionIdIsNotNull() {
            addCriterion("criterion_id is not null");
            return (Criteria) this;
        }

        public Criteria andCriterionIdEqualTo(String value) {
            addCriterion("criterion_id =", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdNotEqualTo(String value) {
            addCriterion("criterion_id <>", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdGreaterThan(String value) {
            addCriterion("criterion_id >", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdGreaterThanOrEqualTo(String value) {
            addCriterion("criterion_id >=", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdLessThan(String value) {
            addCriterion("criterion_id <", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdLessThanOrEqualTo(String value) {
            addCriterion("criterion_id <=", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdLike(String value) {
            addCriterion("criterion_id like", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdNotLike(String value) {
            addCriterion("criterion_id not like", value, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdIn(List<String> values) {
            addCriterion("criterion_id in", values, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdNotIn(List<String> values) {
            addCriterion("criterion_id not in", values, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdBetween(String value1, String value2) {
            addCriterion("criterion_id between", value1, value2, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionIdNotBetween(String value1, String value2) {
            addCriterion("criterion_id not between", value1, value2, "criterionId");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeIsNull() {
            addCriterion("criterion_code is null");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeIsNotNull() {
            addCriterion("criterion_code is not null");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeEqualTo(String value) {
            addCriterion("criterion_code =", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeNotEqualTo(String value) {
            addCriterion("criterion_code <>", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeGreaterThan(String value) {
            addCriterion("criterion_code >", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("criterion_code >=", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeLessThan(String value) {
            addCriterion("criterion_code <", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeLessThanOrEqualTo(String value) {
            addCriterion("criterion_code <=", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeLike(String value) {
            addCriterion("criterion_code like", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeNotLike(String value) {
            addCriterion("criterion_code not like", value, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeIn(List<String> values) {
            addCriterion("criterion_code in", values, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeNotIn(List<String> values) {
            addCriterion("criterion_code not in", values, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeBetween(String value1, String value2) {
            addCriterion("criterion_code between", value1, value2, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionCodeNotBetween(String value1, String value2) {
            addCriterion("criterion_code not between", value1, value2, "criterionCode");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoIsNull() {
            addCriterion("criterion_memo is null");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoIsNotNull() {
            addCriterion("criterion_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoEqualTo(String value) {
            addCriterion("criterion_memo =", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoNotEqualTo(String value) {
            addCriterion("criterion_memo <>", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoGreaterThan(String value) {
            addCriterion("criterion_memo >", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoGreaterThanOrEqualTo(String value) {
            addCriterion("criterion_memo >=", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoLessThan(String value) {
            addCriterion("criterion_memo <", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoLessThanOrEqualTo(String value) {
            addCriterion("criterion_memo <=", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoLike(String value) {
            addCriterion("criterion_memo like", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoNotLike(String value) {
            addCriterion("criterion_memo not like", value, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoIn(List<String> values) {
            addCriterion("criterion_memo in", values, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoNotIn(List<String> values) {
            addCriterion("criterion_memo not in", values, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoBetween(String value1, String value2) {
            addCriterion("criterion_memo between", value1, value2, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andCriterionMemoNotBetween(String value1, String value2) {
            addCriterion("criterion_memo not between", value1, value2, "criterionMemo");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("charge_type like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("charge_type not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountIsNull() {
            addCriterion("check_item_standard_account is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountIsNotNull() {
            addCriterion("check_item_standard_account is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountEqualTo(BigDecimal value) {
            addCriterion("check_item_standard_account =", value, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountNotEqualTo(BigDecimal value) {
            addCriterion("check_item_standard_account <>", value, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountGreaterThan(BigDecimal value) {
            addCriterion("check_item_standard_account >", value, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("check_item_standard_account >=", value, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountLessThan(BigDecimal value) {
            addCriterion("check_item_standard_account <", value, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("check_item_standard_account <=", value, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountIn(List<BigDecimal> values) {
            addCriterion("check_item_standard_account in", values, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountNotIn(List<BigDecimal> values) {
            addCriterion("check_item_standard_account not in", values, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_item_standard_account between", value1, value2, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemStandardAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_item_standard_account not between", value1, value2, "checkItemStandardAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountIsNull() {
            addCriterion("check_item_account is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountIsNotNull() {
            addCriterion("check_item_account is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountEqualTo(BigDecimal value) {
            addCriterion("check_item_account =", value, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountNotEqualTo(BigDecimal value) {
            addCriterion("check_item_account <>", value, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountGreaterThan(BigDecimal value) {
            addCriterion("check_item_account >", value, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("check_item_account >=", value, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountLessThan(BigDecimal value) {
            addCriterion("check_item_account <", value, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("check_item_account <=", value, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountIn(List<BigDecimal> values) {
            addCriterion("check_item_account in", values, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountNotIn(List<BigDecimal> values) {
            addCriterion("check_item_account not in", values, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_item_account between", value1, value2, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_item_account not between", value1, value2, "checkItemAccount");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoIsNull() {
            addCriterion("dpt_test_money_info is null");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoIsNotNull() {
            addCriterion("dpt_test_money_info is not null");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoEqualTo(String value) {
            addCriterion("dpt_test_money_info =", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoNotEqualTo(String value) {
            addCriterion("dpt_test_money_info <>", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoGreaterThan(String value) {
            addCriterion("dpt_test_money_info >", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("dpt_test_money_info >=", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoLessThan(String value) {
            addCriterion("dpt_test_money_info <", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoLessThanOrEqualTo(String value) {
            addCriterion("dpt_test_money_info <=", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoLike(String value) {
            addCriterion("dpt_test_money_info like", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoNotLike(String value) {
            addCriterion("dpt_test_money_info not like", value, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoIn(List<String> values) {
            addCriterion("dpt_test_money_info in", values, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoNotIn(List<String> values) {
            addCriterion("dpt_test_money_info not in", values, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoBetween(String value1, String value2) {
            addCriterion("dpt_test_money_info between", value1, value2, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptTestMoneyInfoNotBetween(String value1, String value2) {
            addCriterion("dpt_test_money_info not between", value1, value2, "dptTestMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoIsNull() {
            addCriterion("check_item_account_memo is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoIsNotNull() {
            addCriterion("check_item_account_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoEqualTo(String value) {
            addCriterion("check_item_account_memo =", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoNotEqualTo(String value) {
            addCriterion("check_item_account_memo <>", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoGreaterThan(String value) {
            addCriterion("check_item_account_memo >", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoGreaterThanOrEqualTo(String value) {
            addCriterion("check_item_account_memo >=", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoLessThan(String value) {
            addCriterion("check_item_account_memo <", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoLessThanOrEqualTo(String value) {
            addCriterion("check_item_account_memo <=", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoLike(String value) {
            addCriterion("check_item_account_memo like", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoNotLike(String value) {
            addCriterion("check_item_account_memo not like", value, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoIn(List<String> values) {
            addCriterion("check_item_account_memo in", values, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoNotIn(List<String> values) {
            addCriterion("check_item_account_memo not in", values, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoBetween(String value1, String value2) {
            addCriterion("check_item_account_memo between", value1, value2, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andCheckItemAccountMemoNotBetween(String value1, String value2) {
            addCriterion("check_item_account_memo not between", value1, value2, "checkItemAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountIsNull() {
            addCriterion("other_standard_account is null");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountIsNotNull() {
            addCriterion("other_standard_account is not null");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountEqualTo(BigDecimal value) {
            addCriterion("other_standard_account =", value, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountNotEqualTo(BigDecimal value) {
            addCriterion("other_standard_account <>", value, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountGreaterThan(BigDecimal value) {
            addCriterion("other_standard_account >", value, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_standard_account >=", value, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountLessThan(BigDecimal value) {
            addCriterion("other_standard_account <", value, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_standard_account <=", value, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountIn(List<BigDecimal> values) {
            addCriterion("other_standard_account in", values, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountNotIn(List<BigDecimal> values) {
            addCriterion("other_standard_account not in", values, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_standard_account between", value1, value2, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherStandardAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_standard_account not between", value1, value2, "otherStandardAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIsNull() {
            addCriterion("other_account is null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIsNotNull() {
            addCriterion("other_account is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountEqualTo(BigDecimal value) {
            addCriterion("other_account =", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotEqualTo(BigDecimal value) {
            addCriterion("other_account <>", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountGreaterThan(BigDecimal value) {
            addCriterion("other_account >", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_account >=", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLessThan(BigDecimal value) {
            addCriterion("other_account <", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_account <=", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIn(List<BigDecimal> values) {
            addCriterion("other_account in", values, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotIn(List<BigDecimal> values) {
            addCriterion("other_account not in", values, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_account between", value1, value2, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_account not between", value1, value2, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoIsNull() {
            addCriterion("dpt_other_money_info is null");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoIsNotNull() {
            addCriterion("dpt_other_money_info is not null");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoEqualTo(String value) {
            addCriterion("dpt_other_money_info =", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoNotEqualTo(String value) {
            addCriterion("dpt_other_money_info <>", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoGreaterThan(String value) {
            addCriterion("dpt_other_money_info >", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("dpt_other_money_info >=", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoLessThan(String value) {
            addCriterion("dpt_other_money_info <", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoLessThanOrEqualTo(String value) {
            addCriterion("dpt_other_money_info <=", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoLike(String value) {
            addCriterion("dpt_other_money_info like", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoNotLike(String value) {
            addCriterion("dpt_other_money_info not like", value, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoIn(List<String> values) {
            addCriterion("dpt_other_money_info in", values, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoNotIn(List<String> values) {
            addCriterion("dpt_other_money_info not in", values, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoBetween(String value1, String value2) {
            addCriterion("dpt_other_money_info between", value1, value2, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andDptOtherMoneyInfoNotBetween(String value1, String value2) {
            addCriterion("dpt_other_money_info not between", value1, value2, "dptOtherMoneyInfo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoIsNull() {
            addCriterion("other_account_memo is null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoIsNotNull() {
            addCriterion("other_account_memo is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoEqualTo(String value) {
            addCriterion("other_account_memo =", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoNotEqualTo(String value) {
            addCriterion("other_account_memo <>", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoGreaterThan(String value) {
            addCriterion("other_account_memo >", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoGreaterThanOrEqualTo(String value) {
            addCriterion("other_account_memo >=", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoLessThan(String value) {
            addCriterion("other_account_memo <", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoLessThanOrEqualTo(String value) {
            addCriterion("other_account_memo <=", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoLike(String value) {
            addCriterion("other_account_memo like", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoNotLike(String value) {
            addCriterion("other_account_memo not like", value, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoIn(List<String> values) {
            addCriterion("other_account_memo in", values, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoNotIn(List<String> values) {
            addCriterion("other_account_memo not in", values, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoBetween(String value1, String value2) {
            addCriterion("other_account_memo between", value1, value2, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andOtherAccountMemoNotBetween(String value1, String value2) {
            addCriterion("other_account_memo not between", value1, value2, "otherAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountIsNull() {
            addCriterion("ext_account is null");
            return (Criteria) this;
        }

        public Criteria andExtAccountIsNotNull() {
            addCriterion("ext_account is not null");
            return (Criteria) this;
        }

        public Criteria andExtAccountEqualTo(BigDecimal value) {
            addCriterion("ext_account =", value, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountNotEqualTo(BigDecimal value) {
            addCriterion("ext_account <>", value, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountGreaterThan(BigDecimal value) {
            addCriterion("ext_account >", value, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_account >=", value, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountLessThan(BigDecimal value) {
            addCriterion("ext_account <", value, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_account <=", value, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountIn(List<BigDecimal> values) {
            addCriterion("ext_account in", values, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountNotIn(List<BigDecimal> values) {
            addCriterion("ext_account not in", values, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_account between", value1, value2, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_account not between", value1, value2, "extAccount");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoIsNull() {
            addCriterion("ext_account_memo is null");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoIsNotNull() {
            addCriterion("ext_account_memo is not null");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoEqualTo(String value) {
            addCriterion("ext_account_memo =", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoNotEqualTo(String value) {
            addCriterion("ext_account_memo <>", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoGreaterThan(String value) {
            addCriterion("ext_account_memo >", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ext_account_memo >=", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoLessThan(String value) {
            addCriterion("ext_account_memo <", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoLessThanOrEqualTo(String value) {
            addCriterion("ext_account_memo <=", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoLike(String value) {
            addCriterion("ext_account_memo like", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoNotLike(String value) {
            addCriterion("ext_account_memo not like", value, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoIn(List<String> values) {
            addCriterion("ext_account_memo in", values, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoNotIn(List<String> values) {
            addCriterion("ext_account_memo not in", values, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoBetween(String value1, String value2) {
            addCriterion("ext_account_memo between", value1, value2, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andExtAccountMemoNotBetween(String value1, String value2) {
            addCriterion("ext_account_memo not between", value1, value2, "extAccountMemo");
            return (Criteria) this;
        }

        public Criteria andAccountFlagIsNull() {
            addCriterion("account_flag is null");
            return (Criteria) this;
        }

        public Criteria andAccountFlagIsNotNull() {
            addCriterion("account_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAccountFlagEqualTo(String value) {
            addCriterion("account_flag =", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotEqualTo(String value) {
            addCriterion("account_flag <>", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagGreaterThan(String value) {
            addCriterion("account_flag >", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagGreaterThanOrEqualTo(String value) {
            addCriterion("account_flag >=", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagLessThan(String value) {
            addCriterion("account_flag <", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagLessThanOrEqualTo(String value) {
            addCriterion("account_flag <=", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagLike(String value) {
            addCriterion("account_flag like", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotLike(String value) {
            addCriterion("account_flag not like", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagIn(List<String> values) {
            addCriterion("account_flag in", values, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotIn(List<String> values) {
            addCriterion("account_flag not in", values, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagBetween(String value1, String value2) {
            addCriterion("account_flag between", value1, value2, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotBetween(String value1, String value2) {
            addCriterion("account_flag not between", value1, value2, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdIsNull() {
            addCriterion("check_department_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdIsNotNull() {
            addCriterion("check_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdEqualTo(String value) {
            addCriterion("check_department_id =", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdNotEqualTo(String value) {
            addCriterion("check_department_id <>", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdGreaterThan(String value) {
            addCriterion("check_department_id >", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_department_id >=", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdLessThan(String value) {
            addCriterion("check_department_id <", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("check_department_id <=", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdLike(String value) {
            addCriterion("check_department_id like", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdNotLike(String value) {
            addCriterion("check_department_id not like", value, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdIn(List<String> values) {
            addCriterion("check_department_id in", values, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdNotIn(List<String> values) {
            addCriterion("check_department_id not in", values, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdBetween(String value1, String value2) {
            addCriterion("check_department_id between", value1, value2, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCheckDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("check_department_id not between", value1, value2, "checkDepartmentId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdIsNull() {
            addCriterion("link_dpt_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdIsNotNull() {
            addCriterion("link_dpt_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdEqualTo(String value) {
            addCriterion("link_dpt_id =", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdNotEqualTo(String value) {
            addCriterion("link_dpt_id <>", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdGreaterThan(String value) {
            addCriterion("link_dpt_id >", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdGreaterThanOrEqualTo(String value) {
            addCriterion("link_dpt_id >=", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdLessThan(String value) {
            addCriterion("link_dpt_id <", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdLessThanOrEqualTo(String value) {
            addCriterion("link_dpt_id <=", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdLike(String value) {
            addCriterion("link_dpt_id like", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdNotLike(String value) {
            addCriterion("link_dpt_id not like", value, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdIn(List<String> values) {
            addCriterion("link_dpt_id in", values, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdNotIn(List<String> values) {
            addCriterion("link_dpt_id not in", values, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdBetween(String value1, String value2) {
            addCriterion("link_dpt_id between", value1, value2, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andLinkDptIdNotBetween(String value1, String value2) {
            addCriterion("link_dpt_id not between", value1, value2, "linkDptId");
            return (Criteria) this;
        }

        public Criteria andPactStatusIsNull() {
            addCriterion("pact_status is null");
            return (Criteria) this;
        }

        public Criteria andPactStatusIsNotNull() {
            addCriterion("pact_status is not null");
            return (Criteria) this;
        }

        public Criteria andPactStatusEqualTo(String value) {
            addCriterion("pact_status =", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusNotEqualTo(String value) {
            addCriterion("pact_status <>", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusGreaterThan(String value) {
            addCriterion("pact_status >", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pact_status >=", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusLessThan(String value) {
            addCriterion("pact_status <", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusLessThanOrEqualTo(String value) {
            addCriterion("pact_status <=", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusLike(String value) {
            addCriterion("pact_status like", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusNotLike(String value) {
            addCriterion("pact_status not like", value, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusIn(List<String> values) {
            addCriterion("pact_status in", values, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusNotIn(List<String> values) {
            addCriterion("pact_status not in", values, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusBetween(String value1, String value2) {
            addCriterion("pact_status between", value1, value2, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactStatusNotBetween(String value1, String value2) {
            addCriterion("pact_status not between", value1, value2, "pactStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusIsNull() {
            addCriterion("pact_flow_status is null");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusIsNotNull() {
            addCriterion("pact_flow_status is not null");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusEqualTo(String value) {
            addCriterion("pact_flow_status =", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusNotEqualTo(String value) {
            addCriterion("pact_flow_status <>", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusGreaterThan(String value) {
            addCriterion("pact_flow_status >", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pact_flow_status >=", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusLessThan(String value) {
            addCriterion("pact_flow_status <", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusLessThanOrEqualTo(String value) {
            addCriterion("pact_flow_status <=", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusLike(String value) {
            addCriterion("pact_flow_status like", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusNotLike(String value) {
            addCriterion("pact_flow_status not like", value, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusIn(List<String> values) {
            addCriterion("pact_flow_status in", values, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusNotIn(List<String> values) {
            addCriterion("pact_flow_status not in", values, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusBetween(String value1, String value2) {
            addCriterion("pact_flow_status between", value1, value2, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andPactFlowStatusNotBetween(String value1, String value2) {
            addCriterion("pact_flow_status not between", value1, value2, "pactFlowStatus");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIsNull() {
            addCriterion("charge_flag is null");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIsNotNull() {
            addCriterion("charge_flag is not null");
            return (Criteria) this;
        }

        public Criteria andChargeFlagEqualTo(String value) {
            addCriterion("charge_flag =", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotEqualTo(String value) {
            addCriterion("charge_flag <>", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagGreaterThan(String value) {
            addCriterion("charge_flag >", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("charge_flag >=", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLessThan(String value) {
            addCriterion("charge_flag <", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLessThanOrEqualTo(String value) {
            addCriterion("charge_flag <=", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLike(String value) {
            addCriterion("charge_flag like", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotLike(String value) {
            addCriterion("charge_flag not like", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIn(List<String> values) {
            addCriterion("charge_flag in", values, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotIn(List<String> values) {
            addCriterion("charge_flag not in", values, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagBetween(String value1, String value2) {
            addCriterion("charge_flag between", value1, value2, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotBetween(String value1, String value2) {
            addCriterion("charge_flag not between", value1, value2, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagIsNull() {
            addCriterion("sample_flag is null");
            return (Criteria) this;
        }

        public Criteria andSampleFlagIsNotNull() {
            addCriterion("sample_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSampleFlagEqualTo(String value) {
            addCriterion("sample_flag =", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagNotEqualTo(String value) {
            addCriterion("sample_flag <>", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagGreaterThan(String value) {
            addCriterion("sample_flag >", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sample_flag >=", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagLessThan(String value) {
            addCriterion("sample_flag <", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagLessThanOrEqualTo(String value) {
            addCriterion("sample_flag <=", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagLike(String value) {
            addCriterion("sample_flag like", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagNotLike(String value) {
            addCriterion("sample_flag not like", value, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagIn(List<String> values) {
            addCriterion("sample_flag in", values, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagNotIn(List<String> values) {
            addCriterion("sample_flag not in", values, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagBetween(String value1, String value2) {
            addCriterion("sample_flag between", value1, value2, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleFlagNotBetween(String value1, String value2) {
            addCriterion("sample_flag not between", value1, value2, "sampleFlag");
            return (Criteria) this;
        }

        public Criteria andSampleStatusIsNull() {
            addCriterion("sample_status is null");
            return (Criteria) this;
        }

        public Criteria andSampleStatusIsNotNull() {
            addCriterion("sample_status is not null");
            return (Criteria) this;
        }

        public Criteria andSampleStatusEqualTo(String value) {
            addCriterion("sample_status =", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusNotEqualTo(String value) {
            addCriterion("sample_status <>", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusGreaterThan(String value) {
            addCriterion("sample_status >", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sample_status >=", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusLessThan(String value) {
            addCriterion("sample_status <", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusLessThanOrEqualTo(String value) {
            addCriterion("sample_status <=", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusLike(String value) {
            addCriterion("sample_status like", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusNotLike(String value) {
            addCriterion("sample_status not like", value, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusIn(List<String> values) {
            addCriterion("sample_status in", values, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusNotIn(List<String> values) {
            addCriterion("sample_status not in", values, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusBetween(String value1, String value2) {
            addCriterion("sample_status between", value1, value2, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andSampleStatusNotBetween(String value1, String value2) {
            addCriterion("sample_status not between", value1, value2, "sampleStatus");
            return (Criteria) this;
        }

        public Criteria andPactApplyerIsNull() {
            addCriterion("pact_applyer is null");
            return (Criteria) this;
        }

        public Criteria andPactApplyerIsNotNull() {
            addCriterion("pact_applyer is not null");
            return (Criteria) this;
        }

        public Criteria andPactApplyerEqualTo(String value) {
            addCriterion("pact_applyer =", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerNotEqualTo(String value) {
            addCriterion("pact_applyer <>", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerGreaterThan(String value) {
            addCriterion("pact_applyer >", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerGreaterThanOrEqualTo(String value) {
            addCriterion("pact_applyer >=", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerLessThan(String value) {
            addCriterion("pact_applyer <", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerLessThanOrEqualTo(String value) {
            addCriterion("pact_applyer <=", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerLike(String value) {
            addCriterion("pact_applyer like", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerNotLike(String value) {
            addCriterion("pact_applyer not like", value, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerIn(List<String> values) {
            addCriterion("pact_applyer in", values, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerNotIn(List<String> values) {
            addCriterion("pact_applyer not in", values, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerBetween(String value1, String value2) {
            addCriterion("pact_applyer between", value1, value2, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactApplyerNotBetween(String value1, String value2) {
            addCriterion("pact_applyer not between", value1, value2, "pactApplyer");
            return (Criteria) this;
        }

        public Criteria andPactCreaterIsNull() {
            addCriterion("pact_creater is null");
            return (Criteria) this;
        }

        public Criteria andPactCreaterIsNotNull() {
            addCriterion("pact_creater is not null");
            return (Criteria) this;
        }

        public Criteria andPactCreaterEqualTo(String value) {
            addCriterion("pact_creater =", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterNotEqualTo(String value) {
            addCriterion("pact_creater <>", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterGreaterThan(String value) {
            addCriterion("pact_creater >", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("pact_creater >=", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterLessThan(String value) {
            addCriterion("pact_creater <", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterLessThanOrEqualTo(String value) {
            addCriterion("pact_creater <=", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterLike(String value) {
            addCriterion("pact_creater like", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterNotLike(String value) {
            addCriterion("pact_creater not like", value, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterIn(List<String> values) {
            addCriterion("pact_creater in", values, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterNotIn(List<String> values) {
            addCriterion("pact_creater not in", values, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterBetween(String value1, String value2) {
            addCriterion("pact_creater between", value1, value2, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactCreaterNotBetween(String value1, String value2) {
            addCriterion("pact_creater not between", value1, value2, "pactCreater");
            return (Criteria) this;
        }

        public Criteria andPactDateIsNull() {
            addCriterion("pact_date is null");
            return (Criteria) this;
        }

        public Criteria andPactDateIsNotNull() {
            addCriterion("pact_date is not null");
            return (Criteria) this;
        }

        public Criteria andPactDateEqualTo(Date value) {
            addCriterion("pact_date =", value, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateNotEqualTo(Date value) {
            addCriterion("pact_date <>", value, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateGreaterThan(Date value) {
            addCriterion("pact_date >", value, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pact_date >=", value, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateLessThan(Date value) {
            addCriterion("pact_date <", value, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateLessThanOrEqualTo(Date value) {
            addCriterion("pact_date <=", value, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateIn(List<Date> values) {
            addCriterion("pact_date in", values, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateNotIn(List<Date> values) {
            addCriterion("pact_date not in", values, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateBetween(Date value1, Date value2) {
            addCriterion("pact_date between", value1, value2, "pactDate");
            return (Criteria) this;
        }

        public Criteria andPactDateNotBetween(Date value1, Date value2) {
            addCriterion("pact_date not between", value1, value2, "pactDate");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("update_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("update_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(String value) {
            addCriterion("update_flag =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(String value) {
            addCriterion("update_flag <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(String value) {
            addCriterion("update_flag >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("update_flag >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(String value) {
            addCriterion("update_flag <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(String value) {
            addCriterion("update_flag <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLike(String value) {
            addCriterion("update_flag like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotLike(String value) {
            addCriterion("update_flag not like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<String> values) {
            addCriterion("update_flag in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<String> values) {
            addCriterion("update_flag not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(String value1, String value2) {
            addCriterion("update_flag between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(String value1, String value2) {
            addCriterion("update_flag not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagIsNull() {
            addCriterion("ccc_flag is null");
            return (Criteria) this;
        }

        public Criteria andCccFlagIsNotNull() {
            addCriterion("ccc_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCccFlagEqualTo(Integer value) {
            addCriterion("ccc_flag =", value, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagNotEqualTo(Integer value) {
            addCriterion("ccc_flag <>", value, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagGreaterThan(Integer value) {
            addCriterion("ccc_flag >", value, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccc_flag >=", value, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagLessThan(Integer value) {
            addCriterion("ccc_flag <", value, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ccc_flag <=", value, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagIn(List<Integer> values) {
            addCriterion("ccc_flag in", values, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagNotIn(List<Integer> values) {
            addCriterion("ccc_flag not in", values, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagBetween(Integer value1, Integer value2) {
            addCriterion("ccc_flag between", value1, value2, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andCccFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ccc_flag not between", value1, value2, "cccFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagIsNull() {
            addCriterion("msg_flag is null");
            return (Criteria) this;
        }

        public Criteria andMsgFlagIsNotNull() {
            addCriterion("msg_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFlagEqualTo(Integer value) {
            addCriterion("msg_flag =", value, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagNotEqualTo(Integer value) {
            addCriterion("msg_flag <>", value, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagGreaterThan(Integer value) {
            addCriterion("msg_flag >", value, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_flag >=", value, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagLessThan(Integer value) {
            addCriterion("msg_flag <", value, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagLessThanOrEqualTo(Integer value) {
            addCriterion("msg_flag <=", value, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagIn(List<Integer> values) {
            addCriterion("msg_flag in", values, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagNotIn(List<Integer> values) {
            addCriterion("msg_flag not in", values, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagBetween(Integer value1, Integer value2) {
            addCriterion("msg_flag between", value1, value2, "msgFlag");
            return (Criteria) this;
        }

        public Criteria andMsgFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_flag not between", value1, value2, "msgFlag");
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