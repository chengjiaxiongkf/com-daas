package com.daas.gaindata.service.provider;

import com.daas.gaindata.constant.App;
import com.daas.gaindata.service.SignService;
import com.daas.gaindata.service.impl.SignServiceImpl;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 10:42
 */
public class SignProvider {
    public static SignService provider(){
        return App.applicationContext.getBean(SignServiceImpl.class);
    }
}
