package COMPRAS;

public class Compras {
private String ID_COMPRA;
private String ID_PROVEEDOR, ID_EMPELEADO, Fecha_COM;
private double Total_COM;
public Compras(String iD_COMPRA, String iD_PROVEEDOR, String iD_EMPELEADO, String fecha_COM, double total_COM) {
	ID_COMPRA = iD_COMPRA;
	ID_PROVEEDOR = iD_PROVEEDOR;
	ID_EMPELEADO = iD_EMPELEADO;
	Fecha_COM = fecha_COM;
	Total_COM = total_COM;
}
public String getID_COMPRA() {
	return ID_COMPRA;
}
public void setID_COMPRA(String iD_COMPRA) {
	ID_COMPRA = iD_COMPRA;
}
public String getID_PROVEEDOR() {
	return ID_PROVEEDOR;
}
public void setID_PROVEEDOR(String iD_PROVEEDOR) {
	ID_PROVEEDOR = iD_PROVEEDOR;
}
public String getID_EMPELEADO() {
	return ID_EMPELEADO;
}
public void setID_EMPELEADO(String iD_EMPELEADO) {
	ID_EMPELEADO = iD_EMPELEADO;
}
public String getFecha_COM() {
	return Fecha_COM;
}
public void setFecha_COM(String fecha_COM) {
	Fecha_COM = fecha_COM;
}
public double getTotal_COM() {
	return Total_COM;
}
public void setTotal_COM(double total_COM) {
	Total_COM = total_COM;
}
}
