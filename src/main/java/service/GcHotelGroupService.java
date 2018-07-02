package service;

import dao.GcHotelGroupMapper;
import entity.GcHotelGroup;
import entity.GcHotelGroupExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyt
 * @date 2018/6/25 下午2:02
 */
@Service
public class GcHotelGroupService implements IGcHotelGroupService {

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
