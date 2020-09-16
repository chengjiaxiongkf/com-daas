package com.daas.basedata.service.impl;

import com.daas.basedata.mapper.ProvinceMapper;
import com.daas.basedata.service.ProvinceService;
import com.daas.basedata.vo.ProvinceVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:17
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceVO> getProvinceByPage(ProvinceVO provinceVO) throws Exception {
        return provinceMapper.getProvinceByPage(provinceVO);
    }

    @Override
    public int getProvinceTotal(ProvinceVO provinceVO) throws Exception {
        return provinceMapper.getProvinceTotal(provinceVO);
    }
}
