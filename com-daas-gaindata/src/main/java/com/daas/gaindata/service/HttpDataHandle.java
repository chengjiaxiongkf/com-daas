package com.daas.gaindata.service;

import java.io.IOException;

/**
 * Http请求获取数据进行处理时,避免大字符串传输长时间内存占用请求
 * 方法1.先写入临时json文件
 * 方法2.从本地临时json文件中取出
 * @Author chengjiaxiong
 * @Date 2020/9/12 0:18
 */
public interface HttpDataHandle {
    void requestHttpData(String url,String fileName,boolean isAppend,String appendMark) throws IOException;
    Object getHttpData(String dir);
}
