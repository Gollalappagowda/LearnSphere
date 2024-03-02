package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;

public interface StudentService {
	Lesson getLesson(int lessonId);
	List<Course> getMyCourses(String email);

}
