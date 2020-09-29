package com.daas.basedata.service;

import com.daas.basedata.vo.ProvinceVO;

import java.util.List;

public interface ProvinceService {
    List<ProvinceVO> getProvinceByPage(ProvinceVO provinceVO) throws Exception;

    Long getProvinceTotal(ProvinceVO provinceVO) throws Exception;

    ProvinceVO getProvinceById(String id) throws Exception;

    int insertProvince(ProvinceVO provinceVO) throws Exception;

    int updateProvinceById(ProvinceVO provinceVO) throws Exception;

    int deleteProvinceById(String id) throws Exception;
}