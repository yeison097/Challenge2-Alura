package com.alura.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.modelo.huesped;
import com.alura.hotel.modelo.reserva;

public class huespedDao {

	public huespedDao() {
		// TODO Auto-generated constructor stub
	}

	public void registrarReserva(huesped huesped) throws SQLException {
		final Connection con = new ConnectionFactory().recuperarConexion();
		try (con) {
			String query = "insert into huesped (nombre,apellido,fechaNacimiento,nacionalidad,telefono,idReserva) values(?,?,?,?,?,?)";
			final PreparedStatement stement = con.prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS);
			try (stement) {
				((PreparedStatement) stement).setString(1, huesped.getNombre());
				((PreparedStatement) stement).setString(2, huesped.getApellido());
				((PreparedStatement) stement).setString(3, huesped.getFechaNacimiento());
				((PreparedStatement) stement).setString(4, huesped.getNacionalidad());
				((PreparedStatement) stement).setDouble(5, huesped.getTelefono());
				((PreparedStatement) stement).setInt(6, huesped.getIdReserva());
				stement.execute();
				final ResultSet rs = stement.getGeneratedKeys();
				
		}catch(SQLException ex) {
			ex.getStackTrace(); 
		}
		
	}

}
}
