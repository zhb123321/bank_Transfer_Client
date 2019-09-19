package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BulkTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BulkTransferExample() {
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

        public Criteria andTransactionidIsNull() {
            addCriterion("TRANSACTIONID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("TRANSACTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONID =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONID <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(BigDecimal value) {
            addCriterion("TRANSACTIONID >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONID >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(BigDecimal value) {
            addCriterion("TRANSACTIONID <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONID <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<BigDecimal> values) {
            addCriterion("TRANSACTIONID in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<BigDecimal> values) {
            addCriterion("TRANSACTIONID not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTIONID between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTIONID not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIsNull() {
            addCriterion("TRANSACTIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIsNotNull() {
            addCriterion("TRANSACTIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeEqualTo(String value) {
            addCriterion("TRANSACTIONTYPE =", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotEqualTo(String value) {
            addCriterion("TRANSACTIONTYPE <>", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeGreaterThan(String value) {
            addCriterion("TRANSACTIONTYPE >", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONTYPE >=", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLessThan(String value) {
            addCriterion("TRANSACTIONTYPE <", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONTYPE <=", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLike(String value) {
            addCriterion("TRANSACTIONTYPE like", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotLike(String value) {
            addCriterion("TRANSACTIONTYPE not like", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIn(List<String> values) {
            addCriterion("TRANSACTIONTYPE in", values, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotIn(List<String> values) {
            addCriterion("TRANSACTIONTYPE not in", values, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeBetween(String value1, String value2) {
            addCriterion("TRANSACTIONTYPE between", value1, value2, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONTYPE not between", value1, value2, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidIsNull() {
            addCriterion("TRANSACTIONTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidIsNotNull() {
            addCriterion("TRANSACTIONTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONTYPEID =", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidNotEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONTYPEID <>", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidGreaterThan(BigDecimal value) {
            addCriterion("TRANSACTIONTYPEID >", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONTYPEID >=", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidLessThan(BigDecimal value) {
            addCriterion("TRANSACTIONTYPEID <", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONTYPEID <=", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidIn(List<BigDecimal> values) {
            addCriterion("TRANSACTIONTYPEID in", values, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidNotIn(List<BigDecimal> values) {
            addCriterion("TRANSACTIONTYPEID not in", values, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTIONTYPEID between", value1, value2, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTIONTYPEID not between", value1, value2, "transactiontypeid");
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