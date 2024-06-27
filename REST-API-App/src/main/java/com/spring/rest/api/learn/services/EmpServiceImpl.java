package com.spring.rest.api.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.api.learn.entity.Employee;

@Service // spring framework identify this is the service class business logic here
public class EmpServiceImpl implements EmployeeService {

	// temp list created to store data
	List<Employee> list;

	// this is constructor
	public EmpServiceImpl() {
		list = new ArrayList<>();
		list.add(new Employee(23, "Akash", "akash@dxc.com", "Pune", "7t8654536"));
		list.add(new Employee(24, "Akash", "akash@dxc.com", "Pune", "7t8654536"));
		list.add(new Employee(25, "Akash", "akash@dxc.com", "Pune", "7t8654536"));

	}

	@Override
	public List<Employee> getEmployees() {
		return list;
	}

	@Override
	public Employee getEmployee(long Eid) {

		Employee e = null;
		for (Employee emp : list)
			if (emp.getId() == Eid) {
				e = emp;
				break;

			}
		return e;
	}

	@Override
	public Employee addEmp(Employee employee) {
		list.add(employee);
		return employee;
	}

}
