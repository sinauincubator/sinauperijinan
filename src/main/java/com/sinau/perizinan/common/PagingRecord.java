package com.sinau.perizinan.common;

import java.io.Serializable;
import java.util.List;

public class PagingRecord<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private int totalRecords;
	private int totalPages;
	private int currentIndex;
	private int beginIndex;
	private int endIndex;
	
	private List<T> records;
		
	public PagingRecord(List<T> records, int totalRecords, int currentIndex) {
		this.records = records;
		this.totalRecords = totalRecords;
		
		this.totalPages = (int) Math.ceil((double) this.totalRecords / PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		
	    this.currentIndex = currentIndex;
		this.beginIndex = Math.max(1, this.currentIndex - 5);		
		this.endIndex = Math.min(this.beginIndex + 10, this.totalPages);
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public int getBeginIndex() {
		return beginIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public List<T> getRecords() {
		return records;
	}
	
}
