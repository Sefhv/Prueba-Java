package com.transport.model;

import com.transport.GeneralVariable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EnterpriseTransport")
public class EnterpriseTransport {

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

	@Column(name = "legalDocumentType")
	private String legalDocumentType = GeneralVariable.EMPTY_STRING;

	@Column(name = "legalDocumentNumber")
	private int legalDocumentNumber = GeneralVariable.ZERO;

	@Column(name = "legalName")
	private String legalName = GeneralVariable.EMPTY_STRING;

	@Column(name = "legalAddress")
	private String legalAddress = GeneralVariable.EMPTY_STRING;

	@Column(name = "legalCity")
	private String legalCity = GeneralVariable.EMPTY_STRING;

	@Column(name = "legalDepartment")
	private String legalDepartment = GeneralVariable.EMPTY_STRING;

	@Column(name = "legalCountry")
	private String legalCountry = GeneralVariable.EMPTY_STRING;

	@Column(name = "legalPhone")
	private String legalPhone = GeneralVariable.EMPTY_STRING;

	public EnterpriseTransport() {

	}

	// GETTERS AND SETTERS
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

	public String getLegalDocumentType() {
		return legalDocumentType;
	}

	public void setLegalDocumentType(String legalDocumentType) {
		this.legalDocumentType = legalDocumentType;
	}

	public int getLegalDocumentNumber() {
		return legalDocumentNumber;
	}

	public void setLegalDocumentNumber(int legalDocumentNumber) {
		this.legalDocumentNumber = legalDocumentNumber;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLegalAddress() {
		return legalAddress;
	}

	public void setLegalAddress(String legalAddress) {
		this.legalAddress = legalAddress;
	}

	public String getLegalCity() {
		return legalCity;
	}

	public void setLegalCity(String legalCity) {
		this.legalCity = legalCity;
	}

	public String getLegalDepartment() {
		return legalDepartment;
	}

	public void setLegalDepartment(String legalDepartment) {
		this.legalDepartment = legalDepartment;
	}

	public String getLegalCountry() {
		return legalCountry;
	}

	public void setLegalCountry(String legalCountry) {
		this.legalCountry = legalCountry;
	}

	public String getLegalPhone() {
		return legalPhone;
	}

	public void setLegalPhone(String legalPhone) {
		this.legalPhone = legalPhone;
	}
}
