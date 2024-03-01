<%-- 
    Document   : index
    Created on : 23-feb-2024, 15:55:56
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
        <h1>Iniciar sesion</h1>
            <form action="ServletIniciarSesion" method="POST">
            <p>Seccion: <input type="text" name="usuario" placeholder="Ingrese la sección"></p>
            <p>Contraseña: <input type="password" name="contrasena" placeholder="Ingrese la contraseña"></p>
            <button type="submit">Iniciar sesión</button>
        </form>

</body>
</html>
