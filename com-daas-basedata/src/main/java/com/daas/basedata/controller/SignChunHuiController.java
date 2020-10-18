package com.daas.basedata.controller;

import com.alibaba.fastjson.JSONObject;
import com.daas.basedata.service.SignChunHuiService;
import com.daas.basedata.vo.SignChunHuiVO;
import com.daas.basedata.vo.SignVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 13:22
 */
@RestController
@RequestMapping("/signChunHui")
@Slf4j
public class SignChunHuiController {
    @Autowired
    private SignChunHuiService signChunHuiService;

    @RequestMapping("/importSign")
    public ResultVO importSign(MultipartFile file) throws Exception{
        ResultVO resultVO = signChunHuiService.importData(file);
        log.info(JSONObject.toJSONString(resultVO));
        return resultVO;
    }

    @RequestMapping("/exportSign")
    public ResultVO exportSign(HttpServletRequest request,HttpServletResponse response) throws Exception{
        return new ResultVO();
    }

    @RequestMapping("/getSignListByPage")
    public ResultPageVO getSignListByPage(SignChunHuiVO signChunHuiVO, HttpServletRequest request, HttpServletResponse response) throws Exception{
        return signChunHuiService.getListByPage(signChunHuiVO);
    }
}
