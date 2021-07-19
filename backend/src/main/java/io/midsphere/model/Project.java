package io.midsphere.model;

import java.io.Serializable;

/**
 * 工程管理
 * @author liqiwen
 * @since 1.0
 */
public class Project implements Serializable {

    private Integer id;

    private String projectName;

    private String projectKey;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }
}
