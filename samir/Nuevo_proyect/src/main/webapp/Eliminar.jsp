<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

label {
	display: block;
	margin: 10px;
}

.btn-success{
text-align: center;
right: 200px;


}
input {
	display: block;
	border: 1px solid gray;
}

</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../Vista/Login.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

	<h1>Eliminar una persona</h1>

	<form action="EliminarServlet">

		<div class="container">
			   <label class="form-label">Id de la persona</label>
			    <input class="form-control" type="number" name="id"
				placeholder="Ingresa el id" required="required">
		</div>
		
	<button type="submit" class="btn-danger">Eliminar</button>
	
	</form>

</body>
</html>