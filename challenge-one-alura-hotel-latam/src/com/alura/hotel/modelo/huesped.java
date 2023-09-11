package com.alura.hotel.modelo;

public class huesped {
	
	private int idHuesped;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private double telefono;
	private int idReserva;
	
	public huesped() {
		// TODO Auto-generated constructor stub
	}
	

	public huesped(int idHuesped, String nombre, String apellido, String fechaNacimiento, String nacionalidad,
			double telefono, int idReserva) {
		this.idHuesped = idHuesped;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}


	public int getIdHuesped() {
		return idHuesped;
	}

	public void setIdHuesped(int idHuesped) {
		this.idHuesped = idHuesped;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	@Override
	public String toString() {
		return "huesped [idHuesped=" + idHuesped + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", telefono=" + telefono
				+ ", idReserva=" + idReserva + "]";
	}
	
	

	
}
