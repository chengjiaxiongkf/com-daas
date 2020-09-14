package com.daas.gaindata;

import com.daas.gaindata.constant.App;
import com.daas.gaindata.dto.AreaDto;
import com.daas.gaindata.dto.BusinessDistrictDto;
import com.daas.gaindata.dto.CityDto;
import com.daas.gaindata.dto.ProvinceDto;
import com.daas.gaindata.mapper.AreaMapper;
import com.daas.gaindata.mapper.BusinessDistrictMapper;
import com.daas.gaindata.mapper.CityMapper;
import com.daas.gaindata.mapper.ProvinceMapper;
import com.daas.gaindata.util.FileUtils;
import com.daas.gaindata.util.HttpDataFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/12 1:24
 */
@SpringBootApplication
public class GaindataMain {
    public static void main(String[] args) throws Exception {
        new SpringApplication(GaindataMain.class).run(args);
//        try {
//            HttpDataFactory.getProvinceProvider().requestHttpData(App.urlBdSub,"SubArea.json",false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        List<AreaPojo> list = (List)HttpDataFactory.getAreaProvider().getHttpData(FileUtils.systemTempDir() +"SubArea.json");
//        String mark = ",";
//        for(int i=0;i<list.size();i++){
//            AreaPojo areaPojo = list.get(i);
//            try {
//                if(i==1){
//                    FileUtils.writeStrToFile("[","BusinessDistrict.json");
//                }
//                if(i==list.size()){
//                    mark="]";
//                }
//                HttpDataFactory.getBusinessDistrictProvider().requestHttpData(String.format(App.urlBdBusiness, areaPojo.getAreaCode()),"BusinessDistrict.json",true,mark);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        ProvinceMapper provinceMapper = (ProvinceMapper)App.applicationContext.getBean("provinceMapper");
//        CityMapper cityMapper = (CityMapper)App.applicationContext.getBean("cityMapper");
//        AreaMapper areaMapper = (AreaMapper)App.applicationContext.getBean("areaMapper");
//        BusinessDistrictMapper businessDistrictMapper = (BusinessDistrictMapper)App.applicationContext.getBean("businessDistrictMapper");
//        List<ProvinceDto> provincelist = (List) HttpDataFactory.getProvinceProvider().getHttpData(FileUtils.systemTempDir() +"SubArea.json");
//        for (ProvinceDto provinceDto : provincelist) {
//            provinceMapper.insert(provinceDto);
//        }
//        List<CityDto> cityList = (List)HttpDataFactory.getCityProvider().getHttpData(FileUtils.systemTempDir() +"SubArea.json");
//        cityList.forEach(cityDto -> {
//            cityMapper.insert(cityDto);
//        });
//        List<AreaDto> areaList = (List)HttpDataFactory.getAreaProvider().getHttpData(FileUtils.systemTempDir() +"SubArea.json");
//        areaList.forEach(areaDto -> {
//            areaMapper.insert(areaDto);
//        });
//        List<BusinessDistrictDto> bdList = (List)HttpDataFactory.getBusinessDistrictProvider().getHttpData(FileUtils.systemTempDir() +"BusinessDistrict.json");
//        bdList.forEach(businessDistrictDto -> {
//            businessDistrictMapper.insert(businessDistrictDto);
//        });
    }
}
