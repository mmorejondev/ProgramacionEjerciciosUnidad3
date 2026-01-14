package com.ejud3.ej3;

public class Principal {

	public static void main(String[] args) {

		Libro l1 = new Libro("Cien años de soledad","Gabriel García Márquez",20.0f);
		Libro l2 = new Libro("El Señor de los Anillos","J.R.R. Tolkien",25.0f);
		Libro l3 = new Libro("El capitán Alatriste","Arturo Pérez Reverte",19.0f);

		TiendaLibros tienda = new TiendaLibros("FNAC");
		tienda.agregarLibro(l1);
		tienda.agregarLibro(l2);
		tienda.agregarLibro(l3);
		
		tienda.mostrarCatalogo();
		
		tienda.buscarLibro();
		tienda.buscarLibroExacto();
		
		TiendaLibros.calcularTotalPrecios();
		
		
		
		
		
		
		
	}

}
