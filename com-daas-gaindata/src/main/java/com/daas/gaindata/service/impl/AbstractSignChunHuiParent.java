package com.daas.gaindata.service.impl;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.gaindata.mapper.SignMapper;
import com.daas.gaindata.service.SignHandle;
import com.daas.gaindata.vo.SignVO;

import javax.annotation.Resource;
import java.io.File;

/**
 * 春晖智慧签到
 * @author v_jxjxcheng
 * @date 2020-10-15 10:39
 */
public abstract class AbstractSignChunHuiParent implements SignHandle {
    protected abstract void importSignByFile(File file);
    protected abstract void importSignByFileName(String fileName);

    @Resource
    private SignMapper signMapper;

    @Override
    public <T> ResultPageVO<T> getSignList(T t) {
        return signMapper.getSignList((SignVO) t);
    }
}
