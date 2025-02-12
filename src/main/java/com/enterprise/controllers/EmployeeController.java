package com.enterprise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.dto.AllEmployeesDTO;
import com.enterprise.dto.EmployeeDTO;
import com.enterprise.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}

	@GetMapping(value = "/all")
	public ResponseEntity<List<AllEmployeesDTO>> getAllEmployees() throws Exception {
		return new ResponseEntity<>(service.findAllEmployees(), HttpStatus.OK);
	}
}
