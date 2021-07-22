package io.midsphere.model.vo;

import java.io.Serializable;

/**
 * 查询参数
 * @author liqiwen
 * @since 1.0
 */
public abstract class AbstractQueryRequest implements Serializable {

    /**
     * 当前页
     */
    protected Integer page;

    /**
     * 分页大小
     */
    protected Integer size;

    /**
     * 开始查询位置
     */
    protected Integer start;

    /**
     * 每次查询偏移量
     */
    protected Integer offset;


    public Integer getOffset() {
        return getSize();
    }

    public Integer getStart() {
        return (getPage()-1) * getSize();
    }

    public Integer getPage() {
        return Math.max(1, page);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
