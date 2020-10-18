package com.daas.basedata.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.util.BeanMapper;
import com.daas.basedata.mapper.BusinessDistrictMapper;
import com.daas.basedata.service.BusinessDistrictService;
import com.daas.basedata.vo.BusinessDistrictVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:16
 */
@Service
public class BusinessDistrictServiceImpl implements BusinessDistrictService {

    @Resource
    private BusinessDistrictMapper businessDistrictMapper;

    @Override
    public Page getBusinessDistrictByPage(Page page,BusinessDistrictVO businessDistrictVO) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("businessDistrictCode",businessDistrictVO.getBusinessDistrictCode());
        queryWrapper.likeRight("businessDistrictName",businessDistrictVO.getBusinessDistrictName());
        return businessDistrictMapper.selectPage(page,queryWrapper);
    }

    @Override
    public BusinessDistrictVO getBusinessDistrictById(String id) {
        return BeanMapper.convert(businessDistrictMapper.selectById(id),BusinessDistrictVO.class);
    }

    @Override
    public int insertBusinessDistrict(BusinessDistrictVO businessDistrictVO) {
        return businessDistrictMapper.insert(businessDistrictVO);
    }

    @Override
    public int updateBusinessDistrictById(BusinessDistrictVO businessDistrictVO) {
        return businessDistrictMapper.updateById(businessDistrictVO);
    }

    @Override
    public int deleteBusinessDistrictById(String id) {
        return businessDistrictMapper.deleteById(id);
    }
}
