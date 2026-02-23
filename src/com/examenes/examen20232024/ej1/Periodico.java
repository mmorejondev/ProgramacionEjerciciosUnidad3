package com.examenes.examen20232024.ej1;

public class Periodico extends Material{
	private String fechaPublicacion;

	public Periodico(String titulo, String autor, int anioPublicacion, String fechaPublicacion) {
		super(titulo, autor, anioPublicacion);
		this.fechaPublicacion=fechaPublicacion;
		
	}

	@Override
	public String toString() {
		return super.toString() + " fecha de Publicación: " + this.fechaPublicacion;
	}
	
	@Override
	public void describirMaterial() {
		
		System.out.println(this.toString());
	}


	
	
	
	
	
	
}
