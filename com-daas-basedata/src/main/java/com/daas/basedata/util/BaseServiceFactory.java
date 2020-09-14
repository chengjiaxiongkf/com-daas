package com.daas.basedata.util;

import com.daas.basedata.constant.App;
import com.daas.basedata.service.AreaService;
import com.daas.basedata.service.BusinessDistrictService;
import com.daas.basedata.service.CityService;
import com.daas.basedata.service.ProvinceService;
import lombok.Getter;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:33
 */
@Getter
public class BaseServiceFactory {
    private ProvinceService provinceService;
    private CityService cityService;
    private AreaService areaService;
    private BusinessDistrictService businessDistrictService;

    private static BaseServiceFactory baseProvider = new BaseServiceFactory();

    public static BaseServiceFactory newInstance(){
        return baseProvider;
    }

    public BaseServiceFactory(){
        provinceService = (ProvinceService)App.applicationContext.getBean("provinceServiceImpl");
        cityService = (CityService)App.applicationContext.getBean("cityServiceImpl");
        areaService = (AreaService)App.applicationContext.getBean("areaServiceImpl");
        businessDistrictService = (BusinessDistrictService)App.applicationContext.getBean("businessDistrictServiceImpl");
    }
}
