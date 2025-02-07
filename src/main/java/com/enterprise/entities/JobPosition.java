package com.enterprise.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJobPosition;
	
	private String name;
	
	@OneToMany(mappedBy = "jobPosition", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Employee> employees = new HashSet<>();
	
	public JobPosition() {
	}

	public JobPosition(Long idJobPosition, String name, Set<Employee> employees) {
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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employees, idJobPosition, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobPosition other = (JobPosition) obj;
		return Objects.equals(employees, other.employees) && Objects.equals(idJobPosition, other.idJobPosition)
				&& Objects.equals(name, other.name);
	}

		
}
