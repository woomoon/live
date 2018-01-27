package com.woomoon.entitys;

public class PrescriptionsEntity {

	private Integer prep_id;
	private Integer message_id;
	private String prep_type;
	private Integer user_id;
	private String prep_name;
	private String prep_remark;
	private String prep_stare;
	private Integer user_id_verify;
	private String prep_isreturn;

	public Integer getPrep_id() {
		return prep_id;
	}
	public Integer getMessage_id() {
		return message_id;
	}
	public String getPrep_type() {
		return prep_type;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public String getPrep_name() {
		return prep_name;
	}
	public String getPrep_remark() {
		return prep_remark;
	}
	public String getPrep_stare() {
		return prep_stare;
	}
	public Integer getUser_id_verify() {
		return user_id_verify;
	}
	public String getPrep_isreturn() {
		return prep_isreturn;
	}
	public void setPrep_id(Integer prep_id) {
		this.prep_id = prep_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public void setPrep_type(String prep_type) {
		this.prep_type = prep_type;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public void setPrep_name(String prep_name) {
		this.prep_name = prep_name;
	}
	public void setPrep_remark(String prep_remark) {
		this.prep_remark = prep_remark;
	}
	public void setPrep_stare(String prep_stare) {
		this.prep_stare = prep_stare;
	}
	public void setUser_id_verify(Integer user_id_verify) {
		this.user_id_verify = user_id_verify;
	}
	public void setPrep_isreturn(String prep_isreturn) {
		this.prep_isreturn = prep_isreturn;
	}


}