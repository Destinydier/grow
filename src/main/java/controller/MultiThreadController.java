package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.GcHotelGroupService;
import service.IGcHotelService;

import javax.annotation.Resource;

/**
 * @author jyt
 * @date 2018/6/25 下午2:40
 */
@RestController
@RequestMapping("/multi")
public class MultiThreadController {
    @Resource
    private IGcHotelService gcHotelService;

    public String getHotelBySingleThread()
    {

        return "";
    }
}
