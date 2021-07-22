package io.midsphere.dto;

import io.midsphere.model.vo.AbstractQueryRequest;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据对象
 * @param <T> T
 * @author liqiwen
 * @since 1.0
 */
public class PageDTO<T> implements Serializable {

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 页大小
     */
    private Integer size;

    /**
     * 数据大小
     */
    private List<T> data;

    /**
     * 总页数
     */
    private long totalPage;

    /**
     * 总数据大小
     */
    private long totalRows;

    /**
     * 查询参数
     */
    private AbstractQueryRequest queryParam;


    public PageDTO() {
        super();
    }

    public PageDTO(AbstractQueryRequest queryParam, long count, List<T> data) {
        super();
        this.queryParam = queryParam;
        this.page = queryParam.getPage();
        this.size = queryParam.getSize();
        this.totalRows = count;
        this.totalPage = (count % queryParam.getSize()) == 0 ? (count/queryParam.getSize()) : (count/queryParam.getSize()) + 1;
        this.data = data;
    }

    public AbstractQueryRequest getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(AbstractQueryRequest queryParam) {
        this.queryParam = queryParam;
    }

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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }
}
