package com.daas.basedata.constant;

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
    public static ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        App.applicationContext = applicationContext;
    }
}
