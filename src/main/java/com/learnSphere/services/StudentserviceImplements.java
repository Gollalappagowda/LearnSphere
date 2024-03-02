package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.entity.Users;
import com.learnSphere.repository.UserRepository;

@Service
public class StudentserviceImplements implements StudentService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Lesson getLesson(int lessonId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Course> getMyCourses(String email) {
        Users user = userRepository.findByEmail(email);
        return user.getCourses();
    }
}