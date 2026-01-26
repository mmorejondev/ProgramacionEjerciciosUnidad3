package com.ejud3.ej12.tipos;

public class Profesor extends Persona{
	
	private String departamento;
	
	public Profesor(String n,String d) {
		super(n);
		this.departamento=d;
	}

	@Override
	public String toString() {
		return "Profesor[nombre:" + this.getNombre() +   ", dpto=" + this.departamento + "]";
	}
	
	
}
