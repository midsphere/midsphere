package io.midsphere.model.vo;

import io.midsphere.model.RepositoryEnum;

import java.io.Serializable;

/**
 * 仓库查询参数
 * @author liqiwen
 * @since 1.0
 */
public class RepositoryQueryParam extends AbstractQueryParam implements Serializable {

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
