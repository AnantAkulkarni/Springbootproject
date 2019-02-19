package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.model.Employee;
import com.example.repository.EmployeeJpa;

@Component
public class EmployeeService {

	@Autowired
	EmployeeJpa employejpa;
	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employejpa.findAll();
	}
	
	public void insertEmployee(Employee employee)
	{
		employejpa.save(employee);
	}
	
	public Employee getAllEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employejpa.findByName(name);
	}
	

}
