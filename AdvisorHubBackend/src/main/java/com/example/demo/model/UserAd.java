package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserAd {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String First_Name;
	private String Last_Name;
	private String Email_Id;
	private Long Mobile_No;	
	private String Gender;
	private int Age;
	private String Stream;
	private String Password;
	private String Confirm_Password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String First_Name) {
		this.First_Name = First_Name;
	}
	public String getEmail_Id() {
		return Email_Id
;
	}
	public void setEmail_Id(String Email_Id) {
		this.Email_Id= Email_Id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public Long getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(Long Mobile_No) {
		this.Mobile_No = Mobile_No;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password= Password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String Confirm_Password) {
		this.Confirm_Password = Confirm_Password;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String Stream) {
		this.Stream = Stream;
	}
	
}
