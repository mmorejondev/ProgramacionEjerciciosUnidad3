package com.ejud3.ej3;

import java.util.Scanner;

public class TiendaLibros {

	String nombre;
	Libro [] catalogo;
	int posicionLibroNuevo;
	static float precioTotalLibros;
	
	public TiendaLibros(String nombre) {
		this.nombre=nombre;
		this.catalogo = new Libro[20];
		this.posicionLibroNuevo=0;
	}
	
	public void agregarLibro(Libro lib) {
		this.catalogo[posicionLibroNuevo]=lib;
		precioTotalLibros = precioTotalLibros + lib.precio;
		this.posicionLibroNuevo++;
	}
	
	public void mostrarCatalogo() {
		for (int i=0;i<this.catalogo.length;i++) {
			if (this.catalogo[i]!=null) {
				this.catalogo[i].mostrarInfo();
			}
		}
	}
	
	public void buscarLibro() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca libro a buscar: ");
		String libroBuscado = teclado.nextLine();
		boolean encontrado=false;
		for (int i=0;i<this.catalogo.length;i++) {
			if (this.catalogo[i]!=null) {
				if (this.catalogo[i].titulo.toUpperCase().contains(libroBuscado.toUpperCase())) {
					System.out.println("Libro encontrado: " + this.catalogo[i].titulo);
					encontrado=true;
				}
			}
		}
		
		if (!encontrado) {
			System.out.println("Ningún libro coincide con los criterios de búsqueda.");
		}
		
		
		
	}
	public void buscarLibroExacto() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca titulo exacto del libro a buscar: ");
		String libroBuscado = teclado.nextLine();
		boolean encontrado=false;
		for (int i=0;i<this.catalogo.length;i++) {
			if (this.catalogo[i]!=null) {
				if (this.catalogo[i].titulo.toUpperCase().equals(libroBuscado.toUpperCase())) {
					System.out.println("Libro encontrado: " + this.catalogo[i].titulo);
					encontrado=true;
				}
			}
		}
		
		if (!encontrado) {
			System.out.println("Ningún libro coincide con los criterios de búsqueda.");
		}
		
		
		
	}
	
	public static void calcularTotalPrecios() {
		System.out.println("El total de precios es: " + precioTotalLibros);
	}
	
	
	
}
