package com.learnSphere.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnSphere.entity.Course;
import com.learnSphere.services.StudentService;
import com.learnSphere.services.TrainerService;
import com.learnSphere.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	
	@Autowired
	TrainerService trainerService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/pay")
	public String pay(Model model, HttpSession session) {
		
	    List<Course> courses = trainerService.courseList();
	    model.addAttribute("courses", courses);
	    return "pay";
	}

	
	@GetMapping("/myCourses")
	public String viewMyCourses(Model model, HttpSession session) {
		//important
	    String email = (String) session.getAttribute("email");
	    
	    List<Course> myCourses = studentService.getMyCourses(email);
	    model.addAttribute("courses", myCourses);
	    return "myCourses";
	}

}
