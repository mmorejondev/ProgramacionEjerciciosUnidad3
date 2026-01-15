package com.ejud3.ej5;

public class Empleado {
	
	String dni;
	String nombre;
	String puesto;
	double salario;
	
	public Empleado(String d,String nombre, String puesto, double salario) {
		this.dni=d;
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}

	
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
	}

	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
	
	
	
}
