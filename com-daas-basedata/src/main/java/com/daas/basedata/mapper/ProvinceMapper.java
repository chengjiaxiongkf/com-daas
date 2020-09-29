package com.daas.basedata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daas.basedata.dto.ProvinceDTO;
import com.daas.basedata.vo.ProvinceVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProvinceMapper extends BaseMapper<ProvinceDTO> {

    List<ProvinceVO> getProvinceByPage(ProvinceVO provinceVO) throws Exception;

    Long getProvinceTotal(ProvinceVO provinceVO) throws Exception;

    ProvinceDTO getProvinceById(String id) throws Exception;

    int insertProvince(ProvinceDTO ProvinceDTO) throws Exception;

    int updateProvinceById(ProvinceDTO ProvinceDTO) throws Exception;

    int deleteProvinceById(String id) throws Exception;
}