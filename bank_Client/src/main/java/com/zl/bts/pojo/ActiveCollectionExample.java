package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ActiveCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiveCollectionExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(BigDecimal value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(BigDecimal value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(BigDecimal value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(BigDecimal value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<BigDecimal> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<BigDecimal> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AID not between", value1, value2, "aid");
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

        public Criteria andInaccountIsNull() {
            addCriterion("INACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInaccountIsNotNull() {
            addCriterion("INACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInaccountEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT =", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT <>", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountGreaterThan(BigDecimal value) {
            addCriterion("INACCOUNT >", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT >=", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLessThan(BigDecimal value) {
            addCriterion("INACCOUNT <", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT <=", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountIn(List<BigDecimal> values) {
            addCriterion("INACCOUNT in", values, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotIn(List<BigDecimal> values) {
            addCriterion("INACCOUNT not in", values, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INACCOUNT between", value1, value2, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INACCOUNT not between", value1, value2, "inaccount");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("USERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("USERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(BigDecimal value) {
            addCriterion("USERPHONE =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(BigDecimal value) {
            addCriterion("USERPHONE <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(BigDecimal value) {
            addCriterion("USERPHONE >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERPHONE >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(BigDecimal value) {
            addCriterion("USERPHONE <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERPHONE <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<BigDecimal> values) {
            addCriterion("USERPHONE in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<BigDecimal> values) {
            addCriterion("USERPHONE not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERPHONE between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERPHONE not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andMoneynumberIsNull() {
            addCriterion("MONEYNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMoneynumberIsNotNull() {
            addCriterion("MONEYNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMoneynumberEqualTo(BigDecimal value) {
            addCriterion("MONEYNUMBER =", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberNotEqualTo(BigDecimal value) {
            addCriterion("MONEYNUMBER <>", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberGreaterThan(BigDecimal value) {
            addCriterion("MONEYNUMBER >", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEYNUMBER >=", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberLessThan(BigDecimal value) {
            addCriterion("MONEYNUMBER <", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEYNUMBER <=", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberIn(List<BigDecimal> values) {
            addCriterion("MONEYNUMBER in", values, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberNotIn(List<BigDecimal> values) {
            addCriterion("MONEYNUMBER not in", values, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEYNUMBER between", value1, value2, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEYNUMBER not between", value1, value2, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNull() {
            addCriterion("CURRENCYID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNotNull() {
            addCriterion("CURRENCYID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID =", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID <>", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThan(BigDecimal value) {
            addCriterion("CURRENCYID >", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID >=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThan(BigDecimal value) {
            addCriterion("CURRENCYID <", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID <=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIn(List<BigDecimal> values) {
            addCriterion("CURRENCYID in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotIn(List<BigDecimal> values) {
            addCriterion("CURRENCYID not in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENCYID between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENCYID not between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNull() {
            addCriterion("PAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNotNull() {
            addCriterion("PAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaynameEqualTo(String value) {
            addCriterion("PAYNAME =", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotEqualTo(String value) {
            addCriterion("PAYNAME <>", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThan(String value) {
            addCriterion("PAYNAME >", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYNAME >=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThan(String value) {
            addCriterion("PAYNAME <", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThanOrEqualTo(String value) {
            addCriterion("PAYNAME <=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLike(String value) {
            addCriterion("PAYNAME like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotLike(String value) {
            addCriterion("PAYNAME not like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameIn(List<String> values) {
            addCriterion("PAYNAME in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotIn(List<String> values) {
            addCriterion("PAYNAME not in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameBetween(String value1, String value2) {
            addCriterion("PAYNAME between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotBetween(String value1, String value2) {
            addCriterion("PAYNAME not between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPayphoneIsNull() {
            addCriterion("PAYPHONE is null");
            return (Criteria) this;
        }

        public Criteria andPayphoneIsNotNull() {
            addCriterion("PAYPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPayphoneEqualTo(BigDecimal value) {
            addCriterion("PAYPHONE =", value, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneNotEqualTo(BigDecimal value) {
            addCriterion("PAYPHONE <>", value, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneGreaterThan(BigDecimal value) {
            addCriterion("PAYPHONE >", value, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYPHONE >=", value, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneLessThan(BigDecimal value) {
            addCriterion("PAYPHONE <", value, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYPHONE <=", value, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneIn(List<BigDecimal> values) {
            addCriterion("PAYPHONE in", values, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneNotIn(List<BigDecimal> values) {
            addCriterion("PAYPHONE not in", values, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYPHONE between", value1, value2, "payphone");
            return (Criteria) this;
        }

        public Criteria andPayphoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYPHONE not between", value1, value2, "payphone");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
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