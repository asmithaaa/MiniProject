package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserAd;
import com.example.demo.repository.UserRepo;



@Service
public class UserService {
	@Autowired
	private UserRepo urepo;
	
	public List<UserAd> getUser() {
		return urepo.findAll();
	}
	public UserAd addUser(UserAd userAd) {
		return urepo.save(userAd);
	}
	
	public UserAd editUser(UserAd userAd,int uid) {
		UserAd xuser = urepo.findById(uid).orElse(null);
		if(xuser !=null) {
			xuser.setFirst_Name(userAd.getFirst_Name());
			xuser.setLast_Name(userAd.getLast_Name());
			xuser.setEmail_Id(userAd.getEmail_Id());
			xuser.setConfirm_Password(userAd.getConfirm_Password());
			xuser.setGender(userAd.getGender());
			xuser.setMobile_No(userAd.getMobile_No());
			xuser.setAge(userAd.getAge());
			xuser.setStream(userAd.getStream());
			xuser.setPassword(userAd.getPassword());
			return urepo.saveAndFlush(xuser);
		}
		else {
			return null;
		}
	}
	
	public String deleteUser(int uid) {
		UserAd xuser = urepo.findById(uid).orElse(null);
		
		if(xuser !=null) {
			urepo.deleteById(uid);
			return "user deleted"+ uid;
		}
		else {
			return "invalid userID";
		}
		
	}
}
