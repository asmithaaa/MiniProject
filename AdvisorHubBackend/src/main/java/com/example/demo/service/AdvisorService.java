package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Advisor;
import com.example.demo.repository.AdvisorRepo;



@Service
public class AdvisorService {
	@Autowired
	private AdvisorRepo prepo;
	
	public List<Advisor> getAdvisor() {
		return prepo.findAll();
	}
	public Optional<Advisor> findAdvisor(int aid) {
		return prepo.findById(aid);
	}
	public Advisor addAdvisor(Advisor advisor) {
		return prepo.save(advisor);
	}
	
	public Advisor editAdvisor(Advisor advisor,int aid) {
		Advisor xadvisor = prepo.findById(aid).orElse(null);
		if(xadvisor !=null) {
			xadvisor.setFirst_Name(advisor.getFirst_Name());
			xadvisor.setLast_Name(advisor.getLast_Name());
			xadvisor.setEmail_Id(advisor.getEmail_Id());
			xadvisor.setMobile_No(advisor.getMobile_No());
			xadvisor.setGender(advisor.getGender());
			xadvisor.setEducation_Qualification(advisor.getEducation_Qualification());
			xadvisor.setAge(advisor.getAge());
			xadvisor.setYears_of_experience(advisor.getYears_of_experience());
			xadvisor.setStream(advisor.getStream());
			xadvisor.setPassword(advisor.getPassword());
			xadvisor.setConfirm_Password(advisor.getConfirm_Password());
//			xadvisor.setAge(advisor.getAge());
			return prepo.saveAndFlush(xadvisor);
		}
		else {
			return null;
		}
	}
	
	public String deleteAdvisor(int aid) {
		Advisor xadvisor = prepo.findById(aid).orElse(null);
		
		if(xadvisor !=null) {
			prepo.deleteById(aid);
			return " advisor deleted"+ aid;
		}
		else {
			return "invalid userID";
		}
	}
}
