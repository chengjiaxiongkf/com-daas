package com.daas.basedata.vo;

import com.daas.commmon.constant.EnumSignType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 10:52
 */
@Getter
@Setter
public class SignChunHuiVO extends SignVO {
    private String userName;
    private int moodLevel;
    private String moodMsg;

    SignChunHuiVO(){
        /**
         * 封装为春晖签到打卡
         */
        super.setSignType(EnumSignType.CHUN_HUI.getSignType());
    }
}
