package com.daas.basedata.service;

import com.daas.basedata.dto.City;
import org.apache.ibatis.annotations.Mapper;

public interface CityService {
    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int deleteByPrimaryKey(String cityCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insert(City record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(City record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    City selectByPrimaryKey(String cityCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(City record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(City record);
}