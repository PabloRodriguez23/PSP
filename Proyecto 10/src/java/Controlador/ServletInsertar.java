/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import Modelo.Seccion;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletInsertar", urlPatterns = {"/ServletInsertar"})
public class ServletInsertar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ControladorProducto CP = new ControladorProducto();
        HttpSession sesion = request.getSession();
        Seccion seccion = (Seccion) sesion.getAttribute("Seccion");
        System.out.println(seccion);
        String ID = request.getParameter("ID");
        String descripcion = request.getParameter("descripcion");
        BigDecimal precio = new BigDecimal(request.getParameter("precio"));
        
        String fecha_caducidad = request.getParameter("fecha_caducidad");
        System.out.println(fecha_caducidad);
        String foto = request.getParameter("foto");
        System.out.println("ID: "+ ID + " descripcion: "+descripcion+" precio: "+precio+" fecha: "+fecha_caducidad+" foto: "+foto);
        CP.insertar(ID,seccion,descripcion,precio,fecha_caducidad,foto);
        response.sendRedirect("Principal.jsp");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Insertar.jsp");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
