package com.learnSphere.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.services.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerService trainerService;
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute Course course) {
		trainerService.addCourse(course);
		return "trainerHome";
	}
	
	@PostMapping("/addLessons")
	public String addLesson(@ModelAttribute Lesson lesson) {
		trainerService.addLesson(lesson);
		return "trainerHome";
	}
	
	@GetMapping("/viewAllCourses")
	public String viewAllCourses(Model model) {
		List<Course> courses=trainerService.courseList();
//		System.out.println(courses);
		model.addAttribute("courses", courses);
		return "allCourses";
	}
	
	@GetMapping("/viewLessons")
	public String viewAllLessons(@RequestParam("courseId") int courseId, Model model) {
	    List<Lesson> lessons = trainerService.getLessonsByCourseId(courseId);
	    System.out.println(lessons);
	    model.addAttribute("lessons", lessons);
	    return "viewLessons";
	}

}
