package com.examenes.examen20232024.ej2.encantado.criaturas;

import com.examenes.examen20232024.ej2.encantado.habilidades.Magico;

public class TrollDePiedra extends Criatura implements Magico{
	private int factorRegeneracion;


	public TrollDePiedra(String nombre, int edad, int factorRegeneracion) {
		super(nombre, edad);
		this.factorRegeneracion = factorRegeneracion;
	}

	@Override 
	public String toString() {
		return super.toString() + " - Factor de Regeneracion:  " + this.factorRegeneracion;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
	@Override
	public void demostrarHabilidad() {
		System.out.println("El troll se regenera...");
	}

	@Override
	public void demostrarHabilidadMagica() {

		System.out.println("Soy un TROLL: El troll muestra su fuerza incrementada...");
		
	}
	
	
}
