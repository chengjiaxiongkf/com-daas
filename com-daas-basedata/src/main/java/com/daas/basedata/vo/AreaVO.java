package com.daas.basedata.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AreaVO {
    /**
     * 
     */
    @JSONField(name="area_code")
    private String areaCode;

    /**
     * 
     */
    @JSONField(name="area_name")
    private String areaName;

    /**
     * 
     */
    private String cityCode;
}