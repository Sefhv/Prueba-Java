package com.vehicle.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.transport.GeneralVariable;
import com.vehicle.controller.VehicleController;
import com.vehicle.model.Vehicle;

@ManagedBean(name = "vehicleBean")
@ViewScoped
public class VehicleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Vehicle> vehicleList;
	private Vehicle vehicle;
	private VehicleController controller;
	private boolean showList;
	private boolean showCreate;
	private boolean showRead;
	private boolean showEdit;
	private String status;

	public VehicleBean() {
		init();
		hideAll();
		goIndex();
		readVehicles();
	}

	public void init() {
		vehicleList = new ArrayList<Vehicle>(1);
		vehicle = new Vehicle();
		controller = new VehicleController();
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

	public void readVehicles() {
		vehicleList = controller.getVehicleListData();
	}

	public void saveVehicle() {
		if (controller.saveOrUpdateVehicle(vehicle) == 0) {
			status = "Ha ocurrido un error";
			System.out.println("Ha ocurrido un error");
		} else {
			if(showCreate) {
				System.out.println("Guardado con éxito");
				vehicleList.add(vehicle);
			} else {
				status = "Actualizado con éxito";
			}
		}
		hideAll();
		goIndex();
	}

	public void goAddVehicle() {
		hideAll();
		showCreate = true;
		vehicle = new Vehicle();
	}

	public void goShowVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		hideAll();
		showRead = true;
	}

	public void goEditVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		hideAll();
		showEdit = true;
	}

	public void goDeleteVehicle(Vehicle vehicle) {

	}

	// GETTERS AND SETTERS
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleController getController() {
		return controller;
	}

	public void setController(VehicleController controller) {
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
