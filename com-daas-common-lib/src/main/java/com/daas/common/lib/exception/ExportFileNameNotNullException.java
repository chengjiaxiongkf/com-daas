package com.daas.common.lib.exception;

import com.daas.commmon.exception.AppException;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 9:48
 */
public class ExportFileNameNotNullException extends AppException {
    public ExportFileNameNotNullException(String errorMsg) {
        super("EXPORT_FILE_NAME_NOT_NULL", errorMsg);
    }
}
