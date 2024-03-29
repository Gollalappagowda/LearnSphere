package com.learnSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
	
	Users findByEmail(String email);

}
