package com.daas.basedata.vo;

import com.daas.basedata.dto.AreaDTO;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class AreaVO extends AreaDTO implements Serializable {
    private Integer startSize;
    private Integer endSize;
}