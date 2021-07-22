package io.midsphere.code.model;

import io.midsphere.model.vo.AbstractQueryRequest;

import java.io.Serializable;

/**
 * 仓库查询参数
 * @author liqiwen
 * @since 1.0
 */
public class RepositoryQueryRequest extends AbstractQueryRequest implements Serializable {

    private RepositoryEnum repositoryType;

    private String projectKey;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public RepositoryEnum getRepositoryType() {
        return repositoryType;
    }

    public void setRepositoryType(RepositoryEnum repositoryType) {
        this.repositoryType = repositoryType;
    }
}
