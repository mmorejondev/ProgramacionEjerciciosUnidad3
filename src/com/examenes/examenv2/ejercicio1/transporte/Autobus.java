package com.examenes.examenv2.ejercicio1.transporte;

import com.examenes.examenv2.ejercicio1.interfaces.CapacidadPasajeros;

public class Autobus extends VehiculoPublico implements CapacidadPasajeros{

	private int capacidad;
	
	public Autobus(String matricula, int capacidad) {
		super(matricula);//Constructor de VehiculoPublico
		this.capacidad=capacidad;
	}

	@Override
	public void activar() {
		super.activar();
		System.out.println("Autobus activado con capacidad para " + this.capacidad + " pasajeros.");
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Autobús:");
		System.out.println("- Matricula: "+ this.matricula);
		System.out.println("- Disponible: " + this.enServicio);
		System.out.println("- Capacidad: " + this.capacidad);
	}

	@Override
	public int obtenerCapacidad() {
		return this.capacidad;
	}
	

}
