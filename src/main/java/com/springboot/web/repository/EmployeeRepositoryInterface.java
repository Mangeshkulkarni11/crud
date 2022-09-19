package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.web.model.Employee;

public interface EmployeeRepositoryInterface extends JpaRepository<Employee,Integer> {
	
	
	
}
                                          