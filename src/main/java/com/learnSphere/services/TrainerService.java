package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;

public interface TrainerService {
	
	public void addCourse(Course course);
	public void saveCourse(Course course);
	public void addLesson(Lesson lesson);
	public Course getCourse(int courseId);
	
	public List<Course> courseList();
	List<Lesson> lessonList();
	List<Lesson> getLessonsByCourseId(int courseId);
	 

}
