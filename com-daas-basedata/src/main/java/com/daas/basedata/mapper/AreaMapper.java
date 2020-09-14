package com.daas.basedata.mapper;

import com.daas.basedata.dto.Area;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaMapper {
    int deleteByPrimaryKey(String areaCode);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String areaCode);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}