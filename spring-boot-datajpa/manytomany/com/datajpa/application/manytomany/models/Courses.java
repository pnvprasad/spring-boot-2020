package com.datajpa.application.manytomany.models;

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
@Table(name="mtm2_courses")
public class Courses {
	@Id
	private Integer cid;
	private String courseName;

}
