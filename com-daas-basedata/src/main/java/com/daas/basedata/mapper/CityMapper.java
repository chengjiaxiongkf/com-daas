package com.daas.basedata.mapper;

import com.daas.basedata.dto.CityDTO;
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
    int insert(CityDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(CityDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    CityDTO selectByPrimaryKey(String cityCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(CityDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(CityDTO record);
}