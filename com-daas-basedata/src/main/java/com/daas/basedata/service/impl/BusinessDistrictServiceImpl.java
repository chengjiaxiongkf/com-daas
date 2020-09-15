package com.daas.basedata.service.impl;

import com.daas.basedata.dto.BusinessDistrictDTO;
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
    public int insert(BusinessDistrictDTO record) {
        return 0;
    }

    @Override
    public int insertSelective(BusinessDistrictDTO record) {
        return 0;
    }

    @Override
    public BusinessDistrictDTO selectByPrimaryKey(String businessDistrictCode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessDistrictDTO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BusinessDistrictDTO record) {
        return 0;
    }
}
