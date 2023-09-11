package com.alura.hotel.principal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.modelo.reserva;

import views.Busqueda;
import views.MenuPrincipal;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		try {
			MenuPrincipal frame = new MenuPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
