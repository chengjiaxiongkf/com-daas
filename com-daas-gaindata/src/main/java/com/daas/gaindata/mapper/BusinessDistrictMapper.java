package com.daas.gaindata.mapper;

import com.daas.gaindata.dto.BusinessDistrictDto;
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
    int insert(BusinessDistrictDto record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(BusinessDistrictDto record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    BusinessDistrictDto selectByPrimaryKey(String businessDistrictCode);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(BusinessDistrictDto record);

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(BusinessDistrictDto record);
}