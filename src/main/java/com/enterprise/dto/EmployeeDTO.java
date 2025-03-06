package com.enterprise.dto;

import com.enterprise.entities.JobPosition;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EmployeeDTO(
		Long id, 
		@NotBlank(message = "Campo requer preenchimento")
		String name, 
		
		@Positive
		@NotNull
		Double salary, 
		
		@NotBlank(message = "Campo requer preenchimento")
		String hiredDate, 
		
		@NotBlank(message = "Campo requer preenchimento")
		JobPosition jobPosition, 
		String state, 
		String city, 
		String neiborhood, 
		String address, 
		
		@NotBlank(message = "Campo requer preenchimento")
		Long zipCode
		) {}
