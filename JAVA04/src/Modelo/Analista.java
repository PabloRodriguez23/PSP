
package Modelo;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import java.util.GregorianCalendar;

public class Analista extends Empleado implements IFecha{
    int Plus_anual;
    int Edad;

    public Analista(int numero, String nombre, int sueldo, int suedomax, int a,int m,int d, int Plus_anual, int Edad) {
        super(numero, nombre, sueldo, suedomax, a, m, d);
        super.setTipo("A");
        this.Plus_anual = Plus_anual;
        this.Edad = Edad;
    }

    public int getNumero() {
        return numero;
    }
    
    public int getPlus_anual() {
        return Plus_anual;
    }

    @Override
    public String toString() {
        return "numero: " + numero + ", nombre: " + nombre + ", sueldo: " + sueldo + ", sueldomax: " + sueldomax + ", Plus_anual: " + Plus_anual + ", Edad: " + Edad;
    }

    public void setPlus_anual(int Plus_anual) {
        this.Plus_anual = Plus_anual;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public boolean cumplemes() {
        return false;
    }

    @Override
    public boolean cumpleaño() {
        return(super.fecha).get(DAY_OF_MONTH)==DIA_DEL_MES&&(super.fecha).get(MONTH)==MES_DEL_AÑO;
    }
    
}
