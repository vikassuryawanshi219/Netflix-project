package com.example.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;
@Entity
public class Users {
	@Id
	@GeneratedValue(generator = "user_id",strategy = GenerationType.AUTO )
	@SequenceGenerator(name = "user_id",sequenceName = "user_id")
	private Integer userId;
	private String userName;
	private long userPhoneNumber;
	private String userCountry;
	private LocalDate dob;
	@ManyToOne
	@JoinColumn(name = "netflix_id")
	private Netflix netflix;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users( String userName, long userPhoneNumber, String userCountry, LocalDate dob) {
		super();
		
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userCountry = userCountry;
		this.dob = dob;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Netflix getNetflix() {
		return netflix;
	}

	public void setNetflix(Netflix netflix) {
		this.netflix = netflix;
	}

	@Override
	public String toString() {
		return "Users [ userName=" + userName + ", userPhoneNumber=" + userPhoneNumber
				+ ", userCountry=" + userCountry + ", dob=" + dob + "]";
	}
	

	
	
	
	

}
