package com.enterprise.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
@JsonIncludeProperties({"idJobPosition"})
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJobPosition;
	
	private String name;
	
	@OneToMany(mappedBy = "jobPosition", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Employee> employees = new HashSet<>();
	
	public JobPosition() {
	}

	public JobPosition(Long idJobPosition, String name) {
		this.idJobPosition = idJobPosition;
		this.name = name;
	}

	public Long getIdJobPosition() {
		return idJobPosition;
	}

	public void setIdJobPosition(Long idJobPosition) {
		this.idJobPosition = idJobPosition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
