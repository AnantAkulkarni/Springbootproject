package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.EmployeeSalary;

public interface EmployeeSalaryJpa extends JpaRepository<EmployeeSalary,Integer> {

}
