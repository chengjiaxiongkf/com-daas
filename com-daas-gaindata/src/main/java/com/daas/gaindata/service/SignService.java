package com.daas.gaindata.service;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.gaindata.vo.SignVO;

import java.util.List;

/**
 * @author v_jxjxcheng
 * @date 2020-10-16 21:38
 */
public interface SignService {
    ResultPageVO getSignList(SignVO signVO);
    ResultPageVO exportSign(List<SignVO> list);
    int batchInsertSign(List<SignVO> list);
}
