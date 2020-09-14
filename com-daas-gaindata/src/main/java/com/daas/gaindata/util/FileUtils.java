package com.daas.gaindata.util;

import com.alibaba.fastjson.JSONReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.*;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/9 21:57
 */
@Slf4j
public class FileUtils {
    public static String systemTempDir(){
        String destDirName = null;
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            destDirName = "D://tmp/";
        }else{
            destDirName = "usr/tmp/";
        }
        File dir = new File(destDirName);
        if(dir.exists()){
            return "D://tmp/";
        }
        if (!destDirName.endsWith(File.separator)) {
            destDirName = destDirName + File.separator;
        }
        //创建目录
        if (!dir.mkdirs()) {
            log.info("创建目录" + destDirName + "失败！");
        }
        return "D://tmp/";
    }

    public static Object outObjectByFilePath(String filePath) throws FileNotFoundException {
        String url = FileUtils.systemTempDir();
        File file = new File(url);
        try (FileReader fileReader = new FileReader(file)){
            JSONReader jsonReader = new JSONReader(fileReader);
            return jsonReader.readObject();
        } catch (IOException e) {
            throw new FileNotFoundException("读取"+url+"目录时读取时IO异常");
        }
    }

    public static void writeStrToFile(String jsonStr,String filePath) throws IOException {
        writeStrToFile(jsonStr,filePath,false,"");
    }

    /**
     * 字符串写入文件
     * @param jsonStr 字符串
     * @param filePath 文件目录地址
     * @param isAppend 是否拼接写入
     */
    public static void writeStrToFile(String jsonStr,String filePath,boolean isAppend,String appendMark) throws IOException {
        String url = "";
        File file = null;
        if(StringUtils.isEmpty(jsonStr)){
            return;
        }
        try {
            url = FileUtils.systemTempDir()+filePath;
            file = new File(url);
            if(!file.exists()){//不存在创建一个文件
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new IOException("写入到"+url+"IO异常");
        }
        try (FileWriter fw = new FileWriter(file,isAppend);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(jsonStr+appendMark);
        } catch (IOException e) {
            throw new IOException("写入到"+url+"IO异常");
        }
    }
}
