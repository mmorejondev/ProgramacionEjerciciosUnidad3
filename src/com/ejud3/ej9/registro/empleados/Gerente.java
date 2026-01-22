package com.ejud3.ej9.registro.empleados;

import com.ejud3.ej9.registro.Empleado;

public class Gerente extends Empleado{

	private String departamento;
	
	public Gerente(String n, int edad, double s, String depar) {
		super(n,edad,s);
		this.departamento=depar;
	}
	
	@Override
	public String toString() {
		return "Gerente - " + this.departamento + " - " + super.toString();
	}
	
	@Override
	public double calcularBonificacion() {
		return  this.getSalario()*1.15;
	}
	
	
	
}
