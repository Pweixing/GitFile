package com.qhg.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuAccountIsNull() {
            addCriterion("stu_account is null");
            return (Criteria) this;
        }

        public Criteria andStuAccountIsNotNull() {
            addCriterion("stu_account is not null");
            return (Criteria) this;
        }

        public Criteria andStuAccountEqualTo(String value) {
            addCriterion("stu_account =", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotEqualTo(String value) {
            addCriterion("stu_account <>", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountGreaterThan(String value) {
            addCriterion("stu_account >", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountGreaterThanOrEqualTo(String value) {
            addCriterion("stu_account >=", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountLessThan(String value) {
            addCriterion("stu_account <", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountLessThanOrEqualTo(String value) {
            addCriterion("stu_account <=", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountLike(String value) {
            addCriterion("stu_account like", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotLike(String value) {
            addCriterion("stu_account not like", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountIn(List<String> values) {
            addCriterion("stu_account in", values, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotIn(List<String> values) {
            addCriterion("stu_account not in", values, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountBetween(String value1, String value2) {
            addCriterion("stu_account between", value1, value2, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotBetween(String value1, String value2) {
            addCriterion("stu_account not between", value1, value2, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("stu_password like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("stu_password not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNull() {
            addCriterion("stu_age is null");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNotNull() {
            addCriterion("stu_age is not null");
            return (Criteria) this;
        }

        public Criteria andStuAgeEqualTo(Integer value) {
            addCriterion("stu_age =", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotEqualTo(Integer value) {
            addCriterion("stu_age <>", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThan(Integer value) {
            addCriterion("stu_age >", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_age >=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThan(Integer value) {
            addCriterion("stu_age <", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_age <=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeIn(List<Integer> values) {
            addCriterion("stu_age in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotIn(List<Integer> values) {
            addCriterion("stu_age not in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeBetween(Integer value1, Integer value2) {
            addCriterion("stu_age between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_age not between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuClassidIsNull() {
            addCriterion("stu_classId is null");
            return (Criteria) this;
        }

        public Criteria andStuClassidIsNotNull() {
            addCriterion("stu_classId is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassidEqualTo(String value) {
            addCriterion("stu_classId =", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotEqualTo(String value) {
            addCriterion("stu_classId <>", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidGreaterThan(String value) {
            addCriterion("stu_classId >", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidGreaterThanOrEqualTo(String value) {
            addCriterion("stu_classId >=", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLessThan(String value) {
            addCriterion("stu_classId <", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLessThanOrEqualTo(String value) {
            addCriterion("stu_classId <=", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLike(String value) {
            addCriterion("stu_classId like", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotLike(String value) {
            addCriterion("stu_classId not like", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidIn(List<String> values) {
            addCriterion("stu_classId in", values, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotIn(List<String> values) {
            addCriterion("stu_classId not in", values, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidBetween(String value1, String value2) {
            addCriterion("stu_classId between", value1, value2, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotBetween(String value1, String value2) {
            addCriterion("stu_classId not between", value1, value2, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridIsNull() {
            addCriterion("stu_tutorId is null");
            return (Criteria) this;
        }

        public Criteria andStuTutoridIsNotNull() {
            addCriterion("stu_tutorId is not null");
            return (Criteria) this;
        }

        public Criteria andStuTutoridEqualTo(String value) {
            addCriterion("stu_tutorId =", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridNotEqualTo(String value) {
            addCriterion("stu_tutorId <>", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridGreaterThan(String value) {
            addCriterion("stu_tutorId >", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridGreaterThanOrEqualTo(String value) {
            addCriterion("stu_tutorId >=", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridLessThan(String value) {
            addCriterion("stu_tutorId <", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridLessThanOrEqualTo(String value) {
            addCriterion("stu_tutorId <=", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridLike(String value) {
            addCriterion("stu_tutorId like", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridNotLike(String value) {
            addCriterion("stu_tutorId not like", value, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridIn(List<String> values) {
            addCriterion("stu_tutorId in", values, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridNotIn(List<String> values) {
            addCriterion("stu_tutorId not in", values, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridBetween(String value1, String value2) {
            addCriterion("stu_tutorId between", value1, value2, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuTutoridNotBetween(String value1, String value2) {
            addCriterion("stu_tutorId not between", value1, value2, "stuTutorid");
            return (Criteria) this;
        }

        public Criteria andStuIphoneIsNull() {
            addCriterion("stu_iphone is null");
            return (Criteria) this;
        }

        public Criteria andStuIphoneIsNotNull() {
            addCriterion("stu_iphone is not null");
            return (Criteria) this;
        }

        public Criteria andStuIphoneEqualTo(Integer value) {
            addCriterion("stu_iphone =", value, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneNotEqualTo(Integer value) {
            addCriterion("stu_iphone <>", value, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneGreaterThan(Integer value) {
            addCriterion("stu_iphone >", value, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_iphone >=", value, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneLessThan(Integer value) {
            addCriterion("stu_iphone <", value, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneLessThanOrEqualTo(Integer value) {
            addCriterion("stu_iphone <=", value, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneIn(List<Integer> values) {
            addCriterion("stu_iphone in", values, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneNotIn(List<Integer> values) {
            addCriterion("stu_iphone not in", values, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneBetween(Integer value1, Integer value2) {
            addCriterion("stu_iphone between", value1, value2, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuIphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_iphone not between", value1, value2, "stuIphone");
            return (Criteria) this;
        }

        public Criteria andStuCollageIsNull() {
            addCriterion("stu_collage is null");
            return (Criteria) this;
        }

        public Criteria andStuCollageIsNotNull() {
            addCriterion("stu_collage is not null");
            return (Criteria) this;
        }

        public Criteria andStuCollageEqualTo(String value) {
            addCriterion("stu_collage =", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageNotEqualTo(String value) {
            addCriterion("stu_collage <>", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageGreaterThan(String value) {
            addCriterion("stu_collage >", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageGreaterThanOrEqualTo(String value) {
            addCriterion("stu_collage >=", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageLessThan(String value) {
            addCriterion("stu_collage <", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageLessThanOrEqualTo(String value) {
            addCriterion("stu_collage <=", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageLike(String value) {
            addCriterion("stu_collage like", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageNotLike(String value) {
            addCriterion("stu_collage not like", value, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageIn(List<String> values) {
            addCriterion("stu_collage in", values, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageNotIn(List<String> values) {
            addCriterion("stu_collage not in", values, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageBetween(String value1, String value2) {
            addCriterion("stu_collage between", value1, value2, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuCollageNotBetween(String value1, String value2) {
            addCriterion("stu_collage not between", value1, value2, "stuCollage");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyIsNull() {
            addCriterion("stu_specialty is null");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyIsNotNull() {
            addCriterion("stu_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyEqualTo(String value) {
            addCriterion("stu_specialty =", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyNotEqualTo(String value) {
            addCriterion("stu_specialty <>", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyGreaterThan(String value) {
            addCriterion("stu_specialty >", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("stu_specialty >=", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyLessThan(String value) {
            addCriterion("stu_specialty <", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("stu_specialty <=", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyLike(String value) {
            addCriterion("stu_specialty like", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyNotLike(String value) {
            addCriterion("stu_specialty not like", value, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyIn(List<String> values) {
            addCriterion("stu_specialty in", values, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyNotIn(List<String> values) {
            addCriterion("stu_specialty not in", values, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyBetween(String value1, String value2) {
            addCriterion("stu_specialty between", value1, value2, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuSpecialtyNotBetween(String value1, String value2) {
            addCriterion("stu_specialty not between", value1, value2, "stuSpecialty");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderIsNull() {
            addCriterion("stu_isLeader is null");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderIsNotNull() {
            addCriterion("stu_isLeader is not null");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderEqualTo(Integer value) {
            addCriterion("stu_isLeader =", value, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderNotEqualTo(Integer value) {
            addCriterion("stu_isLeader <>", value, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderGreaterThan(Integer value) {
            addCriterion("stu_isLeader >", value, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_isLeader >=", value, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderLessThan(Integer value) {
            addCriterion("stu_isLeader <", value, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderLessThanOrEqualTo(Integer value) {
            addCriterion("stu_isLeader <=", value, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderIn(List<Integer> values) {
            addCriterion("stu_isLeader in", values, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderNotIn(List<Integer> values) {
            addCriterion("stu_isLeader not in", values, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderBetween(Integer value1, Integer value2) {
            addCriterion("stu_isLeader between", value1, value2, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuIsleaderNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_isLeader not between", value1, value2, "stuIsleader");
            return (Criteria) this;
        }

        public Criteria andStuGroupidIsNull() {
            addCriterion("stu_groupId is null");
            return (Criteria) this;
        }

        public Criteria andStuGroupidIsNotNull() {
            addCriterion("stu_groupId is not null");
            return (Criteria) this;
        }

        public Criteria andStuGroupidEqualTo(String value) {
            addCriterion("stu_groupId =", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidNotEqualTo(String value) {
            addCriterion("stu_groupId <>", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidGreaterThan(String value) {
            addCriterion("stu_groupId >", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("stu_groupId >=", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidLessThan(String value) {
            addCriterion("stu_groupId <", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidLessThanOrEqualTo(String value) {
            addCriterion("stu_groupId <=", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidLike(String value) {
            addCriterion("stu_groupId like", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidNotLike(String value) {
            addCriterion("stu_groupId not like", value, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidIn(List<String> values) {
            addCriterion("stu_groupId in", values, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidNotIn(List<String> values) {
            addCriterion("stu_groupId not in", values, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidBetween(String value1, String value2) {
            addCriterion("stu_groupId between", value1, value2, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuGroupidNotBetween(String value1, String value2) {
            addCriterion("stu_groupId not between", value1, value2, "stuGroupid");
            return (Criteria) this;
        }

        public Criteria andStuScoreIsNull() {
            addCriterion("stu_score is null");
            return (Criteria) this;
        }

        public Criteria andStuScoreIsNotNull() {
            addCriterion("stu_score is not null");
            return (Criteria) this;
        }

        public Criteria andStuScoreEqualTo(Integer value) {
            addCriterion("stu_score =", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotEqualTo(Integer value) {
            addCriterion("stu_score <>", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreGreaterThan(Integer value) {
            addCriterion("stu_score >", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_score >=", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreLessThan(Integer value) {
            addCriterion("stu_score <", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("stu_score <=", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreIn(List<Integer> values) {
            addCriterion("stu_score in", values, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotIn(List<Integer> values) {
            addCriterion("stu_score not in", values, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreBetween(Integer value1, Integer value2) {
            addCriterion("stu_score between", value1, value2, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_score not between", value1, value2, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuLockIsNull() {
            addCriterion("stu_lock is null");
            return (Criteria) this;
        }

        public Criteria andStuLockIsNotNull() {
            addCriterion("stu_lock is not null");
            return (Criteria) this;
        }

        public Criteria andStuLockEqualTo(Integer value) {
            addCriterion("stu_lock =", value, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockNotEqualTo(Integer value) {
            addCriterion("stu_lock <>", value, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockGreaterThan(Integer value) {
            addCriterion("stu_lock >", value, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_lock >=", value, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockLessThan(Integer value) {
            addCriterion("stu_lock <", value, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockLessThanOrEqualTo(Integer value) {
            addCriterion("stu_lock <=", value, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockIn(List<Integer> values) {
            addCriterion("stu_lock in", values, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockNotIn(List<Integer> values) {
            addCriterion("stu_lock not in", values, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockBetween(Integer value1, Integer value2) {
            addCriterion("stu_lock between", value1, value2, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuLockNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_lock not between", value1, value2, "stuLock");
            return (Criteria) this;
        }

        public Criteria andStuDeleteIsNull() {
            addCriterion("stu_delete is null");
            return (Criteria) this;
        }

        public Criteria andStuDeleteIsNotNull() {
            addCriterion("stu_delete is not null");
            return (Criteria) this;
        }

        public Criteria andStuDeleteEqualTo(Integer value) {
            addCriterion("stu_delete =", value, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteNotEqualTo(Integer value) {
            addCriterion("stu_delete <>", value, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteGreaterThan(Integer value) {
            addCriterion("stu_delete >", value, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_delete >=", value, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteLessThan(Integer value) {
            addCriterion("stu_delete <", value, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("stu_delete <=", value, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteIn(List<Integer> values) {
            addCriterion("stu_delete in", values, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteNotIn(List<Integer> values) {
            addCriterion("stu_delete not in", values, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteBetween(Integer value1, Integer value2) {
            addCriterion("stu_delete between", value1, value2, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_delete not between", value1, value2, "stuDelete");
            return (Criteria) this;
        }

        public Criteria andStuRemakeIsNull() {
            addCriterion("stu_remake is null");
            return (Criteria) this;
        }

        public Criteria andStuRemakeIsNotNull() {
            addCriterion("stu_remake is not null");
            return (Criteria) this;
        }

        public Criteria andStuRemakeEqualTo(String value) {
            addCriterion("stu_remake =", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeNotEqualTo(String value) {
            addCriterion("stu_remake <>", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeGreaterThan(String value) {
            addCriterion("stu_remake >", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_remake >=", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeLessThan(String value) {
            addCriterion("stu_remake <", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeLessThanOrEqualTo(String value) {
            addCriterion("stu_remake <=", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeLike(String value) {
            addCriterion("stu_remake like", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeNotLike(String value) {
            addCriterion("stu_remake not like", value, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeIn(List<String> values) {
            addCriterion("stu_remake in", values, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeNotIn(List<String> values) {
            addCriterion("stu_remake not in", values, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeBetween(String value1, String value2) {
            addCriterion("stu_remake between", value1, value2, "stuRemake");
            return (Criteria) this;
        }

        public Criteria andStuRemakeNotBetween(String value1, String value2) {
            addCriterion("stu_remake not between", value1, value2, "stuRemake");
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