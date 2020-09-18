package com.daas.basedata.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * daas_base_businessDistrict
 * @Author v_jxjxcheng
 * @Date 2020-09-16 11:12:50
 **/
@Getter
@Setter
@TableName("daas_base_businessDistrict")
public class BusinessDistrictDTO extends BaseDTO {
    private String businessDistrictCode;
    private String businessDistrictName;
    private String areaCode;
}