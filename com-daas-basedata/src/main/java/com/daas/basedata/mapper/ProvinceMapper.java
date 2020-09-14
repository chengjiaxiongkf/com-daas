package com.daas.basedata.mapper;

import com.daas.basedata.dto.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProvinceMapper {

    List<Province> getProvinceByPage(Province province) throws Exception;

    int getProvinceByPageTotle(Province province) throws Exception;

    int deleteByPrimaryKey(String provinceCode) throws Exception;

    int insert(Province record) throws Exception;

    int insertSelective(Province record) throws Exception;

    Province selectByPrimaryKey(String provinceCode) throws Exception;

    int updateByPrimaryKeySelective(Province record) throws Exception;

    int updateByPrimaryKey(Province record) throws Exception;
}