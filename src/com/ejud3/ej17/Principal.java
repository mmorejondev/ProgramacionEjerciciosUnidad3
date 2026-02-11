package com.ejud3.ej17;

public class Principal {

	public static void main(String[] args) {

		Bateria b1 = new Bateria(75.0,75.0);
		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla", "Model S", 2023, 15, b1);
		ve1.conducir(100);
	}

}
