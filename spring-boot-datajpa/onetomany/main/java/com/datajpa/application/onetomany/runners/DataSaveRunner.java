package com.datajpa.application.onetomany.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.datajpa.application.onetomany.models.Address;
import com.datajpa.application.onetomany.models.Employee;
import com.datajpa.application.onetomany.models.Phones;
import com.datajpa.application.onetomany.repo.AddressRepository;
import com.datajpa.application.onetomany.repo.EmployeeRepository;
import com.datajpa.application.onetomany.repo.PhonesRepository;
@Component
public class DataSaveRunner implements CommandLineRunner {
	@Autowired
	AddressRepository  addressRepository;
	@Autowired
	PhonesRepository phonesRepository;
	@Autowired
	EmployeeRepository employeeRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub


			withCascade();
	}


public void withCascade() throws Exception {
	// TODO Auto-generated method stub

	
	Phones ph1=new Phones(10,"+91",9032068590l);
	Phones ph2=new Phones(11,"+91",9110889349l);
	Phones ph3=new Phones(12,"+91",9110889342l);
	System.out.println("############ One-->Many ############");
	Address addr1=new Address(111,"Machilipatname",521329);
	Address addr2=new Address(112,"Vijayawada",521430);
	
	Employee emp1=new Employee(100, "nvprasad",addr1,Arrays.asList(ph1,ph2));
	Employee emp2=new Employee(1001, "Krishna",addr2,Arrays.asList(ph3,ph1));
	
	//phonesRepository.save(ph1);
	//phonesRepository.save(ph2);
	employeeRepository.save(emp1);
	employeeRepository.save(emp2);

	System.out.println("############ One- End---->Many ############");
}
	
	
	
	public void withoutCascade() throws Exception {
	// TODO Auto-generated method stub

	System.out.println("############ One-->Many ############");
	
	Address addr1=new Address(111,"Machilipatname",521329);
	Address addr2=new Address(112,"Vijayawada",521430);
	
	Phones ph1=new Phones(1,"+91",9032068591l);
	Phones ph2=new Phones(2,"+91",9110889349l);
	Phones ph3=new Phones(12,"+91",9110889342l);
	Employee emp1=new Employee(200, "nvprasad",addr1,Arrays.asList(ph1,ph2));
	Employee emp2=new Employee(201, "Krishna",addr2,Arrays.asList(ph1,ph3));
	
	addressRepository.save(addr1);
	addressRepository.save(addr2);
	
	phonesRepository.save(ph1);
	phonesRepository.save(ph2);
	
	employeeRepository.save(emp1);
	employeeRepository.save(emp2);
	System.out.println("############ One- End---->Many ############");
}

}