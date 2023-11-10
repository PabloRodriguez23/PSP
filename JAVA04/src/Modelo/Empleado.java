
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.GregorianCalendar;

public abstract class Empleado implements Serializable{
    int numero;
    transient String nombre;
    float sueldo;
    int sueldomax;
    GregorianCalendar fecha;
    String tipo;
    
    public Empleado(int numero, String nombre, int sueldo, int sueldomax,int a,int m,int d) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldomax = sueldomax;
        this.fecha =new GregorianCalendar(a,m,d);
    }

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + ", sueldo=" + sueldo + ", sueldomax=" + sueldomax + ", fecha=" + fecha + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) throws Esueldomaximo{
        if(sueldo>this.sueldomax) throw new Esueldomaximo("El sueldo no puede superar al maximo");
        this.sueldo = sueldo;
        
    }

    public int getSueldomax() {
        return sueldomax;
    }

    public void setSueldomax(int suedomax) {
        this.sueldomax = suedomax;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    
     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
