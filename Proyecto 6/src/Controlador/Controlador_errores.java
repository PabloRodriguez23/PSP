package Controlador;

public class Controlador_errores {
    
    private static String mensaje;
    
    public static String getMensaje(int cod) {
        mensaje = "Error "+ cod + ": ";
        switch(cod) {
            case 101:
                mensaje = mensaje + "al cargar los drivers de la base de datos";
                break;
                
            case 102:
                mensaje = mensaje + "al abrir la base de datos";
                break;

            case 103:
                mensaje = mensaje + "al cerrar la base de datos";
                break;
                
            case 106:
                mensaje = mensaje + "Se valido el NIF, Se actualizaron los datos";
                break;
                
            case 107:
                mensaje = mensaje + "No se pudo validar el NIF";
                break;
                
            case 108:
                mensaje = mensaje + "No se han rellenado todos los valores";
                break;
            case 109:
                mensaje = mensaje + "iniciar sesion";
                break;
            case 110:
                mensaje = mensaje + "calcular el dinero";
                break;
            case 111:
                mensaje = mensaje + "al actualizar el dinero en la DB";
                break;
            case 112:
                mensaje = mensaje + "al insertar empresario en la DB";
                break;  
            default:
                mensaje = mensaje + "DESCONOCIDO";
        }
        return mensaje;
    }
    
}
