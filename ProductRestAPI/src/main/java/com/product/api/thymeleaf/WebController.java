package com.product.api.thymeleaf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.product.api.thymeleaf.model.Student;

@Controller
public class WebController {

	@RequestMapping("/hello")
	public String hello() {
		return "index";
	}

	// sending data
	@RequestMapping("/sendData")
	public ModelAndView sendData() {

		ModelAndView mav = new ModelAndView("data");
		mav.addObject("message", "take up one idean and make it your life");
		return mav;
	}

	// sending Object

	@RequestMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView mav = new ModelAndView("student");
		Student student = new Student();// learn how to send object to the template
		student.setName("Akash");
		student.setAddress("Sai Nagar Pune");
		student.setId(1332);
		mav.addObject("student", student);
		return mav;

	}

	// Rendering multiple records

	@RequestMapping("/students")
	public ModelAndView getStudents() {
		ModelAndView mav = new ModelAndView("studentList");

		Student student = new Student();
		student.setName("Rakesh PAtil");
		student.setAddress("Kalyani Nagar Pune");
		student.setId(89);

		Student stud2 = new Student();
		stud2.setName("Rohini Lokhande");
		stud2.setAddress("Viman Nagar Pune");
		stud2.setId(643);

		Student stud3 = new Student();
		stud3.setName("Priyanka Sutar");
		stud3.setAddress("Shivaji Nagar Pune");
		stud3.setId(543);

		Student stud4 = new Student();
		stud4.setName("Pradip pawar");
		stud4.setAddress("Nagar Pune");
		stud4.setId(123);

		List<Student> allstudents = Arrays.asList(student, stud2, stud3, stud4);

		mav.addObject("students", allstudents);
		return mav;

	}

	@RequestMapping("/studentForm")
	public ModelAndView studentForm() {
		ModelAndView mav = new ModelAndView("studentForm");
		Student student = new Student();// learn how to send object to the template
		student.setName("Akash");
		student.setAddress("Sai Nagar Pune");
		student.setId(1332);
		mav.addObject("student", student);
		return mav;
	}

	// process form data
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView("result");
		System.out.println(student.getName()+": "+ student.getAddress());
		return mav;
	}

}
