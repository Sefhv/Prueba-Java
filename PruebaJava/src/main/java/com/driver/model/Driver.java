package com.driver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.transport.GeneralVariable;

@Entity
@Table(name = "Driver")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "documentType")
	private String documentType = GeneralVariable.EMPTY_STRING;

	@Column(name = "documentNumber")
	private int documentNumber = GeneralVariable.ZERO;

	@Column(name = "name")
	private String name = GeneralVariable.EMPTY_STRING;

	@Column(name = "address")
	private String address = GeneralVariable.EMPTY_STRING;

	@Column(name = "city")
	private String city = GeneralVariable.EMPTY_STRING;

	@Column(name = "department")
	private String department = GeneralVariable.EMPTY_STRING;

	@Column(name = "country")
	private String country = GeneralVariable.EMPTY_STRING;

	@Column(name = "phone")
	private String phone = GeneralVariable.EMPTY_STRING;

	public Driver() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
