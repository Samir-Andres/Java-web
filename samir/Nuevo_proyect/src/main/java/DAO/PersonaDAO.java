import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.conexion;
import Modelo.Persona;

public class PersonaDAO {

	public void create(String nombre, String apellido, String estado_civil, String anio) {
		String sql = "INSERT INTO personas (nombre, apellido, estado_civil, anio) VALUES (?, ?, ?, ?)";
		try (Connection conn = conexion.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
			pst.setString(1, nombre);
			pst.setString(2, apellido);
			pst.setString(3, estado_civil);
			pst.setString(4, anio);
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Registro con éxito");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		String sql = "DELETE FROM personas WHERE id = ?";
		try (Connection conn = conexion.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
			pst.setInt(1, id);
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Persona read(int id) {
		String sql = "SELECT nombre, apellido, estado_civil, anio FROM personas WHERE id = ?";
		try (Connection conn = conexion.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
			pst.setInt(Integer.parseInt(1, id));
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("nombre"));
				p.setApellido(rs.getString("apellido"));
				p.setEstado_civil(rs.getString("estado_civil"));
				p.setAnio(rs.getString("anio"));
				return p;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void update(int id, String nombre, String apellido, String estado_civil, String anio) {
		String sql = "UPDATE personas SET nombre = ?, apellido = ?, estado_civil = ?, anio = ? WHERE id = ?";
		try (Connection conn = conexion.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
			pst.setString(1, nombre);
			pst.setString(2, apellido);
			pst.setString(3, estado_civil);
			pst.setString(4, anio);
			pst.setInt(5, id);
			int confirm = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + id + "?");
			if (confirm == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. " + id + " actualizado");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
