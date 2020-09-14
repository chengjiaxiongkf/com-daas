package com.daas.basedata.service;

import com.daas.basedata.dto.Area;
import org.apache.ibatis.annotations.Mapper;

public interface AreaService {
    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int deleteByPrimaryKey(String areaCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insert(Area record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(Area record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    Area selectByPrimaryKey(String areaCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(Area record);
}