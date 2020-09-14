package com.daas.basedata.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    /**
     * 
     */
    @JSONField(name="area_code")
    private String cityCode;

    /**
     * 
     */
    @JSONField(name="area_name")
    private String cityName;

    /**
     * 
     */
    private String provinceCode;
}