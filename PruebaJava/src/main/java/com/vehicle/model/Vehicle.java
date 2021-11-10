package com.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.transport.GeneralVariable;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "license")
	private String license = GeneralVariable.EMPTY_STRING;
	
	@Column(name = "engine")
	private String engine = GeneralVariable.EMPTY_STRING;
	
	@Column(name = "chassis")
	private String chassis = GeneralVariable.EMPTY_STRING;

	@Column(name = "model")
	private int model = GeneralVariable.ZERO;

	@Column(name = "registration")
	private String registration = GeneralVariable.EMPTY_STRING;
	
	@Column(name = "sitDownPassengers")
	private int sitDownPassengers = GeneralVariable.ZERO;
	
	@Column(name = "standUpPassengers")
	private int standUpPassengers = GeneralVariable.ZERO;
	
	@Column(name = "dryWeight")
	private String dryWeight = GeneralVariable.EMPTY_STRING;
	
	@Column(name = "grossWeight")
	private String grossWeight = GeneralVariable.EMPTY_STRING;
	
	@Column(name = "doors")
	private int doors = GeneralVariable.ZERO;
	
	@Column(name = "brand")
	private String brand = GeneralVariable.EMPTY_STRING;

	@Column(name = "line")
	private String line = GeneralVariable.EMPTY_STRING;

	public Vehicle() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getSitDownPassengers() {
		return sitDownPassengers;
	}

	public void setSitDownPassengers(int sitDownPassengers) {
		this.sitDownPassengers = sitDownPassengers;
	}

	public int getStandUpPassengers() {
		return standUpPassengers;
	}

	public void setStandUpPassengers(int standUpPassengers) {
		this.standUpPassengers = standUpPassengers;
	}

	public String getDryWeight() {
		return dryWeight;
	}

	public void setDryWeight(String dryWeight) {
		this.dryWeight = dryWeight;
	}

	public String getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

}
