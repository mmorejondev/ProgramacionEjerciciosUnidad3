package com.examenes.examen20232024.ej1;

public abstract class Material {

	private String titulo;
	private String autor;
	private int anioPublicacion;

	public Material(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + " - autor: " + autor + " - año de publicacion: " + anioPublicacion;
	}
	
	public abstract void describirMaterial();
	
	

}
