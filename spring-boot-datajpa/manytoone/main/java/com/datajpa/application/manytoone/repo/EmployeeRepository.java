package com.datajpa.application.manytoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.manytoone.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
