package com.daas.common.lib.exception;

import com.daas.commmon.exception.AppException;

/**
 * @Author chengjiaxiong
 * @Date 2020/10/18 17:08
 */
public class ExcelImportDataDuplicateException extends AppException {
    public ExcelImportDataDuplicateException(String errorMsg) {
        super("EXPORT_DATA_SIZE_MAX", errorMsg);
    }
}
