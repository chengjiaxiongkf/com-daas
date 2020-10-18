package com.daas.basedata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daas.basedata.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 14:49
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDTO>  {
}
