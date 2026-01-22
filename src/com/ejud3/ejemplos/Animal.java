package com.ejud3.ejemplos;

public class Animal {

	protected String nombre;
	protected int peso;
	
	
	
	public Animal (String n, int p) {
		this.nombre=n;
		this.peso=p;
	}
	
	
	protected void hacerSonido() {
		System.out.println("Haciendo un sonido...");
	}
}
