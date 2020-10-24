package com.datajpa.application.onetoone.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Employee is parent class and make it as unique then it relationship is one to one;
 * @author NAGA VARAPRASAD P
 *
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="oto1_employee")
public class Employee {
	@Id
	private Integer eId;
	private String email;
	private String firstName;
	private String lastName;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acc_id",unique=true)
	Account account;
}
