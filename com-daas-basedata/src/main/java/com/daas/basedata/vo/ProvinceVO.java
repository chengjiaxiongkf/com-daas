package com.daas.basedata.vo;

import com.daas.basedata.dto.ProvinceDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProvinceVO extends ProvinceDTO implements Serializable {
    private Integer startSize;
    private Integer endSize;
}