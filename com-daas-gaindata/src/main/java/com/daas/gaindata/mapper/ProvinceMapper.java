package com.daas.gaindata.mapper;

import com.daas.gaindata.dto.ProvinceDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProvinceMapper {

    List<ProvinceDto> getProvinceByPage(ProvinceDto province) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int deleteByPrimaryKey(String provinceCode) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insert(ProvinceDto record) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(ProvinceDto record) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    ProvinceDto selectByPrimaryKey(String provinceCode) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(ProvinceDto record) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(ProvinceDto record) throws Exception;
}