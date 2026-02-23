package com.examenes.examen20232024.ej1;

public class Libro extends Material implements Prestable{

	private String ISBN;
	private boolean prestado;

	public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
		super(titulo, autor, anioPublicacion);
		this.ISBN=isbn;
		this.prestado=false;
		
	}

	@Override
	public String toString() {
		return super.toString() + "- ISBN: " + this.ISBN;
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
