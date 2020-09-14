package com.daas.basedata.service.impl;

import com.daas.basedata.dto.City;
import com.daas.basedata.service.CityService;
import org.springframework.stereotype.Service;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:16
 */
@Service
public class CityServiceImpl implements CityService {
    @Override
    public int deleteByPrimaryKey(String cityCode) {
        return 0;
    }

    @Override
    public int insert(City record) {
        return 0;
    }

    @Override
    public int insertSelective(City record) {
        return 0;
    }

    @Override
    public City selectByPrimaryKey(String cityCode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return 0;
    }
}
