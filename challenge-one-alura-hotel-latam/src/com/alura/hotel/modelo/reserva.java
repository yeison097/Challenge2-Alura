package com.alura.hotel.modelo;

import java.time.LocalDate;

public class reserva {
	
	private int idReserva;
	private String inicio;
	private String fin;
	private double valor;
	private String formaPago;
	
	public reserva() {
		// TODO Auto-generated constructor stub
	}

	
	
	public reserva(int idReserva, String inicio, String fin, double valor, String formaPago) {
		this.idReserva = idReserva;
		this.inicio = inicio;
		this.fin = fin;
		this.valor = valor;
		this.formaPago = formaPago;
	}



	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}


	public int getIdReserva() {
		return idReserva;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	@Override
	public String toString() {
		return "idReserva: " + idReserva + "\nInicio: " + inicio + "\nFin: " + fin + "\nValor: " + valor
				+ "\nForma Pago: " + formaPago;
	}
	
	
	

}
