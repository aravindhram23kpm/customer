package com.aracindh.spring.customerModule.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "requirements")


public class CustomerRequirement {
	@Id
	private Long id;
	private String property_type;
	private String budget;
	private String locality;
	

}
