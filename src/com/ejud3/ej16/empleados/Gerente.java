package com.ejud3.ej16.empleados;

public class Gerente extends Empleado{

	private String departamento;
	
	public Gerente(String n, int cod,String dep) {
		super(n, cod);
		this.departamento=dep;
		
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(super.toString() + this.toString());
		
	}

	@Override
	public String toString() {
		return " - Departamento: " + this.departamento;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 2300;
	}
}
