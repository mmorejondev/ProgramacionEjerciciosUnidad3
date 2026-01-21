package com.ejud3.ej8.biblioteca;

public class Libro {
/*
 * titulo (String, privado): Almacena el título del libro.
autor (String, privado): Almacena el nombre del autor del libro.
anioPublicacion (int, privado): Almacena el año de publicación del libro.
disponible (boolean, privado): Indica si el libro está disponible para préstamo.
*/
	
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean disponible;
	
	/*Constructores*/
	public Libro(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.disponible = true;
	}
	/*Getters y Setters*/
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(boolean d) {
		this.disponible = d;
	}
	public void setAutor(String a) {
		if (a!=null) {
			if (a.length()>0 && a.length()<256) {
				this.autor = a;
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
