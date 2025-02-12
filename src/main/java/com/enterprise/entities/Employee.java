package com.enterprise.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmployee;
	
	@Column
	private String name;
	
	@Column
	private Double salary;
	
	@Column(name = "hired_date")
	private String hiredDate;
	
	@Column(name = "dismissal_date")
	private String dismissalDate;
	
	@ManyToOne
	@JoinColumn(name = "idJobPosition")
	private JobPosition jobPosition;
	
	@Column
	private String state;
	
	@Column
	private String city;
	
	@Column
	private String neiborhood;
	
	@Column
	private String address;
	
	@Column(name = "zip_code")
	private Long zipCode;
	
	public Employee() {
	}

	public Employee(Long idEmployee, String name, Double salary, String hiredDate, String dismissalDate,
			JobPosition jobPosition, String state, String city, String neiborhood, String address, Long zipCode) {
		super();
		this.idEmployee = idEmployee;
		this.name = name;
		this.salary = salary;
		this.hiredDate = hiredDate;
		this.dismissalDate = dismissalDate;
		this.jobPosition = jobPosition;
		this.state = state;
		this.city = city;
		this.neiborhood = neiborhood;
		this.address = address;
		this.zipCode = zipCode;
	}

	public Long getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getDismissalDate() {
		return dismissalDate;
	}

	public void setDismissalDate(String dismissalDate) {
		this.dismissalDate = dismissalDate;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeiborhood() {
		return neiborhood;
	}

	public void setNeiborhood(String neiborhood) {
		this.neiborhood = neiborhood;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	
}	
