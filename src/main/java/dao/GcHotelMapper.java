package dao;

import entity.GcHotel;
import entity.GcHotelExample;
import entity.GcHotelWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GcHotelMapper {
    int countByExample(GcHotelExample example);

    int deleteByExample(GcHotelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GcHotelWithBLOBs record);

    int insertSelective(GcHotelWithBLOBs record);

    List<GcHotelWithBLOBs> selectByExampleWithBLOBs(GcHotelExample example);

    List<GcHotel> selectByExample(GcHotelExample example);

    GcHotelWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GcHotelWithBLOBs record, @Param("example") GcHotelExample example);

    int updateByExampleWithBLOBs(@Param("record") GcHotelWithBLOBs record, @Param("example") GcHotelExample example);

    int updateByExample(@Param("record") GcHotel record, @Param("example") GcHotelExample example);

    int updateByPrimaryKeySelective(GcHotelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GcHotelWithBLOBs record);

    int updateByPrimaryKey(GcHotel record);

    List<GcHotel> selectCodeAndDes(@Param("hotelGroupCode") String hotelGroupCode);
}