package JAVA03;

import java.util.GregorianCalendar;




public class Empleado {
    
    String nombre;
    int numero;
    GregorianCalendar fechaalta;
    String Direccion;
    int telefono;

    public Empleado(String nombre, int numero, String Direccion, int telefono,int a, int m,int d) {
        this.nombre = nombre;
        this.numero = numero;
        this.fechaalta = new GregorianCalendar(a,m,d);
        this.Direccion = Direccion;
        this.telefono = telefono;
    }
    
    public Empleado(String nombre, int numero, String Direccion, int telefono) {
        this.nombre = nombre;
        this.numero = numero;
        this.fechaalta = new GregorianCalendar();
        this.Direccion = Direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public GregorianCalendar getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(GregorianCalendar fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numero=" + numero + ", fechaalta=" + fechaalta + ", Direccion=" + Direccion + ", telefono=" + telefono + '}';
    }
    
    
}
