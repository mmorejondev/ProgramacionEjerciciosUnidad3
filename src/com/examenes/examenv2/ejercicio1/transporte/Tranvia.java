package com.examenes.examenv2.ejercicio1.transporte;

import com.examenes.examenv2.ejercicio1.interfaces.CapacidadPasajeros;

public class Tranvia extends VehiculoPublico implements CapacidadPasajeros{

	private int numVagones;
	
	public Tranvia(String matricula, int vagones) {
		super(matricula);
		this.numVagones=vagones;
	}

	@Override
	public int obtenerCapacidad() {
		return this.numVagones*20;
	}

	@Override
	public void activar() {
		super.activar();
		System.out.println("Tranvía activado con capacidad para " + this.numVagones*20 + " pasajeros.");
	}
	@Override
	public void mostrarDetalles() {
		System.out.println("Tranvía:");
		System.out.println("- Matricula: "+ this.matricula);
		System.out.println("- Disponible: " + this.enServicio);
		System.out.println("- Capacidad: " + this.numVagones*20);		
	}

}
