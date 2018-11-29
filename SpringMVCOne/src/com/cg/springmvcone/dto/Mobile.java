package com.cg.springmvcone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MOBILEONEDATA")
public class Mobile {

	@Id
	@Column(name="mob_id")
	@NotNull(message="Mobile Id cannot be empty")
	Integer mobId;
	@Column(name="mob_name")
	@NotEmpty(message="Name cannot be Empty")
	String mobName;
	@Column(name="mob_price")
	Double mobPrice;
	@Column(name="mob_cato")
	String mobCategory;
	@Column(name="mob_online")

	String choice;
	
	public Mobile() {
	
	}
	
	
	public Mobile(Integer mobId, String mobName, Double mobPrice,
			String mobCategory, String choice) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobCategory = mobCategory;
		this.choice = choice;
	}


	public Integer getMobId() {
		return mobId;
	}
	public void setMobId(Integer mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public Double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}
	public String getchoice() {
		return choice;
	}
	public void setchoice(String choice) {
		this.choice = choice;
	}
	
	
}
