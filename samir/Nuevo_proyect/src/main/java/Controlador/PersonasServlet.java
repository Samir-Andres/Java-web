package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import DAO.PersonaDAO;
import Modelo.Persona;

import java.io.IOException;
import java.util.List;

@WebServlet("/PersonasServlet")
public class PersonasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PersonaDAO dao = new PersonaDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");

		if (accion == null || accion.equals("listar")) {
			List<Persona> lista = dao.read();
			request.setAttribute("personas", lista);
			request.getRequestDispatcher("vistas/listar.jsp").forward(request, response);

		} else if (accion.equals("nuevo")) {
			request.getRequestDispatcher("vistas/formulario.jsp").forward(request, response);

		} else if (accion.equals("editar")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				Persona p = dao.read(id);
				request.setAttribute("persona", p);
				request.getRequestDispatcher("vistas/formulario.jsp").forward(request, response);
			} catch (NumberFormatException e) {
				response.sendRedirect("PersonasServlet?accion=listar");
			}

		} else if (accion.equals("eliminar")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				dao.delete(id);
			} catch (NumberFormatException e) {
				
			}
			response.sendRedirect("PersonasServlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Recoger datos del formulario
		int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String estado_civil = request.getParameter("estado_civil");
		String anio = request.getParameter("anio");

		if (id > 0) {
			dao.update(id, nombre, apellido, estado_civil, anio);
		} else {
			dao.create(nombre, apellido, estado_civil, anio);
		}

		response.sendRedirect("PersonasServlet");
	}
}
