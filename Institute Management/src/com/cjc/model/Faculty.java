package com.cjc.model;

public class Faculty {

	private int fid;
	private String fName;
	  private Course co;
	  
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Course getCo() {
		return co;
	}
	public void setCo(Course co) {
		this.co = co;
	}
}
