package COMPRAS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import CONEXIÓN.ConexiónMySQL;

public class ArrayComprasProductos {

    public ArrayList<ComprasProductos> Listar() {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_COM_PRO()}");
            ResultSet rs = csta.executeQuery();
            ComprasProductos com;
            while (rs.next()) {
                com = new ComprasProductos(
                    rs.getString(1), // ID_COMPRA
                    rs.getString(2), // ID_PROVEEDOR
                    rs.getString(3), // ID_EMPLEADO
                    rs.getString(4), // Fecha_COM_PRO
                    rs.getInt(5),    // Cantidad_COM_PRO
                    rs.getDouble(6), // PrecioC_COM_PRO
                    rs.getDouble(7)  // Total_COM_PRO
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return lista;
    }

    public ArrayList<ComprasProductos> Consultar(String cod) {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            Statement st = ConexiónMySQL.getConexión().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM COMPRA_PRODUCTOS WHERE ID_COMPRA LIKE '%" + cod + "%'");
            ComprasProductos com;
            while (rs.next()) {
                com = new ComprasProductos(
                    rs.getString(1), // ID_COMPRA
                    rs.getString(2), // ID_PROVEEDOR
                    rs.getString(3), // ID_EMPLEADO
                    rs.getString(4), // Fecha_COM_PRO
                    rs.getInt(5),    // Cantidad_COM_PRO
                    rs.getDouble(6), // PrecioC_COM_PRO
                    rs.getDouble(7)  // Total_COM_PRO
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return lista;
    }

    public ArrayList<ComprasProductos> ConsultarPorID(String id) {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_COM_PRO(?)}");
            csta.setString(1, id);
            ResultSet rs = csta.executeQuery();
            ComprasProductos com;
            while (rs.next()) {
                com = new ComprasProductos(
                    rs.getString(1), // ID_COMPRA
                    rs.getString(2), // ID_PROVEEDOR
                    rs.getString(3), // ID_EMPLEADO
                    rs.getString(4), // Fecha_COM_PRO
                    rs.getInt(5),    // Cantidad_COM_PRO
                    rs.getDouble(6), // PrecioC_COM_PRO
                    rs.getDouble(7)  // Total_COM_PRO
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return lista;
    }

    public void Insertar(ComprasProductos c) {
    	try {
    		Connection cnx = ConexiónMySQL.getConexión();
    		CallableStatement csta = cnx.prepareCall("{call SP_Insertar_COM_PRO(?,?,?,?,?,?)}");
    		csta.setString(1, c.getID_COMPRA());
    		csta.setString(2, c.getID_PROVEEDOR());
    		csta.setString(3, c.getID_EMPLEADO());
    		csta.setInt(4, c.getCantidad_COM_PRO());
    		csta.setDouble(5, c.getPrecioC_COM_PRO());
    		csta.setDouble(6, c.getTotal_COM());
    		csta.executeUpdate();
    	} catch (Exception e) {
    		System.out.println("ERROR: " + e);
    	}
    }

    public void Eliminar(String id) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_COM_PRO(?)}");
            csta.setString(1, id);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    public void Editar(ComprasProductos c) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Editar_COM_PRO(?,?,?,?,?,?,?)}");
            csta.setString(1, c.getID_COMPRA());
    		csta.setString(2, c.getID_PROVEEDOR());
    		csta.setString(3, c.getID_EMPLEADO());
    		csta.setInt(4, c.getCantidad_COM_PRO());
    		csta.setDouble(5, c.getPrecioC_COM_PRO());
    		csta.setDouble(6, c.getTotal_COM());
    		csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
    public String generarNuevoIDCompra() {
        String nuevoID = "CP01";
        String sql = "SELECT MAX(ID_COMPRA) FROM COMPRA_PRODUCTOS WHERE ID_COMPRA LIKE 'CP%'";
        
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                String ultimoID = rs.getString(1); // Ejemplo: "CP07"
                if (ultimoID != null) {
                    int num = Integer.parseInt(ultimoID.substring(2)); // Extrae "07" → 7
                    num++; // Incrementa a 8
                    nuevoID = String.format("CP%02d", num); // Formatea a "CP08"
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("ERROR al generar nuevo ID de compra: " + e);
        }
        
        return nuevoID;
    }
}