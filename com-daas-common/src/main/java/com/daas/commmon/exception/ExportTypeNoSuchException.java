package com.daas.commmon.exception;

/**
 * 导出类型找不到
 * @author v_jxjxcheng
 * @date 2020-10-13 17:10
 */
public class ExportTypeNoSuchException extends AppException {
    public ExportTypeNoSuchException(String errorMsg) {
        super("EXPORT_TYPE_NO_SUCH",errorMsg);
    }
}
