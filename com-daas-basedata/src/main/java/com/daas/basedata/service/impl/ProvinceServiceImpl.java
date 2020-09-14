package com.daas.basedata.service.impl;

import com.daas.basedata.dto.Province;
import com.daas.basedata.mapper.ProvinceMapper;
import com.daas.basedata.service.ProvinceService;
import com.daas.commmon.dto.ResultDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:17
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public ResultDataDto<List<Province>> getProvinceByPage(Province province) throws Exception {
        ResultDataDto resultDataDto = new ResultDataDto<>(provinceMapper.getProvinceByPage(province));
        resultDataDto.setTotle(provinceMapper.getProvinceByPageTotle(province));
        return resultDataDto;
    }

    @Override
    public int deleteByPrimaryKey(String provinceCode) throws Exception {
        return 0;
    }

    @Override
    public int insert(Province record)  throws Exception {
        return 0;
    }

    @Override
    public int insertSelective(Province record) throws Exception {
        return 0;
    }

    @Override
    public Province selectByPrimaryKey(String provinceCode) throws Exception {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Province record) throws Exception {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Province record) throws Exception {
        return 0;
    }
}
