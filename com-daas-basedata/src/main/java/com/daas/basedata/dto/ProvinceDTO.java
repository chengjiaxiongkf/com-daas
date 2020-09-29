package com.daas.basedata.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * daas_base_province
 * @Author v_jxjxcheng
 * @Date 2020-09-16 11:14:15
 **/
@Getter
@Setter
@TableName("daas_base_province")
public class ProvinceDTO extends BaseDTO {
    private String provinceCode;
    private String provinceName;
}