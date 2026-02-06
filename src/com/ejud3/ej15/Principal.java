package com.ejud3.ej15;

public class Principal {

	public static void main(String[] args) {

		Pelicula p1 = new Pelicula("Solo en casa",1991,1000000000,97);
		p1.mostrarInformacion();
		p1.descargar();
		Libro l1 = new Libro ("Un mundo feliz",1920,3000,400);
		l1.mostrarInformacion();
		l1.descargar();
		
	}

}
