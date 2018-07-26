package com.my.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.my.service.IGcHotelGroupService;
import com.my.service.IGcHotelService;

import javax.annotation.Resource;

/**
 * @author jyt
 * @date 2018/6/25 下午2:40
 */
@RestController
@RequestMapping("/multi")
public class MultiThreadController {

    @Resource
    private IGcHotelGroupService gcHotelGroupService;
    @Resource
    private IGcHotelService gcHotelService;
    public String getHotelBySingleThread()
    {

        return "";
    }


}
