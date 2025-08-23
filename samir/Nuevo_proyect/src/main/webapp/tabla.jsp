<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla de informacion de las personas</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style type="text/css">
body {
	margin: 60px;
}

.table {
	margin-top: 100px;
	text-align: justify;
}

.info {
	text-align: center;
	font-family: inherit;
	color: blue;
	box-shadow: 5px 1px 4px rgba(0, 0, 0, 0.5);
	position: sticky;
}

th {
	font-size: 15px;
}

td {
	font-family: inherit;
}

.blue {
	background-color: red;
	height: 200px;
	width: 100%;

}
</style>
</head>
<body>


	<h1 class="info">Tabla de contenido</h1>
	<table class="table">

		<thead class="thead-dark">

			<tr class="">
				<th>Id. de usuario</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Fecha de nacimiento</th>
				<th>Correo electrónico</th>
				<th>Accion</th>

			</tr>
		</thead>
		<tbody>
			<tr class="table-success">
				<td>Hola</td>
				<td>Hola</td>
				<td>Hola</td>
				<td>mundo</td>
				<td>hola</td>
				<td>Eliminar</td>


			</tr>
		</tbody>
	</table>


	
	
	
</body>
</html>