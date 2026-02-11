package com.ejud3.ej14;

public class VehiculoHibridoClase implements VehiculoElectrico, VehiculoCombustion{

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

	@Override
	public void cargarBateria(int cantidadKWh) {
		if (cantidadKWh<=CAPACIDAD_BATERIA) {
			System.out.println("Cargando " + cantidadKWh);
		}else {
			System.out.println(cantidadKWh + " INCORRECTA");
		}		
	}

	@Override
	public int obtenerAutonomia() {
		// TODO Auto-generated method stub
		return 150;
	}

}
