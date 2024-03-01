package Controlador;

import Modelo.Seccion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorSeccion {
    
    
    
    public Seccion entrar(String Usuario, String Contrasena) {
        Seccion seccion = null;
        Connection conexion = null;
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        System.out.println(Usuario);
        System.out.println(Contrasena);
        try {
            conexion = (Connection) Conexion.getConnection();

            pstatement = conexion.prepareStatement("SELECT Id, descripcion , contraseña, precio_total_productos FROM Seccion where descripcion = ? AND contraseña = ?");
       
            pstatement.setString(1, Usuario);
            pstatement.setString(2, Contrasena);

            resultSet = pstatement.executeQuery();
           
            if (resultSet.next()) {
                String Id = resultSet.getString("Id");
                String Descripcion = resultSet.getString("descripcion");
                String Contraseña = resultSet.getString("contraseña");
                BigDecimal Preciototal = resultSet.getBigDecimal("precio_total_productos");
                seccion = new Seccion(Id,Descripcion,Contraseña,Preciototal);
            }
                    
        } catch (SQLException Ex) {
        } finally {
            Conexion.close(resultSet);
            Conexion.close(conexion);
        }
        return seccion;
    }
    
    public void actualizar(Seccion seccion){
        Connection conexion = null;
        PreparedStatement pstatement = null;
        PreparedStatement pstatement2 = null;
        ResultSet resultSet = null;
        BigDecimal suma= null;
        try {
            conexion = (Connection) Conexion.getConnection();
            pstatement2 = conexion.prepareStatement("Select sum(precio) from Producto where id_seccion = ?");
            pstatement2.setString(1, seccion.getId());
            resultSet = pstatement2.executeQuery();
           
            if (resultSet.next()) {
                suma = resultSet.getBigDecimal(1);
            }
            
            pstatement = conexion.prepareStatement("Update Seccion set precio_total_productos = ? where Id = ?");
       
            pstatement.setBigDecimal(1, suma);
            pstatement.setString(2, seccion.getId());
            pstatement.executeUpdate();
            
            seccion.setPrecioTotalProductos(suma);
                    
        } catch (SQLException Ex) {
        } finally {
            Conexion.close(resultSet);
            Conexion.close(conexion);
        }
    }
    
}