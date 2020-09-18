package com.daas.basedata.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.vo.AreaVO;

public interface AreaService {
    Page getAreaByPage(Page page,AreaVO AreaVO) throws Exception;

    AreaVO getAreaById(String id) throws Exception;

    int insertArea(AreaVO AreaVO) throws Exception;

    int updateAreaById(AreaVO AreaVO) throws Exception;

    int deleteAreaById(String id) throws Exception;
}