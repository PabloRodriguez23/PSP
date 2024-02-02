package Controlador;

import Modelo.Empresario;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ControladorEmpresario {
    PreparedStatement pst;
    ResultSet rs;
    int nif;
    public ControladorEmpresario(int nif){
        this.nif = nif;
        try{
            pst = ControladorDB.getConnection().prepareStatement("Select * from Empresario where nif_empresa = ?");
            pst.setInt(1, nif);
            rs = pst.executeQuery();
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
    }
    public Empresario next(){
        Empresario empresario = null;
        try{
        rs.next();
        empresario = new Empresario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getBigDecimal(6));
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
        
        return empresario;
    }
    public Empresario previus(){
        Empresario empresario = null;
        try{
        rs.previous();
        empresario = new Empresario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getBigDecimal(6));
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
        
        return empresario;
    }
    
    public Empresario primero(){
        Empresario empresario = null;
        try{
        rs.first();
        empresario = new Empresario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getBigDecimal(6));
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
        
        return empresario;
    }
    
    public Empresario ultimo(){
        Empresario empresario = null;
        try{
        rs.last();
        empresario = new Empresario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getBigDecimal(6));
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
        
        return empresario;
    }
    
    public boolean isLast(){
        boolean valor=false;
        try{
            valor = rs.isLast();
            rs.next();
        }catch(Exception ex){
            
        }
        return valor;
    }
    
     public Empresario obtener(){
        Empresario empresario = null;
        try{
            empresario = new Empresario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getBigDecimal(6));
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
        
        return empresario;
    }
     
     public void insertar(int dni,String nombre, String apellido, Date fecha) throws MyException{
        BigDecimal dinero = new BigDecimal("0");
        Connection conexion = null;
        PreparedStatement pstatement;
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("Insert into Empresario values (dni=?,nombre=?,apellido=?,fecha_nacimiento=?,nif_empresa=?,dinero_banco=?)");
            pstatement.setInt(1, dni);
            pstatement.setString(2, nombre);
            pstatement.setString(3, apellido);
            pstatement.setDate(4, new java.sql.Date(fecha.getTime()));            
            pstatement.setInt(5, nif);
            pstatement.setBigDecimal(6, dinero);
            System.out.println(pstatement);
            pstatement.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            Controlador_log n = new Controlador_log(ex);
            throw new MyException(111);
        } finally {
            ControladorDB.close(conexion);
        }
    }
     
     public void eliminar(int dni) throws MyException{
        Connection conexion = null;
        PreparedStatement pstatement;
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("delete from Empresario where dni=?");
            pstatement.setInt(1, dni);     
            System.out.println(pstatement);
            pstatement.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            Controlador_log n = new Controlador_log(ex);
            throw new MyException(111);
        } finally {
            ControladorDB.close(conexion);
        }
    }
    
}

