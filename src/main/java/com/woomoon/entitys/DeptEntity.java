package com.woomoon.entitys;

public class DeptEntity {

	private Integer dept_id;
	private String dept_name;
	private String isParent;
	private Integer dept_pid;
	private String dept_remark;

	public Integer getDept_id() {
		return dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public String getIsParent() {
		return isParent;
	}
	public Integer getDept_pid() {
		return dept_pid;
	}
	public String getDept_remark() {
		return dept_remark;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}
	public void setDept_pid(Integer dept_pid) {
		this.dept_pid = dept_pid;
	}
	public void setDept_remark(String dept_remark) {
		this.dept_remark = dept_remark;
	}


}