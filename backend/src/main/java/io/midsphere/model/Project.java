package io.midsphere.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 项目管理
 * @author liqiwen
 * @since 1.0
 */
public class Project implements Serializable {

    /**
     * 项目主键
     */
    private Integer id;

    /**
     * 工程名称
     */
    private String projectName;

    /**
     * 工程 Key
     */
    private String projectKey;


    /**
     * 项目归属
     */
    private String owner;

    /**
     * 项目测试人员
     */
    private String tester;


    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 修改时间
     */
    private LocalDateTime modifyAt;


    /**
     * 项目状态
     */
    private StatusEnum status;

    /**
     * 该项目下制品存放的位置
     */
    private String productsLocation;

    public String getProductsLocation() {
        return productsLocation;
    }

    public void setProductsLocation(String productsLocation) {
        this.productsLocation = productsLocation;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
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
