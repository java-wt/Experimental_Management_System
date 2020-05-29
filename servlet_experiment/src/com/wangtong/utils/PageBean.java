package com.wangtong.utils;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {

	private Long totleCount;// 总条数
	private Long currentPage;// 当前页
	private Long pageCount = 4l;// 一页的数量
	private Long totlePage;// 总页数
	private List<T> pageData = new ArrayList<>();// 存放查询出来的数据

	public Long getTotleCount() {
		return totleCount;
	}

	public void setTotleCount(Long totleCount) {
		this.totleCount = totleCount;
	}

	public Long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getTotlePage() {
		if(totleCount%pageCount == 0){
			totlePage = totleCount/pageCount;
		}else{
			totlePage = (totleCount/pageCount) + 1;
		}
		
		return totlePage;
	}

	public void setTotlePage(Long totlePage) {
		this.totlePage = totlePage;
	}

	public List<T> getPageData() {
		return pageData;
	}

	public void setPageData(List<T> pageData) {
		this.pageData = pageData;
	}

}
