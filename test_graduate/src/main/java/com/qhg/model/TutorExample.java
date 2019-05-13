package com.qhg.model;

import java.util.ArrayList;
import java.util.List;

public class TutorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TutorExample() {
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

        public Criteria andTutorNameIsNull() {
            addCriterion("tutor_name is null");
            return (Criteria) this;
        }

        public Criteria andTutorNameIsNotNull() {
            addCriterion("tutor_name is not null");
            return (Criteria) this;
        }

        public Criteria andTutorNameEqualTo(String value) {
            addCriterion("tutor_name =", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotEqualTo(String value) {
            addCriterion("tutor_name <>", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameGreaterThan(String value) {
            addCriterion("tutor_name >", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_name >=", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLessThan(String value) {
            addCriterion("tutor_name <", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLessThanOrEqualTo(String value) {
            addCriterion("tutor_name <=", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLike(String value) {
            addCriterion("tutor_name like", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotLike(String value) {
            addCriterion("tutor_name not like", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameIn(List<String> values) {
            addCriterion("tutor_name in", values, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotIn(List<String> values) {
            addCriterion("tutor_name not in", values, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameBetween(String value1, String value2) {
            addCriterion("tutor_name between", value1, value2, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotBetween(String value1, String value2) {
            addCriterion("tutor_name not between", value1, value2, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordIsNull() {
            addCriterion("tutor_password is null");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordIsNotNull() {
            addCriterion("tutor_password is not null");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordEqualTo(String value) {
            addCriterion("tutor_password =", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordNotEqualTo(String value) {
            addCriterion("tutor_password <>", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordGreaterThan(String value) {
            addCriterion("tutor_password >", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_password >=", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordLessThan(String value) {
            addCriterion("tutor_password <", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordLessThanOrEqualTo(String value) {
            addCriterion("tutor_password <=", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordLike(String value) {
            addCriterion("tutor_password like", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordNotLike(String value) {
            addCriterion("tutor_password not like", value, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordIn(List<String> values) {
            addCriterion("tutor_password in", values, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordNotIn(List<String> values) {
            addCriterion("tutor_password not in", values, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordBetween(String value1, String value2) {
            addCriterion("tutor_password between", value1, value2, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorPasswordNotBetween(String value1, String value2) {
            addCriterion("tutor_password not between", value1, value2, "tutorPassword");
            return (Criteria) this;
        }

        public Criteria andTutorSexIsNull() {
            addCriterion("tutor_sex is null");
            return (Criteria) this;
        }

        public Criteria andTutorSexIsNotNull() {
            addCriterion("tutor_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTutorSexEqualTo(String value) {
            addCriterion("tutor_sex =", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotEqualTo(String value) {
            addCriterion("tutor_sex <>", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexGreaterThan(String value) {
            addCriterion("tutor_sex >", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_sex >=", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexLessThan(String value) {
            addCriterion("tutor_sex <", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexLessThanOrEqualTo(String value) {
            addCriterion("tutor_sex <=", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexLike(String value) {
            addCriterion("tutor_sex like", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotLike(String value) {
            addCriterion("tutor_sex not like", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexIn(List<String> values) {
            addCriterion("tutor_sex in", values, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotIn(List<String> values) {
            addCriterion("tutor_sex not in", values, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexBetween(String value1, String value2) {
            addCriterion("tutor_sex between", value1, value2, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotBetween(String value1, String value2) {
            addCriterion("tutor_sex not between", value1, value2, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorAgeIsNull() {
            addCriterion("tutor_age is null");
            return (Criteria) this;
        }

        public Criteria andTutorAgeIsNotNull() {
            addCriterion("tutor_age is not null");
            return (Criteria) this;
        }

        public Criteria andTutorAgeEqualTo(Integer value) {
            addCriterion("tutor_age =", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeNotEqualTo(Integer value) {
            addCriterion("tutor_age <>", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeGreaterThan(Integer value) {
            addCriterion("tutor_age >", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutor_age >=", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeLessThan(Integer value) {
            addCriterion("tutor_age <", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tutor_age <=", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeIn(List<Integer> values) {
            addCriterion("tutor_age in", values, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeNotIn(List<Integer> values) {
            addCriterion("tutor_age not in", values, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeBetween(Integer value1, Integer value2) {
            addCriterion("tutor_age between", value1, value2, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tutor_age not between", value1, value2, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneIsNull() {
            addCriterion("tutor_iphone is null");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneIsNotNull() {
            addCriterion("tutor_iphone is not null");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneEqualTo(String value) {
            addCriterion("tutor_iphone =", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneNotEqualTo(String value) {
            addCriterion("tutor_iphone <>", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneGreaterThan(String value) {
            addCriterion("tutor_iphone >", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_iphone >=", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneLessThan(String value) {
            addCriterion("tutor_iphone <", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneLessThanOrEqualTo(String value) {
            addCriterion("tutor_iphone <=", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneLike(String value) {
            addCriterion("tutor_iphone like", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneNotLike(String value) {
            addCriterion("tutor_iphone not like", value, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneIn(List<String> values) {
            addCriterion("tutor_iphone in", values, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneNotIn(List<String> values) {
            addCriterion("tutor_iphone not in", values, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneBetween(String value1, String value2) {
            addCriterion("tutor_iphone between", value1, value2, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorIphoneNotBetween(String value1, String value2) {
            addCriterion("tutor_iphone not between", value1, value2, "tutorIphone");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeIsNull() {
            addCriterion("tutor_remake is null");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeIsNotNull() {
            addCriterion("tutor_remake is not null");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeEqualTo(String value) {
            addCriterion("tutor_remake =", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeNotEqualTo(String value) {
            addCriterion("tutor_remake <>", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeGreaterThan(String value) {
            addCriterion("tutor_remake >", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_remake >=", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeLessThan(String value) {
            addCriterion("tutor_remake <", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeLessThanOrEqualTo(String value) {
            addCriterion("tutor_remake <=", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeLike(String value) {
            addCriterion("tutor_remake like", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeNotLike(String value) {
            addCriterion("tutor_remake not like", value, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeIn(List<String> values) {
            addCriterion("tutor_remake in", values, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeNotIn(List<String> values) {
            addCriterion("tutor_remake not in", values, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeBetween(String value1, String value2) {
            addCriterion("tutor_remake between", value1, value2, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorRemakeNotBetween(String value1, String value2) {
            addCriterion("tutor_remake not between", value1, value2, "tutorRemake");
            return (Criteria) this;
        }

        public Criteria andTutorEmailIsNull() {
            addCriterion("tutor_email is null");
            return (Criteria) this;
        }

        public Criteria andTutorEmailIsNotNull() {
            addCriterion("tutor_email is not null");
            return (Criteria) this;
        }

        public Criteria andTutorEmailEqualTo(String value) {
            addCriterion("tutor_email =", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailNotEqualTo(String value) {
            addCriterion("tutor_email <>", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailGreaterThan(String value) {
            addCriterion("tutor_email >", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_email >=", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailLessThan(String value) {
            addCriterion("tutor_email <", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailLessThanOrEqualTo(String value) {
            addCriterion("tutor_email <=", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailLike(String value) {
            addCriterion("tutor_email like", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailNotLike(String value) {
            addCriterion("tutor_email not like", value, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailIn(List<String> values) {
            addCriterion("tutor_email in", values, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailNotIn(List<String> values) {
            addCriterion("tutor_email not in", values, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailBetween(String value1, String value2) {
            addCriterion("tutor_email between", value1, value2, "tutorEmail");
            return (Criteria) this;
        }

        public Criteria andTutorEmailNotBetween(String value1, String value2) {
            addCriterion("tutor_email not between", value1, value2, "tutorEmail");
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