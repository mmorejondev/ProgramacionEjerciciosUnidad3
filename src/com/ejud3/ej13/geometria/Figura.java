package com.ejud3.ej13.geometria;

public abstract class Figura {

	private String nombre;
	
	public Figura(String n) {
		this.nombre=n;
	}

	protected abstract double calcularArea(); 
	
	public void mostrarInformacion() {
		System.out.println("Mi nombre es: " + this.nombre);
		System.out.println("Soy un " + this.getClass()); 
		System.out.println(" y mi área es: " + this.calcularArea());
	}
	
	
	
}
