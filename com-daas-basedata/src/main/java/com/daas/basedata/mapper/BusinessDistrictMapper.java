package com.daas.basedata.mapper;

import com.daas.basedata.dto.BusinessDistrictDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessDistrictMapper {
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