package com.aracindh.spring.customerModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aracindh.spring.customerModule.entity.CustomerRequirement;

public interface CustomerRequirementRepository extends JpaRepository<CustomerRequirement, Long> {

}
