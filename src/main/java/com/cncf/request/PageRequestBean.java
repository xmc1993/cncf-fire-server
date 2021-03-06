package com.cncf.request;


import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


@ApiModel
public class PageRequestBean implements Serializable {

	private static final long serialVersionUID = -5460916727522078000L;

	private static final int DEFAULT_PAGE = 1;
	private static final int DEFAULT_SIZE = 10;

	/**
	 * 当前页，默认0
	 */
	@ApiModelProperty(value="当前页，默认1")
	private Integer page = DEFAULT_PAGE;

	/**
	 * 每页多少条，默认10条
	 */
	@ApiModelProperty(value="每页多少条，默认10条")
	private Integer pageSize = DEFAULT_SIZE;

	@ApiModelProperty(value="排序方式（desc or asc）")
	private String qdesc;

	@ApiModelProperty(value="不用传")
	private Integer currentSize;

	public Integer getPage() {
		if(page==null){
			return DEFAULT_PAGE;
		}else if(page.equals(0) || page==0){
			return DEFAULT_PAGE;
		}
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		if(pageSize==null){
			return DEFAULT_SIZE;
		}
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getQdesc() {
		return qdesc;
	}

	public void setQdesc(String qdesc) {
		this.qdesc = qdesc;
	}

	public Integer getCurrentSize() {
		return (page-1)*pageSize;
	}

	public void setCurrentSize(Integer currentSize) {
		this.currentSize = currentSize;
	}
	
	@Override
	public String toString() {
		return page + pageSize  + qdesc + currentSize +"";
	}
	

}
