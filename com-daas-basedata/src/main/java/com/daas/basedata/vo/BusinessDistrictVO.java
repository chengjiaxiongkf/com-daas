package com.daas.basedata.vo;

import com.daas.basedata.dto.BusinessDistrictDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessDistrictVO extends BusinessDistrictDTO {
    private Integer startSize;
    private Integer endSize;
}