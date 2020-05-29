package com.wangtong.utils;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {

	private Long totleCount;// ������
	private Long currentPage;// ��ǰҳ
	private Long pageCount = 4l;// һҳ������
	private Long totlePage;// ��ҳ��
	private List<T> pageData = new ArrayList<>();// ��Ų�ѯ����������

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
