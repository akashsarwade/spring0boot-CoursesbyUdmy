package com.spring.rest.api.crud.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.api.crud.entity.Employee;
import com.spring.rest.api.crud.exception.ResourceNotFoundException;
import com.spring.rest.api.crud.repository.EmployeeRepository;
import com.spring.rest.api.crud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override // we are implementing this method here
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpByID(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		
//		if(employee.isPresent()) {
//			return employee.get();
//		}else
//		{
//			 throw new ResourceNotFoundException("Employee", "id", id);
//		}

		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// we need to check weather given emp id is exist or not
		Employee existingEmp = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));

		existingEmp.setFirstName(employee.getFirstName());
		existingEmp.setLastName(employee.getLastName());
		existingEmp.setEmail(employee.getEmail());
		existingEmp.setAddress(employee.getAddress());
		// save Existing employee to database
		employeeRepository.save(existingEmp);

		return existingEmp;
	}

	@Override
	public void deleteEmployee(long id) {
//		check weather employee exist or not in DB
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
	}

}
