package com.woomoon.entitys;

public class DepositEntity {

	private Integer deposit_id;
	private String live_num;
	private String deposit_money_do;

	public Integer getDeposit_id() {
		return deposit_id;
	}
	public String getLive_num() {
		return live_num;
	}
	public String getDeposit_money_do() {
		return deposit_money_do;
	}
	public void setDeposit_id(Integer deposit_id) {
		this.deposit_id = deposit_id;
	}
	public void setLive_num(String live_num) {
		this.live_num = live_num;
	}
	public void setDeposit_money_do(String deposit_money_do) {
		this.deposit_money_do = deposit_money_do;
	}


}