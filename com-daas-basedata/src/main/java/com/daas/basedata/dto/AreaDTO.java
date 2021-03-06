package com.daas.basedata.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * daas_base_area
 * @Author v_jxjxcheng
 * @Date 2020-09-16 11:10:40
 **/
@Getter
@Setter
@TableName("daas_base_area")
public class AreaDTO extends BaseDTO {
    private String areaCode;
    private String areaName;
    private String cityCode;
}