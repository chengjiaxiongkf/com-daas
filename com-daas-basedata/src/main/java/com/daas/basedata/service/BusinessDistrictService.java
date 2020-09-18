package com.daas.basedata.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.vo.BusinessDistrictVO;

public interface BusinessDistrictService {
    Page getBusinessDistrictByPage(Page page,BusinessDistrictVO BusinessDistrictVO) throws Exception;

    BusinessDistrictVO getBusinessDistrictById(String id) throws Exception;

    int insertBusinessDistrict(BusinessDistrictVO BusinessDistrictVO) throws Exception;

    int updateBusinessDistrictById(BusinessDistrictVO BusinessDistrictVO) throws Exception;

    int deleteBusinessDistrictById(String id) throws Exception;
}