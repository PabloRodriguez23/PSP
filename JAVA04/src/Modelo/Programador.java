
package Modelo;

import static java.util.Calendar.DAY_OF_MONTH;
import java.util.GregorianCalendar;
import static Modelo.IFecha.DIA_DEL_MES;

public class Programador extends Empleado implements IFecha{
    int Sueldoextra;
    boolean senior;

    public Programador(int numero,String nombre, int sueldo, int suedomax, int a,int m,int d,int Sueldoextra, boolean senior) {
        super(numero, nombre, sueldo, suedomax, a, m, d);
        super.setTipo("P");
        this.Sueldoextra = Sueldoextra;
        this.senior = senior;
    }

    public int getNumero() {
        return numero;
    }
    
    public int getSueldoextra() {
        return Sueldoextra;
    }

    @Override
    public String toString() {
        return "numero: " + numero + ", nombre: " + nombre + ", sueldo: " + sueldo + ", sueldomax: " + sueldomax + ", Sueldoextra: " + Sueldoextra + ", senior: " + senior;
    }

    public void setSueldoextra(int Sueldoextra) {
        this.Sueldoextra = Sueldoextra;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    @Override
    public boolean cumplemes() {
        return (super.fecha).get(DAY_OF_MONTH)==DIA_DEL_MES;
    }

    @Override
    public boolean cumpleaño() {
        return false;
    }
    
}
