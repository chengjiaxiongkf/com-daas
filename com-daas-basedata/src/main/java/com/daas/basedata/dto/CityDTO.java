package com.daas.basedata.dto;

import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * daas_base_city
 * @Author v_jxjxcheng
 * @Date 2020-09-16 11:14:03
 **/
@Getter
@Setter
public class CityDTO extends BaseDTO {
    private String cityCode;
    private String cityName;
    private String provinceCode;
}