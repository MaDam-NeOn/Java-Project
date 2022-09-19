package com.example.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name= "Customers")
public class Customers {

	@Id
	private String userName;

	private String email;
	
	private String phoneNumber;
	
	private int age;
	
	private String createdDate;
	
	@OneToOne(cascade = CascadeType.ALL)
    private List<Adress> adress;
	
	public List<Adress> getAdress() {
		return adress;
	}

	public void setAdress(List<Adress> adress) {
		this.adress = adress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
