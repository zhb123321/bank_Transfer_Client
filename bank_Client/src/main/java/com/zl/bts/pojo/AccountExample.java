package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(BigDecimal value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(BigDecimal value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(BigDecimal value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(BigDecimal value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<BigDecimal> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<BigDecimal> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("REALNAME =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("REALNAME <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("REALNAME >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAME >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("REALNAME <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("REALNAME <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("REALNAME like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("REALNAME not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("REALNAME in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("REALNAME not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("REALNAME between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("REALNAME not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CARDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CARDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(BigDecimal value) {
            addCriterion("CARDNUMBER =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(BigDecimal value) {
            addCriterion("CARDNUMBER <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(BigDecimal value) {
            addCriterion("CARDNUMBER >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDNUMBER >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(BigDecimal value) {
            addCriterion("CARDNUMBER <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDNUMBER <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<BigDecimal> values) {
            addCriterion("CARDNUMBER in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<BigDecimal> values) {
            addCriterion("CARDNUMBER not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDNUMBER between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDNUMBER not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andApasswordIsNull() {
            addCriterion("APASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andApasswordIsNotNull() {
            addCriterion("APASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andApasswordEqualTo(BigDecimal value) {
            addCriterion("APASSWORD =", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotEqualTo(BigDecimal value) {
            addCriterion("APASSWORD <>", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordGreaterThan(BigDecimal value) {
            addCriterion("APASSWORD >", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APASSWORD >=", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordLessThan(BigDecimal value) {
            addCriterion("APASSWORD <", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APASSWORD <=", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordIn(List<BigDecimal> values) {
            addCriterion("APASSWORD in", values, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotIn(List<BigDecimal> values) {
            addCriterion("APASSWORD not in", values, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APASSWORD between", value1, value2, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APASSWORD not between", value1, value2, "apassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNull() {
            addCriterion("BPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNotNull() {
            addCriterion("BPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andBpasswordEqualTo(BigDecimal value) {
            addCriterion("BPASSWORD =", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotEqualTo(BigDecimal value) {
            addCriterion("BPASSWORD <>", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThan(BigDecimal value) {
            addCriterion("BPASSWORD >", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BPASSWORD >=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThan(BigDecimal value) {
            addCriterion("BPASSWORD <", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BPASSWORD <=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordIn(List<BigDecimal> values) {
            addCriterion("BPASSWORD in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotIn(List<BigDecimal> values) {
            addCriterion("BPASSWORD not in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BPASSWORD between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BPASSWORD not between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNull() {
            addCriterion("OPENDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("OPENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(String value) {
            addCriterion("OPENDATE =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(String value) {
            addCriterion("OPENDATE <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(String value) {
            addCriterion("OPENDATE >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(String value) {
            addCriterion("OPENDATE >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(String value) {
            addCriterion("OPENDATE <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(String value) {
            addCriterion("OPENDATE <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLike(String value) {
            addCriterion("OPENDATE like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotLike(String value) {
            addCriterion("OPENDATE not like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<String> values) {
            addCriterion("OPENDATE in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<String> values) {
            addCriterion("OPENDATE not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(String value1, String value2) {
            addCriterion("OPENDATE between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(String value1, String value2) {
            addCriterion("OPENDATE not between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andIopendateIsNull() {
            addCriterion("IOPENDATE is null");
            return (Criteria) this;
        }

        public Criteria andIopendateIsNotNull() {
            addCriterion("IOPENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIopendateEqualTo(String value) {
            addCriterion("IOPENDATE =", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateNotEqualTo(String value) {
            addCriterion("IOPENDATE <>", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateGreaterThan(String value) {
            addCriterion("IOPENDATE >", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateGreaterThanOrEqualTo(String value) {
            addCriterion("IOPENDATE >=", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateLessThan(String value) {
            addCriterion("IOPENDATE <", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateLessThanOrEqualTo(String value) {
            addCriterion("IOPENDATE <=", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateLike(String value) {
            addCriterion("IOPENDATE like", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateNotLike(String value) {
            addCriterion("IOPENDATE not like", value, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateIn(List<String> values) {
            addCriterion("IOPENDATE in", values, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateNotIn(List<String> values) {
            addCriterion("IOPENDATE not in", values, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateBetween(String value1, String value2) {
            addCriterion("IOPENDATE between", value1, value2, "iopendate");
            return (Criteria) this;
        }

        public Criteria andIopendateNotBetween(String value1, String value2) {
            addCriterion("IOPENDATE not between", value1, value2, "iopendate");
            return (Criteria) this;
        }

        public Criteria andOpenplaceIsNull() {
            addCriterion("OPENPLACE is null");
            return (Criteria) this;
        }

        public Criteria andOpenplaceIsNotNull() {
            addCriterion("OPENPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenplaceEqualTo(String value) {
            addCriterion("OPENPLACE =", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceNotEqualTo(String value) {
            addCriterion("OPENPLACE <>", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceGreaterThan(String value) {
            addCriterion("OPENPLACE >", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceGreaterThanOrEqualTo(String value) {
            addCriterion("OPENPLACE >=", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceLessThan(String value) {
            addCriterion("OPENPLACE <", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceLessThanOrEqualTo(String value) {
            addCriterion("OPENPLACE <=", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceLike(String value) {
            addCriterion("OPENPLACE like", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceNotLike(String value) {
            addCriterion("OPENPLACE not like", value, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceIn(List<String> values) {
            addCriterion("OPENPLACE in", values, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceNotIn(List<String> values) {
            addCriterion("OPENPLACE not in", values, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceBetween(String value1, String value2) {
            addCriterion("OPENPLACE between", value1, value2, "openplace");
            return (Criteria) this;
        }

        public Criteria andOpenplaceNotBetween(String value1, String value2) {
            addCriterion("OPENPLACE not between", value1, value2, "openplace");
            return (Criteria) this;
        }

        public Criteria andAccountypeIsNull() {
            addCriterion("ACCOUNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountypeIsNotNull() {
            addCriterion("ACCOUNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountypeEqualTo(String value) {
            addCriterion("ACCOUNTYPE =", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeNotEqualTo(String value) {
            addCriterion("ACCOUNTYPE <>", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeGreaterThan(String value) {
            addCriterion("ACCOUNTYPE >", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTYPE >=", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeLessThan(String value) {
            addCriterion("ACCOUNTYPE <", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTYPE <=", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeLike(String value) {
            addCriterion("ACCOUNTYPE like", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeNotLike(String value) {
            addCriterion("ACCOUNTYPE not like", value, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeIn(List<String> values) {
            addCriterion("ACCOUNTYPE in", values, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeNotIn(List<String> values) {
            addCriterion("ACCOUNTYPE not in", values, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeBetween(String value1, String value2) {
            addCriterion("ACCOUNTYPE between", value1, value2, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTYPE not between", value1, value2, "accountype");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectIsNull() {
            addCriterion("ACCOUNTSUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectIsNotNull() {
            addCriterion("ACCOUNTSUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectEqualTo(String value) {
            addCriterion("ACCOUNTSUBJECT =", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectNotEqualTo(String value) {
            addCriterion("ACCOUNTSUBJECT <>", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectGreaterThan(String value) {
            addCriterion("ACCOUNTSUBJECT >", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSUBJECT >=", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectLessThan(String value) {
            addCriterion("ACCOUNTSUBJECT <", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSUBJECT <=", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectLike(String value) {
            addCriterion("ACCOUNTSUBJECT like", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectNotLike(String value) {
            addCriterion("ACCOUNTSUBJECT not like", value, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectIn(List<String> values) {
            addCriterion("ACCOUNTSUBJECT in", values, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectNotIn(List<String> values) {
            addCriterion("ACCOUNTSUBJECT not in", values, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectBetween(String value1, String value2) {
            addCriterion("ACCOUNTSUBJECT between", value1, value2, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andAccountsubjectNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTSUBJECT not between", value1, value2, "accountsubject");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andHouseIsNull() {
            addCriterion("HOUSE is null");
            return (Criteria) this;
        }

        public Criteria andHouseIsNotNull() {
            addCriterion("HOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andHouseEqualTo(String value) {
            addCriterion("HOUSE =", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotEqualTo(String value) {
            addCriterion("HOUSE <>", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThan(String value) {
            addCriterion("HOUSE >", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE >=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThan(String value) {
            addCriterion("HOUSE <", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThanOrEqualTo(String value) {
            addCriterion("HOUSE <=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLike(String value) {
            addCriterion("HOUSE like", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotLike(String value) {
            addCriterion("HOUSE not like", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseIn(List<String> values) {
            addCriterion("HOUSE in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotIn(List<String> values) {
            addCriterion("HOUSE not in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseBetween(String value1, String value2) {
            addCriterion("HOUSE between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotBetween(String value1, String value2) {
            addCriterion("HOUSE not between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andAmountlimitIsNull() {
            addCriterion("AMOUNTLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAmountlimitIsNotNull() {
            addCriterion("AMOUNTLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountlimitEqualTo(BigDecimal value) {
            addCriterion("AMOUNTLIMIT =", value, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNTLIMIT <>", value, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitGreaterThan(BigDecimal value) {
            addCriterion("AMOUNTLIMIT >", value, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNTLIMIT >=", value, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitLessThan(BigDecimal value) {
            addCriterion("AMOUNTLIMIT <", value, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNTLIMIT <=", value, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitIn(List<BigDecimal> values) {
            addCriterion("AMOUNTLIMIT in", values, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNTLIMIT not in", values, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNTLIMIT between", value1, value2, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andAmountlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNTLIMIT not between", value1, value2, "amountlimit");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNull() {
            addCriterion("DELETETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNotNull() {
            addCriterion("DELETETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeEqualTo(String value) {
            addCriterion("DELETETYPE =", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotEqualTo(String value) {
            addCriterion("DELETETYPE <>", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThan(String value) {
            addCriterion("DELETETYPE >", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DELETETYPE >=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThan(String value) {
            addCriterion("DELETETYPE <", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("DELETETYPE <=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLike(String value) {
            addCriterion("DELETETYPE like", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotLike(String value) {
            addCriterion("DELETETYPE not like", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIn(List<String> values) {
            addCriterion("DELETETYPE in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotIn(List<String> values) {
            addCriterion("DELETETYPE not in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeBetween(String value1, String value2) {
            addCriterion("DELETETYPE between", value1, value2, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotBetween(String value1, String value2) {
            addCriterion("DELETETYPE not between", value1, value2, "deletetype");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("UPTIME is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("UPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("UPTIME like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("UPTIME not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("UPTIME in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("UPTIME not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("UPTIME not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("MONEY like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("MONEY not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("MONEY not between", value1, value2, "money");
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