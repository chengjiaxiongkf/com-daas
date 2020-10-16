package com.daas.gaindata.service.provider;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.daas.gaindata.dto.CityDto;
import com.daas.gaindata.service.biz.AbstractHttpDataParent;
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
public class CityProvider extends AbstractHttpDataParent {

    private String dupCode(String key,JSONReader jsonReader){
        String upCode = "";
        if ("area_code".equals(key)) {
            upCode = jsonReader.readObject().toString();
        } else {
            jsonReader.readObject();
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
                if("backend_data".equals(key)){
                    jsonReader.startObject();
                    while (jsonReader.hasNext()){
                        jsonReader.readString();
                        jsonReader.readObject();
                    }
                    jsonReader.endObject();
                }else if("content".equals(key)){
                    jsonReader.startObject();
                    while (jsonReader.hasNext()){
                        key = jsonReader.readString();
                        this.dupCode(key,jsonReader);
                        if("sub".equals(key)){
                            jsonReader.startArray();
                            while (jsonReader.hasNext()){
                                String upCode = null;
                                jsonReader.startObject();
                                while (jsonReader.hasNext()){
                                    key = jsonReader.readString();
                                    String str = this.dupCode(key,jsonReader);
                                    if(StringUtils.isEmpty(upCode)) {
                                        upCode = str;
                                    }
                                    if("sub".equals(key)){
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