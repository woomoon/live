package com.woomoon.entitys;

public class BedpositionEntity {

	private Integer bed_id;
	private Integer area_id;
	private String bed_type;
	private Integer bed_grade;
	private String bed_sex;
	private String bed_state;



	public String getBed_state() {
		return bed_state;
	}

	public void setBed_state(String bed_state) {
		this.bed_state = bed_state;
	}




	public Integer getBed_id() {
		return bed_id;
	}
	public Integer getArea_id() {
		return area_id;
	}
	public String getBed_type() {
		return bed_type;
	}
	public Integer getBed_grade() {
		return bed_grade;
	}
	public String getBed_sex() {
		return bed_sex;
	}
	public void setBed_id(Integer bed_id) {
		this.bed_id = bed_id;
	}
	public void setArea_id(Integer area_id) {
		this.area_id = area_id;
	}
	public void setBed_type(String bed_type) {
		this.bed_type = bed_type;
	}
	public void setBed_grade(Integer bed_grade) {
		this.bed_grade = bed_grade;
	}
	public void setBed_sex(String bed_sex) {
		this.bed_sex = bed_sex;
	}


}