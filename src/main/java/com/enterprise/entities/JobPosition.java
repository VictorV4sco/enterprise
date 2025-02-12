package com.enterprise.entities;

import java.util.ArrayList;
import java.util.List;

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
	private List<Employee> employees = new ArrayList<>();
	
	public JobPosition() {
	}

	public JobPosition(Long idJobPosition, String name, List<Employee> employees) {
		super();
		this.idJobPosition = idJobPosition;
		this.name = name;
		this.employees = employees;
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
