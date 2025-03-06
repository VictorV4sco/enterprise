package com.enterprise.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enterprise.dto.AllEmployeesDTO;
import com.enterprise.dto.EmployeeDTO;
import com.enterprise.entities.Employee;
import com.enterprise.repositories.EmployeeRepository;
import com.enterprise.services.exceptions.ResourceNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Transactional(readOnly = true)
	public EmployeeDTO findById(Long id) {
		
		Employee employee = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
		return new 
				EmployeeDTO(
						employee.getIdEmployee(),
						employee.getName(),
						employee.getSalary(),
						employee.getHiredDate(), 
						employee.getDismissalDate(), 
						employee.getJobPosition(), 
						employee.getState(),
						employee.getCity(),
						employee.getNeiborhood(), 
						employee.getAddress(), 
						employee.getZipCode()
							);
	}
	
	public List<AllEmployeesDTO> findAllEmployees() {
		
		List<Employee> employees = repository.findAll();
		return employees.stream().map(employee -> new AllEmployeesDTO(employee.getIdEmployee(), employee.getName(),
				employee.getHiredDate(), employee.getDismissalDate(), employee.getJobPosition())).collect(Collectors.toList());
	}
}
