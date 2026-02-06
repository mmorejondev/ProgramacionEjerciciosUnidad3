package com.ejud3.ej14;

public class VehiculoCombustionClase implements VehiculoCombustion{

	
	@Override
	public void recargarCombustible(int cantidadLitros) {
		if (cantidadLitros<=CAPACIDAD_TANQUE) {
			System.out.println("Repostando " + cantidadLitros);
		}else {
			System.out.println(cantidadLitros + " INCORRECTA");
		}
	}

	@Override
	public void consumirCombustible(int distanciaKm) {

		float litrosConsumidos = (distanciaKm/100)*6.0f;
		System.out.println("Se han consumido " + litrosConsumidos);
		
	}

}
