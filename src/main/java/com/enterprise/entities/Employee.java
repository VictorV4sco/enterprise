package com.enterprise.entities;

import java.time.LocalDate;

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
	private Long id_employee;
	
	@Column
	private EmployeeStatus status;
	
	@Column
	private String name;
	
	@Column
	private Double salary;
	
	@Column
	private LocalDate hired_date;
	
	@Column
	private String dissmissial_date;
	
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

	public Employee(Long id_employee, EmployeeStatus status, String name, Double salary, LocalDate hired_date,
			String dissmissial_date, JobPosition jobPosition, String state, String city, String neiborhood,
			String address, Long zipCode) {
		this.id_employee = id_employee;
		this.status = status;
		this.name = name;
		this.salary = salary;
		this.hired_date = hired_date;
		this.dissmissial_date = dissmissial_date;
		this.jobPosition = jobPosition;
		this.state = state;
		this.city = city;
		this.neiborhood = neiborhood;
		this.address = address;
		this.zipCode = zipCode;
	}

	public Long getId_employee() {
		return id_employee;
	}

	public void setId_employee(Long id_employee) {
		this.id_employee = id_employee;
	}

	public EmployeeStatus getStatus() {
		return status;
	}

	public void setStatus(EmployeeStatus status) {
		this.status = status;
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

	public LocalDate getHired_date() {
		return hired_date;
	}

	public void setHired_date(LocalDate hired_date) {
		this.hired_date = hired_date;
	}

	public String getDissmissial_date() {
		return dissmissial_date;
	}

	public void setDissmissial_date(String dissmissial_date) {
		this.dissmissial_date = dissmissial_date;
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
