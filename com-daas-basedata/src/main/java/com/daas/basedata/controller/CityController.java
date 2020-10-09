package com.daas.basedata.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.util.BaseServiceFactory;
import com.daas.basedata.vo.CityVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @RequestMapping(value = "/getCityByPage",method = RequestMethod.GET)
    public ResultPageVO<List<CityVO>> getCityByPage(@Param("startSize")String startSize,@Param("endSize")String endSize,CityVO cityVO) throws Exception {
        Page<CityVO> iPage = BaseServiceFactory.newInstance()
                .getCityService().getCityByPage(new Page<>(Integer.parseInt(startSize),Integer.parseInt(endSize)),cityVO);
        return new ResultPageVO<List<CityVO>>()
                .setData(iPage.getRecords()).setTotal(iPage.getTotal());
    }

    @RequestMapping(value = "/getCityById",method = RequestMethod.GET)
    public ResultVO<CityVO> getCityById(@Param("id") String id) throws Exception {
        return new ResultVO<CityVO>()
                .setData(BaseServiceFactory.newInstance().getCityService().getCityById(id));
    }

    @RequestMapping(value = "/insertCity",method = RequestMethod.POST)
    public ResultVO insertCity(CityVO cityVO) throws Exception {
        BaseServiceFactory.newInstance().getCityService().insertCity(cityVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/updateCity",method = RequestMethod.POST)
    public ResultVO updateCity(CityVO cityVO) throws Exception {
        BaseServiceFactory.newInstance().getCityService().updateCityById(cityVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/deleteCity",method = RequestMethod.POST)
    public ResultVO deleteCity(@Param("id") String id) throws Exception {
        BaseServiceFactory.newInstance().getCityService().deleteCityById(id);
        return new ResultVO();
    }
}