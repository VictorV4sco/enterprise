package com.enterprise.dto;

import java.time.LocalDate;

import com.enterprise.entities.EmployeeStatus;
import com.enterprise.entities.JobPosition;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EmployeeDTO(
		Long id, 
		@NotBlank(message = "Campo requer preenchimento")
		String name, 
		
		EmployeeStatus status,
		
		@Positive
		@NotNull
		Double salary, 
		
		@NotBlank(message = "Campo requer preenchimento")
		LocalDate hired_date, 
		
		String dissmissial_date,
		
		@NotBlank(message = "Campo requer preenchimento")
		JobPosition job_position, 
		String state, 
		String city, 
		String neiborhood, 
		String address, 
		
		@NotBlank(message = "Campo requer preenchimento")
		Long zipCode
		) {}
