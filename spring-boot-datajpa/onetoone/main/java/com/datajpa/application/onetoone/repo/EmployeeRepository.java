package com.datajpa.application.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.onetoone.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
