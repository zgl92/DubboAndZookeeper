package org.java.common.pojo;


import java.io.Serializable;

/**
 *  分页的工具类
 */
public class Pager implements Serializable {
    /**
     *   总页数
     */
     private Integer pageCount;

    /**
     * 请求分页的url地址
     */
    private  String url;

    /**
     * 当前页码
     */
    private  Integer currentPage;

    /**
     * 总的信息条数
     */
    private Long count;

    public Pager(Integer pageCount, String url, Integer currentPage, Long count) {
        this.pageCount = pageCount;
        this.url = url;
        this.currentPage = currentPage;
        this.count = count;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
