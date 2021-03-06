package com.daas.commmon.constant;

import lombok.Getter;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 11:14
 */
@Getter
public enum EnumSignType {
    CHUN_HUI("1");

    private final String signType;
    EnumSignType(String signType){
        this.signType = signType;
    }
}
