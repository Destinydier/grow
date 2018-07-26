package com.my.service.impl;

import com.my.dao.GcHotelMapper;
import com.my.entity.GcHotel;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.my.service.IGcHotelService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyt
 * @date 2018/6/25 下午2:35
 */
@Service
@ComponentScan
public class GcHotelServiceImpl implements IGcHotelService {

    @Resource
    private GcHotelMapper gcHotelMapper;

    @Override
    public List<GcHotel> getHotelCode(String hotelGroupCode)
    {
        return gcHotelMapper.selectCodeAndDes(hotelGroupCode);
    }
}
