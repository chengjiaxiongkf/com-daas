package com.daas.gaindata.service.provider;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.daas.gaindata.dto.AreaDto;
import com.daas.gaindata.service.biz.AbstractHttpDataParent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/12 16:47
 */
@Service
@Slf4j
public class AreaProvider extends AbstractHttpDataParent {
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
        List<AreaDto> list = new ArrayList<>();
        try {
            AreaDto areaDto;
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
                                                if(StringUtils.isEmpty(upCode)){
                                                    upCode = str;
                                                }
                                                if("sub".equals(key)){
                                                    jsonReader.startArray();
                                                    while (jsonReader.hasNext()){
                                                        areaDto = JSONObject.toJavaObject((JSONObject)jsonReader.readObject(), AreaDto.class);
                                                        areaDto.setCityCode(upCode);
                                                        list.add(areaDto);
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
