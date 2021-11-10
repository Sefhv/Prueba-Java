package com.transport.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.transport.GeneralVariable;
import com.transport.controller.EnterpriseTransportController;
import com.transport.model.EnterpriseTransport;

@ManagedBean(name = "enterpriseBean")
@ViewScoped
public class EnterpriseTransportBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<EnterpriseTransport> enterpriseTransportList;
	private EnterpriseTransport enterpriseTransport;
	private EnterpriseTransportController controller;
	private boolean showList;
	private boolean showCreate;
	private boolean showRead;
	private boolean showEdit;
	private String status;

	public EnterpriseTransportBean() {
		init();
		hideAll();
		goIndex();
		readEnterprise();
	}

	public void init() {
		enterpriseTransportList = new ArrayList<EnterpriseTransport>(1);
		enterpriseTransport = new EnterpriseTransport();
		controller = new EnterpriseTransportController();
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

	public void readEnterprise() {
		enterpriseTransportList = controller.getEnterpriseTransportListData();
	}

	public void goAddEnterprise() {
		hideAll();
		showCreate = true;
		enterpriseTransport = new EnterpriseTransport();
	}

	public void goShowEnterprise(EnterpriseTransport enterpriseTransport) {
		this.enterpriseTransport = enterpriseTransport;
		hideAll();
		showRead = true;
	}

	public void goEditEnterprise(EnterpriseTransport enterpriseTransport) {
		this.enterpriseTransport = enterpriseTransport;
		hideAll();
		showEdit = true;
	}

	public void goDeleteEnterprise(EnterpriseTransport enterpriseTransport) {
		
	}

	public void saveEnterprise() {
		if (controller.saveOrUpdateEnterpriseTransport(enterpriseTransport) == 0) {
			status = "Ha ocurrido un error";
			System.out.println("Ha ocurrido un error");
		} else {
			if(showCreate) {
				status = "Guardado con éxito";
				enterpriseTransportList.add(enterpriseTransport);
			} else {
				status = "Actualizado con éxito";
			}
		}
		hideAll();
		goIndex();
	}

	// GETTERS AND SETTERS
	public List<EnterpriseTransport> getEnterpriseTransportList() {
		return enterpriseTransportList;
	}

	public void setEnterpriseTransportList(List<EnterpriseTransport> enterpriseTransportList) {
		this.enterpriseTransportList = enterpriseTransportList;
	}

	public EnterpriseTransport getEnterpriseTransport() {
		return enterpriseTransport;
	}

	public void setEnterpriseTransport(EnterpriseTransport enterpriseTransport) {
		this.enterpriseTransport = enterpriseTransport;
	}

	public EnterpriseTransportController getController() {
		return controller;
	}

	public void setController(EnterpriseTransportController controller) {
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
