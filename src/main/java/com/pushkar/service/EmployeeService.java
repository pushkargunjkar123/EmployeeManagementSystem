package com.pushkar.service;

import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushkar.model.Employee;
import com.pushkar.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}

	public Employee save(Employee employee) {
		if (employee.getId() != null && employeeRepository.exists(employee.getId())) {

			throw new EntityExistsException("Already Existing Entity with ID");
		}
		return employeeRepository.save(employee);
	}

	public Employee update(Employee employee) {
		if (employee.getId() != null && employeeRepository.exists(employee.getId())) {

			throw new EntityExistsException("Already Existing Entity with ID");
		}
		return employeeRepository.save(employee);

	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findOne(Integer id) {
		
		return employeeRepository.findOne(id);
	}
	
    public void delete(Integer id) {
    	
    	employeeRepository.delete(id);
    }
}