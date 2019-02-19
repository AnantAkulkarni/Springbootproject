package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Employee;
import com.example.model.EmployeeSalary;
import com.example.repository.EmployeeSalaryJpa;

@Component
public class EmployeeSalarySerivce {

	@Autowired
	EmployeeSalaryJpa employeeSalaryJpa;
	
	
	
	
	public List<EmployeeSalary> findall() {
		// TODO Auto-generated method stub
		return employeeSalaryJpa.findAll();
	}


	public void insertEmployeeSalary(EmployeeSalary employeeSalary) {
		// TODO Auto-generated method stub
		employeeSalaryJpa.save(employeeSalary);
	}
	
}
