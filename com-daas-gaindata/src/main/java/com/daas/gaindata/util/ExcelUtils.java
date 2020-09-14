package com.daas.gaindata.util;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 13:42
 */
public class ExcelUtils {
    public void excelExport(String fileName, List list, List<List<String>> coulumnList){
        try (OutputStream out = new FileOutputStream(fileName);) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0);
            sheet1.setSheetName("sheet1");
            List<List<String>> data = list;
            List<List<String>> head = coulumnList;
            Table table = new Table(1);
            table.setHead(head);
            writer.write0(data, sheet1, table);
            writer.finish();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
