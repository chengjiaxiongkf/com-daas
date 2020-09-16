package com.daas.gaindata.service.impl;

import com.alibaba.fastjson.JSONReader;
import com.daas.commmon.vo.ResultVO;
import com.daas.gaindata.service.HttpDataHandle;
import com.daas.gaindata.util.FileUtils;
import com.daas.gaindata.util.HttpRequestUtils;

import java.io.*;

/**
 *
 * @author cjx_admin
 */
public abstract class AbstractHttpDataParent implements HttpDataHandle {
    @Override
    public void requestHttpData(String url, String filePath, boolean isAppend, String appendMark) throws IOException {
        FileUtils.writeStrToFile(this.filterDate(HttpRequestUtils.getResponseStr(url)), filePath,isAppend,appendMark);
    }

    @Override
    public Object getHttpData(String dir) {
        File file = new File(dir);
        FileReader fileReader;
        JSONReader jsonReader;
        if(!file.exists()){
            return new ResultVO("文件不存在");
        }
        try{
            fileReader = new FileReader(dir);
            jsonReader = new JSONReader(fileReader);
            return this.analysisData(jsonReader);//解析数据
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResultVO();
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
}
