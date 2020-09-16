package com.daas.basedata.controller;

import com.daas.basedata.service.ProvinceService;
import com.daas.basedata.util.BaseServiceFactory;
import com.daas.basedata.vo.ProvinceVO;
import com.daas.commmon.vo.ResultPageVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    @RequestMapping(value = "/getProvinceByPage",method = RequestMethod.GET)
    public ResultPageVO getProvinceByPage(ProvinceVO provinceVO) throws Exception {
        ResultPageVO resultPageVO = new ResultPageVO();
        try {

            ProvinceService provinceService = BaseServiceFactory.newInstance().getProvinceService();
            resultPageVO.setData(provinceService.getProvinceByPage(provinceVO));
            resultPageVO.setTotal(provinceService.getProvinceTotal(provinceVO));
        } catch (Exception e) {
            throw new Exception("分页查询异常.");
        }
        return resultPageVO;
    }
}