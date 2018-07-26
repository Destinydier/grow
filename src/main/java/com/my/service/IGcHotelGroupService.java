package com.my.service;

import com.my.entity.GcHotelGroup;

import java.util.List;

/**
 * @author jyt
 * @date 2018/6/25 下午2:44
 */
public interface IGcHotelGroupService {
    List<GcHotelGroup> getGroupCodeByExample(GcHotelGroup gcHotelGroup);
}
