package Modelo;
import java.util.*;
import static java.util.Calendar.*;
//////////////////////////////////////////////////////////////////
// Interfaz IFecha: m�todos y constantes para obtener
//                  el d�a, mes y a�o
//

public interface IFecha
{
  GregorianCalendar fecha = new GregorianCalendar();
  public final static int DIA_DEL_MES = fecha.get(DAY_OF_MONTH);
  public final static int MES_DEL_AÑO = fecha.get(MONTH)+1;
  public final static int AÑO = fecha.get(YEAR);
  
  public boolean cumplemes();
  public boolean cumpleaño();
}
//////////////////////////////////////////////////////////////////
/*
  public int dia()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(DIA_DEL_MES);
  }
  public int mes()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(MES_DEL_AÑO)+1;
  }
  public int año()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(AÑO);
  }
*/