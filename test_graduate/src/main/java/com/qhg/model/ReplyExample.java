package com.qhg.model;

import java.util.ArrayList;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNull() {
            addCriterion("reply_name is null");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNotNull() {
            addCriterion("reply_name is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNameEqualTo(String value) {
            addCriterion("reply_name =", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotEqualTo(String value) {
            addCriterion("reply_name <>", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThan(String value) {
            addCriterion("reply_name >", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_name >=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThan(String value) {
            addCriterion("reply_name <", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThanOrEqualTo(String value) {
            addCriterion("reply_name <=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLike(String value) {
            addCriterion("reply_name like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotLike(String value) {
            addCriterion("reply_name not like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameIn(List<String> values) {
            addCriterion("reply_name in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotIn(List<String> values) {
            addCriterion("reply_name not in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameBetween(String value1, String value2) {
            addCriterion("reply_name between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotBetween(String value1, String value2) {
            addCriterion("reply_name not between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplierIdIsNull() {
            addCriterion("replier_id is null");
            return (Criteria) this;
        }

        public Criteria andReplierIdIsNotNull() {
            addCriterion("replier_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplierIdEqualTo(String value) {
            addCriterion("replier_id =", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdNotEqualTo(String value) {
            addCriterion("replier_id <>", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdGreaterThan(String value) {
            addCriterion("replier_id >", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("replier_id >=", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdLessThan(String value) {
            addCriterion("replier_id <", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdLessThanOrEqualTo(String value) {
            addCriterion("replier_id <=", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdLike(String value) {
            addCriterion("replier_id like", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdNotLike(String value) {
            addCriterion("replier_id not like", value, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdIn(List<String> values) {
            addCriterion("replier_id in", values, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdNotIn(List<String> values) {
            addCriterion("replier_id not in", values, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdBetween(String value1, String value2) {
            addCriterion("replier_id between", value1, value2, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplierIdNotBetween(String value1, String value2) {
            addCriterion("replier_id not between", value1, value2, "replierId");
            return (Criteria) this;
        }

        public Criteria andReplyContextIsNull() {
            addCriterion("reply_context is null");
            return (Criteria) this;
        }

        public Criteria andReplyContextIsNotNull() {
            addCriterion("reply_context is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContextEqualTo(String value) {
            addCriterion("reply_context =", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextNotEqualTo(String value) {
            addCriterion("reply_context <>", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextGreaterThan(String value) {
            addCriterion("reply_context >", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextGreaterThanOrEqualTo(String value) {
            addCriterion("reply_context >=", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextLessThan(String value) {
            addCriterion("reply_context <", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextLessThanOrEqualTo(String value) {
            addCriterion("reply_context <=", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextLike(String value) {
            addCriterion("reply_context like", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextNotLike(String value) {
            addCriterion("reply_context not like", value, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextIn(List<String> values) {
            addCriterion("reply_context in", values, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextNotIn(List<String> values) {
            addCriterion("reply_context not in", values, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextBetween(String value1, String value2) {
            addCriterion("reply_context between", value1, value2, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyContextNotBetween(String value1, String value2) {
            addCriterion("reply_context not between", value1, value2, "replyContext");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(String value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(String value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(String value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(String value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(String value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLike(String value) {
            addCriterion("reply_time like", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotLike(String value) {
            addCriterion("reply_time not like", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<String> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<String> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(String value1, String value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(String value1, String value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(String value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(String value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(String value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(String value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(String value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(String value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLike(String value) {
            addCriterion("problem_id like", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotLike(String value) {
            addCriterion("problem_id not like", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<String> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<String> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(String value1, String value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(String value1, String value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
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