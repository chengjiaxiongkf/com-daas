package com.daas.basedata.service;

import com.daas.basedata.vo.SignChunHuiVO;
import com.daas.basedata.vo.SignVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 15:00
 */
public interface SignChunHuiService {
    ResultVO importData(MultipartFile file) throws RuntimeException, IOException;

    void export(HttpServletResponse response, SignChunHuiVO signVO) throws Exception;

    ResultPageVO getListByPage(SignChunHuiVO signVO) throws Exception;
}
