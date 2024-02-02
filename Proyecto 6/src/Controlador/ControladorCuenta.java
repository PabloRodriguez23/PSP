
package Controlador;

import Modelo.Cuenta;
import Modelo.Empresario;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorCuenta {
    PreparedStatement pst;
    ResultSet rs;
    int dni;
    float dinero;
    float suma = 0;
    
    public ControladorCuenta(int dni) {
        this.dni = dni;
        Iniciar(dni);
    }
    
    public void Iniciar(int dni){
        try{
            pst = ControladorDB.getConnection().prepareStatement("Select * from Cuenta where dni_empresario = ?");
            pst.setInt(1, dni);
            System.out.println(pst);
            rs = pst.executeQuery();
        }catch(Exception ex){
            ex.printStackTrace();
            Controlador_log n = new Controlador_log(ex);
        }
    }
    
    public boolean esUltimo() throws SQLException{
        return rs.isLast();
    }
    
    public void next() throws SQLException{
        rs.next();
    }
    
    public ArrayList<Cuenta> cuentas() throws MyException{
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        try{
           while(!esUltimo()){
            next();
            cuentas.add(recoger());
            }
        }catch(SQLException ex){
            Controlador_log n = new Controlador_log(ex);
        }
        obtenerdinero(cuentas);
        actualizartabla();
        return cuentas;
    }
    
    public Cuenta recoger() throws SQLException{
        Cuenta cuenta = new Cuenta(rs.getInt(1),rs.getBigDecimal(3));
        return cuenta;
    }
    
    public float obtenerdinero(ArrayList<Cuenta> cuentas){
        suma = 0;
        cuentas.forEach((Cuenta c) -> {
            //suma = suma + c.getDinero().setScale(2).floatValue();
            suma += Float.parseFloat(c.getDinero().toString());
            System.out.println(suma);
        });
        return suma;
    } 
    
    public void actualizartabla() throws MyException{
        PreparedStatement ps;
        try{
            ps = ControladorDB.getConnection().prepareStatement("Update Empresario set dinero_banco =? where dni=?");
            ps.setBigDecimal(1, new BigDecimal(suma));
            ps.setInt(2, dni);
            ps.executeUpdate();
        }catch(SQLException ex){
            Controlador_log n = new Controlador_log(ex);
        }
    }
}
