package com.ejud3.ej16.empleados;

public abstract class Empleado implements Pagable{
	/*
	 * Atributos protegidos:
	nombre (String): el nombre del empleado.
	codigoEmpleado (int): un código único para cada empleado.
	*/
	protected String nombre;
	protected int codigoEmpleado;
	
	/*Este constructor se usará EXCLUSIVAMENTE en el constructor de las clases hijas*/
	public Empleado(String n, int cod) {
		this.nombre=n;
		this.codigoEmpleado=cod;
	}
	
	/*
	Método abstracto:
	mostrarInformacion(): método para mostrar la información básica del empleado. Debe ser público.
	*/
	public abstract void mostrarInformacion();

	@Override
	public String toString() {
		return codigoEmpleado + " - " + nombre; 
	}
	
}
