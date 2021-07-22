package io.midsphere.application.service;

import io.midsphere.exception.BizException;
import io.midsphere.application.model.Application;

/**
 * 应用业务类
 * @author liqiwen
 * @since 1.0
 */
public interface ApplicationService {


    /**
     * 查找应用
     * @param id id
     * @return Application
     * @throws BizException 业务异常
     */
    Application findById(String id) throws BizException;


    /**
     * 删除应用
     * @param id id
     * @throws BizException 业务异常
     */
    void delete(String id) throws BizException;

    /**
     * 修改应用
     * @param application application
     * @throws BizException 业务异常
     */
    void update(Application application) throws BizException;

    /**
     * 保存应用
     * @param application application
     */
    void save(Application application) throws BizException;

}
