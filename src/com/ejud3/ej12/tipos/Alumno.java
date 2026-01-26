package com.ejud3.ej12.tipos;

public class Alumno extends Persona {

	private String curso;
	
	public Alumno(String n,String c) {
		super(n);//Construimos la parte de Persona
		this.curso=c;
	}

	@Override
	public String toString() {
		return "Alumno[nombre:" + this.getNombre() +   ", curso=" + curso + "]";
	}


	
}
