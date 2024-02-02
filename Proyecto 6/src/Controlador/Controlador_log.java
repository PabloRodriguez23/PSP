package Controlador;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador_log {
    
    public Controlador_log(Exception e){
        
        String mensaje = obtenerMensajeError(e);
        
        
        FileWriter Fichero = null;
        
        try {
            Fichero = new FileWriter("log.txt", true);
            BufferedWriter tuberia = new BufferedWriter(Fichero);
            PrintWriter print = new PrintWriter(tuberia);
            
            LocalDate fecha = LocalDate.now();
            
            LocalDateTime locaDate = LocalDateTime.now();
            int hours  = locaDate.getHour();
            int minutes = locaDate.getMinute();
            int seconds = locaDate.getSecond();
            
            System.out.println(fecha);
            System.out.println("Hora actual: " + hours + ":" + minutes + ":" + seconds); 
            
            String Sfecha = "Fecha: " + fecha + " Hora actual: " + hours + ":" + minutes + ":" + seconds + " ";
            
            print.print(Sfecha + mensaje);
            print.print("\n");
            
            print.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador_log.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
             Logger.getLogger(Controlador_log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String obtenerMensajeError(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
    
}
