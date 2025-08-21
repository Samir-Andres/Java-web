<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

.crear {
	text-align: center;
}

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
	margin-top: 20px;
	display: inline;
	margin-left: 40%;
	padding: 5px;
    border-radius: 20px;
    width: 200px;
}

.btn-warning {
	text-align: center;
	margin-top: 20px;
	display: block;
	margin-left: 40%;
	padding: 5px;
    border-radius: 20px;
    width: 200px;
}

.btn-warning:hover{
list-style: none;
text-decoration: none;

}

.btn-danger {
	text-align: center;
	margin-top: 10px;
}
.btn-success{
margin-top: 10px;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>


<h1 class="crear">Actualizar Registro</h1>
<form action="ActualizarServlet" method="get">


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
		
		<div class="container">
			<label class="form-label">Ingresa el id</label> <input
				class="form-control" type="number" name="id"
				placeholder="Ingresa el nombre" required="required">
		</div>

		<div class="Opciones1">
			<button type="submit" class="btn-primary">Actualizar</button>
		</div>
		
		<div class="Opciones">
		<a href="index.jsp" class="btn-warning">Regresar</a>
		</div>
		
	</form>

</body>
</html>