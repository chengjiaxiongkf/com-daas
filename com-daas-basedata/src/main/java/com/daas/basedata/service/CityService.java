package com.daas.basedata.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.vo.CityVO;

public interface CityService {
    Page getCityByPage(Page page,CityVO CityVO) throws Exception;

    CityVO getCityById(String id) throws Exception;

    int insertCity(CityVO CityVO) throws Exception;

    int updateCityById(CityVO CityVO) throws Exception;

    int deleteCityById(String id) throws Exception;
}