package io.midsphere.exception;

import io.midsphere.constants.Message;

/**
 * 业务异常
 * @author liqiwen
 * @since 1.0
 */
public class BizException extends RuntimeException {


    private final Message error;

    public BizException(String msg, String code) {
        this.error = new Message(msg, code);
    }

    public Message getError() {
        return error;
    }
}
