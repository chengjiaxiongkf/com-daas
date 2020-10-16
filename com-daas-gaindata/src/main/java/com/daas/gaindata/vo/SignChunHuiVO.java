package com.daas.gaindata.vo;

import com.daas.gaindata.constant.EnumSignType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 10:52
 */
@Getter
@Setter
public class SignChunHuiVO extends SignVO {
    private String name;
    private int moodLevel;//心情指数
    private String moodMsg;//心情

    SignChunHuiVO(){
        super(EnumSignType.CHUN_HUI.getSignType(),-1L);
    }
}
