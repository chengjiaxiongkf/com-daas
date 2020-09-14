package com.daas.basedata.service.impl;

import com.daas.basedata.dto.BusinessDistrict;
import com.daas.basedata.service.BusinessDistrictService;
import org.springframework.stereotype.Service;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:16
 */
@Service
public class BusinessDistrictServiceImpl implements BusinessDistrictService {
    @Override
    public int deleteByPrimaryKey(String businessDistrictCode) {
        return 0;
    }

    @Override
    public int insert(BusinessDistrict record) {
        return 0;
    }

    @Override
    public int insertSelective(BusinessDistrict record) {
        return 0;
    }

    @Override
    public BusinessDistrict selectByPrimaryKey(String businessDistrictCode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessDistrict record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BusinessDistrict record) {
        return 0;
    }
}
