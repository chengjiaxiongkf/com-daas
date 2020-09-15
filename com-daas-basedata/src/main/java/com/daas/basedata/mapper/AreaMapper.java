package com.daas.basedata.mapper;

import com.daas.basedata.dto.AreaDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaMapper {
    int deleteByPrimaryKey(String areaCode);

    int insert(AreaDTO record);

    int insertSelective(AreaDTO record);

    AreaDTO selectByPrimaryKey(String areaCode);

    int updateByPrimaryKeySelective(AreaDTO record);

    int updateByPrimaryKey(AreaDTO record);
}