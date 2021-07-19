package io.midsphere.model.vo;

import java.io.Serializable;

/**
 * 查询参数
 * @author liqiwen
 * @since 1.0
 */
public abstract class AbstractQueryParam implements Serializable {

    protected Integer page;

    protected Integer size;


    public Integer getPage() {
        return page;
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
