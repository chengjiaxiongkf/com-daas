package com.daas.basedata.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.factory.BaseServiceFactory;
import com.daas.basedata.vo.AreaVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {
    @RequestMapping(value = "/getAreaByPage",method = RequestMethod.GET)
    public ResultPageVO<List<AreaVO>> getAreaByPage(@Param("startSize")String startSize, @Param("endSize")String endSize, AreaVO AreaVO) throws Exception {
        Page<AreaVO> iPage = BaseServiceFactory.newInstance()
                .getAreaService().getAreaByPage(new Page<>(Integer.parseInt(startSize),Integer.parseInt(endSize)),AreaVO);
        return new ResultPageVO<List<AreaVO>>()
                .setData(iPage.getRecords()).setTotal(iPage.getTotal());
    }

    @RequestMapping(value = "/getAreaById",method = RequestMethod.GET)
    public ResultVO<AreaVO> getAreaById(@Param("id") String id) throws Exception {
        return new ResultVO<AreaVO>()
                .setData(BaseServiceFactory.newInstance().getAreaService().getAreaById(id));
    }

    @RequestMapping(value = "/insertArea",method = RequestMethod.POST)
    public ResultVO insertArea(AreaVO AreaVO) throws Exception {
        BaseServiceFactory.newInstance().getAreaService().insertArea(AreaVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/updateArea",method = RequestMethod.POST)
    public ResultVO updateArea(AreaVO AreaVO) throws Exception {
        BaseServiceFactory.newInstance().getAreaService().updateAreaById(AreaVO);
        return new ResultVO();
    }

    @RequestMapping(value = "/deleteArea",method = RequestMethod.POST)
    public ResultVO deleteArea(@Param("id") String id) throws Exception {
        BaseServiceFactory.newInstance().getAreaService().deleteAreaById(id);
        return new ResultVO();
    }
}