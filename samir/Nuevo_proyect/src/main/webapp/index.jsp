<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="Controlador.conexion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Centro de creación</title>

<style>
label {
	display: block;
	margin: 10px;
}

input {
	display: block;
	border: 1px solid gray;
}

.btn-primary {
	text-align: center;
	margin-top: 10px;
	display: inline;
}

.btn-info {
	text-align: center;
	margin-top: 10px;
	display:inline-block;
}

.btn-danger {
	text-align: center;
	margin-top: 10px;
}
.btn-success{
margin-top: 10px;
}


.contenido {
	background-color: #87B1DB;
}

.info {
	color: white;
	text-align: center;
}

.contenido {
	margin-top: 10%;
	border-radius: 20px;
}

.pre {
	color: blue;
	border-bottom-left-radius: 20px;
	border-bottom-right-radius: 20px;
}

.crear {
	text-align: center;
}
.Opciones{
            width: 50%;
            padding: 50px;
            border: 1px solid #ccc;
            box-sizing: border-box; /* Importante */
            margin: 50px;
            margin-left: 25%;
            background-color: #f9f9f9;
            border-radius: 5px;
            text-align: center;
        }
        
.Opciones1{
width: 5%;
  padding: 0px;


}
 
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>
	<%
	conexion test = new conexion();
	Connection conexion = test.conectarBD();
	if (conexion != null) {
		out.print("<h2>Conectado a la base de datos</h2>");
	} else {
		out.print("<h2>No conectado a la base de datos</h2>");
	}
	if (conexion != null) {
		conexion.close();
	}
	%>

	<h1 class="crear">Crear un registro de una persona</h1>

	<form action="PersonasServlet" method="post">


		<div class="container">
			<label class="form-label">Ingresa tu nombre</label> <input
				class="form-control" type="text" name="nombre"
				placeholder="Ingresa el nombre" required="required">
		</div>

		<div class="container">
			<label class="form-label">Ingresa tu apellido</label> <input
				class="form-control" type="text" name="apellido"
				placeholder="Ingresa el apellido" required="required">
		</div>

		<div class="container">
			<label class="form-label">Ingresa tu estado civil</label> <input
				class="form-control" type="text" name="estado_civil"
				placeholder="Ingresa el estado civil" required="required">
		</div>

		<div class="container">
			<label class="form-label">Ingresa tu edad</label> <input
				class="form-control" type="number" name="anio"
				placeholder="Ingresa tu edad" required="required">
		</div>

		<div class="Opciones1">
			<button type="submit" class="btn-primary">Registrar</button>
		</div>
		
	</form>
	
	
	<div class="Opciones">
			<a href="Actualizar.jsp" type="submit" class="btn btn-success">Actualizar los datos de una persona?</a>
			<a href="" class="btn btn-success">Quiere ver la información una persona?</a>
			<a href="Eliminar.jsp" type="submit" class="btn btn-success">Quiere eliminar una persona?</a>

		
	</div>


</body>
</html>
