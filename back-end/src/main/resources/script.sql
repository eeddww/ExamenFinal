CREATE TABLE CATALOGO_TABLAS(
	codigoTabla VARCHAR(20),
	descripcion VARCHAR(100),
	estado CHAR(1),
	PRIMARY KEY (codigoTabla)
);

CREATE TABLE DETALLE_TABLAS(
	id NUMERIC(6),
	codigoTabla VARCHAR(20),
	codigoDetalle CHAR(3),
	valor VARCHAR(50),
	descripcion VARCHAR(100),
	estado CHAR(1),
	PRIMARY KEY (id),
	FOREIGN KEY (codigoTabla) REFERENCES CATALOGO_TABLAS(codigoTabla)
);

INSERT INTO CATALOGO_TABLAS VALUES ('codMoneda','Tabla de moneda','1');
INSERT INTO CATALOGO_TABLAS VALUES ('codPais','Tabla de países','1');
INSERT INTO CATALOGO_TABLAS VALUES ('codGenero','Tabla de generos','1');
INSERT INTO CATALOGO_TABLAS VALUES ('codTipoPago','Tabla de Tipo de Pagos','0');

INSERT INTO DETALLE_TABLAS VALUES (1,'codMoneda',001,'Sol','Moneda en soles','1');
INSERT INTO DETALLE_TABLAS VALUES (2,'codMoneda',002,'Dolar','Moneda en dolares','1');
INSERT INTO DETALLE_TABLAS VALUES (3,'codPais',001,'Peru','Operaciones en Peru','1');
INSERT INTO DETALLE_TABLAS VALUES (4,'codPais',002,'Bolivia','Operaciones en Bolivia','1');
INSERT INTO DETALLE_TABLAS VALUES (5,'codPais',003,'Argentina','Operaciones en Argentina','0');
INSERT INTO DETALLE_TABLAS VALUES (6,'codGenero',001,'Masculino','Genero masculino','1');
INSERT INTO DETALLE_TABLAS VALUES (7,'codGenero',002,'Femenino','Genero femenino','0');
INSERT INTO DETALLE_TABLAS VALUES (8,'codTipoPago',001,'Credito','Pago a credito','0');
INSERT INTO DETALLE_TABLAS VALUES (9,'codTipoPago',002,'Efectivo','Pago en efectivo','0');

