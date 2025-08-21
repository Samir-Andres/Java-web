package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class ActualizarServlet
 */
@WebServlet("/ActualizarServlet")
public class ActualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
        response.setContentType("text/html");
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String estado_civil = request.getParameter("estado_civil");
		String anio = request.getParameter("anio");
		String id = request.getParameter("id");
		
		String sql = "UPDATE personas SET nombre=?, apellido=?, estado_civil=?, anio =?  WHERE id=?";
		
		conexion conn = new conexion();
	
		
		try {
		
	
			PreparedStatement sentencia = conn.conectarBD().prepareStatement(sql);
		    sentencia.setString(1, nombre);
		    sentencia.setString(2, apellido);
		    sentencia.setString(3, estado_civil);
		    sentencia.setString(4, anio);
		    sentencia.setString(5, id);
		    
		    int filasAfectadas = sentencia.executeUpdate();
	        
		    if (filasAfectadas > 0) {
		        System.out.println("Actualización exitosa. Filas afectadas: " + filasAfectadas);
		    } else {
		        System.out.println("No se encontró el registro para actualizar.");
		    }
	    	
		    response.sendRedirect("/Nuevo_proyect/Actualizar.jsp");
	            
	    } catch (SQLException e) {
	        System.err.println("Error al actualizar: " + e.getMessage());
	    }
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
