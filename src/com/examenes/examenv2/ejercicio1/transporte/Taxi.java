package com.examenes.examenv2.ejercicio1.transporte;

public class Taxi extends VehiculoPublico{

	private double tarifaBase;

	public Taxi(String matricula, double tarifaBase) {
		super(matricula);
		this.tarifaBase=tarifaBase;
	}

	public double calcularTarifa(double distancia) {
		return this.tarifaBase + distancia*0.75; 
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Taxi:");
		System.out.println("- Matricula: "+ this.matricula);
		System.out.println("- Disponible: " + this.enServicio);
		System.out.println("- Capacidad: " + 4);
	}
	
	@Override
	public void activar() {
		super.activar();
		System.out.println("Taxi activado para 4 pasajeros.");
	}
}
