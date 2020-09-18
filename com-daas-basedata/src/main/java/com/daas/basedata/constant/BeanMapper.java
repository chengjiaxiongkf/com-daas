package com.daas.basedata.constant;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.List;

/**
 * @author v_jxjxcheng
 * @date 2020-09-18 15:02
 */
public class BeanMapper {
    public static <T,S> T convert(S source,Class<T> targetClass){
        return JSONObject.parseObject(JSONObject.toJSON(source).toString(),targetClass);
    }

    public static <T,S> List<T> convertArray(S source,Class<T> targetClass){
        return JSONArray.parseArray(JSONArray.toJSONString(source), targetClass);
    }
}
