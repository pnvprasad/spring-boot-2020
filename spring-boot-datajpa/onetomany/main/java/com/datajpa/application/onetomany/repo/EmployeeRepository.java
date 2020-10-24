package com.datajpa.application.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.onetomany.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
