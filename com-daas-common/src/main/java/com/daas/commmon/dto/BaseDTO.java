package com.daas.commmon.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDTO {
    /**
     * 主键自增长ID
     */
    private Long id;
    /**
     * 乐观锁版本号
     */
    private Long version = 1L;

    /**
     * 创建人
     */
    private Long createBy;
    private String createByName;
    private LocalDateTime createDate = LocalDateTime.now();

    /**
     * 最后更新人信息
     */
    private Long updateBy;
    private String updateByName;
    private LocalDateTime updateDate = LocalDateTime.now();
}
