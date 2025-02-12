package com.enterprise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
