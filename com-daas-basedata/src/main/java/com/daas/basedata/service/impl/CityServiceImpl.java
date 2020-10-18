package com.daas.basedata.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.util.BeanMapper;
import com.daas.basedata.mapper.CityMapper;
import com.daas.basedata.service.CityService;
import com.daas.basedata.vo.CityVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:16
 */
@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public Page getCityByPage(Page page,CityVO cityVO)  {
        QueryWrapper queryWrapper =  new QueryWrapper();
        queryWrapper.eq("city_code",cityVO.getCityCode());
        queryWrapper.likeRight("city_name",cityVO.getCityName());
        return cityMapper.selectPage(page,queryWrapper);
    }

    @Override
    public CityVO getCityById(String id)  {
        return BeanMapper.convert(cityMapper.selectById(id),CityVO.class);
    }

    @Override
    public int insertCity(CityVO cityVO)  {
        return cityMapper.insert(cityVO);
    }

    @Override
    public int updateCityById(CityVO cityVO)  {
        return cityMapper.updateById(cityVO);
    }

    @Override
    public int deleteCityById(String id)  {
        return cityMapper.deleteById(id);
    }
}
