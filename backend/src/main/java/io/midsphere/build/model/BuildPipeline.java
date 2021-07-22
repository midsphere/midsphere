package io.midsphere.build.model;


import io.midsphere.application.model.Application;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 构建流水线
 * @author liqiwen
 * @since 1.1
 */
public class BuildPipeline implements Serializable {

    /**
     * 主键 id
     */
    private Integer id;

    /**
     * 该构建流水线包含的 Stage
     */
    private List<BuildStage> buildStages;

    /**
     * 构建节点应该与项目关联
     */
    private Application application;

    /**
     * 构建流水线创建时间
     */
    private LocalDateTime createAt;

    /**
     * 构建流水线修改时间
     */
    private LocalDateTime modifyAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<BuildStage> getBuildStages() {
        return buildStages;
    }

    public void setBuildStages(List<BuildStage> buildStages) {
        this.buildStages = buildStages;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
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
}
