package com.datajpa.application.manytoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.manytoone.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
