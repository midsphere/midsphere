package io.midsphere.build.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 构建历史
 * @author liqiwen
 * @since 1.0
 */
public class BuildHistory implements Serializable {

    /**
     * 构建 id
     */
    private Integer id;

    /**
     * 构建编号
     */
    private Integer buildId;

    /**
     * 构建环境
     */
    private String buildEnv;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;

    /**
     * 完成时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime finishTime;

    /**
     * 一个构建记录中存在多个构建节点
     */
    private List<BuildPipeline> buildPipelines;


    public String getBuildEnv() {
        return buildEnv;
    }

    public void setBuildEnv(String buildEnv) {
        this.buildEnv = buildEnv;
    }

    public List<BuildPipeline> getBuildPipelines() {
        return buildPipelines;
    }

    public void setBuildPipelines(List<BuildPipeline> buildPipelines) {
        this.buildPipelines = buildPipelines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }
}
