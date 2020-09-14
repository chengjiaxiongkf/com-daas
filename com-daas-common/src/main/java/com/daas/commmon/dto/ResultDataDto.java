package com.daas.commmon.dto;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:22
 */
public class ResultDataDto<T> extends ResultDto {
    private int startSize = 0;
    private int endSize = 10;
    private int totle;
    private T data;

    public T get(){
        return this.data;
    }
    public ResultDataDto(){
        super();
    }
    public ResultDataDto(T data){
        super();
        this.data = data;
    }
    public void setStartSize(int startSize){
        this.startSize=startSize;
    }
    public void setEndSize(int endSize){
        this.endSize=endSize;
    }
    public void setTotle(int totle){
        this.endSize=totle;
    }
    public int getStartSize(){
       return this.startSize;
    }
    public int getEndSize(){
        return this.endSize;
    }
    public int getTotle(){
        return this.endSize;
    }
}
