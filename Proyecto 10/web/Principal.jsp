<%-- 
    Document   : Principal
    Created on : 24-feb-2024, 17:16:55
    Author     : Pablo
--%>

<%@page import="Modelo.Seccion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Principal</title>
    </head>
    <body>
        <%Seccion seccion = (Seccion) request.getSession().getAttribute("Seccion");
        String persona = null;        
                if(seccion.getId().equals("S1")){
                persona = "Carnicer@";
                }
                if(seccion.getId().equals("S2")){
                persona = "Pescader@";
                }
                if(seccion.getId().equals("S3")){
                persona = "Panader@";
                }
                if(seccion.getId().equals("S4")){
                persona = "Asesor de electrodomesticos";
                }
                if(seccion.getId().equals("S5")){
                persona = "Gamer";
                }
                
            %>
            <h1>Bienvenido <%=persona%></h1>
            <p>Todos tus productos cuestan un total de <%=seccion.getPrecioTotalProductos()%></p>
            <form action="ServletCalcular" method="post">
            <button>Calcular</button>    
            </form>  
            <form action="ServletInsertar" method="get">
                <button>Insertar producto</button>
            </form>
            <form action="ServletLista" method="get">
                <button>Ver lista</button>
            </form>
            <form action="ServletTabla" method="post">
                <button>Ver Tabla</button>
            </form>
            <form action="ServletCerrarSesion" method="post">
                <button>Cerrar Sesion</button>
            </form>
    </body> 
</html>
