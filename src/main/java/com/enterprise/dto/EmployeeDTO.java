package com.enterprise.dto;

import java.time.LocalDate;

import com.enterprise.entities.EmployeeStatus;
import com.enterprise.entities.JobPosition;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public record EmployeeDTO(
		Long id, 
		
		@NotBlank(message = "Campo requer preenchimento")
		String name, 
		
		@NotNull(message = "O status do funcionário é obrigatório")
		EmployeeStatus status,
		
		@Positive(message = "O salário deve ser maior que zero")
		@NotNull(message = "O salário é obrigatório")
		Double salary, 
		
		@NotNull(message = "Data de contratação é obrigatória")
		@PastOrPresent(message = "Data de contratação não pode ser no futuro")
		LocalDate hired_date, 
		
		@PastOrPresent(message = "Data de desligamento não pode ser no futuro")
		LocalDate dismissal_date,
		
		@NotNull(message = "Cargo é obrigatório")
		@Valid
		JobPosition job_position, 
		
		@NotBlank(message = "Campo requer preenchimento")
		String state, 
		
		@NotBlank(message = "Campo requer preenchimento")
		String city, 
		
		@NotBlank(message = "Campo requer preenchimento")
		String neighborhood, 
		
		@NotBlank(message = "Campo requer preenchimento")
		String address, 
		
		@NotNull
		Long zipCode
		) {}
