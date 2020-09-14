package com.daas.gaindata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.daas.gaindata.dto.CityDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/12 0:59
 */
@Service
@Slf4j
public class CityProvider extends HttpDataParent {

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
        }
        return upCode;
    }

    @Override
    public Object analysisData(JSONReader jsonReader) {
        List<CityDto> list = new ArrayList<>();
        try {
            CityDto cityPojo;
            jsonReader.startObject();
            while (jsonReader.hasNext()){
                String key = jsonReader.readString();
                if(key.equals("backend_data")){
                    jsonReader.startObject();
                    while (jsonReader.hasNext()){
                        jsonReader.readString();
                        jsonReader.readObject();
                    }
                    jsonReader.endObject();
                }else if(key.equals("content")){
                    jsonReader.startObject();
                    while (jsonReader.hasNext()){
                        key = jsonReader.readString();
                        this.dupCode(key,jsonReader);
                        if(key.equals("sub")){
                            jsonReader.startArray();
                            while (jsonReader.hasNext()){
                                String upCode = null;
                                jsonReader.startObject();
                                while (jsonReader.hasNext()){
                                    key = jsonReader.readString();
                                    String str = this.dupCode(key,jsonReader);
                                    if(StringUtils.isEmpty(upCode))
                                        upCode = str;
                                    if(key.equals("sub")){
                                        jsonReader.startArray();
                                        while (jsonReader.hasNext()){
                                            cityPojo = JSONObject.toJavaObject((JSONObject)jsonReader.readObject(), CityDto.class);
                                            cityPojo.setProvinceCode(upCode);
                                            list.add(cityPojo);
                                        }
                                        jsonReader.endArray();
                                    }
                                }
                                jsonReader.endObject();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return list;
    }
}