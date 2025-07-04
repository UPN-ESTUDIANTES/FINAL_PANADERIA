package VENTAS;

public class Ventas {
private int ID_VENTA;
private String ID_CLIENTE, ID_EMPLEADO, Fecha_VENTA;
private double Total_VEN;
public Ventas(int iD_VENTA, String iD_CLIENTE, String iD_EMPLEADO, String fecha_VENTA, double total_VEN) {
	ID_VENTA = iD_VENTA;
	ID_CLIENTE = iD_CLIENTE;
	ID_EMPLEADO = iD_EMPLEADO;
	Fecha_VENTA = fecha_VENTA;
	Total_VEN = total_VEN;
}
public int getID_VENTA() {
	return ID_VENTA;
}
public void setID_VENTA(int iD_VENTA) {
	ID_VENTA = iD_VENTA;
}
public String getID_CLIENTE() {
	return ID_CLIENTE;
}
public void setID_CLIENTE(String iD_CLIENTE) {
	ID_CLIENTE = iD_CLIENTE;
}
public String getID_EMPLEADO() {
	return ID_EMPLEADO;
}
public void setID_EMPLEADO(String iD_EMPLEADO) {
	ID_EMPLEADO = iD_EMPLEADO;
}
public String getFecha_VENTA() {
	return Fecha_VENTA;
}
public void setFecha_VENTA(String fecha_VENTA) {
	Fecha_VENTA = fecha_VENTA;
}
public double getTotal_VEN() {
	return Total_VEN;
}
public void setTotal_VEN(double total_VEN) {
	Total_VEN = total_VEN;
}
}
