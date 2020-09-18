package com.daas.basedata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daas.basedata.dto.AreaDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaMapper extends BaseMapper<AreaDTO> {
}