package com.daas.basedata.vo;

import com.daas.basedata.dto.BusinessDistrictDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BusinessDistrictVO extends BusinessDistrictDTO implements Serializable {
    private Integer startSize;
    private Integer endSize;
}