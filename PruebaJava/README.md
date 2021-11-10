Para ejecutar el programa se debe instalar un servidor wildfly 20.
Una vez corra el programa la pagina de inicia será 
http://localhost:8080/jsf2-basic-portlet/index.xhtml o http://localhost:8080/jsf2-basic-portlet/

Se debe instalar una instancia de H2 y ejecutar los siguientes queries:

CREATE TABLE EnterpriseTransport( 
	id IDENTITY NOT NULL PRIMARY KEY, 
	documentType VARCHAR(500),
	documentNumber INT  default 0,
	name VARCHAR(500),
	address VARCHAR(500), 
	city VARCHAR(500),
	department VARCHAR(500),
	country VARCHAR(500),
	phone VARCHAR(500),
	legalDocumentType VARCHAR(500),
	legalDocumentNumber INT  default 0,
	legalName VARCHAR(500),
	legalAddress VARCHAR(500),
	legalCity VARCHAR(500),
	legalDepartment VARCHAR(500),
	legalCountry VARCHAR(500),
	legalPhone VARCHAR(500)
);

insert into EnterpriseTransport(documentType, documentNumber, name, address)
values ('CC', 103451, 'Andres Rojas', 'Cra 78 a');

CREATE TABLE Vehicle(
	id IDENTITY NOT NULL PRIMARY KEY,
	license VARCHAR(500),
	engine VARCHAR(500),
	chassis VARCHAR(500),
	model int default 0,
	registration VARCHAR(500),
	sitDownPassengers int default 0,
	standUpPassengers int default 0,
	dryWeight VARCHAR(500),
	grossWeight VARCHAR(500),
	doors int default 0,
	brand VARCHAR(500),
	line VARCHAR(500)
);

insert into Vehicle(license, model, registration, doors, brand)
values ('158qeq', 1995, '15/05/1996', 4, 'Mazda');

CREATE TABLE Driver(
	id IDENTITY NOT NULL PRIMARY KEY,
	documentType VARCHAR(500),
	documentNumber int default 0,
	name VARCHAR(500),
	address VARCHAR(500),
	city VARCHAR(500),
	department VARCHAR(500),
	country VARCHAR(500),
	phone VARCHAR(500)
);

insert into Driver(documentType, documentNumber, name, department, country)
values ('CC', 10324743, 'Carlos Cortes', 'Cundinamarca', 'Colombia');

CREATE TABLE DriverByEnterpriseTransport(
    id IDENTITY NOT NULL PRIMARY KEY,
    idDriver int NOT NULL,
	FOREIGN KEY(idDriver) REFERENCES Driver(id),
    idEnterpriseTransport int NOT NULL,
	FOREIGN KEY(idEnterpriseTransport) REFERENCES EnterpriseTransport(id)
);

CREATE TABLE VehicleByEnterpriseTransport(
    id IDENTITY NOT NULL PRIMARY KEY,
    idVehicle int NOT NULL, 
	FOREIGN KEY(idVehicle) REFERENCES Vehicle(id) ,
    idEnterpriseTransport int NOT NULL,
	FOREIGN KEY(idEnterpriseTransport) REFERENCES EnterpriseTransport(id)
);

CREATE TABLE DriverByVehicle(
    id IDENTITY NOT NULL PRIMARY KEY,
    idDriver int NOT NULL, 
	FOREIGN KEY(idDriver) REFERENCES Driver(id),
    idVehicle int NOT NULL, 
	FOREIGN KEY(idVehicle) REFERENCES Vehicle(id)
);