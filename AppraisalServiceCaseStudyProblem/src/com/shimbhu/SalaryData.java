package com.shimbhu;

public class SalaryData {

	private Integer totalSum;
	private Integer totalCount;
	private Integer min;
	private Integer max;
	private Integer average;
	
	
	@Override
	public String toString() {
		return "SalaryData [totalSum=" + totalSum + ", totalCount=" + totalCount + ", min=" + min + ", max=" + max
				+ ", average=" + average + "]";
	}

	public SalaryData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryData(Integer totalSum, Integer totalCount, Integer min, Integer max, Integer average) {
		super();
		this.totalSum = totalSum;
		this.totalCount = totalCount;
		this.min = min;
		this.max = max;
		this.average = average;
	}
	
	public Integer getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(Integer totalSum) {
		this.totalSum = totalSum;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getaverage() {
		return average;
	}
	public void setaverage(Integer average) {
		this.average = average;
	}
	
	
}
