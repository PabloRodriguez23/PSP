
package Controlador;

import Modelo.Producto;
import Modelo.Seccion;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControladorProducto {
    
    public ArrayList<Producto> Productos = new ArrayList();
    public static int vuelta = 0;
    
    public ArrayList<Producto> obtenerproductos(Seccion seccion) {
        Productos.clear();
        if (vuelta == 0) {
            vuelta++;

            Connection conexion = null;
            PreparedStatement st = null; //lo usamos para ejecutar la consulta con parámetro (cod tutor)
            ResultSet rs = null; // aqui recogeremos todos los datos que la consulta nos proporcione
            try {
                conexion = (Connection) Conexion.getConnection();
                String Id_seccion = seccion.getId();
                st = conexion.prepareStatement("SELECT Id_producto, Id_seccion, descripcion, precio, fecha_caducidad, foto FROM Producto WHERE Id_seccion = ?");
                st.setString(1, Id_seccion);
                rs = st.executeQuery();

                //mientras siga habiendo resultados por leer, sigo almacenando en el array
                while (rs.next()) {
                    String Id_producto = rs.getString(1);
                    String Descripcion = rs.getString(3);
                    BigDecimal precio = rs.getBigDecimal(4);
                    Date fecha_caducidad = rs.getDate(5);
                    String foto = rs.getString(6);

                    Producto nuevo = new Producto(Id_producto, Descripcion, precio, fecha_caducidad, foto, seccion);
                    Productos.add(nuevo);
                }
                
            } catch (SQLException Ex) {
            } finally {
                Conexion.close(rs);
                Conexion.close(conexion);
            }
        }
        vuelta=0;
        return Productos;
    }
    
    public void eliminar(String producto){
        Connection conexion = null;
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        try {
            conexion = (Connection) Conexion.getConnection();
            
            pstatement = conexion.prepareStatement("delete from Producto where Id_producto = ?");
            System.out.println("Se va a eliminar el producto: " + producto);
            pstatement.setString(1, producto);
            pstatement.executeUpdate();
            System.out.println("Producto eliminado");
                    
        } catch (SQLException Ex) {
        } finally {
            Conexion.close(resultSet);
            Conexion.close(conexion);
        }
    }
    
    public void insertar(String ID,Seccion seccion,String descripcion,BigDecimal precio,String fecha_caducidad,String foto){
        Connection conexion = null;
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        try {
            conexion = (Connection) Conexion.getConnection();
            System.out.println("ID: "+ ID +" Seccion: "+seccion.getId()+ " descripcion: "+descripcion+" precio: "+precio+" fecha: "+fecha_caducidad+" foto: "+foto);
            pstatement = conexion.prepareStatement("insert into Producto values (?,?,?,?,?,?)");
            pstatement.setString(1, ID);
            pstatement.setString(2, seccion.getId());
            pstatement.setString(3, descripcion);
            pstatement.setBigDecimal(4, precio);
            pstatement.setString(5, fecha_caducidad);
            pstatement.setString(6, foto);
            pstatement.execute();
            System.out.println("Producto insertado");
                    
        } catch (SQLException Ex) {
        } finally {
            Conexion.close(resultSet);
            Conexion.close(conexion);
        }
    }
}