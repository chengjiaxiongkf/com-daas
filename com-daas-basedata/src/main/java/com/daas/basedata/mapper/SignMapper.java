package com.daas.basedata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daas.basedata.dto.SignDTO;
import com.daas.basedata.vo.SignChunHuiVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 14:10
 */
@Mapper
public interface SignMapper extends BaseMapper<SignDTO> {
    List<SignChunHuiVO> getSignList(SignChunHuiVO signVO) throws Exception;
    int getSignTotal(SignChunHuiVO signVO) throws Exception;
}
