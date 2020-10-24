package com.datajpa.application.onetoone.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.datajpa.application.onetoone.models.Account;
import com.datajpa.application.onetoone.models.Employee;
import com.datajpa.application.onetoone.repo.AccountRepository;
import com.datajpa.application.onetoone.repo.EmployeeRepository;
@Component
public class DataSaveRunner implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("############One ->One##########");

//withOutCascade();
		withCascade();
			System.out.println("############One -End Of->One##########");

	
	}
	
	private void withCascade() {
		// TODO Auto-generated method stub

		Account account1=new Account(10,"306077479");
		Account account2=new Account(11,"306077478");
		
		
		Employee emp1=new Employee(300,"nvprasad@gmail.com","prasad","puppala",account1);
		Employee emp2=new Employee(322,"nvprasad@gmail.com","prasad","puppala",account2);
		
//		accountRepository.save(account1);
//		accountRepository.save(account2);
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		
	}

	
	private void withOutCascade() {
		// TODO Auto-generated method stub

		Account account1=new Account(10,"306077479");
		Account account2=new Account(11,"306077478");
		
		
		Employee emp1=new Employee(300,"nvprasad@gmail.com","prasad","puppala",account1);
		Employee emp2=new Employee(322,"nvprasad@gmail.com","prasad","puppala",account2);
		
		accountRepository.save(account1);
		accountRepository.save(account2);
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		
	}


	
	
}