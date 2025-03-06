package com.enterprise.dto;

import com.enterprise.entities.JobPosition;

public record AllEmployeesDTO(
		Long id, 
		String name,  
		String hiredDate, 
		JobPosition jobPosition 
		) {}
