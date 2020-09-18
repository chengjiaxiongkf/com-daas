package com.daas.commmon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/15 23:49
 */
@Getter
@Setter
@Accessors(chain = true)
public class ResultPageVO<T> extends ResultVO<T> {
    public ResultPageVO(){
        super();
    }
    private long total;
    private T data;
}
