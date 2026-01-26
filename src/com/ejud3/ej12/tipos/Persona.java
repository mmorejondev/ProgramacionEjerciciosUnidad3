package com.ejud3.ej12.tipos;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
