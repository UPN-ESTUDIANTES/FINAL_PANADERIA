-- PROCESOS ALMACENADOS
-- VENTAS
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

-- DETALLES VENTA
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