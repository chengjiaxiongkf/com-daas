package com.daas.common.lib.exception;

import com.daas.commmon.exception.AppException;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 9:48
 */
public class ExportDataSizeMaxException extends AppException {
    public ExportDataSizeMaxException(String errorMsg) {
        super("EXPORT_DATA_SIZE_MAX", errorMsg);
    }
}
