package com.daas.commmon.exception;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 9:48
 */
public class ExportFileNameNotNullException extends AppException {
    public ExportFileNameNotNullException(String errorMsg) {
        super("EXPORT_FILE_NAME_NOT_NULL", errorMsg);
    }
}
