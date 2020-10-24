package com.datajpa.application.manytoone.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.datajpa.application.manytoone.models.Department;
import com.datajpa.application.manytoone.models.Employee;
import com.datajpa.application.manytoone.repo.DepartmentRepository;
import com.datajpa.application.manytoone.repo.EmployeeRepository;
@Component
public class DataSaveRunner implements CommandLineRunner {
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("############Many ->One##########");

//			withOutCascade();
		withCascade();
			System.out.println("############Many -End Of->One##########");

	
	}

	private void withCascade() {
		// TODO Auto-generated method stub

		Department dept = new Department(100, "IT");
		Department dept1 = new Department(101, "Finance");
		Employee emp = new Employee(1002, "developer", "prasad", dept);
		Employee emp1 = new Employee(1003, "developer", "Vinay", dept);
		Employee emp2 = new Employee(1004, "Finadmin", "krishna", dept1);
		//departmentRepository.save(dept);
		//departmentRepository.save(dept1);
		employeeRepository.save(emp);
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);

	}
	
	private void withOutCascade() {
		// TODO Auto-generated method stub

		Department dept = new Department(100, "IT");
		Department dept1 = new Department(101, "Finance");
		Employee emp = new Employee(1002, "developer", "prasad", dept);
		Employee emp1 = new Employee(1003, "developer", "Vinay", dept);
		Employee emp2 = new Employee(1004, "Finadmin", "krishna", dept1);
		departmentRepository.save(dept);
		departmentRepository.save(dept1);
		employeeRepository.save(emp);
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);

	}


	
	
}