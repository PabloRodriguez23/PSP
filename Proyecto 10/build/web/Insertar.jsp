<%-- 
    Document   : Insertar
    Created on : 01-mar-2024, 11:06:29
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
        <h1>Hello World!</h1>
        <form action="ServletInsertar" method="post">
                    <input type="text" name="ID" placeholder="Ingrese el Id">

                    <input type="text" name="descripcion" placeholder="Ingrese la descripcion">

                    <input type="text" name="precio" placeholder="Ingrese el precio">

                    <input type="Date" name="fecha_caducidad">

                    <input type="text" name="foto" placeholder="Ingrese la foto">
                    <button type="submit">Insertar producto</button>
                </form>
    </body>
</html>
