package com.ejud3.ej14;

public interface VehiculoCombustion {

/*
 * Constante CAPACIDAD_TANQUE (int): Representa la capacidad máxima del tanque de combustible en litros.
Método recargarCombustible(int cantidadLitros): Este método simula la recarga del tanque de combustible del vehículo de combustión. La implementación en la clase VehiculoCombustionEjemplo debe mostrar un mensaje indicando la cantidad de litros que se están recargando en el tanque.
Método consumirCombustible(int distanciaKm): Este método simula el consumo de combustible durante un viaje y debe actualizar el nivel de combustible en consecuencia. La implementación en la clase VehiculoCombustionEjemplo simula el consumo de combustible asumiendo un valor fijo y muestra un mensaje indicando la cantidad de litros consumidos durante la distancia proporcionada.

 * */

	public final static int CAPACIDAD_TANQUE=50;
	void recargarCombustible(int cantidadLitros);
	void consumirCombustible(int distanciaKm);


}
