package com.daas.basedata.factory;

import com.daas.basedata.constant.App;
import com.daas.basedata.service.AreaService;
import com.daas.basedata.service.BusinessDistrictService;
import com.daas.basedata.service.CityService;
import com.daas.basedata.service.ProvinceService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 1:33
 */
@Getter
@Slf4j
public class BaseServiceFactory {
    private ProvinceService provinceService;
    private CityService cityService;
    private AreaService areaService;
    private BusinessDistrictService businessDistrictService;

    public static BaseServiceFactory newInstance(){
        return baseProvider;
    }

    private static BaseServiceFactory baseProvider = new BaseServiceFactory();
    public BaseServiceFactory(){
        log.info("基础数据bean工厂加载ing...");
        long start = System.currentTimeMillis();
        provinceService = (ProvinceService)App.applicationContext.getBean("provinceServiceImpl");
        cityService = (CityService)App.applicationContext.getBean("cityServiceImpl");
        areaService = (AreaService)App.applicationContext.getBean("areaServiceImpl");
        businessDistrictService = (BusinessDistrictService)App.applicationContext.getBean("businessDistrictServiceImpl");
        log.info("基础数据bean工厂加载完成，耗时:"+(System.currentTimeMillis()-start));
    }
}
