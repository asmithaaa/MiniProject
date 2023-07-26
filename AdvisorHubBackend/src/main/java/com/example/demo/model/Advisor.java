package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Advisor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public Long getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(Long mobile_No) {
		Mobile_No = mobile_No;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEducation_Qualification() {
		return Education_Qualification;
	}
	public void setEducation_Qualification(String education_Qualification) {
		Education_Qualification = education_Qualification;
	}
	public int getYears_of_experience() {
		return Years_of_experience;
	}
	public void setYears_of_experience(int years_of_experience) {
		Years_of_experience = years_of_experience;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}
	private String First_Name;
	private String Last_Name;
	private String Email_Id;
	private Long Mobile_No;
	private String Gender;
	private int Age;
	private String Education_Qualification;
	private int Years_of_experience;
	private String Stream;
	private String Password;
	private String Confirm_Password;
	
	
}
