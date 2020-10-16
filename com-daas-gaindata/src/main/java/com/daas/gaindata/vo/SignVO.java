package com.daas.gaindata.vo;

import cn.hutool.core.date.DateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 11:07
 */
@Getter
@Setter
public class SignVO {
    private String signType;//签到类型
    private long userId;//用户Id
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private DateTime SignDate;//签到时间

    SignVO(String signType,long userId){
        this.signType = signType;
        this.userId = userId;
    }
}
