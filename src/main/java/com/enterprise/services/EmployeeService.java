package com.enterprise.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enterprise.dto.AllEmployeesDTO;
import com.enterprise.dto.EmployeeDTO;
import com.enterprise.entities.Employee;
import com.enterprise.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public EmployeeDTO findById(Long id) throws Exception {
		try {
			Employee employee = repository.findById(id).orElseThrow(() -> new Exception("Id" + id + "not found"));
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
		} catch (Exception e) {
			throw e;
		}
	}
	
	public List<AllEmployeesDTO> findAllEmployees() throws Exception {
		try {
			List<Employee> employees = repository.findAll();
			
			if (employees.isEmpty()) {
				throw new Exception("Employees not found");
			}
			
			return employees.stream().map(employee -> new AllEmployeesDTO(employee.getIdEmployee(), employee.getName(),
					employee.getHiredDate(), employee.getDismissalDate(), employee.getJobPosition())).collect(Collectors.toList());
			
		} catch (Exception e) {
			throw e;
		}
	}
}
