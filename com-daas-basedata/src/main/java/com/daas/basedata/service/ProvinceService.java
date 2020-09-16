package com.daas.basedata.service;

import com.daas.basedata.dto.ProvinceDTO;
import com.daas.basedata.vo.ProvinceVO;

import java.util.List;

public interface ProvinceService {
    List<ProvinceVO> getProvinceByPage(ProvinceVO provinceVO) throws Exception;

    int getProvinceTotal(ProvinceVO provinceVO) throws Exception;
}