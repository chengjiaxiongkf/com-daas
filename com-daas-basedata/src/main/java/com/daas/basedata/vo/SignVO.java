package com.daas.basedata.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daas.basedata.dto.SignDTO;
import com.daas.commmon.vo.ResultPageVO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 11:07
 */
@Getter
@Setter
public class SignVO extends ResultPageVO {
    private long userId;
    private String signType;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signDate;
    private int userLevel;
    private String remark;

    //condition
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signDateStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signDateEnd;
}
