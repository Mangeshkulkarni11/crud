package com.springboot.web.service;

import java.util.List;

import com.springboot.web.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee employee,int id);
	void deleteEmployee(int id);
}
