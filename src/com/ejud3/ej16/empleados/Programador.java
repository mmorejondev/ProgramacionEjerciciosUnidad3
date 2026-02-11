package com.ejud3.ej16.empleados;

public class Programador extends Empleado{

	private String lenguaje;
	
	public Programador(String n, int cod, String leng) {
		super(n, cod); //Llamada al constructor de Empleado
		this.lenguaje=leng;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(super.toString() + this.toString());
	}
	
	@Override
	public String toString() {
		return "- lenguaje: " + this.lenguaje;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 1600;
	}
	
	

	
}
