package com.daas.basedata.mapper;

import com.daas.basedata.dto.ProvinceDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProvinceMapper {

    List<ProvinceDTO> getProvinceByPage(ProvinceDTO provinceDTO) throws Exception;

    int getProvinceByTotal(ProvinceDTO provinceDTO) throws Exception;

    int deleteByPrimaryKey(String provinceCode) throws Exception;

    int insert(ProvinceDTO record) throws Exception;

    int insertSelective(ProvinceDTO record) throws Exception;

    ProvinceDTO selectByPrimaryKey(String provinceCode) throws Exception;

    int updateByPrimaryKeySelective(ProvinceDTO record) throws Exception;

    int updateByPrimaryKey(ProvinceDTO record) throws Exception;
}