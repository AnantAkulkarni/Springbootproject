package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;


public interface EmployeeJpa extends JpaRepository<Employee,Integer>{

	Employee findByName(String name);

}
