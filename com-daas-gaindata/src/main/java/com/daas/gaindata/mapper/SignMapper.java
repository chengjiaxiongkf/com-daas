package com.daas.gaindata.mapper;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.gaindata.vo.SignVO;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 11:20
 */
public interface SignMapper {
    ResultPageVO getSignList(SignVO signDto);
}
