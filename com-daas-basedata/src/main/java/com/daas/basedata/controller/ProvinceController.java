package com.daas.basedata.controller;

import com.daas.basedata.factory.BaseServiceFactory;
import com.daas.basedata.vo.ProvinceVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    @RequestMapping(value = "/getProvinceByPage",method = RequestMethod.GET)
    public ResultPageVO<List<ProvinceVO>> getProvinceByPage(ProvinceVO provinceVO) throws Exception {
        return new ResultPageVO<List<ProvinceVO>>()
                .setData(BaseServiceFactory.newInstance().getProvinceService().getProvinceByPage(provinceVO))
                .setTotal(BaseServiceFactory.newInstance().getProvinceService().getProvinceTotal(provinceVO));
    }

    @RequestMapping(value = "/getProvinceById",method = RequestMethod.GET)
    public ResultVO<ProvinceVO> getProvinceById(@Param("id") String id) throws Exception {
        return new ResultVO<ProvinceVO>()
                .setData(BaseServiceFactory.newInstance().getProvinceService().getProvinceById(id));
    }

    @RequestMapping(value = "/insertProvince",method = RequestMethod.POST)
    public ResultVO insertProvince(ProvinceVO provinceVO) throws Exception {
        BaseServiceFactory.newInstance().getProvinceService().insertProvince(provinceVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/updateProvince",method = RequestMethod.POST)
    public ResultVO updateProvince(ProvinceVO provinceVO) throws Exception {
        BaseServiceFactory.newInstance().getProvinceService().updateProvinceById(provinceVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/deleteProvince",method = RequestMethod.POST)
    public ResultVO deleteProvince(@Param("id") String id) throws Exception {
        BaseServiceFactory.newInstance().getProvinceService().deleteProvinceById(id);
        return new ResultVO();
    }
}