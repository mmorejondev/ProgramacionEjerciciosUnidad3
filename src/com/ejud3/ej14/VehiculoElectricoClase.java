package com.ejud3.ej14;

public class VehiculoElectricoClase implements VehiculoElectrico{

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
		return 150;
	}

}
