package com.daas.basedata.service.impl;

import com.daas.basedata.dto.AreaDTO;
import com.daas.basedata.service.AreaService;
import org.springframework.stereotype.Service;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:16
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Override
    public int deleteByPrimaryKey(String areaCode) {
        return 0;
    }

    @Override
    public int insert(AreaDTO record) {
        return 0;
    }

    @Override
    public int insertSelective(AreaDTO record) {
        return 0;
    }

    @Override
    public AreaDTO selectByPrimaryKey(String areaCode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AreaDTO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AreaDTO record) {
        return 0;
    }
}
