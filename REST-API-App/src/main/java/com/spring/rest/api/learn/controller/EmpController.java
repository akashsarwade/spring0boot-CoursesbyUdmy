package com.spring.rest.api.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.api.learn.entity.Employee;
import com.spring.rest.api.learn.services.EmployeeService;

@RestController // RestController and Controller we send data in JSON and XML form
@RequestMapping("/") //
public class EmpController {

	@Autowired//this will create the object of EmpServiceImpl class and inject into "employeeService" it
	private EmployeeService employeeService;//autowired meant I want object of "EmpServiceImpl" class 
	
//	http://localhost:8080/employee/hello
	@GetMapping("/hello") // @GetMapping annotation is used to map the HTTP GET request with the URL
							// "/hello" to the hello() method of the MyController class. When a user
							// navigates to the URL "/hello" in their web browser, the hello() method is
							// called and returns the String "Hello, World!" as the response. By using the
							// @GetMapping annotation, you can easily map incoming HTTP requests to specific
							// methods in your controller classes, making it easier to handle and respond to
							// user requests in your Spring Boot application.
	public String hello() {
		return "Welcome to Employee Data Management Tool";
	}

	// get All Employees

	@GetMapping("/GetAllEmp")
	public List<Employee> getEmployees() {

		return this.employeeService.getEmployees();//this method call to getEmployees();method which present in  the EmployeeService using  employeeService reference variable  
	}

	@GetMapping("/GetEmp/{Eid}")
	public Employee getEmpById(@PathVariable String Eid) {
		return this.employeeService.getEmployee(Long.parseLong(Eid));
	}
	
	@PostMapping("/addEmp")
	public Employee addEmp(@RequestBody Employee employee) {
	
		return this.employeeService.addEmp(employee);
	}
	
	@PutMapping("/updateEmp")
	public Employee updateEmp() {
		return
	}
	
}
