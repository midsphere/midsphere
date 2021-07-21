package io.midsphere.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 日志记录
 * @author liqiwen
 * @since 1.0
 */
public class LogSubject implements Serializable {

    /**
     * 请求描述
     */
    private String description;

    /**
     * 请求用户
     */
    private String username;

    /**
     * 请求开始时间
     */
    private LocalDateTime startTime;

    /**
     * 请求结束时间
     */
    private LocalDateTime endTime;

    /**
     * 请求消耗时间
     */
    private LocalDateTime costTime;

    /**
     * 请求方式
     */
    private String method;

    /**
     * 请求 ip
     */
    private String ip;

    /**
     * 请求入参
     */
    private Object reqParams;

    /**
     * 请求结果
     */
    private Object reqResult;

    /**
     * 请求城市
     */
    private String city;

    /**
     * 请求设备
     */
    private String device;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCostTime() {
        return costTime;
    }

    public void setCostTime(LocalDateTime costTime) {
        this.costTime = costTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Object getReqParams() {
        return reqParams;
    }

    public void setReqParams(Object reqParams) {
        this.reqParams = reqParams;
    }

    public Object getReqResult() {
        return reqResult;
    }

    public void setReqResult(Object reqResult) {
        this.reqResult = reqResult;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
