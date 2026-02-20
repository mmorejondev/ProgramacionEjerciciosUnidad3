package com.ejud3.repaso.ej2;

public class GestorDeAlquileres {
	
	public void alquilarVehiculo(Alquilable v) {
		System.out.println("Alquilando vehículo...");
		v.alquilar();
	}
	public void devolverVehiculo(Alquilable v) {
		System.out.println("Devolviendo vehículo...");

		v.devolver();
		
	}
	public boolean estaAlquilado(Alquilable v) {
		return v.estaAlquilado();
	}


}
