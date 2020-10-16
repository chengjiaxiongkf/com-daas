package com.daas.gaindata.service.biz;

import com.alibaba.fastjson.JSONReader;
import com.daas.commmon.vo.ResultVO;
import com.daas.gaindata.service.HttpDataHandle;
import com.daas.commmon.util.FileUtils;
import com.daas.gaindata.util.HttpRequestUtils;

import java.io.*;

/**
 *
 * @author cjx_admin
 */
public abstract class AbstractHttpDataParent implements HttpDataHandle {
    /**
     * 子类必须重写自己独特的数据解析
     * @param jsonReader
     * @return
     */
    protected abstract Object analysisData(JSONReader jsonReader);

    @Override
    public void requestHttpData(String url, String filePath, boolean isAppend, String appendMark) throws IOException {
        FileUtils.writeStrToFile(this.filterDate(HttpRequestUtils.getResponseStr(url)), filePath,isAppend,appendMark);
    }

    /**
     * 读取http的数据
     * @param dir
     * @return
     */
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
     * 数据过滤,默认无过滤,由子类重写
     * @param dataStr
     * @return
     */
    protected String filterDate(String dataStr){
        return dataStr;
    }
}
