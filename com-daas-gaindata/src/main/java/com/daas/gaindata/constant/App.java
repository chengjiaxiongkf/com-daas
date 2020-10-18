package com.daas.gaindata.constant;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/9 22:24
 */
@Component
public class App implements ApplicationContextAware {
    public static String dirJsonSub;
    public static String urlBdSub;
    public static String urlBdBusiness;
    @Value("${dir.json.sub}")
    public void setJsonFileDir(String dirJsonSub){
        App.dirJsonSub = dirJsonSub;
    }
    @Value("${url.bd.sub}")
    public void setUrlBdSub(String urlBdSub){
        App.urlBdSub = urlBdSub;
    }
    @Value("${url.bd.business}")
    public void seturlBdBusiness(String urlBdBusiness){
        App.urlBdBusiness = urlBdBusiness;
    }

    public static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        App.applicationContext = applicationContext;
    }
}
