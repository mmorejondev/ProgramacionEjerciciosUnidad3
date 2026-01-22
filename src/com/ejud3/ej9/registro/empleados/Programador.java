package com.ejud3.ej9.registro.empleados;

import com.ejud3.ej9.registro.Empleado;

public class Programador extends Empleado{

	private String lenguaje;
	public Programador(String n, int edad, double s, String leng) {
		super(n,edad,s);
		this.lenguaje=leng;
		
	}
	
	@Override
	public String toString() {
		return "Programador - " + this.lenguaje + " - " + super.toString();
	}
	
	@Override
	public double calcularBonificacion() {
		return this.getSalario()*1.10;
	}
	
	
}
