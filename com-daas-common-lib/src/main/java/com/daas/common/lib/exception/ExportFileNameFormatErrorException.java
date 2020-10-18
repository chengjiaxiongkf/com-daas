package com.daas.common.lib.exception;

import com.daas.commmon.exception.AppException;

/**
 * @author v_jxjxcheng
 * @date 2020-10-15 9:48
 */
public class ExportFileNameFormatErrorException extends AppException {
    public ExportFileNameFormatErrorException(String errorMsg) {
        super("EXPORT_FILE_NAME_FORMAT_ERROR", errorMsg);
    }
}
