package io.midsphere.project.vo;

import io.midsphere.model.vo.AbstractQueryRequest;

import java.io.Serializable;

/**
 * 查询 VO
 * @author liqiwen
 * @since 1.0
 */
public class ProjectQueryRequest extends AbstractQueryRequest implements Serializable {

    private String projectKey;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }
}
