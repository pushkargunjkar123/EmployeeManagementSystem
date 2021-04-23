package com.pushkar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pushkar.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	Employee findByName(String name);
	
}