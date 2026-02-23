package com.examenes.examen20232024.ej1;

public class Revista extends Material implements Prestable{

	private String ISSN;
	private boolean prestado;

	public Revista(String titulo, String autor, int anioPublicacion, String issn) {
		super(titulo, autor, anioPublicacion);
		this.ISSN=issn;
		this.prestado=false;
		
	}

	@Override
	public String toString() {
		return super.toString() + "- ISSN: " + this.ISSN;
	}
	
	@Override
	public void describirMaterial() {
		
		System.out.println(this.toString());
	}

	@Override
	public void prestar() {

		if (!this.prestado)
			this.prestado=true;
		
	}

	@Override
	public void devolver() {
		if (this.prestado)
			this.prestado=false;
		
	}

	@Override
	public boolean estaPrestado() {
		
		return this.prestado;
	}

	
	
	
	
	
	
}
