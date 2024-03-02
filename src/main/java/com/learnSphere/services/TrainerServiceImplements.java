package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.repository.CourseRepository;
import com.learnSphere.repository.LessonRepository;

@Service
public class TrainerServiceImplements implements TrainerService {
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	LessonRepository lessonRepository;
	
	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}

	@Override
	public Course getCourse(int courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public List<Course> courseList() {
	    return courseRepository.findAll();
	}
	
	@Override
	public List<Lesson> lessonList() {
	    return lessonRepository.findAll();
	}

	@Override
	public List<Lesson> getLessonsByCourseId(int courseId) {
		Course course=courseRepository.findById(courseId).get();
		return lessonRepository.findByCourse(course);
	}
}