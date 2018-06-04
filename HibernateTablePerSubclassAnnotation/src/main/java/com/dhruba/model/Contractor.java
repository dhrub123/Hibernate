package com.dhruba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Contractor101")
@PrimaryKeyJoinColumn(name="ID")  
public class Contractor extends Employee {
	
	@Column(name="payPerHour")
	private float payPerHour;
	@Column(name="contractPeriod")
	private String contractPeriod;
	
	public float getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}
	public String getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
}
