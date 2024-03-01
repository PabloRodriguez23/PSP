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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletLista", urlPatterns = {"/ServletLista"})
public class ServletLista extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ControladorProducto CP = new ControladorProducto();
        HttpSession sesion = request.getSession();
        
        String producto = request.getParameter("eliminar");
        System.out.println(producto);
        CP.eliminar(producto);
        Seccion seccion = (Seccion) sesion.getAttribute("Seccion");
        
        ArrayList<Producto> productos = CP.obtenerproductos(seccion);
        sesion.setAttribute("Lista", productos);
        response.sendRedirect("Lista.jsp");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ControladorProducto CP = new ControladorProducto();
        HttpSession sesion = request.getSession();
        Seccion seccion = (Seccion) sesion.getAttribute("Seccion");
        ArrayList<Producto> productos = CP.obtenerproductos(seccion);
        sesion.setAttribute("Lista", productos);
        response.sendRedirect("Lista.jsp");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
