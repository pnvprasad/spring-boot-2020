package com.datajpa.application.manytoone.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Parent class of many to one relation ship and department is child::: many --<>Employee and one --<>Department
 * @author NAGA VARAPRASAD P
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mto2_employee")
public class Employee {
	@Id
	private Integer empId;
	private String designation;
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_deptId")
	Department dept;
	
}
