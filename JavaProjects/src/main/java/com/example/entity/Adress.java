package com.example.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@table(name="Adress")
public class Adress {
	
	private String country;
	
	private String state;
	
	@Id
	private Long zipcode;
	
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	
}
