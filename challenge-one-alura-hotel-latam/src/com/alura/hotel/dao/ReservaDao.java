package com.alura.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.modelo.reserva;



public class ReservaDao {
	public static int idR ;

	public ReservaDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean registrarReserva(reserva reserva) throws SQLException {
		final Connection con = new ConnectionFactory().recuperarConexion();
		try (con) {
			String query = "insert into reserva (fechaEntrada,fechaSalida,valor,formaPago) values(?,?,?,?)";
			final PreparedStatement stement = con.prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS);
			try (stement) {
				((PreparedStatement) stement).setString(1, reserva.getInicio());
				((PreparedStatement) stement).setString(2, reserva.getFin());
				((PreparedStatement) stement).setDouble(3, reserva.getValor());
				((PreparedStatement) stement).setString(4, reserva.getFormaPago());
				stement.execute();
				final ResultSet rs = stement.getGeneratedKeys();
				try (rs) {
					while (rs.next()) {
						reserva.setIdReserva(rs.getInt(1));
						idR = reserva.getIdReserva();
						System.out.println("Fue insertado el: " + reserva.toString());
					}
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		
		return true;
	}
	
}
