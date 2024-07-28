package com.zyg.dolphin.base.exception;

/**
 * 错误码
 *
 * @author zy
 */
public interface ErrorCode {
    /**
     * 错误码
     *
     * @return 错误码
     */
    String getCode();

    /**
     * 错误信息
     *
     * @return 错误信息
     */
    String getMessage();
}
