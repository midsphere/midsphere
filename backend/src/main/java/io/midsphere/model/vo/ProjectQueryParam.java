package io.midsphere.model.vo;

import java.io.Serializable;

/**
 * 查询 VO
 * @author liqiwen
 * @since 1.0
 */
public class ProjectQueryParam extends AbstractQueryParam implements Serializable {

    private String projectKey;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }
}
