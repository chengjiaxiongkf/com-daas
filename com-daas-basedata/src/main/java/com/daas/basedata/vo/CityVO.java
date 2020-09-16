package com.daas.basedata.vo;

import com.daas.basedata.dto.CityDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityVO extends CityDTO {
    private Integer startSize;
    private Integer endSize;
}