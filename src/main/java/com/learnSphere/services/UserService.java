package com.learnSphere.services;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Users;

public interface UserService {
	void addUser(Users user);
	boolean checkEmail(String email);
	boolean validate(String email,String password);
	String getUserRole(String email);
	void updateUser(Users user);
	Users getUser(String email);
	
	void addCourse(Users user, Course course);


}
