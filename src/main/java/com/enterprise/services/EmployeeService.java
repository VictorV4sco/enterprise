package com.enterprise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
						employee.getId_employee(),
						employee.getName(),
						employee.getStatus(),
						employee.getSalary(),
						employee.getHired_date(),
						employee.getDismissal_date(),
						employee.getJobPosition(), 
						employee.getState(),
						employee.getCity(),
						employee.getNeighborhood(), 
						employee.getAddress(), 
						employee.getZipCode()
							);
	}
	
	@Transactional(readOnly = true)
	public Page<AllEmployeesDTO> findAllEmployees(Pageable pageable) {
		Page<Employee> employees = repository.findAll(pageable);
		return employees.map(employee -> new AllEmployeesDTO(employee.getId_employee(), employee.getName(),
				employee.getStatus(), employee.getHired_date(), employee.getDismissal_date() ,employee.getJobPosition()));
	}
	
	@Transactional
	public EmployeeDTO insertEmployee(EmployeeDTO dto) {
		Employee employee = new Employee();

		employee.setName(dto.name());
		employee.setStatus(dto.status());
		employee.setSalary(dto.salary());
		employee.setHired_date(dto.hired_date());
		employee.setDismissal_date(dto.dismissal_date());
		employee.setJobPosition(dto.job_position());
		employee.setState(dto.state());
		employee.setCity(dto.city());
		employee.setNeighborhood(dto.neighborhood());
		employee.setAddress(dto.address());
		employee.setZipCode(dto.zipCode());
		
		Employee save = repository.save(employee);
		
		return new EmployeeDTO(
				save.getId_employee(), 
				save.getName(), 
				save.getStatus(), 
				save.getSalary(), 
				save.getHired_date(), 
				save.getDismissal_date(), 
				save.getJobPosition(), 
				save.getState(), 
				save.getCity(), 
				save.getNeighborhood(), 
				save.getAddress(), 
				save.getZipCode()
				);
	}
	
	public EmployeeDTO updateEmployee(Long id, EmployeeDTO dto) {
			Employee employee = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
			
			employee.setName(dto.name());
			employee.setStatus(dto.status());
			employee.setSalary(dto.salary());
			employee.setHired_date(dto.hired_date());
			employee.setDismissal_date(dto.dismissal_date());
			employee.setJobPosition(dto.job_position());
			employee.setState(dto.state());
			employee.setCity(dto.city());
			employee.setNeighborhood(dto.neighborhood());
			employee.setAddress(dto.address());
			employee.setZipCode(dto.zipCode());
			
			Employee save = repository.save(employee);
			
			return new EmployeeDTO(
					save.getId_employee(), 
					save.getName(), 
					save.getStatus(), 
					save.getSalary(), 
					save.getHired_date(), 
					save.getDismissal_date(), 
					save.getJobPosition(), 
					save.getState(), 
					save.getCity(), 
					save.getNeighborhood(), 
					save.getAddress(), 
					save.getZipCode()
					);
		
	}
	
}
