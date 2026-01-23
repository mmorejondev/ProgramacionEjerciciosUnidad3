package com.ejud3.ej10.libreria.libros;

import com.ejud3.ej10.libreria.Libro;

public class LibroFisico extends Libro {
	
	private String ubicacion;

	public LibroFisico(String titulo, String autor, double precio, int numPaginas, String ubicacion) {
		super(titulo, autor, precio, numPaginas);
		this.ubicacion = ubicacion;
	}
	
	@Override
	public void venderLibro() {
		super.venderLibro();
		System.out.println("Se ha vendido el Libro " + this.getTitulo() + " por un precio de: " + this.getPrecio());
		System.out.println("Coste de envio: " + calcularCostoEnvio(this.numPaginas));
				
	}
	
	private double calcularCostoEnvio(int numPag) {
		return 0.01*numPag;
		
	}
	
	

}
