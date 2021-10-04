package com.susanta.springbooth2databaseexample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susanta.springbooth2databaseexample.model.Employee;
import com.susanta.springbooth2databaseexample.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getListOfEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> empList.add(employee));
		return empList;
	}

	public void saveOrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
	}

	public List<Employee> findByFirstName(String firstName) {
		List<Employee> empList = employeeRepository.findByFirstName(firstName);
		
		return empList;
		
	}

	public List<Employee> findByLastName(String lastName) {
		List<Employee> empList = employeeRepository.findByFirstName(lastName);	
		return empList;		
	}

	public void delete(int id) {
		employeeRepository.deleteById(id);
		
	}

	public Employee getEmployeeById(int id) {
		Employee employee = employeeRepository.findById(id);
		return employee;
	}

}
