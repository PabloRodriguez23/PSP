package Controlador;

import Modelo.Empresario;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class ControladorEmpresario {
    PreparedStatement pst;
    ResultSet rs;
    public ControladorEmpresario(int nif){
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
}

