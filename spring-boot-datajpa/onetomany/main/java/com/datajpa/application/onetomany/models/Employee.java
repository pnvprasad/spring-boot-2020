package com.datajpa.application.onetomany.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="otm1_employee")
public class Employee {
	@Id
	private Integer eid;
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addr_id",unique=true)
	Address addr;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_eid")
	private List<Phones> phoneList;

}
