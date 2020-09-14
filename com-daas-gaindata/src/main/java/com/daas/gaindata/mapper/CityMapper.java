package com.daas.gaindata.mapper;

import com.daas.gaindata.dto.CityDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int deleteByPrimaryKey(String cityCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insert(CityDto record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(CityDto record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    CityDto selectByPrimaryKey(String cityCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(CityDto record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(CityDto record);
}