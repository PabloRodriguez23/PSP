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
    public boolean entrar(int usuario,int contrasena){
        boolean entrar = false;
        Connection conexion = null;
        PreparedStatement pstatement;
        ResultSet resultSet = null;
        System.out.println(usuario);
        System.out.println(contrasena);
        try {
            conexion = (Connection) ControladorDB.getConnection();
            pstatement = conexion.prepareStatement("select nif, fundacion, numsocios from Empresa where nif = ? and contrasena =?");
            System.out.println(pstatement);
            pstatement.setInt(1, usuario);
            pstatement.setInt(2, contrasena);
            resultSet = pstatement.executeQuery();
            if (resultSet.next()) {
                entrar = true;
                nif=resultSet.getInt("nif");
                fundacion=resultSet.getDate("fundacion");
                numsocio=resultSet.getInt("numsocios");
                System.out.println(contraseña);
                System.out.println(nif);
            }
           
        } catch (SQLException Ex) {
            Ex.printStackTrace();
        } finally {
            ControladorDB.close(resultSet);
            ControladorDB.close(conexion);
        }
        return entrar;
    }
    
}

