package com.daas.basedata.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinceVO {
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