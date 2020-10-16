package com.daas.gaindata.service;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;

/**
 * 签到
 * @author v_jxjxcheng
 * @date 2020-10-15 10:36
 */
public interface SignHandle {
    /**
     * 签到
     * @return
     */
    ResultVO sign();

    /**
     *  获取签到列表
     */
    <T> ResultPageVO<T> getSignList(T t);
}
