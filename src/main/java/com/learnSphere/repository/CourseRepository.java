package com.learnSphere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	List<Course> findAll();
}
