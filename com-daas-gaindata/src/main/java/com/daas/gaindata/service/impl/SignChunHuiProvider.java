package com.daas.gaindata.service.impl;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.exceptions.POIException;
import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import com.daas.gaindata.mapper.SignMapper;
import com.daas.gaindata.vo.SignVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 10:42
 */
@Slf4j
@Service
public class SignChunHuiProvider extends AbstractSignChunHuiParent {

    /**
     * 数据入库
     * @param list
     */
    private void importSign(List<List<Object>> list){
        //插入数据库
        list.stream().forEach(rows -> {
            rows.stream().forEach(cell -> {

           });
        });
    }

    @Override
    public void importSignByFile(File file) {
        List<List<Object>> readAll = null;
        try (ExcelReader reader = ExcelUtil.getReader(file)){
            readAll = reader.read();
        } catch (Exception e) {
            throw new POIException("春晖智慧根据File导入签到数据异常");
        }
        this.importSign(readAll);
    }

    @Override
    public void importSignByFileName(String fileName) {
        List<List<Object>> readAll = null;
        try (ExcelReader reader = ExcelUtil.getReader(fileName)){
            readAll = reader.read();
        } catch (Exception e) {
            throw new POIException("春晖智慧根据FileName从临时目录导入签到数据异常");
        }
        this.importSign(readAll);
    }
    @Override
    public ResultVO sign() {
        return null;
    }
}
