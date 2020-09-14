package com.daas.gaindata.mapper;

import com.daas.gaindata.dto.AreaDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaMapper {
    int deleteByPrimaryKey(String areaCode);

    int insert(AreaDto record);

    int insertSelective(AreaDto record);

    AreaDto selectByPrimaryKey(String areaCode);

    int updateByPrimaryKeySelective(AreaDto record);

    int updateByPrimaryKey(AreaDto record);
}