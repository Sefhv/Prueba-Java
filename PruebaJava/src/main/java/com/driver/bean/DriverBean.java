package com.driver.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.driver.controller.DriverController;
import com.driver.model.Driver;
import com.transport.GeneralVariable;

@ManagedBean(name = "driverBean")
@ViewScoped
public class DriverBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Driver> driverList;
	private Driver driver;
	private DriverController controller;
	private boolean showList;
	private boolean showCreate;
	private boolean showRead;
	private boolean showEdit;
	private String status;

	public DriverBean() {
		init();
		hideAll();
		goIndex();
		readDrivers();
	}

	public void init() {
		driverList = new ArrayList<Driver>(1);
		driver = new Driver();
		controller = new DriverController();
		status = GeneralVariable.EMPTY_STRING;
	}

	public void hideAll() {
		showList = false;
		showCreate = false;
		showRead = false;
		showEdit = false;
	}

	public void goIndex() {
		status = GeneralVariable.EMPTY_STRING;
		hideAll();
		showList = true;
	}

	public void readDrivers() {
		driverList = controller.getDriverListData();
	}

	public void goAddDriver() {
		hideAll();
		showCreate = true;
		driver = new Driver();
	}

	public void goShowDriver(Driver driver) {
		this.driver = driver;
		hideAll();
		showRead = true;
	}

	public void goEditDriver(Driver driver) {
		this.driver = driver;
		hideAll();
		showEdit = true;
	}

	public void goDeleteDriver(Driver driver) {

	}

	public void saveDriver() {
		hideAll();
		goIndex();
		if (controller.saveOrUpdateDriver(driver) == 0) {
			System.out.println("Ha ocurrido un error");
		} else {
			if(showCreate) {
				System.out.println("Guardado con éxito");
				driverList.add(driver);
			} else {
				status = "Actualizado con éxito";
			}
		}
	}

	// GETTERS AND SETTERS
	public List<Driver> getDriverList() {
		return driverList;
	}

	public void setDriverList(List<Driver> driverList) {
		this.driverList = driverList;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public DriverController getController() {
		return controller;
	}

	public void setController(DriverController controller) {
		this.controller = controller;
	}

	public boolean isShowList() {
		return showList;
	}

	public void setShowList(boolean showList) {
		this.showList = showList;
	}

	public boolean isShowCreate() {
		return showCreate;
	}

	public void setShowCreate(boolean showCreate) {
		this.showCreate = showCreate;
	}

	public boolean isShowRead() {
		return showRead;
	}

	public void setShowRead(boolean showRead) {
		this.showRead = showRead;
	}

	public boolean isShowEdit() {
		return showEdit;
	}

	public void setShowEdit(boolean showEdit) {
		this.showEdit = showEdit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}