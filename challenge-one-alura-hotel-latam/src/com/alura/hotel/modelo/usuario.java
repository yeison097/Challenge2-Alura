package com.alura.hotel.modelo;

public class usuario {
	
	private int id;
	private String correo;
	private String password;
	private String usuario;
	
	public usuario() {
		
	}

	public int getId() {
		return id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
