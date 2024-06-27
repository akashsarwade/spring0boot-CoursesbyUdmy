package com.spring.rest.api.learn.services;

import java.util.List;

import com.spring.rest.api.learn.entity.Employee;
//this is employee service interface and we declare methods here and implement in implementation class
public interface EmployeeService {

	public List<Employee>getEmployees();
	public Employee getEmployee(long Eid);
	public Employee addEmp(Employee employee);
}
