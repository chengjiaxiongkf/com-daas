package com.daas.basedata.service;

import com.daas.basedata.dto.Province;
import com.daas.commmon.dto.ResultDataDto;

import java.util.List;

public interface ProvinceService {
    ResultDataDto<List<Province>> getProvinceByPage(Province province) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int deleteByPrimaryKey(String provinceCode) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insert(Province record) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int insertSelective(Province record) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    Province selectByPrimaryKey(String provinceCode) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKeySelective(Province record) throws Exception;

    /**
     *
     * @ https://blog.csdn.net/caiqing116 2020-09-13
     */
    int updateByPrimaryKey(Province record) throws Exception;
}