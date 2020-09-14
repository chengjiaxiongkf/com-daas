package com.daas.gaindata.util;

import com.daas.gaindata.constant.App;
import com.daas.gaindata.service.HttpDataHandle;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/12 0:55
 */
public class HttpDataFactory {
    public static HttpDataHandle getProvinceProvider(){
        return (HttpDataHandle) App.applicationContext.getBean("provinceProvider");
    }
    public static HttpDataHandle getCityProvider(){
        return (HttpDataHandle) App.applicationContext.getBean("cityProvider");
    }
    public static HttpDataHandle getAreaProvider(){
        return (HttpDataHandle) App.applicationContext.getBean("areaProvider");
    }
    public static HttpDataHandle getBusinessDistrictProvider(){
        return (HttpDataHandle) App.applicationContext.getBean("businessDistrictProvider");
    }
}
