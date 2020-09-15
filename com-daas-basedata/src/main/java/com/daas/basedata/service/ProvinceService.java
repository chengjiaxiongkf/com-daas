package com.daas.basedata.service;

import com.daas.basedata.dto.ProvinceDTO;
import com.daas.basedata.vo.ProvinceVO;

import java.util.List;

public interface ProvinceService {
    List<ProvinceVO> getProvinceByPage(String startSize, String endSize, ProvinceVO provinceVO) throws Exception;

    int getProvinceByTotal(ProvinceVO provinceVO) throws Exception;
}