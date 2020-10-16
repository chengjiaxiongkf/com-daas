package com.daas.gaindata.service.provider;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.daas.gaindata.dto.ProvinceDto;
import com.daas.gaindata.service.biz.AbstractHttpDataParent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/12 0:59
 */
@Service
@Slf4j
public class ProvinceProvider extends AbstractHttpDataParent {

    private void dupCode(String key, JSONReader jsonReader){
        switch (key) {
            case "area_code":
                jsonReader.readObject();
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
    }

    @Override
    public Object analysisData(JSONReader jsonReader){
        List<ProvinceDto> list = new ArrayList<>();
        try {
            ProvinceDto provinceProvider;
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
                                provinceProvider = JSONObject.toJavaObject((JSONObject)jsonReader.readObject(), ProvinceDto.class);
                                list.add(provinceProvider);
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
