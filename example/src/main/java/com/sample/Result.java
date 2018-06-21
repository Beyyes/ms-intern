package com.sample;

import java.util.List;

public class Result implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int sum;
	private int passedCount;
	private int failedCount;

	private List<String> passedNames;
	private List<String> failedNames;

	public Result() {
	}

	public Result(int sum, int passedCount, List<String> passedNames,
			int failedCount, List<String> failedNames) {
		this.sum = sum;
		this.passedCount = passedCount;
		this.passedNames = passedNames;
		this.failedCount = failedCount;
		this.failedNames = failedNames;
	}

	public int getSum() {
		return this.sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getPassedCount() {
		return this.passedCount;
	}

	public void setPassedCount(int passedCount) {
		this.passedCount = passedCount;
	}

	public java.util.List<java.lang.String> getPassedNames() {
		return this.passedNames;
	}

	public void setPassedNames(java.util.List<java.lang.String> passedNames) {
		this.passedNames = passedNames;
	}

	public java.util.List<java.lang.String> getFailedNames() {
		return this.failedNames;
	}

	public void setFailedNames(java.util.List<java.lang.String> failedNames) {
		this.failedNames = failedNames;
	}

	public int getFailedCount() {
		return this.failedCount;
	}

	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}

	public Result(int sum, int passedCount,
			java.util.List<java.lang.String> passedNames,
			java.util.List<java.lang.String> failedNames, int failedCount) {
		this.sum = sum;
		this.passedCount = passedCount;
		this.passedNames = passedNames;
		this.failedNames = failedNames;
		this.failedCount = failedCount;
	}

}