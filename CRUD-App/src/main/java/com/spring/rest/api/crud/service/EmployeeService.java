package com.spring.rest.api.crud.service;

import java.util.List;

import com.spring.rest.api.crud.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmpByID(long id);

	Employee updateEmployee(Employee employee, long id);

	void deleteEmployee(long id);
}
