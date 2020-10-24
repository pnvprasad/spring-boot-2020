package com.datajpa.application.manytoone.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mto1_department")
public class Department {
	@Id
	private Integer deptid;
	private String deptName;
	
}
