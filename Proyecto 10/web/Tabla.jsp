 <%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Producto"%>
<%-- 
    Document   : Tabla
    Created on : 24-feb-2024, 19:58:52
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla de productos:</h1>
        <%
            HttpSession sesion = request.getSession();
            ArrayList<Producto> productos = (ArrayList<Producto>) sesion.getAttribute("Tabla");
        %>
        <table>
            <tr>
                <th>Id Producto</th>
                <th>Descripcion</th>
                <th>Precio</th>
                <th>Fecha de caducidad</th>
                <th>Foto</th>
            </tr>
        <%
            for(Producto x : productos){
            %>
            <tr>
                <td><%=x.getIdProducto()%></td>
                <td><%=x.getDescripcion()%></td>
                <td><%=x.getPrecio()%></td>
                <td><%=x.getFechaCaducidad()%></td>
                <td><img src="Imagenes/<%=x.getFoto()%>" alt="<%=x.getFoto()%>"  width="100" height="80"></td>
            </tr>
            <%
            }
            %>
        </table>
        <form action="Principal.jsp">
            <button>Volver</button>
        </form>
        <form action="ServletCerrarSesion" method="post">
                <button>Cerrar Sesion</button>
        </form>
    </body>
</html>
