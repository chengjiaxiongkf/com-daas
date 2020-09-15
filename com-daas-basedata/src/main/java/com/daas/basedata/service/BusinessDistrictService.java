package com.daas.basedata.service;

import com.daas.basedata.dto.BusinessDistrictDTO;

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
    int insert(BusinessDistrictDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(BusinessDistrictDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    BusinessDistrictDTO selectByPrimaryKey(String businessDistrictCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(BusinessDistrictDTO record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(BusinessDistrictDTO record);
}