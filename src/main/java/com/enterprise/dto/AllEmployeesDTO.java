package com.enterprise.dto;

import java.time.LocalDate;

import com.enterprise.entities.EmployeeStatus;
import com.enterprise.entities.JobPosition;

public record AllEmployeesDTO(
		Long id, 
		String name,
		EmployeeStatus status,
		LocalDate hiredDate, 
		String dissmissialDate,
		JobPosition jobPosition 
		) {}
