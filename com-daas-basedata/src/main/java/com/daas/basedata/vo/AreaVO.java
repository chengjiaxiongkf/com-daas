package com.daas.basedata.vo;

import com.daas.basedata.dto.AreaDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AreaVO extends AreaDTO {
    private Integer startSize;
    private Integer endSize;
}