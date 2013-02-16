package com.example.controlpersonalizado;

public class Tweet {
	
	String nombre;
	String texto;
	public Tweet(String nombre, String texto) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.texto=texto;
	}
	public String getTexto() {
		return texto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
