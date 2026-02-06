package com.ejud3.ej14;

public interface VehiculoCombustion {

	public final static int CAPACIDAD_TANQUE=50;
	void recargarCombustible(int cantidadLitros);
	void consumirCombustible(int distanciaKm);

}
