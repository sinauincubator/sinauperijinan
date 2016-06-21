package com.sinau.perizinan.controller;

import java.util.List;

import org.springframework.beans.support.PagedListHolder;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.common.PerijinanConstantsDefinitions;

public class GenericBaseController<T> {

	public PagedListHolder<T> setPagination(List<T> source, int page) {
		PagedListHolder<T> pageList = new PagedListHolder<T>(source);
		pageList.setPage(page);
		pageList.setPageSize(PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		
		return pageList;
	}
	
	public PagingRecord<T> setPagination(List<T> records, int totalRecords, int currentIndex) {
		PagingRecord<T> pageList = new PagingRecord<T>(records, totalRecords, currentIndex);
				
		return pageList;
	}
}
