package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CrossborderTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrossborderTransferExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(BigDecimal value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(BigDecimal value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(BigDecimal value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(BigDecimal value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<BigDecimal> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<BigDecimal> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID not between", value1, value2, "cid");
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

        public Criteria andUseraddrIsNull() {
            addCriterion("USERADDR is null");
            return (Criteria) this;
        }

        public Criteria andUseraddrIsNotNull() {
            addCriterion("USERADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddrEqualTo(String value) {
            addCriterion("USERADDR =", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotEqualTo(String value) {
            addCriterion("USERADDR <>", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrGreaterThan(String value) {
            addCriterion("USERADDR >", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrGreaterThanOrEqualTo(String value) {
            addCriterion("USERADDR >=", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLessThan(String value) {
            addCriterion("USERADDR <", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLessThanOrEqualTo(String value) {
            addCriterion("USERADDR <=", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLike(String value) {
            addCriterion("USERADDR like", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotLike(String value) {
            addCriterion("USERADDR not like", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrIn(List<String> values) {
            addCriterion("USERADDR in", values, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotIn(List<String> values) {
            addCriterion("USERADDR not in", values, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrBetween(String value1, String value2) {
            addCriterion("USERADDR between", value1, value2, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotBetween(String value1, String value2) {
            addCriterion("USERADDR not between", value1, value2, "useraddr");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(Long value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(Long value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(Long value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(Long value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(Long value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<Long> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<Long> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(Long value1, Long value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(Long value1, Long value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
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

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andReusernumberIsNull() {
            addCriterion("REUSERNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andReusernumberIsNotNull() {
            addCriterion("REUSERNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andReusernumberEqualTo(BigDecimal value) {
            addCriterion("REUSERNUMBER =", value, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberNotEqualTo(BigDecimal value) {
            addCriterion("REUSERNUMBER <>", value, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberGreaterThan(BigDecimal value) {
            addCriterion("REUSERNUMBER >", value, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REUSERNUMBER >=", value, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberLessThan(BigDecimal value) {
            addCriterion("REUSERNUMBER <", value, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REUSERNUMBER <=", value, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberIn(List<BigDecimal> values) {
            addCriterion("REUSERNUMBER in", values, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberNotIn(List<BigDecimal> values) {
            addCriterion("REUSERNUMBER not in", values, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REUSERNUMBER between", value1, value2, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andReusernumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REUSERNUMBER not between", value1, value2, "reusernumber");
            return (Criteria) this;
        }

        public Criteria andBankcountryIsNull() {
            addCriterion("BANKCOUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andBankcountryIsNotNull() {
            addCriterion("BANKCOUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andBankcountryEqualTo(String value) {
            addCriterion("BANKCOUNTRY =", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryNotEqualTo(String value) {
            addCriterion("BANKCOUNTRY <>", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryGreaterThan(String value) {
            addCriterion("BANKCOUNTRY >", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCOUNTRY >=", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryLessThan(String value) {
            addCriterion("BANKCOUNTRY <", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryLessThanOrEqualTo(String value) {
            addCriterion("BANKCOUNTRY <=", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryLike(String value) {
            addCriterion("BANKCOUNTRY like", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryNotLike(String value) {
            addCriterion("BANKCOUNTRY not like", value, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryIn(List<String> values) {
            addCriterion("BANKCOUNTRY in", values, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryNotIn(List<String> values) {
            addCriterion("BANKCOUNTRY not in", values, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryBetween(String value1, String value2) {
            addCriterion("BANKCOUNTRY between", value1, value2, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andBankcountryNotBetween(String value1, String value2) {
            addCriterion("BANKCOUNTRY not between", value1, value2, "bankcountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryIsNull() {
            addCriterion("REUSERCOUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andReusercountryIsNotNull() {
            addCriterion("REUSERCOUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andReusercountryEqualTo(String value) {
            addCriterion("REUSERCOUNTRY =", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryNotEqualTo(String value) {
            addCriterion("REUSERCOUNTRY <>", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryGreaterThan(String value) {
            addCriterion("REUSERCOUNTRY >", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryGreaterThanOrEqualTo(String value) {
            addCriterion("REUSERCOUNTRY >=", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryLessThan(String value) {
            addCriterion("REUSERCOUNTRY <", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryLessThanOrEqualTo(String value) {
            addCriterion("REUSERCOUNTRY <=", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryLike(String value) {
            addCriterion("REUSERCOUNTRY like", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryNotLike(String value) {
            addCriterion("REUSERCOUNTRY not like", value, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryIn(List<String> values) {
            addCriterion("REUSERCOUNTRY in", values, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryNotIn(List<String> values) {
            addCriterion("REUSERCOUNTRY not in", values, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryBetween(String value1, String value2) {
            addCriterion("REUSERCOUNTRY between", value1, value2, "reusercountry");
            return (Criteria) this;
        }

        public Criteria andReusercountryNotBetween(String value1, String value2) {
            addCriterion("REUSERCOUNTRY not between", value1, value2, "reusercountry");
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

        public Criteria andReusernameIsNull() {
            addCriterion("REUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReusernameIsNotNull() {
            addCriterion("REUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReusernameEqualTo(String value) {
            addCriterion("REUSERNAME =", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameNotEqualTo(String value) {
            addCriterion("REUSERNAME <>", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameGreaterThan(String value) {
            addCriterion("REUSERNAME >", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameGreaterThanOrEqualTo(String value) {
            addCriterion("REUSERNAME >=", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameLessThan(String value) {
            addCriterion("REUSERNAME <", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameLessThanOrEqualTo(String value) {
            addCriterion("REUSERNAME <=", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameLike(String value) {
            addCriterion("REUSERNAME like", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameNotLike(String value) {
            addCriterion("REUSERNAME not like", value, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameIn(List<String> values) {
            addCriterion("REUSERNAME in", values, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameNotIn(List<String> values) {
            addCriterion("REUSERNAME not in", values, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameBetween(String value1, String value2) {
            addCriterion("REUSERNAME between", value1, value2, "reusername");
            return (Criteria) this;
        }

        public Criteria andReusernameNotBetween(String value1, String value2) {
            addCriterion("REUSERNAME not between", value1, value2, "reusername");
            return (Criteria) this;
        }

        public Criteria andExchangeyidIsNull() {
            addCriterion("EXCHANGEYID is null");
            return (Criteria) this;
        }

        public Criteria andExchangeyidIsNotNull() {
            addCriterion("EXCHANGEYID is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeyidEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID =", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID <>", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGEYID >", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID >=", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidLessThan(BigDecimal value) {
            addCriterion("EXCHANGEYID <", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID <=", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEYID in", values, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEYID not in", values, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEYID between", value1, value2, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEYID not between", value1, value2, "exchangeyid");
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

        public Criteria andDatetimeIsNull() {
            addCriterion("DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("DATETIME =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("DATETIME <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("DATETIME >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATETIME >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("DATETIME <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("DATETIME <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("DATETIME like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("DATETIME not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("DATETIME in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("DATETIME not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("DATETIME between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("DATETIME not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(Long value) {
            addCriterion("SERVICE =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(Long value) {
            addCriterion("SERVICE <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(Long value) {
            addCriterion("SERVICE >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(Long value) {
            addCriterion("SERVICE >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(Long value) {
            addCriterion("SERVICE <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(Long value) {
            addCriterion("SERVICE <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<Long> values) {
            addCriterion("SERVICE in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<Long> values) {
            addCriterion("SERVICE not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(Long value1, Long value2) {
            addCriterion("SERVICE between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(Long value1, Long value2) {
            addCriterion("SERVICE not between", value1, value2, "service");
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