package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.model.EmployeeSalary;
import com.example.service.EmployeeSalarySerivce;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeSalarySerivce employeeSalaryService;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee()
	{
		try
		{
		return employeeService.getAllEmployee();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/get/{name}")
	public Employee getEmployee(@PathVariable final String name)
	{
		return employeeService.getAllEmployeeByName(name);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/save")
	public void insertEmployee(@RequestBody Employee employee)
	{
		employeeService.insertEmployee(employee);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/savesalary")
	public void insertEmployee(@RequestBody EmployeeSalary employeeSalary)
	{
		employeeSalaryService.insertEmployeeSalary(employeeSalary);
	}
	
	
	
	@GetMapping("/load/{name}")
	public List<EmployeeSalary> loaddata(@PathVariable final String name)
	{
		try
		{
		
		Employee employee=new Employee();
		
		employee.setName(name);
		employee.setCity("blr");
		
		EmployeeSalary employeeSalary = new EmployeeSalary();
		employeeSalary.setSalary(1000);
		employeeSalary.setEmployee(employee);
		
		
		employeeSalaryService.insertEmployeeSalary(employeeSalary);
		}catch(Exception exception)
		{
			exception.printStackTrace();
		}
		
		return employeeSalaryService.findall();
	}
	
	
	@GetMapping("/getSalaryAll")
	public List<EmployeeSalary> getAllEmployeeSalary()
	{
		try
		{
		return employeeSalaryService.findall();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
