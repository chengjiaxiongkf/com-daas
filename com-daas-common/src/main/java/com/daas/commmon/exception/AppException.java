package com.daas.commmon.exception;

import lombok.Getter;

/**
 * 所有自定义异常继承此项目异常父类，必须封装errorCode成员
 * @author v_jxjxcheng
 * @date 2020-10-13 17:01
 */
@Getter
public class AppException extends RuntimeException {
    public String errorCode;
    public AppException(String errorCode,String errorMsg){
        super(errorMsg);
        this.errorCode = errorCode;
    }
}
