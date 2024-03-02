package com.learnSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Users;
import com.learnSphere.repository.UserRepository;

@Service
public class UserServiceImplements implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public void addUser(Users user) {
		repo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		if (repo.findByEmail(email) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean validate(String email, String password) {
		Users user = repo.findByEmail(email);
		String db_password = user.getPassword();

		return db_password.equals(password);
	}

	@Override
	public String getUserRole(String email) {
		Users user = repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public void updateUser(Users user) {
		repo.save(user);
	}

	@Override
	public Users getUser(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public void addCourse(Users user, Course course) {
		if (!user.getCourses().contains(course)) {
			user.getCourses().add(course);
			repo.save(user);
		}
	}

}