package com.spring.rest.api.crud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.api.crud.entity.Employee;
import com.spring.rest.api.crud.service.EmployeeService;

@RestController
@RequestMapping("/emp")
@ControllerAdvice

public class EmployeeController {

	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// Build create employee REST API
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.CREATED);
	}

	// Build Get All Employees List

	@GetMapping("/allEmp")
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}

	// Build Get Employee By Id
	@GetMapping("/getEmpById/{id}")
	public ResponseEntity<Employee> getEmpByID(@PathVariable("id") long eid) {
		return new ResponseEntity<Employee>(employeeService.getEmpByID(eid), HttpStatus.OK);
	}

	// Build Update Employee REST API
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}

	// Build DELETE Employee REST API
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long eid) {
		employeeService.deleteEmployee(eid);
		return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);
	}
}
