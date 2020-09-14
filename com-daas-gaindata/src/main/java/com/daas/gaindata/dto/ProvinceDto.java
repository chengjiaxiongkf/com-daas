package com.daas.gaindata.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinceDto {
    /**
     * 
     */
    @JSONField(name="area_code")
    private String provinceCode;

    /**
     * 
     */
    @JSONField(name="area_name")
    private String provinceName;
}