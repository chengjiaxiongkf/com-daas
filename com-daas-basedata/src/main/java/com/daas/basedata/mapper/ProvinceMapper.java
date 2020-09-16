package com.daas.basedata.mapper;

import com.daas.basedata.dto.ProvinceDTO;
import com.daas.basedata.vo.ProvinceVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProvinceMapper {

    List<ProvinceVO> getProvinceByPage(ProvinceVO provinceVO) throws Exception;

    int getProvinceTotal(ProvinceVO provinceVO) throws Exception;

    int insert(ProvinceDTO record) throws Exception;

    int updateActiveById(String id) throws Exception;

    int updateByPrimaryKey(ProvinceDTO record) throws Exception;

    ProvinceDTO selectByPrimaryKey(String provinceCode) throws Exception;


}