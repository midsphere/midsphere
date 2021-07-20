package io.midsphere.exception;


/**
 * 应用异常
 * @author liqiwen
 * @since 1.0
 */
public class ApplicationException extends BizException{

    public ApplicationException(String msg, String code) {
        super(msg, code);
    }
}
