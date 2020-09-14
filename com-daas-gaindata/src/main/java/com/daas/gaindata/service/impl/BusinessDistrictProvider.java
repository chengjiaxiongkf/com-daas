package com.daas.gaindata.service.impl;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.daas.gaindata.dto.BusinessDistrictDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/12 16:48
 */
@Service
@Slf4j
public class BusinessDistrictProvider extends HttpDataParent {
    public String filterDate(String str){
        JSONObject jsonObject;
        try {
            jsonObject = (JSONObject)JSONObject.parseObject(str).get("content");
        } catch (Exception e) {
            return "";
        }
        return null==jsonObject.get("sub")?"":jsonObject.toString();
    }

    @Override
    public Object analysisData(JSONReader jsonReader) {
        List<BusinessDistrictDto> list = new ArrayList<>();
        try {
            BusinessDistrictDto businessDistrictPojo;
            jsonReader.startArray();
            while (jsonReader.hasNext()){
                jsonReader.startObject();
                String upCode = null;
                List<BusinessDistrictDto> bdList = new ArrayList<>();
                while (jsonReader.hasNext()){
                    String key = jsonReader.readString();
                    String str = this.dupCode(key,jsonReader);
                    if(StringUtils.isEmpty(upCode))
                        upCode = str;
                    if(key.equals("sub")){
                        jsonReader.startArray();
                        while (jsonReader.hasNext()){
                            businessDistrictPojo = JSONObject.toJavaObject((JSONObject)jsonReader.readObject(), BusinessDistrictDto.class);
                            bdList.add(businessDistrictPojo);
                        }
                        jsonReader.endArray();
                    }
                }
                for (BusinessDistrictDto bdPojo : bdList) {
                    bdPojo.setAreaCode(upCode);
                }
                list.addAll(bdList);
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return list;
    }

    private String dupCode(String key,JSONReader jsonReader){
        String upCode = "";
        switch (key) {
            case "area_code":
                upCode = jsonReader.readObject().toString();
                break;
            case "area_name":
                jsonReader.readObject();
                break;
            case "area_type":
                jsonReader.readObject();
                break;
            case "geo":
                jsonReader.readObject();
                break;
            case "sup_business_area":
                jsonReader.readObject();
                break;
        }
        return upCode;
    }

    public void writeWithoutHead() throws IOException {
        try (OutputStream out = new FileOutputStream("withHead.xlsx");) {
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
            List<List<String>> head = new ArrayList<List<String>>();
            List<String> headCoulumn1 = new ArrayList<String>();
            List<String> headCoulumn2 = new ArrayList<String>();
            List<String> headCoulumn3 = new ArrayList<String>();
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
}