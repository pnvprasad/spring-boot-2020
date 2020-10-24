package com.datajpa.application.onetomany.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.datajpa.application.onetoone.models.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="otm2_phones")
public class Phones {
	@Id
	private Integer id;
	private String areaCode;
	private Long number;


}
