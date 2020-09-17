package com.daas.basedata.service;

import com.daas.basedata.vo.ProvinceVO;

import java.util.List;

public interface ProvinceService {
    List<ProvinceVO> getProvinceByPage(ProvinceVO provinceVO) throws Exception;

    int getProvinceTotal(ProvinceVO provinceVO) throws Exception;

    int insertProvince(ProvinceVO provinceVO) throws Exception;

    int updateProvince(ProvinceVO provinceVO) throws Exception;

    int deleteProvince(ProvinceVO provinceVO) throws Exception;
}