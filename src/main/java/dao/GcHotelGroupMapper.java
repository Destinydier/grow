package dao;

import entity.GcHotelGroup;
import entity.GcHotelGroupExample;
import entity.GcHotelGroupWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GcHotelGroupMapper {
    int countByExample(GcHotelGroupExample example);

    int deleteByExample(GcHotelGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GcHotelGroupWithBLOBs record);

    int insertSelective(GcHotelGroupWithBLOBs record);

    List<GcHotelGroupWithBLOBs> selectByExampleWithBLOBs(GcHotelGroupExample example);

    List<GcHotelGroup> selectByExample(GcHotelGroupExample example);

    GcHotelGroupWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GcHotelGroupWithBLOBs record, @Param("example") GcHotelGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") GcHotelGroupWithBLOBs record, @Param("example") GcHotelGroupExample example);

    int updateByExample(@Param("record") GcHotelGroup record, @Param("example") GcHotelGroupExample example);

    int updateByPrimaryKeySelective(GcHotelGroupWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GcHotelGroupWithBLOBs record);

    int updateByPrimaryKey(GcHotelGroup record);

    List<GcHotelGroup> selectCodeAndDes(GcHotelGroupExample example);
}