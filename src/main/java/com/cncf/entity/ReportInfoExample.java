package com.cncf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ReportInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportInfoExample() {
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

        public Criteria andPactNumberIsNull() {
            addCriterion("pact_number is null");
            return (Criteria) this;
        }

        public Criteria andPactNumberIsNotNull() {
            addCriterion("pact_number is not null");
            return (Criteria) this;
        }

        public Criteria andPactNumberEqualTo(String value) {
            addCriterion("pact_number =", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberNotEqualTo(String value) {
            addCriterion("pact_number <>", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberGreaterThan(String value) {
            addCriterion("pact_number >", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pact_number >=", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberLessThan(String value) {
            addCriterion("pact_number <", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberLessThanOrEqualTo(String value) {
            addCriterion("pact_number <=", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberLike(String value) {
            addCriterion("pact_number like", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberNotLike(String value) {
            addCriterion("pact_number not like", value, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberIn(List<String> values) {
            addCriterion("pact_number in", values, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberNotIn(List<String> values) {
            addCriterion("pact_number not in", values, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberBetween(String value1, String value2) {
            addCriterion("pact_number between", value1, value2, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andPactNumberNotBetween(String value1, String value2) {
            addCriterion("pact_number not between", value1, value2, "pactNumber");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andTestAddressIsNull() {
            addCriterion("test_address is null");
            return (Criteria) this;
        }

        public Criteria andTestAddressIsNotNull() {
            addCriterion("test_address is not null");
            return (Criteria) this;
        }

        public Criteria andTestAddressEqualTo(String value) {
            addCriterion("test_address =", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressNotEqualTo(String value) {
            addCriterion("test_address <>", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressGreaterThan(String value) {
            addCriterion("test_address >", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressGreaterThanOrEqualTo(String value) {
            addCriterion("test_address >=", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressLessThan(String value) {
            addCriterion("test_address <", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressLessThanOrEqualTo(String value) {
            addCriterion("test_address <=", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressLike(String value) {
            addCriterion("test_address like", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressNotLike(String value) {
            addCriterion("test_address not like", value, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressIn(List<String> values) {
            addCriterion("test_address in", values, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressNotIn(List<String> values) {
            addCriterion("test_address not in", values, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressBetween(String value1, String value2) {
            addCriterion("test_address between", value1, value2, "testAddress");
            return (Criteria) this;
        }

        public Criteria andTestAddressNotBetween(String value1, String value2) {
            addCriterion("test_address not between", value1, value2, "testAddress");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andResultFlagIsNull() {
            addCriterion("result_flag is null");
            return (Criteria) this;
        }

        public Criteria andResultFlagIsNotNull() {
            addCriterion("result_flag is not null");
            return (Criteria) this;
        }

        public Criteria andResultFlagEqualTo(String value) {
            addCriterion("result_flag =", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagNotEqualTo(String value) {
            addCriterion("result_flag <>", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagGreaterThan(String value) {
            addCriterion("result_flag >", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagGreaterThanOrEqualTo(String value) {
            addCriterion("result_flag >=", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagLessThan(String value) {
            addCriterion("result_flag <", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagLessThanOrEqualTo(String value) {
            addCriterion("result_flag <=", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagLike(String value) {
            addCriterion("result_flag like", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagNotLike(String value) {
            addCriterion("result_flag not like", value, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagIn(List<String> values) {
            addCriterion("result_flag in", values, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagNotIn(List<String> values) {
            addCriterion("result_flag not in", values, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagBetween(String value1, String value2) {
            addCriterion("result_flag between", value1, value2, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andResultFlagNotBetween(String value1, String value2) {
            addCriterion("result_flag not between", value1, value2, "resultFlag");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPageCountIsNull() {
            addCriterion("page_count is null");
            return (Criteria) this;
        }

        public Criteria andPageCountIsNotNull() {
            addCriterion("page_count is not null");
            return (Criteria) this;
        }

        public Criteria andPageCountEqualTo(Integer value) {
            addCriterion("page_count =", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotEqualTo(Integer value) {
            addCriterion("page_count <>", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountGreaterThan(Integer value) {
            addCriterion("page_count >", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_count >=", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountLessThan(Integer value) {
            addCriterion("page_count <", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountLessThanOrEqualTo(Integer value) {
            addCriterion("page_count <=", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountIn(List<Integer> values) {
            addCriterion("page_count in", values, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotIn(List<Integer> values) {
            addCriterion("page_count not in", values, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountBetween(Integer value1, Integer value2) {
            addCriterion("page_count between", value1, value2, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("page_count not between", value1, value2, "pageCount");
            return (Criteria) this;
        }

        public Criteria andWriterIsNull() {
            addCriterion("writer is null");
            return (Criteria) this;
        }

        public Criteria andWriterIsNotNull() {
            addCriterion("writer is not null");
            return (Criteria) this;
        }

        public Criteria andWriterEqualTo(String value) {
            addCriterion("writer =", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotEqualTo(String value) {
            addCriterion("writer <>", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThan(String value) {
            addCriterion("writer >", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThanOrEqualTo(String value) {
            addCriterion("writer >=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThan(String value) {
            addCriterion("writer <", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThanOrEqualTo(String value) {
            addCriterion("writer <=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLike(String value) {
            addCriterion("writer like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotLike(String value) {
            addCriterion("writer not like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterIn(List<String> values) {
            addCriterion("writer in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotIn(List<String> values) {
            addCriterion("writer not in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterBetween(String value1, String value2) {
            addCriterion("writer between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotBetween(String value1, String value2) {
            addCriterion("writer not between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterDateIsNull() {
            addCriterion("writer_date is null");
            return (Criteria) this;
        }

        public Criteria andWriterDateIsNotNull() {
            addCriterion("writer_date is not null");
            return (Criteria) this;
        }

        public Criteria andWriterDateEqualTo(String value) {
            addCriterion("writer_date =", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateNotEqualTo(String value) {
            addCriterion("writer_date <>", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateGreaterThan(String value) {
            addCriterion("writer_date >", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateGreaterThanOrEqualTo(String value) {
            addCriterion("writer_date >=", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateLessThan(String value) {
            addCriterion("writer_date <", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateLessThanOrEqualTo(String value) {
            addCriterion("writer_date <=", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateLike(String value) {
            addCriterion("writer_date like", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateNotLike(String value) {
            addCriterion("writer_date not like", value, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateIn(List<String> values) {
            addCriterion("writer_date in", values, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateNotIn(List<String> values) {
            addCriterion("writer_date not in", values, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateBetween(String value1, String value2) {
            addCriterion("writer_date between", value1, value2, "writerDate");
            return (Criteria) this;
        }

        public Criteria andWriterDateNotBetween(String value1, String value2) {
            addCriterion("writer_date not between", value1, value2, "writerDate");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(String value) {
            addCriterion("audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(String value) {
            addCriterion("audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(String value) {
            addCriterion("audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(String value) {
            addCriterion("audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(String value) {
            addCriterion("audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(String value) {
            addCriterion("audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLike(String value) {
            addCriterion("audit_date like", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotLike(String value) {
            addCriterion("audit_date not like", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<String> values) {
            addCriterion("audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<String> values) {
            addCriterion("audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(String value1, String value2) {
            addCriterion("audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(String value1, String value2) {
            addCriterion("audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andSignaturerIsNull() {
            addCriterion("signaturer is null");
            return (Criteria) this;
        }

        public Criteria andSignaturerIsNotNull() {
            addCriterion("signaturer is not null");
            return (Criteria) this;
        }

        public Criteria andSignaturerEqualTo(String value) {
            addCriterion("signaturer =", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerNotEqualTo(String value) {
            addCriterion("signaturer <>", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerGreaterThan(String value) {
            addCriterion("signaturer >", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerGreaterThanOrEqualTo(String value) {
            addCriterion("signaturer >=", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerLessThan(String value) {
            addCriterion("signaturer <", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerLessThanOrEqualTo(String value) {
            addCriterion("signaturer <=", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerLike(String value) {
            addCriterion("signaturer like", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerNotLike(String value) {
            addCriterion("signaturer not like", value, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerIn(List<String> values) {
            addCriterion("signaturer in", values, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerNotIn(List<String> values) {
            addCriterion("signaturer not in", values, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerBetween(String value1, String value2) {
            addCriterion("signaturer between", value1, value2, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignaturerNotBetween(String value1, String value2) {
            addCriterion("signaturer not between", value1, value2, "signaturer");
            return (Criteria) this;
        }

        public Criteria andSignatureDateIsNull() {
            addCriterion("signature_date is null");
            return (Criteria) this;
        }

        public Criteria andSignatureDateIsNotNull() {
            addCriterion("signature_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureDateEqualTo(String value) {
            addCriterion("signature_date =", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateNotEqualTo(String value) {
            addCriterion("signature_date <>", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateGreaterThan(String value) {
            addCriterion("signature_date >", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateGreaterThanOrEqualTo(String value) {
            addCriterion("signature_date >=", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateLessThan(String value) {
            addCriterion("signature_date <", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateLessThanOrEqualTo(String value) {
            addCriterion("signature_date <=", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateLike(String value) {
            addCriterion("signature_date like", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateNotLike(String value) {
            addCriterion("signature_date not like", value, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateIn(List<String> values) {
            addCriterion("signature_date in", values, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateNotIn(List<String> values) {
            addCriterion("signature_date not in", values, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateBetween(String value1, String value2) {
            addCriterion("signature_date between", value1, value2, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andSignatureDateNotBetween(String value1, String value2) {
            addCriterion("signature_date not between", value1, value2, "signatureDate");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("report_status is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("report_status is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(String value) {
            addCriterion("report_status =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(String value) {
            addCriterion("report_status <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(String value) {
            addCriterion("report_status >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("report_status >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(String value) {
            addCriterion("report_status <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(String value) {
            addCriterion("report_status <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLike(String value) {
            addCriterion("report_status like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotLike(String value) {
            addCriterion("report_status not like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<String> values) {
            addCriterion("report_status in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<String> values) {
            addCriterion("report_status not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(String value1, String value2) {
            addCriterion("report_status between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(String value1, String value2) {
            addCriterion("report_status not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andSendFlagIsNull() {
            addCriterion("send_flag is null");
            return (Criteria) this;
        }

        public Criteria andSendFlagIsNotNull() {
            addCriterion("send_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSendFlagEqualTo(String value) {
            addCriterion("send_flag =", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotEqualTo(String value) {
            addCriterion("send_flag <>", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagGreaterThan(String value) {
            addCriterion("send_flag >", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagGreaterThanOrEqualTo(String value) {
            addCriterion("send_flag >=", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagLessThan(String value) {
            addCriterion("send_flag <", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagLessThanOrEqualTo(String value) {
            addCriterion("send_flag <=", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagLike(String value) {
            addCriterion("send_flag like", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotLike(String value) {
            addCriterion("send_flag not like", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagIn(List<String> values) {
            addCriterion("send_flag in", values, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotIn(List<String> values) {
            addCriterion("send_flag not in", values, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagBetween(String value1, String value2) {
            addCriterion("send_flag between", value1, value2, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotBetween(String value1, String value2) {
            addCriterion("send_flag not between", value1, value2, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(String value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(String value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(String value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(String value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(String value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(String value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLike(String value) {
            addCriterion("send_date like", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotLike(String value) {
            addCriterion("send_date not like", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<String> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<String> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(String value1, String value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(String value1, String value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
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

        public Criteria andEmsNumberIsNull() {
            addCriterion("ems_number is null");
            return (Criteria) this;
        }

        public Criteria andEmsNumberIsNotNull() {
            addCriterion("ems_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmsNumberEqualTo(String value) {
            addCriterion("ems_number =", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberNotEqualTo(String value) {
            addCriterion("ems_number <>", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberGreaterThan(String value) {
            addCriterion("ems_number >", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ems_number >=", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberLessThan(String value) {
            addCriterion("ems_number <", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberLessThanOrEqualTo(String value) {
            addCriterion("ems_number <=", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberLike(String value) {
            addCriterion("ems_number like", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberNotLike(String value) {
            addCriterion("ems_number not like", value, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberIn(List<String> values) {
            addCriterion("ems_number in", values, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberNotIn(List<String> values) {
            addCriterion("ems_number not in", values, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberBetween(String value1, String value2) {
            addCriterion("ems_number between", value1, value2, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andEmsNumberNotBetween(String value1, String value2) {
            addCriterion("ems_number not between", value1, value2, "emsNumber");
            return (Criteria) this;
        }

        public Criteria andSendMemoIsNull() {
            addCriterion("send_memo is null");
            return (Criteria) this;
        }

        public Criteria andSendMemoIsNotNull() {
            addCriterion("send_memo is not null");
            return (Criteria) this;
        }

        public Criteria andSendMemoEqualTo(String value) {
            addCriterion("send_memo =", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoNotEqualTo(String value) {
            addCriterion("send_memo <>", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoGreaterThan(String value) {
            addCriterion("send_memo >", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoGreaterThanOrEqualTo(String value) {
            addCriterion("send_memo >=", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoLessThan(String value) {
            addCriterion("send_memo <", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoLessThanOrEqualTo(String value) {
            addCriterion("send_memo <=", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoLike(String value) {
            addCriterion("send_memo like", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoNotLike(String value) {
            addCriterion("send_memo not like", value, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoIn(List<String> values) {
            addCriterion("send_memo in", values, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoNotIn(List<String> values) {
            addCriterion("send_memo not in", values, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoBetween(String value1, String value2) {
            addCriterion("send_memo between", value1, value2, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendMemoNotBetween(String value1, String value2) {
            addCriterion("send_memo not between", value1, value2, "sendMemo");
            return (Criteria) this;
        }

        public Criteria andSendPersonIsNull() {
            addCriterion("send_person is null");
            return (Criteria) this;
        }

        public Criteria andSendPersonIsNotNull() {
            addCriterion("send_person is not null");
            return (Criteria) this;
        }

        public Criteria andSendPersonEqualTo(String value) {
            addCriterion("send_person =", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonNotEqualTo(String value) {
            addCriterion("send_person <>", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonGreaterThan(String value) {
            addCriterion("send_person >", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonGreaterThanOrEqualTo(String value) {
            addCriterion("send_person >=", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonLessThan(String value) {
            addCriterion("send_person <", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonLessThanOrEqualTo(String value) {
            addCriterion("send_person <=", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonLike(String value) {
            addCriterion("send_person like", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonNotLike(String value) {
            addCriterion("send_person not like", value, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonIn(List<String> values) {
            addCriterion("send_person in", values, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonNotIn(List<String> values) {
            addCriterion("send_person not in", values, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonBetween(String value1, String value2) {
            addCriterion("send_person between", value1, value2, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendPersonNotBetween(String value1, String value2) {
            addCriterion("send_person not between", value1, value2, "sendPerson");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIsNull() {
            addCriterion("send_date_time is null");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIsNotNull() {
            addCriterion("send_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeEqualTo(Date value) {
            addCriterion("send_date_time =", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotEqualTo(Date value) {
            addCriterion("send_date_time <>", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeGreaterThan(Date value) {
            addCriterion("send_date_time >", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_date_time >=", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeLessThan(Date value) {
            addCriterion("send_date_time <", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_date_time <=", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIn(List<Date> values) {
            addCriterion("send_date_time in", values, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotIn(List<Date> values) {
            addCriterion("send_date_time not in", values, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeBetween(Date value1, Date value2) {
            addCriterion("send_date_time between", value1, value2, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_date_time not between", value1, value2, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andRangeFlagIsNull() {
            addCriterion("range_flag is null");
            return (Criteria) this;
        }

        public Criteria andRangeFlagIsNotNull() {
            addCriterion("range_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRangeFlagEqualTo(String value) {
            addCriterion("range_flag =", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagNotEqualTo(String value) {
            addCriterion("range_flag <>", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagGreaterThan(String value) {
            addCriterion("range_flag >", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("range_flag >=", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagLessThan(String value) {
            addCriterion("range_flag <", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagLessThanOrEqualTo(String value) {
            addCriterion("range_flag <=", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagLike(String value) {
            addCriterion("range_flag like", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagNotLike(String value) {
            addCriterion("range_flag not like", value, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagIn(List<String> values) {
            addCriterion("range_flag in", values, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagNotIn(List<String> values) {
            addCriterion("range_flag not in", values, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagBetween(String value1, String value2) {
            addCriterion("range_flag between", value1, value2, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeFlagNotBetween(String value1, String value2) {
            addCriterion("range_flag not between", value1, value2, "rangeFlag");
            return (Criteria) this;
        }

        public Criteria andRangeDateIsNull() {
            addCriterion("range_date is null");
            return (Criteria) this;
        }

        public Criteria andRangeDateIsNotNull() {
            addCriterion("range_date is not null");
            return (Criteria) this;
        }

        public Criteria andRangeDateEqualTo(String value) {
            addCriterion("range_date =", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateNotEqualTo(String value) {
            addCriterion("range_date <>", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateGreaterThan(String value) {
            addCriterion("range_date >", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateGreaterThanOrEqualTo(String value) {
            addCriterion("range_date >=", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateLessThan(String value) {
            addCriterion("range_date <", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateLessThanOrEqualTo(String value) {
            addCriterion("range_date <=", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateLike(String value) {
            addCriterion("range_date like", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateNotLike(String value) {
            addCriterion("range_date not like", value, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateIn(List<String> values) {
            addCriterion("range_date in", values, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateNotIn(List<String> values) {
            addCriterion("range_date not in", values, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateBetween(String value1, String value2) {
            addCriterion("range_date between", value1, value2, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andRangeDateNotBetween(String value1, String value2) {
            addCriterion("range_date not between", value1, value2, "rangeDate");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(String value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(String value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(String value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(String value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(String value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLike(String value) {
            addCriterion("position_id like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotLike(String value) {
            addCriterion("position_id not like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<String> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<String> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(String value1, String value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(String value1, String value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andRangeMemoIsNull() {
            addCriterion("range_memo is null");
            return (Criteria) this;
        }

        public Criteria andRangeMemoIsNotNull() {
            addCriterion("range_memo is not null");
            return (Criteria) this;
        }

        public Criteria andRangeMemoEqualTo(String value) {
            addCriterion("range_memo =", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoNotEqualTo(String value) {
            addCriterion("range_memo <>", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoGreaterThan(String value) {
            addCriterion("range_memo >", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("range_memo >=", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoLessThan(String value) {
            addCriterion("range_memo <", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoLessThanOrEqualTo(String value) {
            addCriterion("range_memo <=", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoLike(String value) {
            addCriterion("range_memo like", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoNotLike(String value) {
            addCriterion("range_memo not like", value, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoIn(List<String> values) {
            addCriterion("range_memo in", values, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoNotIn(List<String> values) {
            addCriterion("range_memo not in", values, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoBetween(String value1, String value2) {
            addCriterion("range_memo between", value1, value2, "rangeMemo");
            return (Criteria) this;
        }

        public Criteria andRangeMemoNotBetween(String value1, String value2) {
            addCriterion("range_memo not between", value1, value2, "rangeMemo");
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

        public Criteria andCreateDateTimeIsNull() {
            addCriterion("create_date_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNotNull() {
            addCriterion("create_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeEqualTo(Date value) {
            addCriterion("create_date_time =", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotEqualTo(Date value) {
            addCriterion("create_date_time <>", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThan(Date value) {
            addCriterion("create_date_time >", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date_time >=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThan(Date value) {
            addCriterion("create_date_time <", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_date_time <=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIn(List<Date> values) {
            addCriterion("create_date_time in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotIn(List<Date> values) {
            addCriterion("create_date_time not in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeBetween(Date value1, Date value2) {
            addCriterion("create_date_time between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_date_time not between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andAttProductNameIsNull() {
            addCriterion("att_product_name is null");
            return (Criteria) this;
        }

        public Criteria andAttProductNameIsNotNull() {
            addCriterion("att_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttProductNameEqualTo(String value) {
            addCriterion("att_product_name =", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameNotEqualTo(String value) {
            addCriterion("att_product_name <>", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameGreaterThan(String value) {
            addCriterion("att_product_name >", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("att_product_name >=", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameLessThan(String value) {
            addCriterion("att_product_name <", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameLessThanOrEqualTo(String value) {
            addCriterion("att_product_name <=", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameLike(String value) {
            addCriterion("att_product_name like", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameNotLike(String value) {
            addCriterion("att_product_name not like", value, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameIn(List<String> values) {
            addCriterion("att_product_name in", values, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameNotIn(List<String> values) {
            addCriterion("att_product_name not in", values, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameBetween(String value1, String value2) {
            addCriterion("att_product_name between", value1, value2, "attProductName");
            return (Criteria) this;
        }

        public Criteria andAttProductNameNotBetween(String value1, String value2) {
            addCriterion("att_product_name not between", value1, value2, "attProductName");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIsNull() {
            addCriterion("publish_flag is null");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIsNotNull() {
            addCriterion("publish_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPublishFlagEqualTo(Integer value) {
            addCriterion("publish_flag =", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotEqualTo(Integer value) {
            addCriterion("publish_flag <>", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagGreaterThan(Integer value) {
            addCriterion("publish_flag >", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_flag >=", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagLessThan(Integer value) {
            addCriterion("publish_flag <", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagLessThanOrEqualTo(Integer value) {
            addCriterion("publish_flag <=", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIn(List<Integer> values) {
            addCriterion("publish_flag in", values, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotIn(List<Integer> values) {
            addCriterion("publish_flag not in", values, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagBetween(Integer value1, Integer value2) {
            addCriterion("publish_flag between", value1, value2, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_flag not between", value1, value2, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameIsNull() {
            addCriterion("publish_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameIsNotNull() {
            addCriterion("publish_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameEqualTo(String value) {
            addCriterion("publish_user_name =", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameNotEqualTo(String value) {
            addCriterion("publish_user_name <>", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameGreaterThan(String value) {
            addCriterion("publish_user_name >", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("publish_user_name >=", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameLessThan(String value) {
            addCriterion("publish_user_name <", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameLessThanOrEqualTo(String value) {
            addCriterion("publish_user_name <=", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameLike(String value) {
            addCriterion("publish_user_name like", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameNotLike(String value) {
            addCriterion("publish_user_name not like", value, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameIn(List<String> values) {
            addCriterion("publish_user_name in", values, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameNotIn(List<String> values) {
            addCriterion("publish_user_name not in", values, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameBetween(String value1, String value2) {
            addCriterion("publish_user_name between", value1, value2, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishUserNameNotBetween(String value1, String value2) {
            addCriterion("publish_user_name not between", value1, value2, "publishUserName");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeIsNull() {
            addCriterion("publish_date_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeIsNotNull() {
            addCriterion("publish_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeEqualTo(Date value) {
            addCriterion("publish_date_time =", value, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeNotEqualTo(Date value) {
            addCriterion("publish_date_time <>", value, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeGreaterThan(Date value) {
            addCriterion("publish_date_time >", value, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date_time >=", value, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeLessThan(Date value) {
            addCriterion("publish_date_time <", value, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_date_time <=", value, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeIn(List<Date> values) {
            addCriterion("publish_date_time in", values, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeNotIn(List<Date> values) {
            addCriterion("publish_date_time not in", values, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeBetween(Date value1, Date value2) {
            addCriterion("publish_date_time between", value1, value2, "publishDateTime");
            return (Criteria) this;
        }

        public Criteria andPublishDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_date_time not between", value1, value2, "publishDateTime");
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