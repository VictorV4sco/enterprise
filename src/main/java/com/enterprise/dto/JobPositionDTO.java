package com.enterprise.dto;

import java.util.List;

import com.enterprise.entities.Employee;

public record JobPositionDTO(
		Long id,
		String nome,
		List<Employee> employees
		) {}
