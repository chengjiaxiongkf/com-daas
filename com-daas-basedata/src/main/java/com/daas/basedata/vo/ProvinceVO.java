package com.daas.basedata.vo;

import com.daas.basedata.dto.ProvinceDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinceVO extends ProvinceDTO {
    private Integer startSize;
    private Integer endSize;
}