package com.daas.basedata.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessDistrict {
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