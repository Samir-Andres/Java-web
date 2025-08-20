package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	public Connection conectarBD() {

		Connection connection = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyect", "root", "2556229");
			System.out.println("Conectado a la base de datos exitosamente");
		} catch (SQLException e) {
			System.out.println("Error en la conexion a la base de datos" + e.getMessage());

		}
		System.out.println();
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException el) {
			el.printStackTrace();
		}
		
		return connection;
	}

	public static Connection getConnection() {
		return null;
	}

}

