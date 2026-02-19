package com.examenes.examenv2.ejercicio1.transporte;

public abstract class VehiculoPublico {

	protected String matricula;
	protected boolean enServicio;
	
	public VehiculoPublico(String matricula) {
		this.matricula=matricula;
		this.enServicio=false;
	}
	
	public void activar() {
		this.enServicio=true;
	}
	public void desactivar() {
		this.enServicio=false;
	}
	public abstract void mostrarDetalles();	
	
}
