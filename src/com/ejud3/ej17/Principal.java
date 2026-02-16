package com.ejud3.ej17;

public class Principal {

	public static void main(String[] args) {

		Bateria b1 = new Bateria(75.0,75.0);//Creamos el objeto suponiendo que la bateria está completamente cargada
		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla", "Model S", 2023, 15, b1);
		ve1.conducir(100);
		ve1.realizarMantenimiento();
		
		System.out.println("Comprobando métodos de la interface Recargable");
		System.out.println("Autonomía:" + ve1.obtenerAutonomiaElectrica());
		ve1.recargar();
		System.out.println("Autonomía: " + ve1.obtenerAutonomiaElectrica());
		
		TanqueCombustible t1 = new TanqueCombustible(40.0,40.0);
		VehiculoCombustion vc1 = new VehiculoCombustion("Opel","Vectra",2024,"Gasolina",t1,6.0);
		vc1.conducir(200);
		vc1.realizarMantenimiento();
		vc1.repostar();
		
		ve1.mostrarInformacion();
		vc1.mostrarInformacion();
		
		
	}

}
