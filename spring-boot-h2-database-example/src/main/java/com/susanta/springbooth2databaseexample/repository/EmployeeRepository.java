package com.susanta.springbooth2databaseexample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.susanta.springbooth2databaseexample.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	public List<Employee> findByFirstName(String firstName);
	
	public List<Employee> findByLastName(String lastName);
	
	public Employee findById(int id);

}
