package com.daas.basedata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.daas.basedata.dto.ProvinceDTO;
import com.daas.basedata.mapper.ProvinceMapper;
import com.daas.basedata.service.ProvinceService;
import com.daas.basedata.vo.ProvinceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:17
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceVO> getProvinceByPage(String startSize, String endSize, ProvinceVO provinceVO) throws Exception {
        ProvinceDTO provinceDTO = JSONObject.parseObject(JSONObject.toJSONString(provinceVO), ProvinceDTO.class);
        return JSONObject.parseArray(JSONObject.toJSONString(provinceMapper.getProvinceByPage(provinceDTO)), ProvinceVO.class);
    }

    @Override
    public int getProvinceByTotal(ProvinceVO provinceVO) throws Exception {
        return provinceMapper.getProvinceByTotal(JSONObject.parseObject(JSONObject.toJSONString(provinceVO), ProvinceDTO.class));
    }
}
