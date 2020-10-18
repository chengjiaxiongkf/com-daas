package com.daas.basedata.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daas.commmon.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 14:11
 */
@Getter
@Setter
@TableName("daas_base_user")
public class UserDTO extends BaseDTO {
    private String userName;
    private String idNo;
    private String idNoType;
}
