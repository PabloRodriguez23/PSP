/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ControladorEmpresa {
    private int nif;
    private Date fundacion;
    private int numsocio;
    private int contraseña;
    private String foto;
    public boolean entrar(int usuario,int contrasena) throws MyException{
        boolean entrar = false;
        Connection conexion = null;
        PreparedStatement pstatement;
        ResultSet resultSet = null;
        System.out.println(usuario);
        System.out.println(contrasena);
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("select nif, fundacion, numsocios, foto from Empresa where nif = ? and contrasena =?");
            pstatement.setInt(1, usuario);
            pstatement.setInt(2, contrasena);            
            System.out.println(pstatement);

            resultSet = pstatement.executeQuery();
            if (resultSet.next()) {
                entrar = true;
                nif=resultSet.getInt("nif");
                fundacion=resultSet.getDate("fundacion");
                numsocio=resultSet.getInt("numsocios");
                foto = resultSet.getString("foto");
                System.out.println(contraseña);
                System.out.println(nif);
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            Controlador_log n = new Controlador_log(ex);
            throw new MyException(109);
        } finally {
            ControladorDB.close(resultSet);
            ControladorDB.close(conexion);
        }
        calcular(nif);
        actualizar(nif);
        return entrar;
    }
    
    
    public void calcular(int nif) throws MyException{
        Connection conexion = null;
        PreparedStatement pstatement;
        ResultSet resultSet = null;
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("select count(*) from Empresario where nif_empresa =?");
            pstatement.setInt(1,nif);
            System.out.println(pstatement);
            resultSet = pstatement.executeQuery();
            if (resultSet.next()) {
                numsocio=resultSet.getInt(1);
                System.out.println(numsocio);
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            Controlador_log n = new Controlador_log(ex);
            throw new MyException(110);
        } finally {
            ControladorDB.close(resultSet);
            ControladorDB.close(conexion);
        }
    }
    
    public void actualizar(int nif) throws MyException{
        Connection conexion = null;
        PreparedStatement pstatement;
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("Update Empresa set numsocios = ? where nif =?");
            pstatement.setInt(1,numsocio);
            pstatement.setInt(2,nif);
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
    
    public void actualizar2(int nif,Date fundacion,int contraseña) throws MyException{
        Connection conexion = null;
        PreparedStatement pstatement;
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("Update Empresa set fundacion = ?, contrasena = ? where nif =?");
            pstatement.setDate(1, new java.sql.Date(fundacion.getTime()));
            pstatement.setInt(2,contraseña);
            pstatement.setInt(3,nif);
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
    
    

    public Date getFundacion() {
        return fundacion;
    }

    public int getNumsocio() {
        return numsocio;
    }

    public String getFoto() {
        return foto;
    }
    
    
    
    
}

