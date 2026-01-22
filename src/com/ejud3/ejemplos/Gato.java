package com.ejud3.ejemplos;

public class Gato extends Animal{
	
	int vidas;
	
	public Gato(String n, int p, int v) {
		
		
		super(n,p);//Construimos la parte comun de todos los Animales
		this.vidas=v;
		
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("MIAU...");
	}
	@Override
	public String toString() {
		
		return this.nombre + " - " + this.peso + " - " + this.vidas; 
	}

	
}
