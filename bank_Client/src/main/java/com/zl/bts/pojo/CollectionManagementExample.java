package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CollectionManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionManagementExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(BigDecimal value) {
            addCriterion("MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(BigDecimal value) {
            addCriterion("MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(BigDecimal value) {
            addCriterion("MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(BigDecimal value) {
            addCriterion("MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<BigDecimal> values) {
            addCriterion("MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<BigDecimal> values) {
            addCriterion("MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MID not between", value1, value2, "mid");
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

        public Criteria andInvoiceIsNull() {
            addCriterion("INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(BigDecimal value) {
            addCriterion("INVOICE =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(BigDecimal value) {
            addCriterion("INVOICE >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(BigDecimal value) {
            addCriterion("INVOICE <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<BigDecimal> values) {
            addCriterion("INVOICE in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE not between", value1, value2, "invoice");
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

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY not between", value1, value2, "money");
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

        public Criteria andTranstypeIsNull() {
            addCriterion("TRANSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TRANSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(Long value) {
            addCriterion("TRANSTYPE =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(Long value) {
            addCriterion("TRANSTYPE <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(Long value) {
            addCriterion("TRANSTYPE >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSTYPE >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(Long value) {
            addCriterion("TRANSTYPE <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(Long value) {
            addCriterion("TRANSTYPE <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<Long> values) {
            addCriterion("TRANSTYPE in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<Long> values) {
            addCriterion("TRANSTYPE not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(Long value1, Long value2) {
            addCriterion("TRANSTYPE between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(Long value1, Long value2) {
            addCriterion("TRANSTYPE not between", value1, value2, "transtype");
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

        public Criteria andOutaccountIsNull() {
            addCriterion("OUTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOutaccountIsNotNull() {
            addCriterion("OUTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOutaccountEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT =", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT <>", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountGreaterThan(BigDecimal value) {
            addCriterion("OUTACCOUNT >", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT >=", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLessThan(BigDecimal value) {
            addCriterion("OUTACCOUNT <", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT <=", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountIn(List<BigDecimal> values) {
            addCriterion("OUTACCOUNT in", values, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotIn(List<BigDecimal> values) {
            addCriterion("OUTACCOUNT not in", values, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTACCOUNT between", value1, value2, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTACCOUNT not between", value1, value2, "outaccount");
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

        public Criteria andDeletetypeIsNull() {
            addCriterion("DELETETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNotNull() {
            addCriterion("DELETETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeEqualTo(BigDecimal value) {
            addCriterion("DELETETYPE =", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotEqualTo(BigDecimal value) {
            addCriterion("DELETETYPE <>", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThan(BigDecimal value) {
            addCriterion("DELETETYPE >", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELETETYPE >=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThan(BigDecimal value) {
            addCriterion("DELETETYPE <", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELETETYPE <=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIn(List<BigDecimal> values) {
            addCriterion("DELETETYPE in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotIn(List<BigDecimal> values) {
            addCriterion("DELETETYPE not in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELETETYPE between", value1, value2, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELETETYPE not between", value1, value2, "deletetype");
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