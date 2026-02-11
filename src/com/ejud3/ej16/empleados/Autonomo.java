package com.ejud3.ej16.empleados;

public class Autonomo extends Empleado{

	private int duracionContrato;

	public Autonomo(String n, int cod, int dc) {
		super(n, cod);
		this.duracionContrato=dc;
	}

	@Override
	public void mostrarInformacion() {

		System.out.println(super.toString() + this.toString());
	}
	@Override
	public String toString() {
		return " - Contrato de: " + this.duracionContrato + " meses.";
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 1700;
	}

}
