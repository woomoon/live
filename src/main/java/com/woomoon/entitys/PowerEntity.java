package com.woomoon.entitys;

public class PowerEntity {

	private Integer power_id;
	private Integer power_pid;
	private String power_name;
	private String isParent;
	private String power_size;
	private String power_url;
	private String power_remark;
	private String icon;
	private String open;

	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getPower_id() {
		return power_id;
	}
	public Integer getPower_pid() {
		return power_pid;
	}
	public String getPower_name() {
		return power_name;
	}
	public String getIsParent() {
		return isParent;
	}
	public String getPower_size() {
		return power_size;
	}
	public String getPower_url() {
		return power_url;
	}
	public String getPower_remark() {
		return power_remark;
	}
	public void setPower_id(Integer power_id) {
		this.power_id = power_id;
	}
	public void setPower_pid(Integer power_pid) {
		this.power_pid = power_pid;
	}
	public void setPower_name(String power_name) {
		this.power_name = power_name;
	}
	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}
	public void setPower_size(String power_size) {
		this.power_size = power_size;
	}
	public void setPower_url(String power_url) {
		this.power_url = power_url;
	}
	public void setPower_remark(String power_remark) {
		this.power_remark = power_remark;
	}

	@Override
	public String toString() {
		return "PowerEntity{" +
				"power_id=" + power_id +
				", power_pid=" + power_pid +
				", power_name='" + power_name + '\'' +
				", isParent='" + isParent + '\'' +
				", power_size='" + power_size + '\'' +
				", power_url='" + power_url + '\'' +
				", power_remark='" + power_remark + '\'' +
				", icon='" + icon + '\'' +
				'}';
	}
}