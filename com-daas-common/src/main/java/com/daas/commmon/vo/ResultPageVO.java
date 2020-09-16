package com.daas.commmon.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/15 23:49
 */
@Getter
@Setter
public class ResultPageVO extends ResultVO {
    public ResultPageVO(){
        super();
    }
    private int total;
    private Object data;
}
