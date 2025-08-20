package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class PersonasServlet
 */
@WebServlet("/PersonasServlet")
public class PersonasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		out.print("<!DOCTYPE>");
		out.print("<html>");
		out.print("<head>");
		out.print("<h1>Bienvenido</h1>");
		out.print("<h4>P</h4>");
		out.print("</head>");
		out.print("<body>");
		out.print("</body>");
		out.print("</html>");
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String estado_civil = request.getParameter("estado_civil");
		String anio = request.getParameter("anio");
		
		String sql = "Insert into personas (nombre, apellido, estado_civil, anio) values (?, ?, ?, ?)";
		
		conexion conn = new conexion();
		
		try {
			PreparedStatement pStmt = conn.conectarBD().prepareStatement(sql);
			
			String Año = anio;
			
			pStmt.setString(1, nombre);
			pStmt.setString(2, apellido);
			pStmt.setString(3, estado_civil);
			pStmt.setString(4, Año);
			
			int rowsAffected = pStmt.executeUpdate();
			
			if(rowsAffected > 0) {
				response.sendRedirect("/Nuevo_proyect/index.jsp");
				
			}else {
				response.getWriter().print("Probelama al insertar una persona");
			}
		}catch (Exception e) {
			out.print("Todos los datos debe son obligatorio");
			
		
		}
		out.print("Dato guardado");
		
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
