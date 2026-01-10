package com.ejud3.ej2;

public class Principal {

	public static void main(String[] args) {

		CuentaBancaria cuenta1 = new CuentaBancaria("Manolo Gutierres",1000);
		cuenta1.mostrarInfo();
		cuenta1.ingresarDinero(200);
		cuenta1.mostrarInfo();
		cuenta1.retirarDinero(500);
		cuenta1.mostrarInfo();
		cuenta1.retirarDinero(750);
		cuenta1.mostrarInfo();
		
		
	}

}
