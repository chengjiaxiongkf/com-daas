package com.daas.basedata.service.impl;

import com.daas.basedata.dto.Area;
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
    public int insert(Area record) {
        return 0;
    }

    @Override
    public int insertSelective(Area record) {
        return 0;
    }

    @Override
    public Area selectByPrimaryKey(String areaCode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Area record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Area record) {
        return 0;
    }
}
