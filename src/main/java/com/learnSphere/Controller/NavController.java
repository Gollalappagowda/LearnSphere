package com.learnSphere.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnSphere.entity.Course;
import com.learnSphere.services.TrainerService;

@Controller
public class NavController {
	
	@Autowired
	TrainerService trainerService;

	@GetMapping("/register")
    public String register() {
        return "register";
    }
	@GetMapping("/login")
    public String login() {
        return "login";
    }
	@GetMapping("/createCourse")
    public String createCourse() {
        return "createCourse";
    }
	@GetMapping("/addLesson")
    public String addLesson(Model model) {
		List<Course> courseList=trainerService.courseList();
		model.addAttribute("courses", courseList);
        return "addLesson";
    }
	@GetMapping("/trainerHome")
    public String trainerHome() {
        return "trainerHome";
    }
	@GetMapping("/studentHome")
    public String studentHome() {
        return "studentHome";
    }
	@GetMapping("/index")
    public String Home() {
        return "index";
    }
	@GetMapping("/forgotPassword")
    public String forgotPassword() {
        return "resetPassword";
    }
}