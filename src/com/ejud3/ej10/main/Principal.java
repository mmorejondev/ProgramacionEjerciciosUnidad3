package com.ejud3.ej10.main;

import com.ejud3.ej10.libreria.Libro;
import com.ejud3.ej10.libreria.libros.LibroElectronico;
import com.ejud3.ej10.libreria.libros.LibroFisico;

public class Principal {

	public static void main(String[] args) {

		Libro [] carrito = new Libro[5];
		carrito[0]=new LibroFisico("El principito","Antoine de Saint-Exupery",20.0,150,"Novela Fantástica");
		carrito[1]=new LibroElectronico("1984","George Orwell",18.0,300,"PDF");
		carrito[2]=new LibroElectronico("El Señor de los Anillos","J.R.R. Tolkien",21.0,900,"AZW");
		carrito[3]=new LibroFisico("Un mundo feliz","Aldous Huxley",17,200,"Novela Distópica");
		carrito[4]=new LibroFisico("El arte de la guerra","Sun Tzu",15,60,"Ensayo histórico");
		
		for (int i=0;i<carrito.length;i++) {
			Libro lib=carrito[i];
			lib.venderLibro();
		}
		
		for (Libro lib: carrito) {
			lib.venderLibro();
		}
		
		
		
	}

}
