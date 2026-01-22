package com.ejud3.ej9.registro;

public class Empleado {

	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String n, int e, double s) {
		this.nombre=n;
		this.edad=e;
		this.salario=s;
	}
	
	@Override
	public String toString() {
		return "[Nombre: " + this.nombre + " - " + "Edad: " + this.edad + " - " + "Salario: " + this.salario + "]";
	}
	
	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	
	public double calcularBonificacion() {return 0;} 

	public double getSalario() {
		return salario;
	}
	
}
