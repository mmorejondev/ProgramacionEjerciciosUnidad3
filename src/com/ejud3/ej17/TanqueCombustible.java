package com.ejud3.ej17;

public class TanqueCombustible {
	
	private double capacidad; //cantidad actual de combustible en litros.
	private double capacidadMaxima; // Capacidad máxima del tanque en litros.
	public TanqueCombustible(double capacidad, double capacidadMaxima) {
		this.capacidad = capacidad;
		this.capacidadMaxima = capacidadMaxima;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	public void mostrarInformacionTanque() {
		System.out.println(this.toString());
	}

	
	@Override
	public String toString() {
		return "TanqueCombustible [capacidad=" + capacidad + ", capacidadMaxima=" + capacidadMaxima + "]";
	}

	
	

}
