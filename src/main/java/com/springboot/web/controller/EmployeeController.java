package com.springboot.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.Employee;
import com.springboot.web.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private  EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//build create employee rest API
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
	return	new ResponseEntity <Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}

	//build get all employees rest API
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	//build get employee Id rest API
	//http:localhost:8080/api/employee
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")int id)
	{
		return new ResponseEntity <Employee>(employeeService.getEmployeeById(id),HttpStatus.OK);
	}
	
	//build update rest API
	//http://localhost:8080/api/employees/1
	@PutMapping("{id}")
	public ResponseEntity<Employee>updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),HttpStatus.OK);
		
	}
	
	//BUILD DELETe REST API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
		//delete employee from DB
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("employee deleted succsefully",HttpStatus.OK);
	
}

	
}
