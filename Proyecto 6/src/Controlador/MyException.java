package Controlador;

public class MyException extends Exception{
    private int codigo;
    
    public MyException(){
        
    }
       
    public MyException(int codigo) {
        super();
        this.codigo=codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
