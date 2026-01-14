package com.ejud3.ejemplos;

public class Persona {

	String nombre;
	String apellidos;
	String dni;
	Asignatura [] matricula;
	
	public Persona(String nombre,String a, String d) {
		this.nombre=nombre;
		this.apellidos=a;
		this.dni=d;
		matricula = new Asignatura[7];
	}
	
	public Persona(String n, String d) {
		this(n,"",d);
	}
	public Persona() {}
	
	
	
}
