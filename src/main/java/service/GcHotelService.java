package service;

import dao.GcHotelMapper;
import entity.GcHotel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyt
 * @date 2018/6/25 下午2:35
 */
@Service("gcHotelService")
public class GcHotelService implements IGcHotelService{

    @Resource
    private GcHotelMapper gcHotelMapper;

    @Override
    public List<GcHotel> getHotelCode(String hotelGroupCode)
    {
        return gcHotelMapper.selectCodeAndDes(hotelGroupCode);
    }
}
