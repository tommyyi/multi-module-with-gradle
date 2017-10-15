package com.tag.bean;

public class Dep {
	private int dptId;
	private String dptName;
	public int getDptId() {
		return dptId;
	}
	public void setDptId(int dptId) {
		this.dptId = dptId;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public Dep(int dptId, String dptName) {
		this.dptId = dptId;
		this.dptName = dptName;
	}
	public Dep() {
		// TODO Auto-generated constructor stub
	}
	
}
