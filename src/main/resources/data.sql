drop table if exists piezas;
CREATE TABLE piezas (
codigo INT AUTO_INCREMENT,
nombre VARCHAR(100),
PRIMARY KEY (codigo));

drop table if exists proveedores;
CREATE TABLE proveedores (
id CHAR (4),
nombre VARCHAR(100),
PRIMARY KEY (id));

insert into proveedores (id, nombre) values ('9213', 'Sheet Metal Worker');
insert into proveedores (id, nombre) values ('2608', 'Pipelayer');
insert into proveedores (id, nombre) values ('9261', 'Tile Setter');
insert into proveedores (id, nombre) values ('8768', 'Sheet Metal Worker');
insert into proveedores (id, nombre) values ('8081', 'Pipelayer');
insert into proveedores (id, nombre) values ('3447', 'Ironworker');
insert into proveedores (id, nombre) values ('3683', 'Cement Mason');
insert into proveedores (id, nombre) values ('3323', 'Cement Mason');
insert into proveedores (id, nombre) values ('9761', 'Cement Mason');
insert into proveedores (id, nombre) values ('8661', 'Electrician');

drop table if exists suministra;
CREATE TABLE suministra (
id INT AUTO_INCREMENT,
codigo_pieza INT REFERENCES piezas(codigo) ON DELETE CASCADE ON UPDATE CASCADE,
id_proveedor CHAR(4) REFERENCES proveedores (id) ON DELETE CASCADE ON UPDATE CASCADE,
precio INT,
PRIMARY KEY (id));

insert into suministra (codigo_pieza, id_proveedor, precio) values (13, '9213', 3333);
insert into suministra (codigo_pieza, id_proveedor, precio) values (4, '9213', 1594);
insert into suministra (codigo_pieza, id_proveedor, precio) values (5, '9213', 8130);
insert into suministra (codigo_pieza, id_proveedor, precio) values (6, '9213', 4270);
insert into suministra (codigo_pieza, id_proveedor, precio) values (11, '9213', 9148);
insert into suministra (codigo_pieza, id_proveedor, precio) values (5, '9213', 8752);
insert into suministra (codigo_pieza, id_proveedor, precio) values (8, '9213', 4993);
insert into suministra (codigo_pieza, id_proveedor, precio) values (5, '9213', 4468);
insert into suministra (codigo_pieza, id_proveedor, precio) values (13, '9213', 5482);
insert into suministra (codigo_pieza, id_proveedor, precio) values (20, '9213', 2203);
insert into suministra (codigo_pieza, id_proveedor, precio) values (2, '8768', 799);
insert into suministra (codigo_pieza, id_proveedor, precio) values (6, '8768', 2019);
insert into suministra (codigo_pieza, id_proveedor, precio) values (11, '8768', 4154);
insert into suministra (codigo_pieza, id_proveedor, precio) values (14, '8768', 8483);
insert into suministra (codigo_pieza, id_proveedor, precio) values (15, '8661', 4670);
insert into suministra (codigo_pieza, id_proveedor, precio) values (4, '8661', 1854);
insert into suministra (codigo_pieza, id_proveedor, precio) values (18, '8661', 976);
insert into suministra (codigo_pieza, id_proveedor, precio) values (16, '8661', 11579);
insert into suministra (codigo_pieza, id_proveedor, precio) values (16, '8661', 1761);
insert into suministra (codigo_pieza, id_proveedor, precio) values (9, '8661', 6388);




