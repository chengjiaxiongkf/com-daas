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
    public ResultPageVO(T t,long total){
        this.data = t;
        this.total = total;
    }
    private long total;
    private T data;
    private int startSize;
    private int endSize;
}
