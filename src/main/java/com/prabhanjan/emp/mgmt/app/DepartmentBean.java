package com.prabhanjan.emp.mgmt.app;

public class DepartmentBean {

	private int id;
	private String deptName;
	private String delptLocation;
	
	public DepartmentBean(int id, String deptName, String delptLocation) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.delptLocation = delptLocation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDelptLocation() {
		return delptLocation;
	}
	public void setDelptLocation(String delptLocation) {
		this.delptLocation = delptLocation;
	}
	@Override
	public String toString() {
		return "DepartmentBean [id=" + id + ", deptName=" + deptName + ", delptLocation=" + delptLocation + "]";
	}
	
}
