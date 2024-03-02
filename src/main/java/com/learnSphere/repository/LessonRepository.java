package com.learnSphere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;

public interface LessonRepository  extends JpaRepository<Lesson, Integer>{
	List<Lesson> findAll();

	List<Lesson> findByCourse(Course course);
}
