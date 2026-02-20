package com.ejud3.repaso.ej2;

public class Coche extends Vehiculo implements Alquilable{
	
	private String tipoCombustible;
	
	
	public Coche(String matricula, String marca, String modelo, String tipoCombustible) {
		super(matricula, marca, modelo);
		this.tipoCombustible=tipoCombustible;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describirVehiculo() {
		System.out.println("Marca: " + this.marca + " - Modelo: " + this.modelo + " Matrícula: " + this.matricula + " Tipo de combustible: " + this.tipoCombustible);
	}

	@Override
	public void alquilar() {
		System.out.println("Coche alquilado");
		if (!this.alquilado) {
			this.alquilado=true;
		}
	
	}

	@Override
	public void devolver() {
		if (this.alquilado) {
			this.alquilado=false;
		}
		System.out.println("Coche devuelto");

	}

	@Override
	public boolean estaAlquilado() {
		return this.alquilado;
	}

	

}
