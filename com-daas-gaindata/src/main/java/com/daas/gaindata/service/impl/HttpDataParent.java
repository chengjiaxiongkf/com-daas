package com.daas.gaindata.service.impl;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONReader;
import com.daas.commmon.dto.ResultDto;
import com.daas.gaindata.dto.BusinessDistrictDto;
import com.daas.gaindata.service.HttpDataHandle;
import com.daas.gaindata.util.FileUtils;
import com.daas.gaindata.util.HttpRequestUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public abstract class HttpDataParent implements HttpDataHandle {
    public void requestHttpData(String url, String filePath,boolean isAppend,String appendMark) throws IOException {
        FileUtils.writeStrToFile(this.filterDate(HttpRequestUtils.getResponseStr(url)), filePath,isAppend,appendMark);
    }

    public Object getHttpData(String dir) {
        File file = new File(dir);
        FileReader fileReader;
        JSONReader jsonReader;
        if(!file.exists())
            return new ResultDto("文件不存在");
        try{
            fileReader = new FileReader(dir);
            jsonReader = new JSONReader(fileReader);
            Object object = this.analysisData(jsonReader);
            return object;//解析数据
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResultDto();
    }

    /**
     * 父类默认直接读取全部字符串，各自子类自己写特殊的业务数据解析
     * @param jsonReader
     * @return
     */
    public abstract Object analysisData(JSONReader jsonReader);

    /**
     * 数据过滤,默认无过滤,由子类重写
     * @param dataStr
     * @return
     */
    public String filterDate(String dataStr){
        return dataStr;
    }

    /**
     * 数据导出excel
     */
//    public Object writeWithoutHead(Object object){  return object; }
}
