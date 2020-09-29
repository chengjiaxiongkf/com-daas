package com.daas.basedata.vo;

import com.daas.basedata.dto.CityDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CityVO extends CityDTO implements Serializable {
    private Integer startSize;
    private Integer endSize;
}