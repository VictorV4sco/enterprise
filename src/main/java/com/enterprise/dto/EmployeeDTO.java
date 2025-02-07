package com.enterprise.dto;

import com.enterprise.entities.JobPosition;

public record EmployeeDTO(
		Long id, 
		String name, 
		Double salary, 
		String hiredDate, 
		String dismissalDate,
		JobPosition jobPosition, 
		String state, 
		String city, 
		String neiborhood, 
		String address, 
		Long zipCode
		) {}
