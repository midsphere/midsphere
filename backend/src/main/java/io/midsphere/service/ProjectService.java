package io.midsphere.service;

import io.midsphere.dto.PageDTO;
import io.midsphere.exception.BizException;
import io.midsphere.model.Project;

/**
 * 工程管理
 * @author liqiwen
 * @since 1.0
 */
public interface ProjectService {


    PageDTO<Project> findPage();

    /**
     * 申请项目
     * @param project project
     */
    void applyProject(Project project) throws BizException;

    /**
     * 校验 projectKey 的有效性
     * @param projectKey projectKey
     * @return boolean
     */
    boolean validateProjectKey(String projectKey);
}
