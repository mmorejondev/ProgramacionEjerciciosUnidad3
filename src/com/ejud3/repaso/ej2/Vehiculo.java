package com.ejud3.repaso.ej2;

public abstract class Vehiculo {

	
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	protected boolean alquilado;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.alquilado=false;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public abstract void describirVehiculo();
	
}
