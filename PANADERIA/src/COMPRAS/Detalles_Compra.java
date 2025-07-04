package COMPRAS;

public class Detalles_Compra {
private String ID_COMPRA;
private String ID_PRODUCTO;
private int Cantidad;
private double PrecioCompra;
public Detalles_Compra(String iD_COMPRA, String iD_PRODUCTO, int cantidad, double precioCompra) {
	ID_COMPRA = iD_COMPRA;
	ID_PRODUCTO = iD_PRODUCTO;
	Cantidad = cantidad;
	PrecioCompra = precioCompra;
}
public String getID_COMPRA() {
	return ID_COMPRA;
}
public void setID_COMPRA(String iD_COMPRA) {
	ID_COMPRA = iD_COMPRA;
}
public String getID_PRODUCTO() {
	return ID_PRODUCTO;
}
public void setID_PRODUCTO(String iD_PRODUCTO) {
	ID_PRODUCTO = iD_PRODUCTO;
}
public int getCantidad() {
	return Cantidad;
}
public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}
public double getPrecioCompra() {
	return PrecioCompra;
}
public void setPrecioCompra(double precioCompra) {
	PrecioCompra = precioCompra;
}
}
