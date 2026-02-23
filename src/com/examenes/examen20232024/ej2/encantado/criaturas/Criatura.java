package com.examenes.examen20232024.ej2.encantado.criaturas;

public abstract class Criatura {

	protected String nombre;
	protected int edad;
	
	public Criatura(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - edad: " + edad;
	}
	
	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	public abstract void demostrarHabilidad();
	

		

}
