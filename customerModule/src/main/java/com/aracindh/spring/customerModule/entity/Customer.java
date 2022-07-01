package com.aracindh.spring.customerModule.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "customer")

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String address;

	private String emailId;

	private String contact_number;

	private String requirement;
	
	@OneToMany(targetEntity = CustomerRequirement.class, cascade = CascadeType.ALL )
	@JoinColumn(name = "cr_fk", referencedColumnName="id")
	private List<CustomerRequirement> customerRequirement;

}
