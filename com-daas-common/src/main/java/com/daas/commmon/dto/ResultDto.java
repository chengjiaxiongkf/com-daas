package com.daas.commmon.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/11 0:29
 */
@Getter
@Setter
public class ResultDto implements Serializable {
    public static final String CODE_SUCCESS = "200";
    public static final String CODE_ERROR = "500";

    private String code;
    private String msg;
    private String errorMsg;
    public ResultDto(){
        this.code = ResultDto.CODE_SUCCESS;
    }
    public ResultDto(String msg){
        this.msg = msg;
    }
    public ResultDto(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
