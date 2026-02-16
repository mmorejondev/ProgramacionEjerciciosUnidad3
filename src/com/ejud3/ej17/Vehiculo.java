package com.ejud3.ej17;

public abstract class Vehiculo {

	protected String marca;
	protected String modelo;
	protected int anioFabricacion;
	
	public Vehiculo(String marca, String modelo, int anioFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}
	
	public abstract void conducir(double distancia);
	public abstract void realizarMantenimiento();

	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + "]";
	}
	
	
}
