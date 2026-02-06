package com.ejud3.ej14;

public interface VehiculoElectrico {
	/*
	 * Constante CAPACIDAD_BATERIA (int): Representa la capacidad máxima de la batería en kilovatios-hora.
	Método cargarBateria(int cantidadKWh): Este método simula la carga de la batería del vehículo eléctrico. La implementación en la clase VehiculoElectricoClase debe mostrar un mensaje indicando la cantidad de kilovatios-hora que se están cargando en la batería.
	Método obtenerAutonomia(): int: Este método devuelve la autonomía restante del vehículo eléctrico en kilómetros. La implementación en la clase VehiculoElectricoClase simula devolver un valor ficticio y muestra un mensaje en la consola indicando la autonomía restante.
	*/
		
	public final int CAPACIDAD_BATERIA=50;
	void cargarBateria(int cantidadKWh);
	int obtenerAutonomia();

}
