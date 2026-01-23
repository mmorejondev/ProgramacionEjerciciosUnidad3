package com.ejud3.ej10.libreria.libros;

import java.util.Scanner;

import com.ejud3.ej10.libreria.Libro;

public class LibroElectronico extends Libro{

	private String formato;

	public LibroElectronico(String titulo, String autor, double precio, int numPaginas, String formato) {
		super(titulo, autor, precio, numPaginas);
		this.formato = formato;
	}

	@Override
	public void venderLibro() {
		super.venderLibro();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca tipo de dispositivo: ");
		String tipoDispositivo = teclado.nextLine();
		if (this.verificarCompatibilidadDispositivo(tipoDispositivo)) {
			System.out.println("Se ha vendido el Libro electrónico " + this.getTitulo() + " por un precio de: " + this.getPrecio());
		}else {
			System.out.println("No se ha podido realizar la venta. Dispositivo incompatible.");
		}
		
			
	}
	
	private boolean verificarCompatibilidadDispositivo(String dispositivo) {
		boolean compatible=false;
		
		if (dispositivo.equals("KINDLE")) {
			compatible=true;
		}else if (dispositivo.equals("TABLET")){
			if (this.formato.equals("PDF") || this.formato.equals("EPUB")) {
				compatible=true;
			}
		}
		
		return compatible;
	}
	
	
}
