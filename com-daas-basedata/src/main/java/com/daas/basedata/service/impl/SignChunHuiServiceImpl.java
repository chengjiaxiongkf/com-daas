package com.daas.basedata.service.impl;

import cn.hutool.core.io.FileUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.daas.basedata.dto.SignDTO;
import com.daas.basedata.dto.UserDTO;
import com.daas.basedata.mapper.SignMapper;
import com.daas.basedata.mapper.UserMapper;
import com.daas.basedata.service.SignChunHuiService;
import com.daas.basedata.util.BeanMapper;
import com.daas.basedata.vo.SignChunHuiExcelVO;
import com.daas.basedata.vo.SignChunHuiVO;
import com.daas.basedata.vo.SignVO;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import com.daas.common.lib.exception.ExcelImportDataDuplicateException;
import com.daas.common.lib.util.ExcelUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.assertj.core.internal.InputStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 15:00
 */
@Service
@Slf4j
public class SignChunHuiServiceImpl implements SignChunHuiService {

    @Resource
    private SignMapper signMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional
    public ResultVO importData(MultipartFile file) throws RuntimeException {
        StringBuilder msg = new StringBuilder();
        int successCount=0;
//        InputStream inputStream=file.getInputStream();
        InputStream inputStream= FileUtil.getInputStream(new File("d:/123.xlsx"));
        String[] excelHead={"序号","备注","提交时间","您的真实姓名","今日心情指数","“一句话”心情"};
        String[] excelHeadAlias={"no","remark","signDate","name","moodLevel","moodMsg"};
        List<SignChunHuiExcelVO> result= ExcelUtils.importExcel(inputStream,excelHead,excelHeadAlias, SignChunHuiExcelVO.class);
        result.stream().forEach(signChunHuiExcelVO -> {
            UserDTO userDTO = this.userExistProcess(signChunHuiExcelVO);
            long id = userDTO.getId();
            //封装签到记录
            SignDTO signDTO = BeanMapper.convert(signChunHuiExcelVO,SignDTO.class);
            signDTO.setUserId(id);
            signDTO.setUserLevel(signChunHuiExcelVO.getMoodLevel());
            signDTO.setRemark(signChunHuiExcelVO.getMoodMsg());
            try {
                signDTO = this.signExistProcess(signDTO);
            } catch (ExcelImportDataDuplicateException e) {
                msg.append(String.format("序号:[%s]的数据重复;", signChunHuiExcelVO.getNo()));
            }
        });
        return new ResultVO(msg.toString());
    }

    @Override
    public void export(HttpServletResponse response, SignChunHuiVO signVO) throws Exception {

    }

    @Override
    public ResultPageVO getListByPage(SignChunHuiVO signChunHuiVO) throws Exception {
        return new ResultPageVO<>(signMapper.getSignList(signChunHuiVO),signMapper.getSignTotal(signChunHuiVO));
    }

    private UserDTO userExistProcess(SignChunHuiExcelVO signChunHuiExcelVO){
        QueryWrapper<UserDTO> wrapper = Wrappers.query();
        wrapper.eq("name",signChunHuiExcelVO.getUserName());
        UserDTO userDTO = userMapper.selectOne(wrapper);
        if(userDTO==null){//用户不存在，则新增
            userDTO = new UserDTO();
            userDTO.setUserName(signChunHuiExcelVO.getUserName());
            userMapper.insert(userDTO);//回写主键id到userDTO
        }
        return userDTO;
    }

    private SignDTO signExistProcess(SignDTO signDTO) throws ExcelImportDataDuplicateException {
        //三个条件一样为重复数据
        QueryWrapper<SignDTO> wrapper = Wrappers.query();
        wrapper.eq("user_id",signDTO.getUserId());
        wrapper.eq("sign_type",signDTO.getSignType());
        wrapper.eq("sign_date",signDTO.getSignDate());
        signDTO = signMapper.selectOne(wrapper);
        if(signDTO==null){//签到不存在，则新增
            signMapper.insert(signDTO);//回写主键id到userDTO
        }else{
            throw new ExcelImportDataDuplicateException("导入数据重复");
        }
        return signDTO;
    }
}
