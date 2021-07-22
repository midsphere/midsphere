package io.midsphere.build.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 构建阶段
 * @author liqiwen
 * @since 1.0
 */
public class BuildStage implements Serializable {

    /**
     * 主键 id
     */
    private Integer id;

    /**
     * 执行节点位置
     * 该值表明该节点存在与构建流水线的那个位置
     */
    private Integer orderNo;

    /**
     * 该节点应该执行的是什么 shell 脚本
     */
    private String shellStr;

    /**
     * 该节点是否开启
     */
    private Boolean enable;

    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 修改时间
     */
    private LocalDateTime modifyAt;

    /**
     * 是否内置 stage
     */
    private boolean internalStage = false;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getShellStr() {
        return shellStr;
    }

    public void setShellStr(String shellStr) {
        this.shellStr = shellStr;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
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

    public boolean isInternalStage() {
        return internalStage;
    }

    public void setInternalStage(boolean internalStage) {
        this.internalStage = internalStage;
    }
}
