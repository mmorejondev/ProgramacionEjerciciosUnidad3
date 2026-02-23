package com.examenes.examen20232024.ej2.encantado.criaturas;

import com.examenes.examen20232024.ej2.encantado.habilidades.Magico;

public class Dragon extends Criatura implements Magico{
	private String color;

	public Dragon(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color = color;
	}

	@Override 
	public String toString() {
		return super.toString() + " - color: " + this.color;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
	@Override
	public void demostrarHabilidad() {
		System.out.println("El dragón come vacas y duerme 23 horas al día.");
	}

	@Override
	public void demostrarHabilidadMagica() {

		System.out.println("Soy un DRAGON: Escupe fuego, vuela e invoca tormentas.");
		
	}
	
	
	
	

}
