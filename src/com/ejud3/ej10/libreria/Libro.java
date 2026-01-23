package com.ejud3.ej10.libreria;

public class Libro {

	private String titulo;
	private String autor;
	private double precio;
	protected int numPaginas;
	
	public Libro(String titulo, String autor, double precio, int numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.numPaginas = numPaginas;
	}
	
	public void venderLibro() {
		System.out.println("Se está vendiendo un libro...");
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public double getPrecio() {
		return this.precio;
	}
	
	
	
}
