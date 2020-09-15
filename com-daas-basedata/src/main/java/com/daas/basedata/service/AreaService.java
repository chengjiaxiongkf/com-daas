package com.daas.basedata.service;

import com.daas.basedata.dto.AreaDTO;

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
    int insert(AreaDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(AreaDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    AreaDTO selectByPrimaryKey(String areaCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(AreaDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(AreaDTO record);
}