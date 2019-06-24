package com.onps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSubprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSubprojectExample() {
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

        public Criteria andSubprojectidIsNull() {
            addCriterion("SUBPROJECTID is null");
            return (Criteria) this;
        }

        public Criteria andSubprojectidIsNotNull() {
            addCriterion("SUBPROJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andSubprojectidEqualTo(String value) {
            addCriterion("SUBPROJECTID =", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidNotEqualTo(String value) {
            addCriterion("SUBPROJECTID <>", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidGreaterThan(String value) {
            addCriterion("SUBPROJECTID >", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidGreaterThanOrEqualTo(String value) {
            addCriterion("SUBPROJECTID >=", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidLessThan(String value) {
            addCriterion("SUBPROJECTID <", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidLessThanOrEqualTo(String value) {
            addCriterion("SUBPROJECTID <=", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidLike(String value) {
            addCriterion("SUBPROJECTID like", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidNotLike(String value) {
            addCriterion("SUBPROJECTID not like", value, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidIn(List<String> values) {
            addCriterion("SUBPROJECTID in", values, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidNotIn(List<String> values) {
            addCriterion("SUBPROJECTID not in", values, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidBetween(String value1, String value2) {
            addCriterion("SUBPROJECTID between", value1, value2, "subprojectid");
            return (Criteria) this;
        }

        public Criteria andSubprojectidNotBetween(String value1, String value2) {
            addCriterion("SUBPROJECTID not between", value1, value2, "subprojectid");
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

        public Criteria andLevel1EqualTo(String value) {
            addCriterion("LEVEL1 =", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotEqualTo(String value) {
            addCriterion("LEVEL1 <>", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThan(String value) {
            addCriterion("LEVEL1 >", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL1 >=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThan(String value) {
            addCriterion("LEVEL1 <", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThanOrEqualTo(String value) {
            addCriterion("LEVEL1 <=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Like(String value) {
            addCriterion("LEVEL1 like", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotLike(String value) {
            addCriterion("LEVEL1 not like", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1In(List<String> values) {
            addCriterion("LEVEL1 in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotIn(List<String> values) {
            addCriterion("LEVEL1 not in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Between(String value1, String value2) {
            addCriterion("LEVEL1 between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotBetween(String value1, String value2) {
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

        public Criteria andLevel2EqualTo(String value) {
            addCriterion("LEVEL2 =", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotEqualTo(String value) {
            addCriterion("LEVEL2 <>", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThan(String value) {
            addCriterion("LEVEL2 >", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL2 >=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThan(String value) {
            addCriterion("LEVEL2 <", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThanOrEqualTo(String value) {
            addCriterion("LEVEL2 <=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Like(String value) {
            addCriterion("LEVEL2 like", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotLike(String value) {
            addCriterion("LEVEL2 not like", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2In(List<String> values) {
            addCriterion("LEVEL2 in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotIn(List<String> values) {
            addCriterion("LEVEL2 not in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Between(String value1, String value2) {
            addCriterion("LEVEL2 between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotBetween(String value1, String value2) {
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

        public Criteria andLevel3EqualTo(String value) {
            addCriterion("LEVEL3 =", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotEqualTo(String value) {
            addCriterion("LEVEL3 <>", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThan(String value) {
            addCriterion("LEVEL3 >", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL3 >=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThan(String value) {
            addCriterion("LEVEL3 <", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThanOrEqualTo(String value) {
            addCriterion("LEVEL3 <=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Like(String value) {
            addCriterion("LEVEL3 like", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotLike(String value) {
            addCriterion("LEVEL3 not like", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3In(List<String> values) {
            addCriterion("LEVEL3 in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotIn(List<String> values) {
            addCriterion("LEVEL3 not in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Between(String value1, String value2) {
            addCriterion("LEVEL3 between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotBetween(String value1, String value2) {
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

        public Criteria andLevel4EqualTo(String value) {
            addCriterion("LEVEL4 =", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotEqualTo(String value) {
            addCriterion("LEVEL4 <>", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThan(String value) {
            addCriterion("LEVEL4 >", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL4 >=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThan(String value) {
            addCriterion("LEVEL4 <", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThanOrEqualTo(String value) {
            addCriterion("LEVEL4 <=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Like(String value) {
            addCriterion("LEVEL4 like", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotLike(String value) {
            addCriterion("LEVEL4 not like", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4In(List<String> values) {
            addCriterion("LEVEL4 in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotIn(List<String> values) {
            addCriterion("LEVEL4 not in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Between(String value1, String value2) {
            addCriterion("LEVEL4 between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotBetween(String value1, String value2) {
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

        public Criteria andLevel5EqualTo(String value) {
            addCriterion("LEVEL5 =", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotEqualTo(String value) {
            addCriterion("LEVEL5 <>", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5GreaterThan(String value) {
            addCriterion("LEVEL5 >", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL5 >=", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5LessThan(String value) {
            addCriterion("LEVEL5 <", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5LessThanOrEqualTo(String value) {
            addCriterion("LEVEL5 <=", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5Like(String value) {
            addCriterion("LEVEL5 like", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotLike(String value) {
            addCriterion("LEVEL5 not like", value, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5In(List<String> values) {
            addCriterion("LEVEL5 in", values, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotIn(List<String> values) {
            addCriterion("LEVEL5 not in", values, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5Between(String value1, String value2) {
            addCriterion("LEVEL5 between", value1, value2, "level5");
            return (Criteria) this;
        }

        public Criteria andLevel5NotBetween(String value1, String value2) {
            addCriterion("LEVEL5 not between", value1, value2, "level5");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNull() {
            addCriterion("ISCORRECT is null");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNotNull() {
            addCriterion("ISCORRECT is not null");
            return (Criteria) this;
        }

        public Criteria andIscorrectEqualTo(String value) {
            addCriterion("ISCORRECT =", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotEqualTo(String value) {
            addCriterion("ISCORRECT <>", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThan(String value) {
            addCriterion("ISCORRECT >", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThanOrEqualTo(String value) {
            addCriterion("ISCORRECT >=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThan(String value) {
            addCriterion("ISCORRECT <", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThanOrEqualTo(String value) {
            addCriterion("ISCORRECT <=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLike(String value) {
            addCriterion("ISCORRECT like", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotLike(String value) {
            addCriterion("ISCORRECT not like", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectIn(List<String> values) {
            addCriterion("ISCORRECT in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotIn(List<String> values) {
            addCriterion("ISCORRECT not in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectBetween(String value1, String value2) {
            addCriterion("ISCORRECT between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotBetween(String value1, String value2) {
            addCriterion("ISCORRECT not between", value1, value2, "iscorrect");
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

        public Criteria andDefaultdescriptionIsNull() {
            addCriterion("DEFAULTDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionIsNotNull() {
            addCriterion("DEFAULTDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionEqualTo(String value) {
            addCriterion("DEFAULTDESCRIPTION =", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionNotEqualTo(String value) {
            addCriterion("DEFAULTDESCRIPTION <>", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionGreaterThan(String value) {
            addCriterion("DEFAULTDESCRIPTION >", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULTDESCRIPTION >=", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionLessThan(String value) {
            addCriterion("DEFAULTDESCRIPTION <", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionLessThanOrEqualTo(String value) {
            addCriterion("DEFAULTDESCRIPTION <=", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionLike(String value) {
            addCriterion("DEFAULTDESCRIPTION like", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionNotLike(String value) {
            addCriterion("DEFAULTDESCRIPTION not like", value, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionIn(List<String> values) {
            addCriterion("DEFAULTDESCRIPTION in", values, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionNotIn(List<String> values) {
            addCriterion("DEFAULTDESCRIPTION not in", values, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionBetween(String value1, String value2) {
            addCriterion("DEFAULTDESCRIPTION between", value1, value2, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andDefaultdescriptionNotBetween(String value1, String value2) {
            addCriterion("DEFAULTDESCRIPTION not between", value1, value2, "defaultdescription");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andTimestapIsNull() {
            addCriterion("TIMESTAP is null");
            return (Criteria) this;
        }

        public Criteria andTimestapIsNotNull() {
            addCriterion("TIMESTAP is not null");
            return (Criteria) this;
        }

        public Criteria andTimestapEqualTo(Date value) {
            addCriterion("TIMESTAP =", value, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapNotEqualTo(Date value) {
            addCriterion("TIMESTAP <>", value, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapGreaterThan(Date value) {
            addCriterion("TIMESTAP >", value, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapGreaterThanOrEqualTo(Date value) {
            addCriterion("TIMESTAP >=", value, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapLessThan(Date value) {
            addCriterion("TIMESTAP <", value, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapLessThanOrEqualTo(Date value) {
            addCriterion("TIMESTAP <=", value, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapIn(List<Date> values) {
            addCriterion("TIMESTAP in", values, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapNotIn(List<Date> values) {
            addCriterion("TIMESTAP not in", values, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapBetween(Date value1, Date value2) {
            addCriterion("TIMESTAP between", value1, value2, "timestap");
            return (Criteria) this;
        }

        public Criteria andTimestapNotBetween(Date value1, Date value2) {
            addCriterion("TIMESTAP not between", value1, value2, "timestap");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNull() {
            addCriterion("ADD1 is null");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNotNull() {
            addCriterion("ADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd1EqualTo(String value) {
            addCriterion("ADD1 =", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotEqualTo(String value) {
            addCriterion("ADD1 <>", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThan(String value) {
            addCriterion("ADD1 >", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThanOrEqualTo(String value) {
            addCriterion("ADD1 >=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThan(String value) {
            addCriterion("ADD1 <", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThanOrEqualTo(String value) {
            addCriterion("ADD1 <=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Like(String value) {
            addCriterion("ADD1 like", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotLike(String value) {
            addCriterion("ADD1 not like", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1In(List<String> values) {
            addCriterion("ADD1 in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotIn(List<String> values) {
            addCriterion("ADD1 not in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Between(String value1, String value2) {
            addCriterion("ADD1 between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotBetween(String value1, String value2) {
            addCriterion("ADD1 not between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNull() {
            addCriterion("ADD2 is null");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNotNull() {
            addCriterion("ADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd2EqualTo(String value) {
            addCriterion("ADD2 =", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotEqualTo(String value) {
            addCriterion("ADD2 <>", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThan(String value) {
            addCriterion("ADD2 >", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThanOrEqualTo(String value) {
            addCriterion("ADD2 >=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThan(String value) {
            addCriterion("ADD2 <", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThanOrEqualTo(String value) {
            addCriterion("ADD2 <=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Like(String value) {
            addCriterion("ADD2 like", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotLike(String value) {
            addCriterion("ADD2 not like", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2In(List<String> values) {
            addCriterion("ADD2 in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotIn(List<String> values) {
            addCriterion("ADD2 not in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Between(String value1, String value2) {
            addCriterion("ADD2 between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotBetween(String value1, String value2) {
            addCriterion("ADD2 not between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNull() {
            addCriterion("ADD3 is null");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNotNull() {
            addCriterion("ADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd3EqualTo(Date value) {
            addCriterion("ADD3 =", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotEqualTo(Date value) {
            addCriterion("ADD3 <>", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThan(Date value) {
            addCriterion("ADD3 >", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThanOrEqualTo(Date value) {
            addCriterion("ADD3 >=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThan(Date value) {
            addCriterion("ADD3 <", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThanOrEqualTo(Date value) {
            addCriterion("ADD3 <=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3In(List<Date> values) {
            addCriterion("ADD3 in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotIn(List<Date> values) {
            addCriterion("ADD3 not in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Between(Date value1, Date value2) {
            addCriterion("ADD3 between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotBetween(Date value1, Date value2) {
            addCriterion("ADD3 not between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd4IsNull() {
            addCriterion("ADD4 is null");
            return (Criteria) this;
        }

        public Criteria andAdd4IsNotNull() {
            addCriterion("ADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd4EqualTo(String value) {
            addCriterion("ADD4 =", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotEqualTo(String value) {
            addCriterion("ADD4 <>", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThan(String value) {
            addCriterion("ADD4 >", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThanOrEqualTo(String value) {
            addCriterion("ADD4 >=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThan(String value) {
            addCriterion("ADD4 <", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThanOrEqualTo(String value) {
            addCriterion("ADD4 <=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4Like(String value) {
            addCriterion("ADD4 like", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotLike(String value) {
            addCriterion("ADD4 not like", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4In(List<String> values) {
            addCriterion("ADD4 in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotIn(List<String> values) {
            addCriterion("ADD4 not in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4Between(String value1, String value2) {
            addCriterion("ADD4 between", value1, value2, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotBetween(String value1, String value2) {
            addCriterion("ADD4 not between", value1, value2, "add4");
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