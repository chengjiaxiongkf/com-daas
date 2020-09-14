package com.daas.basedata.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.daas.commmon.dto.ResultDataDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Province extends ResultDataDto {
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