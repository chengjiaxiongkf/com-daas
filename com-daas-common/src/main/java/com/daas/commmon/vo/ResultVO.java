package com.daas.commmon.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/11 0:29
 */
@Getter
@Setter
public class ResultVO implements Serializable {
    public static final String CODE_SUCCESS = "200";
    public static final String CODE_ERROR = "500";

    private String code;
    private String msg;
    private String errorMsg;
    public ResultVO(){
        this.code = ResultVO.CODE_SUCCESS;
    }
    public ResultVO(String msg){
        this.msg = msg;
    }
    public ResultVO(String code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
