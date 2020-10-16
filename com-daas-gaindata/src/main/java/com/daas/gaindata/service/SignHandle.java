package com.daas.gaindata.service;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import com.daas.gaindata.vo.SignVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    <T> ResultVO sign(T t);

    /**
     *  获取签到列表
     */
    ResultPageVO<SignVO> getSignList(SignVO signVO);

    /**
     * 导出签到数据
     * @param list
     */
    void exportSignList(List<SignVO> list, HttpServletResponse httpServletResponse);
}
