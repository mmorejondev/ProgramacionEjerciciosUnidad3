package com.examenes.examen.ejercicio2.clientes;

public class Cliente {
	
	private int id;
	private Datos datos;
	
	public Cliente(int id, Datos datos) {
		this.id = id;
		this.datos = datos;
	}

	public void mostrarInformacion() {
		System.out.println("Cliente " + this.id + " - " + this.datos.getGigabytesConsumidos() + "GB usados, Saldo: " + this.datos.getSaldoDisponible() + "€.");
	}
}
