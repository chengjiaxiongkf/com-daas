package com.daas.basedata.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.constant.BeanMapper;
import com.daas.basedata.dto.AreaDTO;
import com.daas.basedata.mapper.AreaMapper;
import com.daas.basedata.service.AreaService;
import com.daas.basedata.vo.AreaVO;
import com.daas.basedata.vo.CityVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:16
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaMapper areaMapper;

    @Override
    public Page getAreaByPage(Page page,AreaVO areaVO) {
        QueryWrapper queryWrapper =  new QueryWrapper();
        queryWrapper.eq("area_code",areaVO.getAreaCode());
        queryWrapper.likeRight("area_name",areaVO.getAreaName());
        return areaMapper.selectPage(page,queryWrapper);
    }

    @Override
    public AreaVO getAreaById(String id) {
        return (AreaVO)BeanMapper.convert(areaMapper.selectById(id),AreaVO.class);
    }

    @Override
    public int insertArea(AreaVO areaVO) {
        return areaMapper.insert(areaVO);
    }

    @Override
    public int updateAreaById(AreaVO areaVO) {
        return areaMapper.updateById(areaVO);
    }

    @Override
    public int deleteAreaById(String id) {
        return areaMapper.deleteById(id);
    }
}
