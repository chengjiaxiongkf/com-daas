package com.daas.gaindata.dto;

import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 11:23
 */
@Getter
@Setter
public class SignDTO extends BaseDTO {
    private String signType;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String signDate;
}
