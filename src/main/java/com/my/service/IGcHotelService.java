package com.my.service;

import com.my.entity.GcHotel;

import java.util.List;

/**
 * @author jyt
 * @date 2018/6/25 下午2:44
 */
public interface IGcHotelService {

    List<GcHotel> getHotelCode(String hotelGroupCode);
}
