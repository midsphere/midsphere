package io.midsphere.application.model;

import io.midsphere.annotation.Unique;
import io.midsphere.project.model.Project;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 应用
 * @author liqiwen
 */
public class Application implements Serializable {

    /**
     * 应用 id
     */
    private String id;

    /**
     * 应用类型
     */
    private String appName;

    /**
     * 应用 key
     */
    @Unique
    private String appKey;

    /**
     * APP 类型
     * 1. SERVER 服务端
     * 2. CLIENT 客户端 B 端
     * 3. MOBILE 移动端 C 端
     */
    private AppTypeEnum appType;

    /**
     * 语言枚举
     */
    private LanguageEnum language;

    /**
     * 应用创建人
     */
    private String createUser;


    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 修改时间
     */
    private LocalDateTime modifyAt;

    /**
     * 应用关联的项目
     */
    private Project project;


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
