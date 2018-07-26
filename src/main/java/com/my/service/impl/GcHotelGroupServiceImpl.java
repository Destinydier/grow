package com.my.service.impl;

import com.my.dao.GcHotelGroupMapper;
import com.my.entity.GcHotelGroup;
import com.my.entity.GcHotelGroupExample;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.my.service.IGcHotelGroupService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyt
 * @date 2018/6/25 下午2:02
 */
@Service
public class GcHotelGroupServiceImpl implements IGcHotelGroupService {

    @Resource
    private GcHotelGroupMapper gcHotelGroupMapper;

    @Override
    public List<GcHotelGroup> getGroupCodeByExample(GcHotelGroup gcHotelGroup)
    {
        GcHotelGroupExample example = new GcHotelGroupExample();
        GcHotelGroupExample.Criteria c = example.createCriteria();

        return gcHotelGroupMapper.selectCodeAndDes(example);
    }
}
