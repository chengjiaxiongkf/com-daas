package com.daas.basedata.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.util.BaseServiceFactory;
import com.daas.basedata.vo.BusinessDistrictVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/businessDistrict")
public class BusinessDistrictController {
    @RequestMapping(value = "/getBusinessDistrictByPage",method = RequestMethod.GET)
    public ResultPageVO<List<BusinessDistrictVO>> getBusinessDistrictByPage(@Param("startSize")String startSize, @Param("endSize")String endSize, BusinessDistrictVO BusinessDistrictVO) throws Exception {
        Page<BusinessDistrictVO> iPage = BaseServiceFactory.newInstance()
                .getBusinessDistrictService().getBusinessDistrictByPage(new Page<>(Integer.parseInt(startSize),Integer.parseInt(endSize)),BusinessDistrictVO);
        return new ResultPageVO<List<BusinessDistrictVO>>()
                .setData(iPage.getRecords()).setTotal(iPage.getTotal());
    }

    @RequestMapping(value = "/getBusinessDistrictById",method = RequestMethod.GET)
    public ResultVO<BusinessDistrictVO> getBusinessDistrictById(@Param("id") String id) throws Exception {
        return new ResultVO<BusinessDistrictVO>()
                .setData(BaseServiceFactory.newInstance().getBusinessDistrictService().getBusinessDistrictById(id));
    }

    @RequestMapping(value = "/insertBusinessDistrict",method = RequestMethod.POST)
    public ResultVO insertBusinessDistrict(BusinessDistrictVO BusinessDistrictVO) throws Exception {
        BaseServiceFactory.newInstance().getBusinessDistrictService().insertBusinessDistrict(BusinessDistrictVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/updateBusinessDistrict",method = RequestMethod.POST)
    public ResultVO updateBusinessDistrict(BusinessDistrictVO BusinessDistrictVO) throws Exception {
        BaseServiceFactory.newInstance().getBusinessDistrictService().updateBusinessDistrictById(BusinessDistrictVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/deleteBusinessDistrict",method = RequestMethod.POST)
    public ResultVO deleteBusinessDistrict(@Param("id") String id) throws Exception {
        BaseServiceFactory.newInstance().getBusinessDistrictService().deleteBusinessDistrictById(id);
        return new ResultVO();
    }
}