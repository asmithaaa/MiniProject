package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserAd;



public interface UserRepo extends JpaRepository<UserAd, Integer> {

}
