package com.onps.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubprojectExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNull() {
            addCriterion("SUBNAME is null");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNotNull() {
            addCriterion("SUBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubnameEqualTo(Object value) {
            addCriterion("SUBNAME =", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotEqualTo(Object value) {
            addCriterion("SUBNAME <>", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThan(Object value) {
            addCriterion("SUBNAME >", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThanOrEqualTo(Object value) {
            addCriterion("SUBNAME >=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThan(Object value) {
            addCriterion("SUBNAME <", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThanOrEqualTo(Object value) {
            addCriterion("SUBNAME <=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameIn(List<Object> values) {
            addCriterion("SUBNAME in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotIn(List<Object> values) {
            addCriterion("SUBNAME not in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameBetween(Object value1, Object value2) {
            addCriterion("SUBNAME between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotBetween(Object value1, Object value2) {
            addCriterion("SUBNAME not between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameIsNull() {
            addCriterion("SUBMITFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameIsNotNull() {
            addCriterion("SUBMITFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameEqualTo(Object value) {
            addCriterion("SUBMITFILENAME =", value, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameNotEqualTo(Object value) {
            addCriterion("SUBMITFILENAME <>", value, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameGreaterThan(Object value) {
            addCriterion("SUBMITFILENAME >", value, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameGreaterThanOrEqualTo(Object value) {
            addCriterion("SUBMITFILENAME >=", value, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameLessThan(Object value) {
            addCriterion("SUBMITFILENAME <", value, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameLessThanOrEqualTo(Object value) {
            addCriterion("SUBMITFILENAME <=", value, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameIn(List<Object> values) {
            addCriterion("SUBMITFILENAME in", values, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameNotIn(List<Object> values) {
            addCriterion("SUBMITFILENAME not in", values, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameBetween(Object value1, Object value2) {
            addCriterion("SUBMITFILENAME between", value1, value2, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameNotBetween(Object value1, Object value2) {
            addCriterion("SUBMITFILENAME not between", value1, value2, "submitfilename");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentIsNull() {
            addCriterion("SUBMITDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentIsNotNull() {
            addCriterion("SUBMITDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT =", value, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentNotEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT <>", value, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentGreaterThan(Object value) {
            addCriterion("SUBMITDEPARTMENT >", value, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentGreaterThanOrEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT >=", value, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentLessThan(Object value) {
            addCriterion("SUBMITDEPARTMENT <", value, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentLessThanOrEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT <=", value, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentIn(List<Object> values) {
            addCriterion("SUBMITDEPARTMENT in", values, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentNotIn(List<Object> values) {
            addCriterion("SUBMITDEPARTMENT not in", values, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentBetween(Object value1, Object value2) {
            addCriterion("SUBMITDEPARTMENT between", value1, value2, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentNotBetween(Object value1, Object value2) {
            addCriterion("SUBMITDEPARTMENT not between", value1, value2, "submitdepartment");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberIsNull() {
            addCriterion("SUBMITNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberIsNotNull() {
            addCriterion("SUBMITNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberEqualTo(String value) {
            addCriterion("SUBMITNUMBER =", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberNotEqualTo(String value) {
            addCriterion("SUBMITNUMBER <>", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberGreaterThan(String value) {
            addCriterion("SUBMITNUMBER >", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITNUMBER >=", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberLessThan(String value) {
            addCriterion("SUBMITNUMBER <", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberLessThanOrEqualTo(String value) {
            addCriterion("SUBMITNUMBER <=", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberLike(String value) {
            addCriterion("SUBMITNUMBER like", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberNotLike(String value) {
            addCriterion("SUBMITNUMBER not like", value, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberIn(List<String> values) {
            addCriterion("SUBMITNUMBER in", values, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberNotIn(List<String> values) {
            addCriterion("SUBMITNUMBER not in", values, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberBetween(String value1, String value2) {
            addCriterion("SUBMITNUMBER between", value1, value2, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberNotBetween(String value1, String value2) {
            addCriterion("SUBMITNUMBER not between", value1, value2, "submitnumber");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("SUBMITDATE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("SUBMITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterion("SUBMITDATE =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterion("SUBMITDATE <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterion("SUBMITDATE >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITDATE >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterion("SUBMITDATE <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITDATE <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterion("SUBMITDATE in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterion("SUBMITDATE not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterion("SUBMITDATE between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITDATE not between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andApprovalnameIsNull() {
            addCriterion("APPROVALNAME is null");
            return (Criteria) this;
        }

        public Criteria andApprovalnameIsNotNull() {
            addCriterion("APPROVALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalnameEqualTo(Object value) {
            addCriterion("APPROVALNAME =", value, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameNotEqualTo(Object value) {
            addCriterion("APPROVALNAME <>", value, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameGreaterThan(Object value) {
            addCriterion("APPROVALNAME >", value, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALNAME >=", value, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameLessThan(Object value) {
            addCriterion("APPROVALNAME <", value, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALNAME <=", value, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameIn(List<Object> values) {
            addCriterion("APPROVALNAME in", values, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameNotIn(List<Object> values) {
            addCriterion("APPROVALNAME not in", values, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameBetween(Object value1, Object value2) {
            addCriterion("APPROVALNAME between", value1, value2, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovalnameNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALNAME not between", value1, value2, "approvalname");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentIsNull() {
            addCriterion("APPROVALDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentIsNotNull() {
            addCriterion("APPROVALDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT =", value, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentNotEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT <>", value, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentGreaterThan(Object value) {
            addCriterion("APPROVALDEPARTMENT >", value, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT >=", value, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentLessThan(Object value) {
            addCriterion("APPROVALDEPARTMENT <", value, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT <=", value, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentIn(List<Object> values) {
            addCriterion("APPROVALDEPARTMENT in", values, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentNotIn(List<Object> values) {
            addCriterion("APPROVALDEPARTMENT not in", values, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentBetween(Object value1, Object value2) {
            addCriterion("APPROVALDEPARTMENT between", value1, value2, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALDEPARTMENT not between", value1, value2, "approvaldepartment");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberIsNull() {
            addCriterion("APPROVALNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberIsNotNull() {
            addCriterion("APPROVALNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberEqualTo(String value) {
            addCriterion("APPROVALNUMBER =", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotEqualTo(String value) {
            addCriterion("APPROVALNUMBER <>", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberGreaterThan(String value) {
            addCriterion("APPROVALNUMBER >", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVALNUMBER >=", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberLessThan(String value) {
            addCriterion("APPROVALNUMBER <", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberLessThanOrEqualTo(String value) {
            addCriterion("APPROVALNUMBER <=", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberLike(String value) {
            addCriterion("APPROVALNUMBER like", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotLike(String value) {
            addCriterion("APPROVALNUMBER not like", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberIn(List<String> values) {
            addCriterion("APPROVALNUMBER in", values, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotIn(List<String> values) {
            addCriterion("APPROVALNUMBER not in", values, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberBetween(String value1, String value2) {
            addCriterion("APPROVALNUMBER between", value1, value2, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotBetween(String value1, String value2) {
            addCriterion("APPROVALNUMBER not between", value1, value2, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNull() {
            addCriterion("APPROVALDATE is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("APPROVALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(Date value) {
            addCriterion("APPROVALDATE =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(Date value) {
            addCriterion("APPROVALDATE <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(Date value) {
            addCriterion("APPROVALDATE >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVALDATE >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(Date value) {
            addCriterion("APPROVALDATE <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("APPROVALDATE <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<Date> values) {
            addCriterion("APPROVALDATE in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<Date> values) {
            addCriterion("APPROVALDATE not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(Date value1, Date value2) {
            addCriterion("APPROVALDATE between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("APPROVALDATE not between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaIsNull() {
            addCriterion("SUBMITFILENAME_TA is null");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaIsNotNull() {
            addCriterion("SUBMITFILENAME_TA is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaEqualTo(Object value) {
            addCriterion("SUBMITFILENAME_TA =", value, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaNotEqualTo(Object value) {
            addCriterion("SUBMITFILENAME_TA <>", value, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaGreaterThan(Object value) {
            addCriterion("SUBMITFILENAME_TA >", value, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaGreaterThanOrEqualTo(Object value) {
            addCriterion("SUBMITFILENAME_TA >=", value, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaLessThan(Object value) {
            addCriterion("SUBMITFILENAME_TA <", value, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaLessThanOrEqualTo(Object value) {
            addCriterion("SUBMITFILENAME_TA <=", value, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaIn(List<Object> values) {
            addCriterion("SUBMITFILENAME_TA in", values, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaNotIn(List<Object> values) {
            addCriterion("SUBMITFILENAME_TA not in", values, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaBetween(Object value1, Object value2) {
            addCriterion("SUBMITFILENAME_TA between", value1, value2, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitfilenameTaNotBetween(Object value1, Object value2) {
            addCriterion("SUBMITFILENAME_TA not between", value1, value2, "submitfilenameTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaIsNull() {
            addCriterion("SUBMITDEPARTMENT_TA is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaIsNotNull() {
            addCriterion("SUBMITDEPARTMENT_TA is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT_TA =", value, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaNotEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT_TA <>", value, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaGreaterThan(Object value) {
            addCriterion("SUBMITDEPARTMENT_TA >", value, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaGreaterThanOrEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT_TA >=", value, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaLessThan(Object value) {
            addCriterion("SUBMITDEPARTMENT_TA <", value, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaLessThanOrEqualTo(Object value) {
            addCriterion("SUBMITDEPARTMENT_TA <=", value, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaIn(List<Object> values) {
            addCriterion("SUBMITDEPARTMENT_TA in", values, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaNotIn(List<Object> values) {
            addCriterion("SUBMITDEPARTMENT_TA not in", values, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaBetween(Object value1, Object value2) {
            addCriterion("SUBMITDEPARTMENT_TA between", value1, value2, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdepartmentTaNotBetween(Object value1, Object value2) {
            addCriterion("SUBMITDEPARTMENT_TA not between", value1, value2, "submitdepartmentTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaIsNull() {
            addCriterion("SUBMITNUMBER_TA is null");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaIsNotNull() {
            addCriterion("SUBMITNUMBER_TA is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaEqualTo(String value) {
            addCriterion("SUBMITNUMBER_TA =", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaNotEqualTo(String value) {
            addCriterion("SUBMITNUMBER_TA <>", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaGreaterThan(String value) {
            addCriterion("SUBMITNUMBER_TA >", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITNUMBER_TA >=", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaLessThan(String value) {
            addCriterion("SUBMITNUMBER_TA <", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaLessThanOrEqualTo(String value) {
            addCriterion("SUBMITNUMBER_TA <=", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaLike(String value) {
            addCriterion("SUBMITNUMBER_TA like", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaNotLike(String value) {
            addCriterion("SUBMITNUMBER_TA not like", value, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaIn(List<String> values) {
            addCriterion("SUBMITNUMBER_TA in", values, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaNotIn(List<String> values) {
            addCriterion("SUBMITNUMBER_TA not in", values, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaBetween(String value1, String value2) {
            addCriterion("SUBMITNUMBER_TA between", value1, value2, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitnumberTaNotBetween(String value1, String value2) {
            addCriterion("SUBMITNUMBER_TA not between", value1, value2, "submitnumberTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaIsNull() {
            addCriterion("SUBMITDATE_TA is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaIsNotNull() {
            addCriterion("SUBMITDATE_TA is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaEqualTo(Date value) {
            addCriterion("SUBMITDATE_TA =", value, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaNotEqualTo(Date value) {
            addCriterion("SUBMITDATE_TA <>", value, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaGreaterThan(Date value) {
            addCriterion("SUBMITDATE_TA >", value, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITDATE_TA >=", value, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaLessThan(Date value) {
            addCriterion("SUBMITDATE_TA <", value, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITDATE_TA <=", value, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaIn(List<Date> values) {
            addCriterion("SUBMITDATE_TA in", values, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaNotIn(List<Date> values) {
            addCriterion("SUBMITDATE_TA not in", values, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaBetween(Date value1, Date value2) {
            addCriterion("SUBMITDATE_TA between", value1, value2, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andSubmitdateTaNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITDATE_TA not between", value1, value2, "submitdateTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaIsNull() {
            addCriterion("APPROVALNAME_TA is null");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaIsNotNull() {
            addCriterion("APPROVALNAME_TA is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaEqualTo(Object value) {
            addCriterion("APPROVALNAME_TA =", value, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaNotEqualTo(Object value) {
            addCriterion("APPROVALNAME_TA <>", value, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaGreaterThan(Object value) {
            addCriterion("APPROVALNAME_TA >", value, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALNAME_TA >=", value, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaLessThan(Object value) {
            addCriterion("APPROVALNAME_TA <", value, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALNAME_TA <=", value, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaIn(List<Object> values) {
            addCriterion("APPROVALNAME_TA in", values, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaNotIn(List<Object> values) {
            addCriterion("APPROVALNAME_TA not in", values, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaBetween(Object value1, Object value2) {
            addCriterion("APPROVALNAME_TA between", value1, value2, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnameTaNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALNAME_TA not between", value1, value2, "approvalnameTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaIsNull() {
            addCriterion("APPROVALDEPARTMENT_TA is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaIsNotNull() {
            addCriterion("APPROVALDEPARTMENT_TA is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT_TA =", value, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaNotEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT_TA <>", value, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaGreaterThan(Object value) {
            addCriterion("APPROVALDEPARTMENT_TA >", value, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT_TA >=", value, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaLessThan(Object value) {
            addCriterion("APPROVALDEPARTMENT_TA <", value, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALDEPARTMENT_TA <=", value, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaIn(List<Object> values) {
            addCriterion("APPROVALDEPARTMENT_TA in", values, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaNotIn(List<Object> values) {
            addCriterion("APPROVALDEPARTMENT_TA not in", values, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaBetween(Object value1, Object value2) {
            addCriterion("APPROVALDEPARTMENT_TA between", value1, value2, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldepartmentTaNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALDEPARTMENT_TA not between", value1, value2, "approvaldepartmentTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaIsNull() {
            addCriterion("APPROVALNUMBER_TA is null");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaIsNotNull() {
            addCriterion("APPROVALNUMBER_TA is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaEqualTo(String value) {
            addCriterion("APPROVALNUMBER_TA =", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaNotEqualTo(String value) {
            addCriterion("APPROVALNUMBER_TA <>", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaGreaterThan(String value) {
            addCriterion("APPROVALNUMBER_TA >", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVALNUMBER_TA >=", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaLessThan(String value) {
            addCriterion("APPROVALNUMBER_TA <", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaLessThanOrEqualTo(String value) {
            addCriterion("APPROVALNUMBER_TA <=", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaLike(String value) {
            addCriterion("APPROVALNUMBER_TA like", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaNotLike(String value) {
            addCriterion("APPROVALNUMBER_TA not like", value, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaIn(List<String> values) {
            addCriterion("APPROVALNUMBER_TA in", values, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaNotIn(List<String> values) {
            addCriterion("APPROVALNUMBER_TA not in", values, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaBetween(String value1, String value2) {
            addCriterion("APPROVALNUMBER_TA between", value1, value2, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberTaNotBetween(String value1, String value2) {
            addCriterion("APPROVALNUMBER_TA not between", value1, value2, "approvalnumberTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaIsNull() {
            addCriterion("APPROVALDATE_TA is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaIsNotNull() {
            addCriterion("APPROVALDATE_TA is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaEqualTo(Date value) {
            addCriterion("APPROVALDATE_TA =", value, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaNotEqualTo(Date value) {
            addCriterion("APPROVALDATE_TA <>", value, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaGreaterThan(Date value) {
            addCriterion("APPROVALDATE_TA >", value, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVALDATE_TA >=", value, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaLessThan(Date value) {
            addCriterion("APPROVALDATE_TA <", value, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaLessThanOrEqualTo(Date value) {
            addCriterion("APPROVALDATE_TA <=", value, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaIn(List<Date> values) {
            addCriterion("APPROVALDATE_TA in", values, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaNotIn(List<Date> values) {
            addCriterion("APPROVALDATE_TA not in", values, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaBetween(Date value1, Date value2) {
            addCriterion("APPROVALDATE_TA between", value1, value2, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andApprovaldateTaNotBetween(Date value1, Date value2) {
            addCriterion("APPROVALDATE_TA not between", value1, value2, "approvaldateTa");
            return (Criteria) this;
        }

        public Criteria andReplydateIsNull() {
            addCriterion("REPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andReplydateIsNotNull() {
            addCriterion("REPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplydateEqualTo(Date value) {
            addCriterion("REPLYDATE =", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateNotEqualTo(Date value) {
            addCriterion("REPLYDATE <>", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateGreaterThan(Date value) {
            addCriterion("REPLYDATE >", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLYDATE >=", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateLessThan(Date value) {
            addCriterion("REPLYDATE <", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateLessThanOrEqualTo(Date value) {
            addCriterion("REPLYDATE <=", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateIn(List<Date> values) {
            addCriterion("REPLYDATE in", values, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateNotIn(List<Date> values) {
            addCriterion("REPLYDATE not in", values, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateBetween(Date value1, Date value2) {
            addCriterion("REPLYDATE between", value1, value2, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateNotBetween(Date value1, Date value2) {
            addCriterion("REPLYDATE not between", value1, value2, "replydate");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressIsNull() {
            addCriterion("APPROVALPROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressIsNotNull() {
            addCriterion("APPROVALPROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressEqualTo(Object value) {
            addCriterion("APPROVALPROGRESS =", value, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressNotEqualTo(Object value) {
            addCriterion("APPROVALPROGRESS <>", value, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressGreaterThan(Object value) {
            addCriterion("APPROVALPROGRESS >", value, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALPROGRESS >=", value, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressLessThan(Object value) {
            addCriterion("APPROVALPROGRESS <", value, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALPROGRESS <=", value, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressIn(List<Object> values) {
            addCriterion("APPROVALPROGRESS in", values, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressNotIn(List<Object> values) {
            addCriterion("APPROVALPROGRESS not in", values, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressBetween(Object value1, Object value2) {
            addCriterion("APPROVALPROGRESS between", value1, value2, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andApprovalprogressNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALPROGRESS not between", value1, value2, "approvalprogress");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentIsNull() {
            addCriterion("CONSTRUCTIONCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentIsNotNull() {
            addCriterion("CONSTRUCTIONCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCONTENT =", value, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCONTENT <>", value, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONCONTENT >", value, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCONTENT >=", value, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentLessThan(Object value) {
            addCriterion("CONSTRUCTIONCONTENT <", value, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCONTENT <=", value, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentIn(List<Object> values) {
            addCriterion("CONSTRUCTIONCONTENT in", values, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONCONTENT not in", values, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONCONTENT between", value1, value2, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andConstructioncontentNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONCONTENT not between", value1, value2, "constructioncontent");
            return (Criteria) this;
        }

        public Criteria andProjectnumberIsNull() {
            addCriterion("PROJECTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andProjectnumberIsNotNull() {
            addCriterion("PROJECTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnumberEqualTo(Object value) {
            addCriterion("PROJECTNUMBER =", value, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberNotEqualTo(Object value) {
            addCriterion("PROJECTNUMBER <>", value, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberGreaterThan(Object value) {
            addCriterion("PROJECTNUMBER >", value, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTNUMBER >=", value, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberLessThan(Object value) {
            addCriterion("PROJECTNUMBER <", value, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTNUMBER <=", value, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberIn(List<Object> values) {
            addCriterion("PROJECTNUMBER in", values, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberNotIn(List<Object> values) {
            addCriterion("PROJECTNUMBER not in", values, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberBetween(Object value1, Object value2) {
            addCriterion("PROJECTNUMBER between", value1, value2, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andProjectnumberNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTNUMBER not between", value1, value2, "projectnumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceIsNull() {
            addCriterion("CONSTRUCTIONPLACE is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceIsNotNull() {
            addCriterion("CONSTRUCTIONPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPLACE =", value, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPLACE <>", value, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONPLACE >", value, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPLACE >=", value, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceLessThan(Object value) {
            addCriterion("CONSTRUCTIONPLACE <", value, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPLACE <=", value, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceIn(List<Object> values) {
            addCriterion("CONSTRUCTIONPLACE in", values, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONPLACE not in", values, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONPLACE between", value1, value2, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructionplaceNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONPLACE not between", value1, value2, "constructionplace");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyIsNull() {
            addCriterion("CONSTRUCTIONCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyIsNotNull() {
            addCriterion("CONSTRUCTIONCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCOMPANY =", value, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCOMPANY <>", value, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONCOMPANY >", value, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCOMPANY >=", value, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyLessThan(Object value) {
            addCriterion("CONSTRUCTIONCOMPANY <", value, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONCOMPANY <=", value, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyIn(List<Object> values) {
            addCriterion("CONSTRUCTIONCOMPANY in", values, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONCOMPANY not in", values, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONCOMPANY between", value1, value2, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andConstructioncompanyNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONCOMPANY not between", value1, value2, "constructioncompany");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentIsNull() {
            addCriterion("RELEASEINVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentIsNotNull() {
            addCriterion("RELEASEINVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentEqualTo(BigDecimal value) {
            addCriterion("RELEASEINVESTMENT =", value, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentNotEqualTo(BigDecimal value) {
            addCriterion("RELEASEINVESTMENT <>", value, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentGreaterThan(BigDecimal value) {
            addCriterion("RELEASEINVESTMENT >", value, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEINVESTMENT >=", value, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentLessThan(BigDecimal value) {
            addCriterion("RELEASEINVESTMENT <", value, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEINVESTMENT <=", value, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentIn(List<BigDecimal> values) {
            addCriterion("RELEASEINVESTMENT in", values, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentNotIn(List<BigDecimal> values) {
            addCriterion("RELEASEINVESTMENT not in", values, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEINVESTMENT between", value1, value2, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andReleaseinvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEINVESTMENT not between", value1, value2, "releaseinvestment");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseIsNull() {
            addCriterion("CONSTRUCTIONPHASE is null");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseIsNotNull() {
            addCriterion("CONSTRUCTIONPHASE is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPHASE =", value, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPHASE <>", value, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONPHASE >", value, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPHASE >=", value, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseLessThan(Object value) {
            addCriterion("CONSTRUCTIONPHASE <", value, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPHASE <=", value, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseIn(List<Object> values) {
            addCriterion("CONSTRUCTIONPHASE in", values, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONPHASE not in", values, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONPHASE between", value1, value2, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andConstructionphaseNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONPHASE not between", value1, value2, "constructionphase");
            return (Criteria) this;
        }

        public Criteria andFirstdesignIsNull() {
            addCriterion("FIRSTDESIGN is null");
            return (Criteria) this;
        }

        public Criteria andFirstdesignIsNotNull() {
            addCriterion("FIRSTDESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdesignEqualTo(Object value) {
            addCriterion("FIRSTDESIGN =", value, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignNotEqualTo(Object value) {
            addCriterion("FIRSTDESIGN <>", value, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignGreaterThan(Object value) {
            addCriterion("FIRSTDESIGN >", value, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignGreaterThanOrEqualTo(Object value) {
            addCriterion("FIRSTDESIGN >=", value, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignLessThan(Object value) {
            addCriterion("FIRSTDESIGN <", value, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignLessThanOrEqualTo(Object value) {
            addCriterion("FIRSTDESIGN <=", value, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignIn(List<Object> values) {
            addCriterion("FIRSTDESIGN in", values, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignNotIn(List<Object> values) {
            addCriterion("FIRSTDESIGN not in", values, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignBetween(Object value1, Object value2) {
            addCriterion("FIRSTDESIGN between", value1, value2, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andFirstdesignNotBetween(Object value1, Object value2) {
            addCriterion("FIRSTDESIGN not between", value1, value2, "firstdesign");
            return (Criteria) this;
        }

        public Criteria andBiddingIsNull() {
            addCriterion("BIDDING is null");
            return (Criteria) this;
        }

        public Criteria andBiddingIsNotNull() {
            addCriterion("BIDDING is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingEqualTo(Object value) {
            addCriterion("BIDDING =", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotEqualTo(Object value) {
            addCriterion("BIDDING <>", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingGreaterThan(Object value) {
            addCriterion("BIDDING >", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingGreaterThanOrEqualTo(Object value) {
            addCriterion("BIDDING >=", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingLessThan(Object value) {
            addCriterion("BIDDING <", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingLessThanOrEqualTo(Object value) {
            addCriterion("BIDDING <=", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingIn(List<Object> values) {
            addCriterion("BIDDING in", values, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotIn(List<Object> values) {
            addCriterion("BIDDING not in", values, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingBetween(Object value1, Object value2) {
            addCriterion("BIDDING between", value1, value2, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotBetween(Object value1, Object value2) {
            addCriterion("BIDDING not between", value1, value2, "bidding");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignIsNull() {
            addCriterion("CONSTRUCTIONDESIGN is null");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignIsNotNull() {
            addCriterion("CONSTRUCTIONDESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignEqualTo(Object value) {
            addCriterion("CONSTRUCTIONDESIGN =", value, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONDESIGN <>", value, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONDESIGN >", value, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONDESIGN >=", value, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignLessThan(Object value) {
            addCriterion("CONSTRUCTIONDESIGN <", value, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONDESIGN <=", value, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignIn(List<Object> values) {
            addCriterion("CONSTRUCTIONDESIGN in", values, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONDESIGN not in", values, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONDESIGN between", value1, value2, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andConstructiondesignNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONDESIGN not between", value1, value2, "constructiondesign");
            return (Criteria) this;
        }

        public Criteria andStarttimeConIsNull() {
            addCriterion("STARTTIME_CON is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeConIsNotNull() {
            addCriterion("STARTTIME_CON is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeConEqualTo(Object value) {
            addCriterion("STARTTIME_CON =", value, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConNotEqualTo(Object value) {
            addCriterion("STARTTIME_CON <>", value, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConGreaterThan(Object value) {
            addCriterion("STARTTIME_CON >", value, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConGreaterThanOrEqualTo(Object value) {
            addCriterion("STARTTIME_CON >=", value, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConLessThan(Object value) {
            addCriterion("STARTTIME_CON <", value, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConLessThanOrEqualTo(Object value) {
            addCriterion("STARTTIME_CON <=", value, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConIn(List<Object> values) {
            addCriterion("STARTTIME_CON in", values, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConNotIn(List<Object> values) {
            addCriterion("STARTTIME_CON not in", values, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConBetween(Object value1, Object value2) {
            addCriterion("STARTTIME_CON between", value1, value2, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andStarttimeConNotBetween(Object value1, Object value2) {
            addCriterion("STARTTIME_CON not between", value1, value2, "starttimeCon");
            return (Criteria) this;
        }

        public Criteria andProjectprogressIsNull() {
            addCriterion("PROJECTPROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andProjectprogressIsNotNull() {
            addCriterion("PROJECTPROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProjectprogressEqualTo(Object value) {
            addCriterion("PROJECTPROGRESS =", value, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressNotEqualTo(Object value) {
            addCriterion("PROJECTPROGRESS <>", value, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressGreaterThan(Object value) {
            addCriterion("PROJECTPROGRESS >", value, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTPROGRESS >=", value, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressLessThan(Object value) {
            addCriterion("PROJECTPROGRESS <", value, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTPROGRESS <=", value, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressIn(List<Object> values) {
            addCriterion("PROJECTPROGRESS in", values, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressNotIn(List<Object> values) {
            addCriterion("PROJECTPROGRESS not in", values, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressBetween(Object value1, Object value2) {
            addCriterion("PROJECTPROGRESS between", value1, value2, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andProjectprogressNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTPROGRESS not between", value1, value2, "projectprogress");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentIsNull() {
            addCriterion("COMPLETEDINVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentIsNotNull() {
            addCriterion("COMPLETEDINVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDINVESTMENT =", value, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentNotEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDINVESTMENT <>", value, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentGreaterThan(BigDecimal value) {
            addCriterion("COMPLETEDINVESTMENT >", value, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDINVESTMENT >=", value, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentLessThan(BigDecimal value) {
            addCriterion("COMPLETEDINVESTMENT <", value, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDINVESTMENT <=", value, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDINVESTMENT in", values, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentNotIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDINVESTMENT not in", values, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDINVESTMENT between", value1, value2, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andCompletedinvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDINVESTMENT not between", value1, value2, "completedinvestment");
            return (Criteria) this;
        }

        public Criteria andFormedabilityIsNull() {
            addCriterion("FORMEDABILITY is null");
            return (Criteria) this;
        }

        public Criteria andFormedabilityIsNotNull() {
            addCriterion("FORMEDABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andFormedabilityEqualTo(Object value) {
            addCriterion("FORMEDABILITY =", value, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityNotEqualTo(Object value) {
            addCriterion("FORMEDABILITY <>", value, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityGreaterThan(Object value) {
            addCriterion("FORMEDABILITY >", value, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityGreaterThanOrEqualTo(Object value) {
            addCriterion("FORMEDABILITY >=", value, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityLessThan(Object value) {
            addCriterion("FORMEDABILITY <", value, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityLessThanOrEqualTo(Object value) {
            addCriterion("FORMEDABILITY <=", value, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityIn(List<Object> values) {
            addCriterion("FORMEDABILITY in", values, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityNotIn(List<Object> values) {
            addCriterion("FORMEDABILITY not in", values, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityBetween(Object value1, Object value2) {
            addCriterion("FORMEDABILITY between", value1, value2, "formedability");
            return (Criteria) this;
        }

        public Criteria andFormedabilityNotBetween(Object value1, Object value2) {
            addCriterion("FORMEDABILITY not between", value1, value2, "formedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityIsNull() {
            addCriterion("DESIGNEDABILITY is null");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityIsNotNull() {
            addCriterion("DESIGNEDABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityEqualTo(Object value) {
            addCriterion("DESIGNEDABILITY =", value, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityNotEqualTo(Object value) {
            addCriterion("DESIGNEDABILITY <>", value, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityGreaterThan(Object value) {
            addCriterion("DESIGNEDABILITY >", value, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityGreaterThanOrEqualTo(Object value) {
            addCriterion("DESIGNEDABILITY >=", value, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityLessThan(Object value) {
            addCriterion("DESIGNEDABILITY <", value, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityLessThanOrEqualTo(Object value) {
            addCriterion("DESIGNEDABILITY <=", value, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityIn(List<Object> values) {
            addCriterion("DESIGNEDABILITY in", values, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityNotIn(List<Object> values) {
            addCriterion("DESIGNEDABILITY not in", values, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityBetween(Object value1, Object value2) {
            addCriterion("DESIGNEDABILITY between", value1, value2, "designedability");
            return (Criteria) this;
        }

        public Criteria andDesignedabilityNotBetween(Object value1, Object value2) {
            addCriterion("DESIGNEDABILITY not between", value1, value2, "designedability");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(Object value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(Object value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(Object value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(Object value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(Object value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(Object value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<Object> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<Object> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(Object value1, Object value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(Object value1, Object value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("TIMESTAMP =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("TIMESTAMP <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("TIMESTAMP >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("TIMESTAMP <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("TIMESTAMP in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("TIMESTAMP not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("PROJECTID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("PROJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(String value) {
            addCriterion("PROJECTID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(String value) {
            addCriterion("PROJECTID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(String value) {
            addCriterion("PROJECTID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(String value) {
            addCriterion("PROJECTID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(String value) {
            addCriterion("PROJECTID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLike(String value) {
            addCriterion("PROJECTID like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotLike(String value) {
            addCriterion("PROJECTID not like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<String> values) {
            addCriterion("PROJECTID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<String> values) {
            addCriterion("PROJECTID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(String value1, String value2) {
            addCriterion("PROJECTID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(String value1, String value2) {
            addCriterion("PROJECTID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Object value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Object value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Object value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Object value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Object value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Object value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Object> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Object> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Object value1, Object value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Object value1, Object value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNull() {
            addCriterion("TESTTIME is null");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNotNull() {
            addCriterion("TESTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTesttimeEqualTo(Object value) {
            addCriterion("TESTTIME =", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotEqualTo(Object value) {
            addCriterion("TESTTIME <>", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThan(Object value) {
            addCriterion("TESTTIME >", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThanOrEqualTo(Object value) {
            addCriterion("TESTTIME >=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThan(Object value) {
            addCriterion("TESTTIME <", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThanOrEqualTo(Object value) {
            addCriterion("TESTTIME <=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeIn(List<Object> values) {
            addCriterion("TESTTIME in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotIn(List<Object> values) {
            addCriterion("TESTTIME not in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeBetween(Object value1, Object value2) {
            addCriterion("TESTTIME between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotBetween(Object value1, Object value2) {
            addCriterion("TESTTIME not between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeConIsNull() {
            addCriterion("ENDTIME_CON is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeConIsNotNull() {
            addCriterion("ENDTIME_CON is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeConEqualTo(Object value) {
            addCriterion("ENDTIME_CON =", value, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConNotEqualTo(Object value) {
            addCriterion("ENDTIME_CON <>", value, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConGreaterThan(Object value) {
            addCriterion("ENDTIME_CON >", value, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConGreaterThanOrEqualTo(Object value) {
            addCriterion("ENDTIME_CON >=", value, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConLessThan(Object value) {
            addCriterion("ENDTIME_CON <", value, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConLessThanOrEqualTo(Object value) {
            addCriterion("ENDTIME_CON <=", value, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConIn(List<Object> values) {
            addCriterion("ENDTIME_CON in", values, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConNotIn(List<Object> values) {
            addCriterion("ENDTIME_CON not in", values, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConBetween(Object value1, Object value2) {
            addCriterion("ENDTIME_CON between", value1, value2, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andEndtimeConNotBetween(Object value1, Object value2) {
            addCriterion("ENDTIME_CON not between", value1, value2, "endtimeCon");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(Object value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(Object value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(Object value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(Object value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(Object value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(Object value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<Object> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<Object> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(Object value1, Object value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(Object value1, Object value2) {
            addCriterion("REASON not between", value1, value2, "reason");
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