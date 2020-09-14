package com.daas.basedata.service;

import com.daas.basedata.dto.BusinessDistrict;
import org.apache.ibatis.annotations.Mapper;

public interface BusinessDistrictService {
    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int deleteByPrimaryKey(String businessDistrictCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insert(BusinessDistrict record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(BusinessDistrict record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    BusinessDistrict selectByPrimaryKey(String businessDistrictCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(BusinessDistrict record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(BusinessDistrict record);
}