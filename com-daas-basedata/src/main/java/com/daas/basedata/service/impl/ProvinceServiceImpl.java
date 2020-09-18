package com.daas.basedata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.daas.basedata.dto.ProvinceDTO;
import com.daas.basedata.mapper.ProvinceMapper;
import com.daas.basedata.service.ProvinceService;
import com.daas.basedata.vo.ProvinceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    public Long getProvinceTotal(ProvinceVO provinceVO) throws Exception {
        return provinceMapper.getProvinceTotal(provinceVO);
    }

    @Override
    public ProvinceVO getProvinceById(String id) throws Exception {
        return JSONObject.parseObject(JSONObject.toJSON(provinceMapper.getProvinceById(id)).toString(),ProvinceVO.class);
    }

    @Override
    public int insertProvince(ProvinceVO provinceVO) throws Exception {
        if(StringUtils.isEmpty(provinceVO.getProvinceCode()) || StringUtils.isEmpty(provinceVO.getProvinceName())){
            throw new RuntimeException("省编码或者省名称为空");
        }
        return provinceMapper.insertProvince(JSONObject.parseObject(JSONObject.toJSON(provinceVO).toString(), ProvinceDTO.class));
    }

    @Override
    public int updateProvinceById(ProvinceVO provinceVO) throws Exception {
        if(StringUtils.isEmpty(provinceVO.getProvinceCode()) && StringUtils.isEmpty(provinceVO.getProvinceName())){
            throw new RuntimeException("省编码跟省名称不能都为空");
        }
        return provinceMapper.updateProvinceById(JSONObject.parseObject(JSONObject.toJSON(provinceVO).toString(), ProvinceDTO.class));
    }

    @Override
    public int deleteProvinceById(String id) throws Exception {
        return provinceMapper.deleteProvinceById(id);
    }
}
