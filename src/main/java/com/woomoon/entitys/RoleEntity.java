package com.woomoon.entitys;

public class RoleEntity {

	private Integer role_id;
	private Integer role_pid;
	private String role_name;
	private String isParent;
	private String role_size;
	private String role_url;
	private String role_remark;
	private String icon;
	private String open;

	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public Integer getRole_pid() {
		return role_pid;
	}
	public String getRole_name() {
		return role_name;
	}
	public String getIsParent() {
		return isParent;
	}
	public String getRole_size() {
		return role_size;
	}
	public String getRole_url() {
		return role_url;
	}
	public String getRole_remark() {
		return role_remark;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public void setRole_pid(Integer role_pid) {
		this.role_pid = role_pid;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}
	public void setRole_size(String role_size) {
		this.role_size = role_size;
	}
	public void setRole_url(String role_url) {
		this.role_url = role_url;
	}
	public void setRole_remark(String role_remark) {
		this.role_remark = role_remark;
	}


}