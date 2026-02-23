package com.examenes.examen20232024.ej2.encantado.criaturas;

import com.examenes.examen20232024.ej2.encantado.habilidades.Magico;

public class Humano extends Criatura{
	private int inteligencia;

	public Humano(String nombre, int edad, int iq) {
		super(nombre, edad);
		
		this.inteligencia=iq;
	}

	@Override 
	public String toString() {
		return super.toString() + " - IQ: " + this.inteligencia;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
	@Override
	public void demostrarHabilidad() {
		System.out.println("El humano crea herramientas y resuelve problemas.");
	}

	

}
