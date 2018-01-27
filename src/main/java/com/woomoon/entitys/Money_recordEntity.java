package com.woomoon.entitys;

public class Money_recordEntity {

	private Integer record_id;
	private String deposit_id;
	private Integer out_id;
	private Integer user_id;
	private String record_time;
	private String record_type;
	private String record_mode;
	private String record_remark;

	public Integer getRecord_id() {
		return record_id;
	}
	public String getDeposit_id() {
		return deposit_id;
	}
	public Integer getOut_id() {
		return out_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public String getRecord_time() {
		return record_time;
	}
	public String getRecord_type() {
		return record_type;
	}
	public String getRecord_mode() {
		return record_mode;
	}
	public String getRecord_remark() {
		return record_remark;
	}
	public void setRecord_id(Integer record_id) {
		this.record_id = record_id;
	}
	public void setDeposit_id(String deposit_id) {
		this.deposit_id = deposit_id;
	}
	public void setOut_id(Integer out_id) {
		this.out_id = out_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public void setRecord_time(String record_time) {
		this.record_time = record_time;
	}
	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}
	public void setRecord_mode(String record_mode) {
		this.record_mode = record_mode;
	}
	public void setRecord_remark(String record_remark) {
		this.record_remark = record_remark;
	}


}