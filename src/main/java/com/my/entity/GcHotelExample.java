package com.my.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcHotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GcHotelExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeIsNull() {
            addCriterion("hotel_group_code is null");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeIsNotNull() {
            addCriterion("hotel_group_code is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeEqualTo(String value) {
            addCriterion("hotel_group_code =", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeNotEqualTo(String value) {
            addCriterion("hotel_group_code <>", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeGreaterThan(String value) {
            addCriterion("hotel_group_code >", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_group_code >=", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeLessThan(String value) {
            addCriterion("hotel_group_code <", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("hotel_group_code <=", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeLike(String value) {
            addCriterion("hotel_group_code like", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeNotLike(String value) {
            addCriterion("hotel_group_code not like", value, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeIn(List<String> values) {
            addCriterion("hotel_group_code in", values, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeNotIn(List<String> values) {
            addCriterion("hotel_group_code not in", values, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeBetween(String value1, String value2) {
            addCriterion("hotel_group_code between", value1, value2, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupCodeNotBetween(String value1, String value2) {
            addCriterion("hotel_group_code not between", value1, value2, "hotelGroupCode");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdIsNull() {
            addCriterion("hotel_group_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdIsNotNull() {
            addCriterion("hotel_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdEqualTo(Long value) {
            addCriterion("hotel_group_id =", value, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdNotEqualTo(Long value) {
            addCriterion("hotel_group_id <>", value, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdGreaterThan(Long value) {
            addCriterion("hotel_group_id >", value, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hotel_group_id >=", value, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdLessThan(Long value) {
            addCriterion("hotel_group_id <", value, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("hotel_group_id <=", value, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdIn(List<Long> values) {
            addCriterion("hotel_group_id in", values, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdNotIn(List<Long> values) {
            addCriterion("hotel_group_id not in", values, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdBetween(Long value1, Long value2) {
            addCriterion("hotel_group_id between", value1, value2, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("hotel_group_id not between", value1, value2, "hotelGroupId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Long value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Long value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Long value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Long value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Long value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Long> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Long> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Long value1, Long value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Long value1, Long value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andStaIsNull() {
            addCriterion("sta is null");
            return (Criteria) this;
        }

        public Criteria andStaIsNotNull() {
            addCriterion("sta is not null");
            return (Criteria) this;
        }

        public Criteria andStaEqualTo(String value) {
            addCriterion("sta =", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotEqualTo(String value) {
            addCriterion("sta <>", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaGreaterThan(String value) {
            addCriterion("sta >", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaGreaterThanOrEqualTo(String value) {
            addCriterion("sta >=", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaLessThan(String value) {
            addCriterion("sta <", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaLessThanOrEqualTo(String value) {
            addCriterion("sta <=", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaLike(String value) {
            addCriterion("sta like", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotLike(String value) {
            addCriterion("sta not like", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaIn(List<String> values) {
            addCriterion("sta in", values, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotIn(List<String> values) {
            addCriterion("sta not in", values, "sta");
            return (Criteria) this;
        }

        public Criteria andStaBetween(String value1, String value2) {
            addCriterion("sta between", value1, value2, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotBetween(String value1, String value2) {
            addCriterion("sta not between", value1, value2, "sta");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("audit like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("audit not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptEnIsNull() {
            addCriterion("descript_en is null");
            return (Criteria) this;
        }

        public Criteria andDescriptEnIsNotNull() {
            addCriterion("descript_en is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEnEqualTo(String value) {
            addCriterion("descript_en =", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnNotEqualTo(String value) {
            addCriterion("descript_en <>", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnGreaterThan(String value) {
            addCriterion("descript_en >", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnGreaterThanOrEqualTo(String value) {
            addCriterion("descript_en >=", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnLessThan(String value) {
            addCriterion("descript_en <", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnLessThanOrEqualTo(String value) {
            addCriterion("descript_en <=", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnLike(String value) {
            addCriterion("descript_en like", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnNotLike(String value) {
            addCriterion("descript_en not like", value, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnIn(List<String> values) {
            addCriterion("descript_en in", values, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnNotIn(List<String> values) {
            addCriterion("descript_en not in", values, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnBetween(String value1, String value2) {
            addCriterion("descript_en between", value1, value2, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptEnNotBetween(String value1, String value2) {
            addCriterion("descript_en not between", value1, value2, "descriptEn");
            return (Criteria) this;
        }

        public Criteria andDescriptShortIsNull() {
            addCriterion("descript_short is null");
            return (Criteria) this;
        }

        public Criteria andDescriptShortIsNotNull() {
            addCriterion("descript_short is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptShortEqualTo(String value) {
            addCriterion("descript_short =", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortNotEqualTo(String value) {
            addCriterion("descript_short <>", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortGreaterThan(String value) {
            addCriterion("descript_short >", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortGreaterThanOrEqualTo(String value) {
            addCriterion("descript_short >=", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortLessThan(String value) {
            addCriterion("descript_short <", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortLessThanOrEqualTo(String value) {
            addCriterion("descript_short <=", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortLike(String value) {
            addCriterion("descript_short like", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortNotLike(String value) {
            addCriterion("descript_short not like", value, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortIn(List<String> values) {
            addCriterion("descript_short in", values, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortNotIn(List<String> values) {
            addCriterion("descript_short not in", values, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortBetween(String value1, String value2) {
            addCriterion("descript_short between", value1, value2, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andDescriptShortNotBetween(String value1, String value2) {
            addCriterion("descript_short not between", value1, value2, "descriptShort");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNull() {
            addCriterion("address1 is null");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNotNull() {
            addCriterion("address1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress1EqualTo(String value) {
            addCriterion("address1 =", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotEqualTo(String value) {
            addCriterion("address1 <>", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThan(String value) {
            addCriterion("address1 >", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("address1 >=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThan(String value) {
            addCriterion("address1 <", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThanOrEqualTo(String value) {
            addCriterion("address1 <=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Like(String value) {
            addCriterion("address1 like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotLike(String value) {
            addCriterion("address1 not like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1In(List<String> values) {
            addCriterion("address1 in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotIn(List<String> values) {
            addCriterion("address1 not in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Between(String value1, String value2) {
            addCriterion("address1 between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotBetween(String value1, String value2) {
            addCriterion("address1 not between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNull() {
            addCriterion("address2 is null");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNotNull() {
            addCriterion("address2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress2EqualTo(String value) {
            addCriterion("address2 =", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotEqualTo(String value) {
            addCriterion("address2 <>", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThan(String value) {
            addCriterion("address2 >", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("address2 >=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThan(String value) {
            addCriterion("address2 <", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThanOrEqualTo(String value) {
            addCriterion("address2 <=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Like(String value) {
            addCriterion("address2 like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotLike(String value) {
            addCriterion("address2 not like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2In(List<String> values) {
            addCriterion("address2 in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotIn(List<String> values) {
            addCriterion("address2 not in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Between(String value1, String value2) {
            addCriterion("address2 between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotBetween(String value1, String value2) {
            addCriterion("address2 not between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvIsNull() {
            addCriterion("phone_rsv is null");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvIsNotNull() {
            addCriterion("phone_rsv is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvEqualTo(String value) {
            addCriterion("phone_rsv =", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvNotEqualTo(String value) {
            addCriterion("phone_rsv <>", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvGreaterThan(String value) {
            addCriterion("phone_rsv >", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvGreaterThanOrEqualTo(String value) {
            addCriterion("phone_rsv >=", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvLessThan(String value) {
            addCriterion("phone_rsv <", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvLessThanOrEqualTo(String value) {
            addCriterion("phone_rsv <=", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvLike(String value) {
            addCriterion("phone_rsv like", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvNotLike(String value) {
            addCriterion("phone_rsv not like", value, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvIn(List<String> values) {
            addCriterion("phone_rsv in", values, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvNotIn(List<String> values) {
            addCriterion("phone_rsv not in", values, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvBetween(String value1, String value2) {
            addCriterion("phone_rsv between", value1, value2, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andPhoneRsvNotBetween(String value1, String value2) {
            addCriterion("phone_rsv not between", value1, value2, "phoneRsv");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDnsIsNull() {
            addCriterion("dns is null");
            return (Criteria) this;
        }

        public Criteria andDnsIsNotNull() {
            addCriterion("dns is not null");
            return (Criteria) this;
        }

        public Criteria andDnsEqualTo(String value) {
            addCriterion("dns =", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotEqualTo(String value) {
            addCriterion("dns <>", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsGreaterThan(String value) {
            addCriterion("dns >", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsGreaterThanOrEqualTo(String value) {
            addCriterion("dns >=", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLessThan(String value) {
            addCriterion("dns <", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLessThanOrEqualTo(String value) {
            addCriterion("dns <=", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLike(String value) {
            addCriterion("dns like", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotLike(String value) {
            addCriterion("dns not like", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsIn(List<String> values) {
            addCriterion("dns in", values, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotIn(List<String> values) {
            addCriterion("dns not in", values, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsBetween(String value1, String value2) {
            addCriterion("dns between", value1, value2, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotBetween(String value1, String value2) {
            addCriterion("dns not between", value1, value2, "dns");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andListOrderIsNull() {
            addCriterion("list_order is null");
            return (Criteria) this;
        }

        public Criteria andListOrderIsNotNull() {
            addCriterion("list_order is not null");
            return (Criteria) this;
        }

        public Criteria andListOrderEqualTo(Integer value) {
            addCriterion("list_order =", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotEqualTo(Integer value) {
            addCriterion("list_order <>", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderGreaterThan(Integer value) {
            addCriterion("list_order >", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_order >=", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderLessThan(Integer value) {
            addCriterion("list_order <", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderLessThanOrEqualTo(Integer value) {
            addCriterion("list_order <=", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderIn(List<Integer> values) {
            addCriterion("list_order in", values, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotIn(List<Integer> values) {
            addCriterion("list_order not in", values, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderBetween(Integer value1, Integer value2) {
            addCriterion("list_order between", value1, value2, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("list_order not between", value1, value2, "listOrder");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("modify_user like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("modify_user not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("modify_user not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNull() {
            addCriterion("modify_datetime is null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNotNull() {
            addCriterion("modify_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeEqualTo(Date value) {
            addCriterion("modify_datetime =", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotEqualTo(Date value) {
            addCriterion("modify_datetime <>", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThan(Date value) {
            addCriterion("modify_datetime >", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_datetime >=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThan(Date value) {
            addCriterion("modify_datetime <", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_datetime <=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIn(List<Date> values) {
            addCriterion("modify_datetime in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotIn(List<Date> values) {
            addCriterion("modify_datetime not in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeBetween(Date value1, Date value2) {
            addCriterion("modify_datetime between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_datetime not between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNull() {
            addCriterion("district_code is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("district_code is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(String value) {
            addCriterion("district_code =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(String value) {
            addCriterion("district_code <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(String value) {
            addCriterion("district_code >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("district_code >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(String value) {
            addCriterion("district_code <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("district_code <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLike(String value) {
            addCriterion("district_code like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotLike(String value) {
            addCriterion("district_code not like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<String> values) {
            addCriterion("district_code in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<String> values) {
            addCriterion("district_code not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(String value1, String value2) {
            addCriterion("district_code between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("district_code not between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeIsNull() {
            addCriterion("town_code is null");
            return (Criteria) this;
        }

        public Criteria andTownCodeIsNotNull() {
            addCriterion("town_code is not null");
            return (Criteria) this;
        }

        public Criteria andTownCodeEqualTo(String value) {
            addCriterion("town_code =", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeNotEqualTo(String value) {
            addCriterion("town_code <>", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeGreaterThan(String value) {
            addCriterion("town_code >", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeGreaterThanOrEqualTo(String value) {
            addCriterion("town_code >=", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeLessThan(String value) {
            addCriterion("town_code <", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeLessThanOrEqualTo(String value) {
            addCriterion("town_code <=", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeLike(String value) {
            addCriterion("town_code like", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeNotLike(String value) {
            addCriterion("town_code not like", value, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeIn(List<String> values) {
            addCriterion("town_code in", values, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeNotIn(List<String> values) {
            addCriterion("town_code not in", values, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeBetween(String value1, String value2) {
            addCriterion("town_code between", value1, value2, "townCode");
            return (Criteria) this;
        }

        public Criteria andTownCodeNotBetween(String value1, String value2) {
            addCriterion("town_code not between", value1, value2, "townCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeIsNull() {
            addCriterion("shopping_district_code is null");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeIsNotNull() {
            addCriterion("shopping_district_code is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeEqualTo(String value) {
            addCriterion("shopping_district_code =", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeNotEqualTo(String value) {
            addCriterion("shopping_district_code <>", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeGreaterThan(String value) {
            addCriterion("shopping_district_code >", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_district_code >=", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeLessThan(String value) {
            addCriterion("shopping_district_code <", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("shopping_district_code <=", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeLike(String value) {
            addCriterion("shopping_district_code like", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeNotLike(String value) {
            addCriterion("shopping_district_code not like", value, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeIn(List<String> values) {
            addCriterion("shopping_district_code in", values, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeNotIn(List<String> values) {
            addCriterion("shopping_district_code not in", values, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeBetween(String value1, String value2) {
            addCriterion("shopping_district_code between", value1, value2, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andShoppingDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("shopping_district_code not between", value1, value2, "shoppingDistrictCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeIsNull() {
            addCriterion("scenic_spot_code is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeIsNotNull() {
            addCriterion("scenic_spot_code is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeEqualTo(String value) {
            addCriterion("scenic_spot_code =", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeNotEqualTo(String value) {
            addCriterion("scenic_spot_code <>", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeGreaterThan(String value) {
            addCriterion("scenic_spot_code >", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_code >=", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeLessThan(String value) {
            addCriterion("scenic_spot_code <", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_code <=", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeLike(String value) {
            addCriterion("scenic_spot_code like", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeNotLike(String value) {
            addCriterion("scenic_spot_code not like", value, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeIn(List<String> values) {
            addCriterion("scenic_spot_code in", values, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeNotIn(List<String> values) {
            addCriterion("scenic_spot_code not in", values, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeBetween(String value1, String value2) {
            addCriterion("scenic_spot_code between", value1, value2, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotCodeNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_code not between", value1, value2, "scenicSpotCode");
            return (Criteria) this;
        }

        public Criteria andBookListOrderIsNull() {
            addCriterion("book_list_order is null");
            return (Criteria) this;
        }

        public Criteria andBookListOrderIsNotNull() {
            addCriterion("book_list_order is not null");
            return (Criteria) this;
        }

        public Criteria andBookListOrderEqualTo(String value) {
            addCriterion("book_list_order =", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderNotEqualTo(String value) {
            addCriterion("book_list_order <>", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderGreaterThan(String value) {
            addCriterion("book_list_order >", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderGreaterThanOrEqualTo(String value) {
            addCriterion("book_list_order >=", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderLessThan(String value) {
            addCriterion("book_list_order <", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderLessThanOrEqualTo(String value) {
            addCriterion("book_list_order <=", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderLike(String value) {
            addCriterion("book_list_order like", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderNotLike(String value) {
            addCriterion("book_list_order not like", value, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderIn(List<String> values) {
            addCriterion("book_list_order in", values, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderNotIn(List<String> values) {
            addCriterion("book_list_order not in", values, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderBetween(String value1, String value2) {
            addCriterion("book_list_order between", value1, value2, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andBookListOrderNotBetween(String value1, String value2) {
            addCriterion("book_list_order not between", value1, value2, "bookListOrder");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeIsNull() {
            addCriterion("start_level_code is null");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeIsNotNull() {
            addCriterion("start_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeEqualTo(String value) {
            addCriterion("start_level_code =", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeNotEqualTo(String value) {
            addCriterion("start_level_code <>", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeGreaterThan(String value) {
            addCriterion("start_level_code >", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("start_level_code >=", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeLessThan(String value) {
            addCriterion("start_level_code <", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("start_level_code <=", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeLike(String value) {
            addCriterion("start_level_code like", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeNotLike(String value) {
            addCriterion("start_level_code not like", value, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeIn(List<String> values) {
            addCriterion("start_level_code in", values, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeNotIn(List<String> values) {
            addCriterion("start_level_code not in", values, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeBetween(String value1, String value2) {
            addCriterion("start_level_code between", value1, value2, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andStartLevelCodeNotBetween(String value1, String value2) {
            addCriterion("start_level_code not between", value1, value2, "startLevelCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNull() {
            addCriterion("brand_code is null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNotNull() {
            addCriterion("brand_code is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(String value) {
            addCriterion("brand_code =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(String value) {
            addCriterion("brand_code <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(String value) {
            addCriterion("brand_code >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(String value) {
            addCriterion("brand_code >=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(String value) {
            addCriterion("brand_code <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(String value) {
            addCriterion("brand_code <=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLike(String value) {
            addCriterion("brand_code like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotLike(String value) {
            addCriterion("brand_code not like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIn(List<String> values) {
            addCriterion("brand_code in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<String> values) {
            addCriterion("brand_code not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(String value1, String value2) {
            addCriterion("brand_code between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(String value1, String value2) {
            addCriterion("brand_code not between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCompreScoreIsNull() {
            addCriterion("compre_score is null");
            return (Criteria) this;
        }

        public Criteria andCompreScoreIsNotNull() {
            addCriterion("compre_score is not null");
            return (Criteria) this;
        }

        public Criteria andCompreScoreEqualTo(String value) {
            addCriterion("compre_score =", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreNotEqualTo(String value) {
            addCriterion("compre_score <>", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreGreaterThan(String value) {
            addCriterion("compre_score >", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreGreaterThanOrEqualTo(String value) {
            addCriterion("compre_score >=", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreLessThan(String value) {
            addCriterion("compre_score <", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreLessThanOrEqualTo(String value) {
            addCriterion("compre_score <=", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreLike(String value) {
            addCriterion("compre_score like", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreNotLike(String value) {
            addCriterion("compre_score not like", value, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreIn(List<String> values) {
            addCriterion("compre_score in", values, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreNotIn(List<String> values) {
            addCriterion("compre_score not in", values, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreBetween(String value1, String value2) {
            addCriterion("compre_score between", value1, value2, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCompreScoreNotBetween(String value1, String value2) {
            addCriterion("compre_score not between", value1, value2, "compreScore");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andManageTypeIsNull() {
            addCriterion("manage_type is null");
            return (Criteria) this;
        }

        public Criteria andManageTypeIsNotNull() {
            addCriterion("manage_type is not null");
            return (Criteria) this;
        }

        public Criteria andManageTypeEqualTo(String value) {
            addCriterion("manage_type =", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotEqualTo(String value) {
            addCriterion("manage_type <>", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeGreaterThan(String value) {
            addCriterion("manage_type >", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("manage_type >=", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLessThan(String value) {
            addCriterion("manage_type <", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLessThanOrEqualTo(String value) {
            addCriterion("manage_type <=", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLike(String value) {
            addCriterion("manage_type like", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotLike(String value) {
            addCriterion("manage_type not like", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeIn(List<String> values) {
            addCriterion("manage_type in", values, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotIn(List<String> values) {
            addCriterion("manage_type not in", values, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeBetween(String value1, String value2) {
            addCriterion("manage_type between", value1, value2, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotBetween(String value1, String value2) {
            addCriterion("manage_type not between", value1, value2, "manageType");
            return (Criteria) this;
        }

        public Criteria andPairPicIsNull() {
            addCriterion("pair_pic is null");
            return (Criteria) this;
        }

        public Criteria andPairPicIsNotNull() {
            addCriterion("pair_pic is not null");
            return (Criteria) this;
        }

        public Criteria andPairPicEqualTo(String value) {
            addCriterion("pair_pic =", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicNotEqualTo(String value) {
            addCriterion("pair_pic <>", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicGreaterThan(String value) {
            addCriterion("pair_pic >", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicGreaterThanOrEqualTo(String value) {
            addCriterion("pair_pic >=", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicLessThan(String value) {
            addCriterion("pair_pic <", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicLessThanOrEqualTo(String value) {
            addCriterion("pair_pic <=", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicLike(String value) {
            addCriterion("pair_pic like", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicNotLike(String value) {
            addCriterion("pair_pic not like", value, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicIn(List<String> values) {
            addCriterion("pair_pic in", values, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicNotIn(List<String> values) {
            addCriterion("pair_pic not in", values, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicBetween(String value1, String value2) {
            addCriterion("pair_pic between", value1, value2, "pairPic");
            return (Criteria) this;
        }

        public Criteria andPairPicNotBetween(String value1, String value2) {
            addCriterion("pair_pic not between", value1, value2, "pairPic");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(String value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(String value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(String value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(String value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(String value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLike(String value) {
            addCriterion("app_type like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotLike(String value) {
            addCriterion("app_type not like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<String> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<String> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(String value1, String value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(String value1, String value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckIsNull() {
            addCriterion("online_check is null");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckIsNotNull() {
            addCriterion("online_check is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckEqualTo(String value) {
            addCriterion("online_check =", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckNotEqualTo(String value) {
            addCriterion("online_check <>", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckGreaterThan(String value) {
            addCriterion("online_check >", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckGreaterThanOrEqualTo(String value) {
            addCriterion("online_check >=", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckLessThan(String value) {
            addCriterion("online_check <", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckLessThanOrEqualTo(String value) {
            addCriterion("online_check <=", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckLike(String value) {
            addCriterion("online_check like", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckNotLike(String value) {
            addCriterion("online_check not like", value, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckIn(List<String> values) {
            addCriterion("online_check in", values, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckNotIn(List<String> values) {
            addCriterion("online_check not in", values, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckBetween(String value1, String value2) {
            addCriterion("online_check between", value1, value2, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andOnlineCheckNotBetween(String value1, String value2) {
            addCriterion("online_check not between", value1, value2, "onlineCheck");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andArea1IsNull() {
            addCriterion("area1 is null");
            return (Criteria) this;
        }

        public Criteria andArea1IsNotNull() {
            addCriterion("area1 is not null");
            return (Criteria) this;
        }

        public Criteria andArea1EqualTo(String value) {
            addCriterion("area1 =", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotEqualTo(String value) {
            addCriterion("area1 <>", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1GreaterThan(String value) {
            addCriterion("area1 >", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1GreaterThanOrEqualTo(String value) {
            addCriterion("area1 >=", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1LessThan(String value) {
            addCriterion("area1 <", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1LessThanOrEqualTo(String value) {
            addCriterion("area1 <=", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1Like(String value) {
            addCriterion("area1 like", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotLike(String value) {
            addCriterion("area1 not like", value, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1In(List<String> values) {
            addCriterion("area1 in", values, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotIn(List<String> values) {
            addCriterion("area1 not in", values, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1Between(String value1, String value2) {
            addCriterion("area1 between", value1, value2, "area1");
            return (Criteria) this;
        }

        public Criteria andArea1NotBetween(String value1, String value2) {
            addCriterion("area1 not between", value1, value2, "area1");
            return (Criteria) this;
        }

        public Criteria andArea2IsNull() {
            addCriterion("area2 is null");
            return (Criteria) this;
        }

        public Criteria andArea2IsNotNull() {
            addCriterion("area2 is not null");
            return (Criteria) this;
        }

        public Criteria andArea2EqualTo(String value) {
            addCriterion("area2 =", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotEqualTo(String value) {
            addCriterion("area2 <>", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2GreaterThan(String value) {
            addCriterion("area2 >", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2GreaterThanOrEqualTo(String value) {
            addCriterion("area2 >=", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2LessThan(String value) {
            addCriterion("area2 <", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2LessThanOrEqualTo(String value) {
            addCriterion("area2 <=", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2Like(String value) {
            addCriterion("area2 like", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotLike(String value) {
            addCriterion("area2 not like", value, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2In(List<String> values) {
            addCriterion("area2 in", values, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotIn(List<String> values) {
            addCriterion("area2 not in", values, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2Between(String value1, String value2) {
            addCriterion("area2 between", value1, value2, "area2");
            return (Criteria) this;
        }

        public Criteria andArea2NotBetween(String value1, String value2) {
            addCriterion("area2 not between", value1, value2, "area2");
            return (Criteria) this;
        }

        public Criteria andZoneCodeIsNull() {
            addCriterion("zone_code is null");
            return (Criteria) this;
        }

        public Criteria andZoneCodeIsNotNull() {
            addCriterion("zone_code is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCodeEqualTo(String value) {
            addCriterion("zone_code =", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotEqualTo(String value) {
            addCriterion("zone_code <>", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeGreaterThan(String value) {
            addCriterion("zone_code >", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zone_code >=", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeLessThan(String value) {
            addCriterion("zone_code <", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeLessThanOrEqualTo(String value) {
            addCriterion("zone_code <=", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeLike(String value) {
            addCriterion("zone_code like", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotLike(String value) {
            addCriterion("zone_code not like", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeIn(List<String> values) {
            addCriterion("zone_code in", values, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotIn(List<String> values) {
            addCriterion("zone_code not in", values, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeBetween(String value1, String value2) {
            addCriterion("zone_code between", value1, value2, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotBetween(String value1, String value2) {
            addCriterion("zone_code not between", value1, value2, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNull() {
            addCriterion("customer_manager is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNotNull() {
            addCriterion("customer_manager is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerEqualTo(String value) {
            addCriterion("customer_manager =", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotEqualTo(String value) {
            addCriterion("customer_manager <>", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThan(String value) {
            addCriterion("customer_manager >", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager >=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThan(String value) {
            addCriterion("customer_manager <", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThanOrEqualTo(String value) {
            addCriterion("customer_manager <=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLike(String value) {
            addCriterion("customer_manager like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotLike(String value) {
            addCriterion("customer_manager not like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIn(List<String> values) {
            addCriterion("customer_manager in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotIn(List<String> values) {
            addCriterion("customer_manager not in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerBetween(String value1, String value2) {
            addCriterion("customer_manager between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotBetween(String value1, String value2) {
            addCriterion("customer_manager not between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLike(String value) {
            addCriterion("wechat_name like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andPmsBrandIsNull() {
            addCriterion("pms_brand is null");
            return (Criteria) this;
        }

        public Criteria andPmsBrandIsNotNull() {
            addCriterion("pms_brand is not null");
            return (Criteria) this;
        }

        public Criteria andPmsBrandEqualTo(String value) {
            addCriterion("pms_brand =", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandNotEqualTo(String value) {
            addCriterion("pms_brand <>", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandGreaterThan(String value) {
            addCriterion("pms_brand >", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandGreaterThanOrEqualTo(String value) {
            addCriterion("pms_brand >=", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandLessThan(String value) {
            addCriterion("pms_brand <", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandLessThanOrEqualTo(String value) {
            addCriterion("pms_brand <=", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandLike(String value) {
            addCriterion("pms_brand like", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandNotLike(String value) {
            addCriterion("pms_brand not like", value, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandIn(List<String> values) {
            addCriterion("pms_brand in", values, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandNotIn(List<String> values) {
            addCriterion("pms_brand not in", values, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandBetween(String value1, String value2) {
            addCriterion("pms_brand between", value1, value2, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andPmsBrandNotBetween(String value1, String value2) {
            addCriterion("pms_brand not between", value1, value2, "pmsBrand");
            return (Criteria) this;
        }

        public Criteria andResrvSyncIsNull() {
            addCriterion("resrv_sync is null");
            return (Criteria) this;
        }

        public Criteria andResrvSyncIsNotNull() {
            addCriterion("resrv_sync is not null");
            return (Criteria) this;
        }

        public Criteria andResrvSyncEqualTo(String value) {
            addCriterion("resrv_sync =", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncNotEqualTo(String value) {
            addCriterion("resrv_sync <>", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncGreaterThan(String value) {
            addCriterion("resrv_sync >", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncGreaterThanOrEqualTo(String value) {
            addCriterion("resrv_sync >=", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncLessThan(String value) {
            addCriterion("resrv_sync <", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncLessThanOrEqualTo(String value) {
            addCriterion("resrv_sync <=", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncLike(String value) {
            addCriterion("resrv_sync like", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncNotLike(String value) {
            addCriterion("resrv_sync not like", value, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncIn(List<String> values) {
            addCriterion("resrv_sync in", values, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncNotIn(List<String> values) {
            addCriterion("resrv_sync not in", values, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncBetween(String value1, String value2) {
            addCriterion("resrv_sync between", value1, value2, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncNotBetween(String value1, String value2) {
            addCriterion("resrv_sync not between", value1, value2, "resrvSync");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeIsNull() {
            addCriterion("resrv_sync_type is null");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeIsNotNull() {
            addCriterion("resrv_sync_type is not null");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeEqualTo(String value) {
            addCriterion("resrv_sync_type =", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeNotEqualTo(String value) {
            addCriterion("resrv_sync_type <>", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeGreaterThan(String value) {
            addCriterion("resrv_sync_type >", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resrv_sync_type >=", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeLessThan(String value) {
            addCriterion("resrv_sync_type <", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeLessThanOrEqualTo(String value) {
            addCriterion("resrv_sync_type <=", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeLike(String value) {
            addCriterion("resrv_sync_type like", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeNotLike(String value) {
            addCriterion("resrv_sync_type not like", value, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeIn(List<String> values) {
            addCriterion("resrv_sync_type in", values, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeNotIn(List<String> values) {
            addCriterion("resrv_sync_type not in", values, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeBetween(String value1, String value2) {
            addCriterion("resrv_sync_type between", value1, value2, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andResrvSyncTypeNotBetween(String value1, String value2) {
            addCriterion("resrv_sync_type not between", value1, value2, "resrvSyncType");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("star_level is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("star_level is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(String value) {
            addCriterion("star_level =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(String value) {
            addCriterion("star_level <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(String value) {
            addCriterion("star_level >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("star_level >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(String value) {
            addCriterion("star_level <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(String value) {
            addCriterion("star_level <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(String value) {
            addCriterion("star_level like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(String value) {
            addCriterion("star_level not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<String> values) {
            addCriterion("star_level in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<String> values) {
            addCriterion("star_level not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(String value1, String value2) {
            addCriterion("star_level between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(String value1, String value2) {
            addCriterion("star_level not between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(BigDecimal value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(BigDecimal value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(BigDecimal value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<BigDecimal> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeIsNull() {
            addCriterion("hotel_longitude is null");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeIsNotNull() {
            addCriterion("hotel_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeEqualTo(BigDecimal value) {
            addCriterion("hotel_longitude =", value, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("hotel_longitude <>", value, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeGreaterThan(BigDecimal value) {
            addCriterion("hotel_longitude >", value, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hotel_longitude >=", value, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeLessThan(BigDecimal value) {
            addCriterion("hotel_longitude <", value, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hotel_longitude <=", value, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeIn(List<BigDecimal> values) {
            addCriterion("hotel_longitude in", values, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("hotel_longitude not in", values, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hotel_longitude between", value1, value2, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hotel_longitude not between", value1, value2, "hotelLongitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeIsNull() {
            addCriterion("hotel_latitude is null");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeIsNotNull() {
            addCriterion("hotel_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeEqualTo(BigDecimal value) {
            addCriterion("hotel_latitude =", value, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("hotel_latitude <>", value, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeGreaterThan(BigDecimal value) {
            addCriterion("hotel_latitude >", value, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hotel_latitude >=", value, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeLessThan(BigDecimal value) {
            addCriterion("hotel_latitude <", value, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hotel_latitude <=", value, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeIn(List<BigDecimal> values) {
            addCriterion("hotel_latitude in", values, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("hotel_latitude not in", values, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hotel_latitude between", value1, value2, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andHotelLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hotel_latitude not between", value1, value2, "hotelLatitude");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateIsNull() {
            addCriterion("renovation_date is null");
            return (Criteria) this;
        }

        public Criteria andRenovationDateIsNotNull() {
            addCriterion("renovation_date is not null");
            return (Criteria) this;
        }

        public Criteria andRenovationDateEqualTo(Date value) {
            addCriterion("renovation_date =", value, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateNotEqualTo(Date value) {
            addCriterion("renovation_date <>", value, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateGreaterThan(Date value) {
            addCriterion("renovation_date >", value, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("renovation_date >=", value, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateLessThan(Date value) {
            addCriterion("renovation_date <", value, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateLessThanOrEqualTo(Date value) {
            addCriterion("renovation_date <=", value, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateIn(List<Date> values) {
            addCriterion("renovation_date in", values, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateNotIn(List<Date> values) {
            addCriterion("renovation_date not in", values, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateBetween(Date value1, Date value2) {
            addCriterion("renovation_date between", value1, value2, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andRenovationDateNotBetween(Date value1, Date value2) {
            addCriterion("renovation_date not between", value1, value2, "renovationDate");
            return (Criteria) this;
        }

        public Criteria andLandMarkIsNull() {
            addCriterion("land_mark is null");
            return (Criteria) this;
        }

        public Criteria andLandMarkIsNotNull() {
            addCriterion("land_mark is not null");
            return (Criteria) this;
        }

        public Criteria andLandMarkEqualTo(String value) {
            addCriterion("land_mark =", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkNotEqualTo(String value) {
            addCriterion("land_mark <>", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkGreaterThan(String value) {
            addCriterion("land_mark >", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkGreaterThanOrEqualTo(String value) {
            addCriterion("land_mark >=", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkLessThan(String value) {
            addCriterion("land_mark <", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkLessThanOrEqualTo(String value) {
            addCriterion("land_mark <=", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkLike(String value) {
            addCriterion("land_mark like", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkNotLike(String value) {
            addCriterion("land_mark not like", value, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkIn(List<String> values) {
            addCriterion("land_mark in", values, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkNotIn(List<String> values) {
            addCriterion("land_mark not in", values, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkBetween(String value1, String value2) {
            addCriterion("land_mark between", value1, value2, "landMark");
            return (Criteria) this;
        }

        public Criteria andLandMarkNotBetween(String value1, String value2) {
            addCriterion("land_mark not between", value1, value2, "landMark");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andPromotionTagIsNull() {
            addCriterion("promotion_tag is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTagIsNotNull() {
            addCriterion("promotion_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTagEqualTo(String value) {
            addCriterion("promotion_tag =", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagNotEqualTo(String value) {
            addCriterion("promotion_tag <>", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagGreaterThan(String value) {
            addCriterion("promotion_tag >", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_tag >=", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagLessThan(String value) {
            addCriterion("promotion_tag <", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagLessThanOrEqualTo(String value) {
            addCriterion("promotion_tag <=", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagLike(String value) {
            addCriterion("promotion_tag like", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagNotLike(String value) {
            addCriterion("promotion_tag not like", value, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagIn(List<String> values) {
            addCriterion("promotion_tag in", values, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagNotIn(List<String> values) {
            addCriterion("promotion_tag not in", values, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagBetween(String value1, String value2) {
            addCriterion("promotion_tag between", value1, value2, "promotionTag");
            return (Criteria) this;
        }

        public Criteria andPromotionTagNotBetween(String value1, String value2) {
            addCriterion("promotion_tag not between", value1, value2, "promotionTag");
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