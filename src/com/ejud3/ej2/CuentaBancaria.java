package com.ejud3.ej2;

public class CuentaBancaria {

	//atributos
	double saldo;
	String titular;
	//constructores
	public CuentaBancaria(String t,double s) {
		saldo=s;
		titular=t;
	}
	//metodos
	public void ingresarDinero(double cantidad) {
		if (cantidad>0) {
			saldo = saldo + cantidad;
		}
	}
	
	public void retirarDinero(double cantidad) {
		if (cantidad<=saldo) {
			saldo=saldo-cantidad;
		}else {
			System.out.println("ERROR: Saldo insuficiente.");
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Información de la cuenta: ");
		System.out.println("__________________________________________");
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo + " €.");
	}
	
	
}
