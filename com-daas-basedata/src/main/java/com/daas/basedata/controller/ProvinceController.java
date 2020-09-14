package com.daas.basedata.controller;

import com.daas.basedata.dto.Province;
import com.daas.basedata.util.BaseServiceFactory;
import com.daas.commmon.dto.ResultDataDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provice")
public class ProvinceController {
    @RequestMapping(value = "/getProvinceByPage",method = RequestMethod.GET)
    public ResultDataDto<List<Province>> getProvinceByPage(Province province) throws Exception {
        ResultDataDto<List<Province>> resultDataDto = null;
        try {
            resultDataDto = BaseServiceFactory.newInstance().getProvinceService().getProvinceByPage(province);
        } catch (Exception e) {
            throw new Exception("分页查询异常.");
        }
        return resultDataDto;
    }
}