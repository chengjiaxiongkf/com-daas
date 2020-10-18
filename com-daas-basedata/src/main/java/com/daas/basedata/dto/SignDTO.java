package com.daas.basedata.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 14:11
 */
@Getter
@Setter
@TableName("daas_biz_sign")
public class SignDTO extends BaseDTO {
    private long userId;
    private String signType;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signDate;
    private int userLevel;
    private String remark;
}
