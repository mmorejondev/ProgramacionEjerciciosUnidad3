package com.ejud3.ejemplos;

public class Perro extends Animal {
	
	String raza;
	
	public Perro(String n, int p, String raz) {
		super(n,p);
		this.raza=raz;
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("GUAU...");
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
	
	
	

}
