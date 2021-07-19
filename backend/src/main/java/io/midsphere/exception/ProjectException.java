package io.midsphere.exception;

/**
 * 工程异常
 * @author liqiwen
 * @since 1.0
 */
public class ProjectException extends BizException {

    public ProjectException(String msg, String code) {
        super(msg, code);
    }
}
