package com.cg.jpastart.entities;

import javax.persistence.Embeddable;

@Embeddable
public class SeatInfo {
	int totalCount;
	int availableCount;
	int bookCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	@Override
	public String toString() {
		return "SeatInfo [totalCount=" + totalCount + ", availableCount="
				+ availableCount + ", bookCount=" + bookCount + "]";
	}
	public SeatInfo(int totalCount, int availableCount, int bookCount) {
		super();
		this.totalCount = totalCount;
		this.availableCount = availableCount;
		this.bookCount = bookCount;
	}
	public SeatInfo() {
		super();
	}
	


}
