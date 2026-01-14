package com.ejud3.ej3;

public class Libro {

	String titulo;
	String autor;
	float precio;
	
	public Libro(String t,String a,float p) {
		this.titulo=t;
		this.autor=a;
		this.precio=p;
	}

	public Libro() {}
	
	public void mostrarInfo() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Precio: " + this.precio);
	}
	
	
}
