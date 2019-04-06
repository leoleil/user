package com.onps.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andSubmitcompanyIsNull() {
            addCriterion("SUBMITCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyIsNotNull() {
            addCriterion("SUBMITCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyEqualTo(Object value) {
            addCriterion("SUBMITCOMPANY =", value, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyNotEqualTo(Object value) {
            addCriterion("SUBMITCOMPANY <>", value, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyGreaterThan(Object value) {
            addCriterion("SUBMITCOMPANY >", value, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyGreaterThanOrEqualTo(Object value) {
            addCriterion("SUBMITCOMPANY >=", value, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyLessThan(Object value) {
            addCriterion("SUBMITCOMPANY <", value, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyLessThanOrEqualTo(Object value) {
            addCriterion("SUBMITCOMPANY <=", value, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyIn(List<Object> values) {
            addCriterion("SUBMITCOMPANY in", values, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyNotIn(List<Object> values) {
            addCriterion("SUBMITCOMPANY not in", values, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyBetween(Object value1, Object value2) {
            addCriterion("SUBMITCOMPANY between", value1, value2, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andSubmitcompanyNotBetween(Object value1, Object value2) {
            addCriterion("SUBMITCOMPANY not between", value1, value2, "submitcompany");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("PROJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("PROJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(Object value) {
            addCriterion("PROJECTNAME =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(Object value) {
            addCriterion("PROJECTNAME <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(Object value) {
            addCriterion("PROJECTNAME >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(Object value) {
            addCriterion("PROJECTNAME >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(Object value) {
            addCriterion("PROJECTNAME <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(Object value) {
            addCriterion("PROJECTNAME <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<Object> values) {
            addCriterion("PROJECTNAME in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<Object> values) {
            addCriterion("PROJECTNAME not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(Object value1, Object value2) {
            addCriterion("PROJECTNAME between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(Object value1, Object value2) {
            addCriterion("PROJECTNAME not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameIsNull() {
            addCriterion("DOCUMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDocumentnameIsNotNull() {
            addCriterion("DOCUMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentnameEqualTo(Object value) {
            addCriterion("DOCUMENTNAME =", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotEqualTo(Object value) {
            addCriterion("DOCUMENTNAME <>", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameGreaterThan(Object value) {
            addCriterion("DOCUMENTNAME >", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameGreaterThanOrEqualTo(Object value) {
            addCriterion("DOCUMENTNAME >=", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameLessThan(Object value) {
            addCriterion("DOCUMENTNAME <", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameLessThanOrEqualTo(Object value) {
            addCriterion("DOCUMENTNAME <=", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameIn(List<Object> values) {
            addCriterion("DOCUMENTNAME in", values, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotIn(List<Object> values) {
            addCriterion("DOCUMENTNAME not in", values, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameBetween(Object value1, Object value2) {
            addCriterion("DOCUMENTNAME between", value1, value2, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotBetween(Object value1, Object value2) {
            addCriterion("DOCUMENTNAME not between", value1, value2, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberIsNull() {
            addCriterion("DOCUMENTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberIsNotNull() {
            addCriterion("DOCUMENTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberEqualTo(Object value) {
            addCriterion("DOCUMENTNUMBER =", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotEqualTo(Object value) {
            addCriterion("DOCUMENTNUMBER <>", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberGreaterThan(Object value) {
            addCriterion("DOCUMENTNUMBER >", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberGreaterThanOrEqualTo(Object value) {
            addCriterion("DOCUMENTNUMBER >=", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberLessThan(Object value) {
            addCriterion("DOCUMENTNUMBER <", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberLessThanOrEqualTo(Object value) {
            addCriterion("DOCUMENTNUMBER <=", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberIn(List<Object> values) {
            addCriterion("DOCUMENTNUMBER in", values, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotIn(List<Object> values) {
            addCriterion("DOCUMENTNUMBER not in", values, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberBetween(Object value1, Object value2) {
            addCriterion("DOCUMENTNUMBER between", value1, value2, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotBetween(Object value1, Object value2) {
            addCriterion("DOCUMENTNUMBER not between", value1, value2, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentdateIsNull() {
            addCriterion("DOCUMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentdateIsNotNull() {
            addCriterion("DOCUMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentdateEqualTo(Date value) {
            addCriterion("DOCUMENTDATE =", value, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateNotEqualTo(Date value) {
            addCriterion("DOCUMENTDATE <>", value, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateGreaterThan(Date value) {
            addCriterion("DOCUMENTDATE >", value, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DOCUMENTDATE >=", value, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateLessThan(Date value) {
            addCriterion("DOCUMENTDATE <", value, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateLessThanOrEqualTo(Date value) {
            addCriterion("DOCUMENTDATE <=", value, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateIn(List<Date> values) {
            addCriterion("DOCUMENTDATE in", values, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateNotIn(List<Date> values) {
            addCriterion("DOCUMENTDATE not in", values, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateBetween(Date value1, Date value2) {
            addCriterion("DOCUMENTDATE between", value1, value2, "documentdate");
            return (Criteria) this;
        }

        public Criteria andDocumentdateNotBetween(Date value1, Date value2) {
            addCriterion("DOCUMENTDATE not between", value1, value2, "documentdate");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountIsNull() {
            addCriterion("INVESTMENTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountIsNotNull() {
            addCriterion("INVESTMENTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTAMOUNT =", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountNotEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTAMOUNT <>", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountGreaterThan(BigDecimal value) {
            addCriterion("INVESTMENTAMOUNT >", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTAMOUNT >=", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountLessThan(BigDecimal value) {
            addCriterion("INVESTMENTAMOUNT <", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTAMOUNT <=", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountIn(List<BigDecimal> values) {
            addCriterion("INVESTMENTAMOUNT in", values, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountNotIn(List<BigDecimal> values) {
            addCriterion("INVESTMENTAMOUNT not in", values, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENTAMOUNT between", value1, value2, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENTAMOUNT not between", value1, value2, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityIsNull() {
            addCriterion("APPROVALAUTHORITY is null");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityIsNotNull() {
            addCriterion("APPROVALAUTHORITY is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityEqualTo(Object value) {
            addCriterion("APPROVALAUTHORITY =", value, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityNotEqualTo(Object value) {
            addCriterion("APPROVALAUTHORITY <>", value, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityGreaterThan(Object value) {
            addCriterion("APPROVALAUTHORITY >", value, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityGreaterThanOrEqualTo(Object value) {
            addCriterion("APPROVALAUTHORITY >=", value, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityLessThan(Object value) {
            addCriterion("APPROVALAUTHORITY <", value, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityLessThanOrEqualTo(Object value) {
            addCriterion("APPROVALAUTHORITY <=", value, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityIn(List<Object> values) {
            addCriterion("APPROVALAUTHORITY in", values, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityNotIn(List<Object> values) {
            addCriterion("APPROVALAUTHORITY not in", values, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityBetween(Object value1, Object value2) {
            addCriterion("APPROVALAUTHORITY between", value1, value2, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andApprovalauthorityNotBetween(Object value1, Object value2) {
            addCriterion("APPROVALAUTHORITY not between", value1, value2, "approvalauthority");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodIsNull() {
            addCriterion("CONSTRUCTIONPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodIsNotNull() {
            addCriterion("CONSTRUCTIONPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPERIOD =", value, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodNotEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPERIOD <>", value, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodGreaterThan(Object value) {
            addCriterion("CONSTRUCTIONPERIOD >", value, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodGreaterThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPERIOD >=", value, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodLessThan(Object value) {
            addCriterion("CONSTRUCTIONPERIOD <", value, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodLessThanOrEqualTo(Object value) {
            addCriterion("CONSTRUCTIONPERIOD <=", value, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodIn(List<Object> values) {
            addCriterion("CONSTRUCTIONPERIOD in", values, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodNotIn(List<Object> values) {
            addCriterion("CONSTRUCTIONPERIOD not in", values, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONPERIOD between", value1, value2, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andConstructionperiodNotBetween(Object value1, Object value2) {
            addCriterion("CONSTRUCTIONPERIOD not between", value1, value2, "constructionperiod");
            return (Criteria) this;
        }

        public Criteria andIsimportentIsNull() {
            addCriterion("ISIMPORTENT is null");
            return (Criteria) this;
        }

        public Criteria andIsimportentIsNotNull() {
            addCriterion("ISIMPORTENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsimportentEqualTo(BigDecimal value) {
            addCriterion("ISIMPORTENT =", value, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentNotEqualTo(BigDecimal value) {
            addCriterion("ISIMPORTENT <>", value, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentGreaterThan(BigDecimal value) {
            addCriterion("ISIMPORTENT >", value, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISIMPORTENT >=", value, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentLessThan(BigDecimal value) {
            addCriterion("ISIMPORTENT <", value, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISIMPORTENT <=", value, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentIn(List<BigDecimal> values) {
            addCriterion("ISIMPORTENT in", values, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentNotIn(List<BigDecimal> values) {
            addCriterion("ISIMPORTENT not in", values, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISIMPORTENT between", value1, value2, "isimportent");
            return (Criteria) this;
        }

        public Criteria andIsimportentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISIMPORTENT not between", value1, value2, "isimportent");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNull() {
            addCriterion("LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNotNull() {
            addCriterion("LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1EqualTo(Object value) {
            addCriterion("LEVEL1 =", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotEqualTo(Object value) {
            addCriterion("LEVEL1 <>", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThan(Object value) {
            addCriterion("LEVEL1 >", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThanOrEqualTo(Object value) {
            addCriterion("LEVEL1 >=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThan(Object value) {
            addCriterion("LEVEL1 <", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThanOrEqualTo(Object value) {
            addCriterion("LEVEL1 <=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1In(List<Object> values) {
            addCriterion("LEVEL1 in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotIn(List<Object> values) {
            addCriterion("LEVEL1 not in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Between(Object value1, Object value2) {
            addCriterion("LEVEL1 between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotBetween(Object value1, Object value2) {
            addCriterion("LEVEL1 not between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNull() {
            addCriterion("LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNotNull() {
            addCriterion("LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2EqualTo(Object value) {
            addCriterion("LEVEL2 =", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotEqualTo(Object value) {
            addCriterion("LEVEL2 <>", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThan(Object value) {
            addCriterion("LEVEL2 >", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThanOrEqualTo(Object value) {
            addCriterion("LEVEL2 >=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThan(Object value) {
            addCriterion("LEVEL2 <", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThanOrEqualTo(Object value) {
            addCriterion("LEVEL2 <=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2In(List<Object> values) {
            addCriterion("LEVEL2 in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotIn(List<Object> values) {
            addCriterion("LEVEL2 not in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Between(Object value1, Object value2) {
            addCriterion("LEVEL2 between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotBetween(Object value1, Object value2) {
            addCriterion("LEVEL2 not between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNull() {
            addCriterion("LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNotNull() {
            addCriterion("LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3EqualTo(Object value) {
            addCriterion("LEVEL3 =", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotEqualTo(Object value) {
            addCriterion("LEVEL3 <>", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThan(Object value) {
            addCriterion("LEVEL3 >", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThanOrEqualTo(Object value) {
            addCriterion("LEVEL3 >=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThan(Object value) {
            addCriterion("LEVEL3 <", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThanOrEqualTo(Object value) {
            addCriterion("LEVEL3 <=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3In(List<Object> values) {
            addCriterion("LEVEL3 in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotIn(List<Object> values) {
            addCriterion("LEVEL3 not in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Between(Object value1, Object value2) {
            addCriterion("LEVEL3 between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotBetween(Object value1, Object value2) {
            addCriterion("LEVEL3 not between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNull() {
            addCriterion("LEVEL4 is null");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNotNull() {
            addCriterion("LEVEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel4EqualTo(Object value) {
            addCriterion("LEVEL4 =", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotEqualTo(Object value) {
            addCriterion("LEVEL4 <>", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThan(Object value) {
            addCriterion("LEVEL4 >", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThanOrEqualTo(Object value) {
            addCriterion("LEVEL4 >=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThan(Object value) {
            addCriterion("LEVEL4 <", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThanOrEqualTo(Object value) {
            addCriterion("LEVEL4 <=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4In(List<Object> values) {
            addCriterion("LEVEL4 in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotIn(List<Object> values) {
            addCriterion("LEVEL4 not in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Between(Object value1, Object value2) {
            addCriterion("LEVEL4 between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotBetween(Object value1, Object value2) {
            addCriterion("LEVEL4 not between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel5IsNull() {
            addCriterion("LEVEL5 is null");
            return (Criteria) this;
        }

        public Criteria andLevel5IsNotNull() {
            addCriterion("LEVEL5 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel5EqualTo(Object value) {
            addCriterion("LEVEL5 =", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotEqualTo(Object value) {
            addCriterion("LEVEL5 <>", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5GreaterThan(Object value) {
            addCriterion("LEVEL5 >", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5GreaterThanOrEqualTo(Object value) {
            addCriterion("LEVEL5 >=", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5LessThan(Object value) {
            addCriterion("LEVEL5 <", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5LessThanOrEqualTo(Object value) {
            addCriterion("LEVEL5 <=", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5In(List<Object> values) {
            addCriterion("LEVEL5 in", values, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotIn(List<Object> values) {
            addCriterion("LEVEL5 not in", values, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5Between(Object value1, Object value2) {
            addCriterion("LEVEL5 between", value1, value2, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotBetween(Object value1, Object value2) {
            addCriterion("LEVEL5 not between", value1, value2, "level5");
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