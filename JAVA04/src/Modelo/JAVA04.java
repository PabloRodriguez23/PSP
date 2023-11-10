/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.MyList;

/**
 *
 * @author Pablo
 */
public class JAVA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList listo = new MyList();
        Empleado emp1 =new Programador(2,"Pablo",2000,3000,2023,8,12,200,true);
        Empleado emp2 =new Analista(1,"Alba",2000,3000,2023,8,12,200,20);
        Empleado emp3 =new Programador(3,"Abel",2000,3000,2023,8,12,200,true);
        listo.add(emp1);
        listo.add(emp2);
        listo.add(emp3);
        listo.guardar();
        listo.showMyList();
    }
    
}
