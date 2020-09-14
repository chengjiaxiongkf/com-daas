package com.daas.gaindata.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessDistrictDto {
    /**
     * 
     */
    @JSONField(name="area_code")
    private String businessDistrictCode;

    /**
     * 
     */
    @JSONField(name="area_name")
    private String businessDistrictName;

    /**
     * 
     */
    private String areaCode;
}