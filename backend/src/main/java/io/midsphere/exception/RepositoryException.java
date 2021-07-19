package io.midsphere.exception;

/**
 * 仓库异常
 * @author liqiwen
 * @since 1.0
 */
public class RepositoryException extends BizException {


    public RepositoryException(String msg, String code) {
        super(msg, code);
    }
}
