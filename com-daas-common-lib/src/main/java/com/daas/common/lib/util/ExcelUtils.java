package com.daas.common.lib.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.daas.common.lib.exception.ExportFileNameNotNullException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 13:42
 */
@Slf4j
public class ExcelUtils {
    /**
     * 导出
     * @param fileName
     * @param list
     * @param coulumnList
     * @throws IOException
     */
    public void excelExport(String fileName, List list, List<List<String>> coulumnList) throws IOException {
        if(this.checkFileNameByType(fileName)){
            throw new RuntimeException();
        }
        try (OutputStream out = new FileOutputStream("withHead.xlsx")) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0);
            sheet1.setSheetName("sheet1");
            List<List<String>> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                List<String> item = new ArrayList<>();
                item.add("item0" + i);
                item.add("item1" + i);
                item.add("item2" + i);
                data.add(item);
            }
            List<List<String>> head = new ArrayList<>();
            List<String> headCoulumn1 = new ArrayList<>();
            List<String> headCoulumn2 = new ArrayList<>();
            List<String> headCoulumn3 = new ArrayList<>();
            headCoulumn1.add("区");
            headCoulumn2.add("商圈编码");
            headCoulumn3.add("商圈名称");
            head.add(headCoulumn1);
            head.add(headCoulumn2);
            head.add(headCoulumn3);
            Table table = new Table(1);
            table.setHead(head);
            writer.write0(data, sheet1, table);
            writer.finish();
        }
    }

    /**
     * 导出格式校验
     * @param fileName
     * @return
     */
    private boolean checkFileNameByType(String fileName) throws ExportFileNameNotNullException {
        if(fileName.endsWith(ExcelTypeEnum.XLS.getValue()) || fileName.endsWith(ExcelTypeEnum.XLSX.getValue())){
            return false;
        }
        return true;
    }

    /**
     * 读取excel表格内容返回List<Map>
     * @param inputStream  excel文件流
     * @param head         表头数组
     * @param headerAlias  表头别名数组
     * @return
     */
    public static List<Map<String,Object>> importExcel(InputStream inputStream, String[] head, String[] headerAlias){
        ExcelReader reader = ExcelUtil.getReader(inputStream);
        List<Object> header=reader.readRow(1);
        //替换表头关键字
        if(check(head,headerAlias)) {
            throw new ExportFileNameNotNullException("数据不一致");
        }
        for(int i=0;i<head.length;i++){
            if(head[i].equals(header.get(i))){
                reader.addHeaderAlias(head[i],headerAlias[i]);
            }else{
                return null;
            }
        }
        List<Map<String,Object>> read = reader.read(1,2,Integer.MAX_VALUE);
        return read;
    }
    /**
     * 读取excel表格内容返回List<Bean>
     * @param inputStream  excel文件流
     * @param head         表头数组
     * @param headerAlias  表头别名数组
     * @return
     */
    public static <T>List<T> importExcel(InputStream inputStream, String[] head, String[] headerAlias,Class<T> bean){
        ExcelReader reader = ExcelUtil.getReader(inputStream);
        List<Object> header=reader.readRow(0);
        //替换表头关键字
        if(!check(head,headerAlias)) {
            throw new ExportFileNameNotNullException("数据不一致");
        }
        for(int i=0;i<head.length;i++){
            if(head[i].equals(header.get(i))){
                reader.addHeaderAlias(head[i],headerAlias[i]);
            }else{
                return null;
            }
        }
        //读取指点行开始的表数据（从0开始）
        List<T> read = reader.read(0,1,bean);
        return read;
    }

    private static boolean check(String[] head, String[] headerAlias){
        if(StringUtils.isEmpty(head)|| ArrayUtil.isEmpty(headerAlias)||head.length!=headerAlias.length){
            return false;
        }
        return true;
    }
}
