-- INSERT A TABLA PRODUCTOS
INSERT INTO PRODUCTOS VALUES('A01', 'Pan Francés', 'Pan crocante tradicional', 0.30, 200);
INSERT INTO PRODUCTOS VALUES('A02', 'Croissant', 'Croissant de mantequilla horneado', 1.20, 50);
INSERT INTO PRODUCTOS VALUES('A03', 'Empanada de Pollo', 'Empanada rellena de pollo desmenuzado', 2.50, 30);
INSERT INTO PRODUCTOS VALUES('A04', 'Torta de Chocolate', 'Torta húmeda de chocolate por porción', 3.00, 25);
INSERT INTO PRODUCTOS VALUES('A05', 'Pan Integral', 'Pan hecho con harina integral y semillas', 0.50, 100);

-- PROCESOS ALMACENADOS
-- PRODUCTOS
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
call SP_Insertar_PRO('A06', 'ROSQUITAS', '10u AROS HECHOS CON HARINA DE TRIGO', 2, 15);
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

create procedure SP_ConsultarNOMBRE_PRO(
nom VARCHAR(100))
select * from PRODUCTOS where Nombre_PRO=nom;

call SP_ConsultarNOMBRE_PRO('Pan Francés');

CREATE PROCEDURE SP_ActualizarStock_PRO(
IN p_idProducto VARCHAR(30),
IN p_cantidad INT)
UPDATE PRODUCTOS SET Stock_PRO = Stock_PRO + p_cantidad
WHERE ID_PRODUCTO = p_idProducto;