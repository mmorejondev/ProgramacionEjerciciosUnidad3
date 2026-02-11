package com.ejud3.ej14;

public class Principal {

	public static void main(String[] args) {

		VehiculoCombustionClase vc1 = new VehiculoCombustionClase();
		vc1.recargarCombustible(50);
		vc1.consumirCombustible(200);
		
		VehiculoElectricoClase ve1 = new VehiculoElectricoClase();
		ve1.cargarBateria(40);
		System.out.println(ve1.obtenerAutonomia());
		
		
		
		VehiculoHibridoClase vh1 = new VehiculoHibridoClase();
		vh1.cargarBateria(45);
		System.out.println(vh1.obtenerAutonomia());
		vh1.recargarCombustible(40);
		vh1.consumirCombustible(150);
		
	}

}
