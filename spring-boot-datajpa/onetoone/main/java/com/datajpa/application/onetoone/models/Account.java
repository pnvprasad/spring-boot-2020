package com.datajpa.application.onetoone.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.datajpa.application.manytoone.models.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="oto2_department")
public class Account {
	@Id
private Integer aId;
private String accNumber;

}
