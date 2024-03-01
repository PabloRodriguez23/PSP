/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Seccion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletIniciarSesion", urlPatterns = {"/ServletIniciarSesion"})
public class ServletIniciarSesion extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ControladorSeccion CS = new ControladorSeccion();
        HttpSession sesion = request.getSession();
        
        String Seccion = request.getParameter("usuario");
        String Contraseña = request.getParameter("contrasena");
        System.out.println("" + Seccion + Contraseña);
        Seccion entrar = CS.entrar(Seccion, Contraseña);
        if(entrar != null){
            sesion.setAttribute("Seccion", entrar);
            response.sendRedirect("Principal.jsp");
        }else{
            response.sendRedirect("LoginErroneo.jsp");
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
