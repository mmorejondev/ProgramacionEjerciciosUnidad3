package com.ejud3.repaso.ej2;

public class Camion extends Vehiculo{
	
	private double capacidadCarga;
	
	
	public Camion(String matricula, String marca, String modelo, double capacidadCarga) {
		super(matricula, marca, modelo);
		this.capacidadCarga=capacidadCarga;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describirVehiculo() {
		System.out.println("Marca: " + this.marca + " - Modelo: " + this.modelo + " SMatrícula: " + this.matricula + " Capacidad de carga: " + this.capacidadCarga);
	}
}
