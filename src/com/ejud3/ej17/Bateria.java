package com.ejud3.ej17;

public class Bateria {

	/*Atributos protegidos?:
		capacidad (double): Capacidad actual de la batería en kWh.
		capacidadMaxima (double): Capacidad máxima en kWh.
		Método no abstracto:
		mostrarInformacionBateria(): Muestra la información de la batería.
*/
	
	private double capacidad;
	private double capacidadMaxima;

	
	public double getCapacidad() {
		return capacidad;
	}
	

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}


	public Bateria(double capacidad, double capacidadMaxima) {
		this.capacidad = capacidad;
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public void mostrarInformacionBateria() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Bateria [capacidad=" + capacidad + ", capacidadMaxima=" + capacidadMaxima + "]";
	}
	
	
	
	
}
