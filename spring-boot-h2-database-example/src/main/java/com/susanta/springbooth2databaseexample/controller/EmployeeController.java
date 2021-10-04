package com.susanta.springbooth2databaseexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susanta.springbooth2databaseexample.model.Employee;
import com.susanta.springbooth2databaseexample.service.EmployeeService;

@RestController
@RequestMapping("/1.0")
public class EmployeeController {

	
		@Autowired
		EmployeeService employeeService;


		@GetMapping("/employee")
	    public List<Employee> getListEmployee() {
	        return employeeService.getListOfEmployee();
	    }
		
		@GetMapping("/employee/{id}")
	    public Employee getEmployeeById(@PathVariable int id) {
	        return employeeService.getEmployeeById(id);
	    }
		

		@PutMapping("/employee")
		private int updateEmployee(@RequestBody Employee employee) {
			employeeService.saveOrUpdate(employee);
			return employee.getId();
		}
	
		
	    @GetMapping("/{firstName}")
	    public List<Employee> findByFirstName(@PathVariable String firstName) {
	    	List<Employee> employeeFirstList = employeeService.findByFirstName(firstName);

	        return employeeFirstList;
	    }
		
	    @GetMapping("/{lastname}")
	    public List<Employee> findByLastName(@PathVariable String lastName) {
	    	List<Employee> employeeLastList = employeeService.findByLastName(lastName);
	        return employeeLastList;
	    }
		
	
		@DeleteMapping("/employee/{id}")
		private void deleteStudent(@PathVariable("id") int id) {
			employeeService.delete(id);
		}


	
	
}
