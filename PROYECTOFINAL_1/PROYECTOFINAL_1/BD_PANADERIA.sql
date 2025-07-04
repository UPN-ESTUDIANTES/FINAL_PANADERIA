CREATE DATABASE PANADERIA;
USE PANADERIA;

CREATE TABLE PRODUCTOS (
    ID_PRODUCTO VARCHAR(30) NOT NULL PRIMARY KEY,
    Nombre_PRO VARCHAR(100) NOT NULL,
    Descripcion_PRO VARCHAR(150),
    Precio_venta REAL NOT NULL,
    Stock_PRO INT NOT NULL
);

select * from PRODUCTOS;
insert into PRODUCTOS values('A01', 'PAN FRANCES', 'PAN CLASICO REDONDO HECHO DE TRIGO', 0.3, 50);
insert into PRODUCTOS values('A02', 'FRUGOS', '1LTRO DE DURAZNO', 4.5, 20);

create procedure SP_Listar_PRO()
select * from PRODUCTOS;

call SP_Listar_PRO();

create procedure SP_Insertar_PRO(
id VARCHAR(30),
nom VARCHAR(100),
des VARCHAR(150),
pre REAL,
stock INT)
insert into PRODUCTOS values(id, nom, des, pre, stock);

call SP_Insertar_PRO('A03', 'ROSQUITAS', '10u AROS HECHOS CON HARINA DE TRIGO', 2, 15);
call SP_Listar_PRO();

create procedure SP_Eliminar_PRO(
id VARCHAR(30))
delete from PRODUCTOS where ID_PRODUCTO = id;

call SP_Eliminar_PRO('A03');
call SP_Listar_PRO();

create procedure SP_Editar_PRO(
id VARCHAR(30),
nom VARCHAR(100),
des VARCHAR(150),
pre REAL,
stock INT)
update PRODUCTOS set Nombre_PRO=nom, Descripcion_PRO=des, Precio_venta=pre, Stock_PRO=stock
where ID_PRODUCTO=id;

call SP_Editar_PRO('A02', 'TAMPICO', '1LTRO, DE NARANJA', 4, 18);
call SP_Listar_PRO();

create procedure SP_ConsultarCod_PRO(
id VARCHAR(30))
select * from PRODUCTOS where ID_PRODUCTO=id;

call SP_ConsultarCod_PRO('A01');

CREATE PROCEDURE SP_ActualizarStock_PRO(
    IN p_idProducto VARCHAR(30),
    IN p_cantidad INT
)
UPDATE PRODUCTOS SET Stock_PRO = Stock_PRO + p_cantidad
WHERE ID_PRODUCTO = p_idProducto;

CREATE TABLE CLIENTES (
    ID_CLIENTE VARCHAR(30) PRIMARY KEY,
    Nombre_CLI VARCHAR(100) NOT NULL,
    Telefono_CLI VARCHAR(20),
    Direccion_CLI VARCHAR(150),
    Email_CLI VARCHAR(100)
);

select * from CLIENTES;
insert into CLIENTES values('14156576', 'HUGO', 957786321, 'CERCADO DE LIMA', 'HUGO1015@GMAIL.COM');
insert into CLIENTES values('43542131', 'ORLANDO', 963789023, 'CERCADO DE LIMA', 'ORLA1325@GMAIL.COM');

create procedure SP_Listar_CLI()
select * from CLIENTES;

call SP_Listar_CLI();

create procedure SP_Insertar_CLI(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
dire VARCHAR(150),
email VARCHAR(100))
insert into CLIENTES values(id, nom, tel, dire, email);

call SP_Insertar_CLI('54637289', 'FERNANDO', 943576823, 'CERCADO DE LIMA', 'FER6780@GMAIL.COM');
call SP_Listar_CLI();

create procedure SP_Eliminar_CLI(
id VARCHAR(30))
delete from CLIENTES where ID_CLIENTE = id;

call SP_Eliminar_CLI('43542131');
call SP_Listar_CLI();

create procedure SP_Editar_CLI(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
dire VARCHAR(150),
email VARCHAR(100))
update CLIENTES set Nombre_CLI=nom, Telefono_CLI=tel, Direccion_CLI=dire, Email_CLI=email
where ID_CLIENTE=id;

call SP_Editar_CLI('54637289', 'LUIS', 978943560, 'CERCADO DE LIMA', 'LUIS6780@GMAIL.COM');
call SP_Listar_CLI();

create procedure SP_ConsultarCod_CLI(
id VARCHAR(30))
select * from CLIENTES where ID_CLIENTE=id;

call SP_ConsultarCod_CLI('54637289');


CREATE TABLE EMPLEADOS (
    ID_EMPLEADO VARCHAR(30) NOT NULL PRIMARY KEY,
    Nombre_EMP VARCHAR(100) NOT NULL,
    Apellido_EMP VARCHAR(100) NOT NULL,
    Cargo_EMP VARCHAR(50),
    Salario REAL,
    Afiliacion VARCHAR(30) NOT NULL
);

select * from EMPLEADOS;
insert into EMPLEADOS values(71814524, 'PEDRO', 'JUAREZ', 'CAJERO', 1200, 'AFP');
insert into EMPLEADOS values(31838526, 'JUAN', 'DIAZ', 'PANADERO', 1500, 'ONP');

create procedure SP_Listar_EMP()
select * from EMPLEADOS;

call SP_Listar_EMP();

create procedure SP_Insertar_EMP(
id VARCHAR(30),
nom VARCHAR(100),
ape VARCHAR(100),
cargo VARCHAR(50),
sala REAL,
afilia VARCHAR(30))
insert into EMPLEADOS values(id, nom, ape, cargo, sala, afilia);

call SP_Insertar_EMP('12345678', 'FABIAN', 'TORRE', 'ADMINISTRADOR', 2000, 'AFP');
call SP_Listar_EMP();

create procedure SP_Eliminar_EMP(
id VARCHAR(30))
delete from EMPLEADOS where ID_EMPLEADO = id;

call SP_Eliminar_EMP('71814524');
call SP_Listar_EMP();

create procedure SP_Editar_EMP(
id VARCHAR(30),
nom VARCHAR(100),
ape VARCHAR(100),
cargo VARCHAR(50),
sala REAL,
afilia VARCHAR(30))
update EMPLEADOS set Nombre_EMP=nom, Apellido_EMP=ape, Cargo_EMP=cargo, Salario=sala, Afiliacion=afilia
where ID_EMPLEADO=id;

call SP_Editar_EMP('12345678', 'LUIS', 'PEREZ', 'PANADERO', 1200, 'ONP');
call SP_Listar_EMP();

create procedure SP_ConsultarCod_EMP(
id VARCHAR(30))
select * from EMPLEADOS where ID_EMPLEADO=id;

call SP_ConsultarCod_EMP('12345678');

CREATE TABLE PROVEEDORES (
    ID_PROVEEDOR VARCHAR(30) PRIMARY KEY,
    Nombre_PROV VARCHAR(100) NOT NULL,
    Telefono_PROV VARCHAR(20),
    Email_PROV VARCHAR(100),
    Direccion_PROV VARCHAR(150),
    Distrito_PROV VARCHAR(50)
);

select * from PROVEEDORES;
insert into PROVEEDORES values('123456', 'TAMPICO BEVERAGES INC', 987654321, 'TAMP@GMAIL.COM', 'CALLE LOS JARDINES', 'PUEBLO LIBRE');
insert into PROVEEDORES values('654321', 'AGRO MI PERU', 912345678, 'AGRO@GMAIL.COM','JR. LOS OLIVARES', 'SAN JUAN DE LURIGANCHO');

create procedure SP_Listar_PROV()
select * from PROVEEDORES;

call SP_Listar_PROV();

create procedure SP_Insertar_PROV(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
email VARCHAR(100),
dire VARCHAR(150),
distri VARCHAR(50))
insert into PROVEEDORES values(id, nom, tel, email, dire, distri);

call SP_Insertar_PROV('645123', 'SAN FERNANDO', 9783312465, 'SANFER@GMAIL.COM', 'LAS ORQUIDIAS', 'CALLAO');
call SP_Listar_PROV();

create procedure SP_Eliminar_PROV(
id VARCHAR(30))
delete from PROVEEDORES where ID_PROVEEDOR = id;

call SP_Eliminar_PROV('123456');
call SP_Listar_PROV();

create procedure SP_Editar_PROV(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
email VARCHAR(100),
dire VARCHAR(150),
distri VARCHAR(50))
update PROVEEDORES set Nombre_PROV=nom, Telefono_PROV=tel, Email_PROV=email, Direccion_PROV=dire, Distrito_PROV=distri
where ID_PROVEEDOR=id;

call SP_Editar_PROV('645123', 'COCA COLA', 912834765, 'COCA@GMAIL.COM', 'CALLE LA EMBAJADA', 'MIRAFLORES');
call SP_Listar_PROV();

create procedure SP_ConsultarCod_PROV(
id VARCHAR(30))
select * from PROVEEDORES where ID_PROVEEDOR=id;

call SP_ConsultarCod_PROV('123456');

CREATE TABLE VENTAS (
    ID_VENTA VARCHAR(30) PRIMARY KEY,
    ID_CLIENTE VARCHAR(30),
    ID_EMPLEADO VARCHAR(30),
    Fecha_VEN DATETIME DEFAULT CURRENT_TIMESTAMP,
    Total_VEN REAL,
    FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES(ID_CLIENTE),
    FOREIGN KEY (ID_EMPLEADO) REFERENCES EMPLEADOS(ID_EMPLEADO)
);

create procedure SP_Listar_VEN()
select * from VENTAS;

create procedure SP_Insertar_VEN(
    id VARCHAR(30),
    cliente VARCHAR(30),
    empleado VARCHAR(30),
    total REAL)
insert into VENTAS values (id, cliente, empleado, total);

create procedure SP_Eliminar_VEN(
id VARCHAR(30))
delete from VENTAS where ID_VENTA = id;

create procedure SP_Editar_VEN(
    id VARCHAR(30),
    cliente VARCHAR(30),
    empleado VARCHAR(30),
    total REAL)
update VENTAS set ID_CLIENTE = cliente, ID_EMPLEADO = empleado, Total_VEN = total
where ID_VENTA = id;

create procedure SP_ConsultarCod_VEN(
id VARCHAR(30))
select * from VENTAS where ID_VENTA = id;

CREATE TABLE DETALLES_VENTA (
    ID_VENTA VARCHAR(30),
    ID_PRODUCTO VARCHAR(30),
    Cantidad_VEN INT NOT NULL,
    Precio_unitario_VEN REAL NOT NULL,
    FOREIGN KEY (ID_VENTA) REFERENCES VENTAS(ID_VENTA),
    FOREIGN KEY (ID_PRODUCTO) REFERENCES PRODUCTOS(ID_PRODUCTO)
);

create procedure SP_Listar_DET_VEN()
select * from DETALLES_VENTA;

create procedure SP_Insertar_DET_VEN(
    idVenta VARCHAR(30),
    idProducto VARCHAR(30),
    cantidad INT,
    precio REAL)
insert into DETALLES_VENTA values(idVenta, idProducto, cantidad, precio);

create procedure SP_Eliminar_DET_VEN(
idDetalle VARCHAR(30))
delete from DETALLES_VENTA where ID_DETALLE_VENTA = idDetalle;

create procedure SP_Editar_DET_VEN(
    idVenta VARCHAR(30),
    idProducto VARCHAR(30),
    cantidad INT,
    precio REAL)
update DETALLES_VENTA set ID_PRODUCTO = idProducto, Cantidad_VEN = cantidad,
Precio_unitario_VEN = precio
where ID_VENTA = idVenta;

create procedure SP_ConsultarCod_DET_VEN(
idDetalle VARCHAR(30))
select * from DETALLES_VENTA where ID_VENTA = idVenta;

CREATE TABLE COMPRAS (
    ID_COMPRA VARCHAR(30) PRIMARY KEY,
    ID_PROVEEDOR VARCHAR(30),
    ID_EMPLEADO VARCHAR(30),
    Fecha_COM DATETIME DEFAULT CURRENT_TIMESTAMP,
    Total_COM REAL,
    FOREIGN KEY (ID_PROVEEDOR) REFERENCES PROVEEDORES(ID_PROVEEDOR),
    FOREIGN KEY (ID_EMPLEADO) REFERENCES EMPLEADOS(ID_EMPLEADO)
);

create procedure SP_Listar_COM()
select * from COMPRAS
ORDER BY Fecha_COM DESC;


create procedure SP_Insertar_COM(
    id VARCHAR(30),
    proveedor VARCHAR(30),
    empleado VARCHAR(30),
    total REAL)
insert into COMPRAS (ID_COMPRA, ID_PROVEEDOR, ID_EMPLEADO, Total_COM)
values (id, proveedor, empleado, total);

create procedure SP_Eliminar_COM(
id VARCHAR(30))
delete from COMPRAS where ID_COMPRA = id;

create procedure SP_Editar_COM(
    id VARCHAR(30),
    proveedor VARCHAR(30),
    empleado VARCHAR(30),
    total REAL
)
update COMPRAS set ID_PROVEEDOR = proveedor, ID_EMPLEADO = empleado, Total_COM = total
where ID_COMPRA = id;

create procedure SP_ConsultarCod_COM(
id VARCHAR(30))
select * from COMPRAS where ID_COMPRA = id;

CREATE TABLE DETALLES_COMPRA (
    ID_COMPRA VARCHAR(30),
    ID_PRODUCTO VARCHAR(30),
    Cantidad_COM INT NOT NULL,
    Precio_unitario_COM REAL NOT NULL,
    FOREIGN KEY (ID_COMPRA) REFERENCES COMPRAS(ID_COMPRA),
    FOREIGN KEY (ID_PRODUCTO) REFERENCES PRODUCTOS(ID_PRODUCTO)
);

create procedure SP_Listar_DET_COM()
select * from DETALLES_COMPRA;

create procedure SP_Insertar_DET_COM(
    idCompra VARCHAR(30),
    idProducto VARCHAR(30),
    cantidad INT,
    precio REAL)
insert into DETALLES_COMPRA values(idCompra, idProducto, cantidad, precio);

create procedure SP_Eliminar_DET_COM(
idDetalle VARCHAR(30))
delete from DETALLES_COMPRA where ID_COMPRA = idCompra;

create procedure SP_Editar_DET_COM(
    idCompra VARCHAR(30),
    idProducto VARCHAR(30),
    cantidad INT,
    precio REAL)
update DETALLES_COMPRA set ID_PRODUCTO = idProducto, Cantidad_COM = cantidad,
Precio_unitario_COM = precio
where ID_COMPRA = idCompra;

CREATE PROCEDURE SP_Listar_DET_COM_Ordenado()
    SELECT 
        dc.ID_COMPRA,
        dc.ID_PRODUCTO,
        dc.CANTIDAD_COM,
        dc.Precio_unitario_COM,
        c.Fecha_COM
    FROM DETALLES_COMPRA dc
    INNER JOIN COMPRAS c ON dc.ID_COMPRA = c.ID_COMPRA
    ORDER BY c.Fecha_COM DESC;

create procedure SP_ConsultarCod_DET_COM(
idDetalle VARCHAR(30))
select * from DETALLES_COMPRA where ID_COMPRA = idCompra;