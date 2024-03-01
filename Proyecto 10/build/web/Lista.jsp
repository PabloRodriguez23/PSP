<%-- 
    Document   : Lista
    Created on : 24-feb-2024, 19:58:46
    Author     : Pablo
--%>

<%@page import="Modelo.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/csslista.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de productos:</h1>
        <%
            HttpSession sesion = request.getSession();
            ArrayList<Producto> productos = (ArrayList<Producto>) sesion.getAttribute("Lista");
        %>
        <section>
        <%
            for(Producto x : productos){
            %>
            <article>
                Id Producto: <%=x.getIdProducto()%>, 
                Descripcion: <%=x.getDescripcion()%>, 
                Precio: <%=x.getPrecio()%>, 
                Fecha caducidad: <%=x.getFechaCaducidad()%>, 
                Foto: <img src="Imagenes/<%=x.getFoto()%>" alt="<%=x.getFoto()%>"  width="100" height="80">
                <form action="ServletLista" method="post">
                    <input type="text" name="eliminar" placeholder="Ingrese la sección" value="<%=x.getIdProducto()%>" hidden="true">
                    <button>Eliminar</button>
                </form>
            </article>
            <%
            }
            %>
        </section>
        <form action="Principal.jsp">
            <button>Volver</button>
        </form>
        <form action="ServletCerrarSesion" method="post">
                <button>Cerrar Sesion</button>
            </form>
    </body>
</html>
