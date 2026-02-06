package com.ejud3.ej15;

public class Libro extends ItemMultimedia{
	
	private int numeroPaginas;

	public Libro(String titulo, int anioLanzamiento, long tamanioEnBytes, int numPag) {
		super(titulo, anioLanzamiento, tamanioEnBytes);
		this.numeroPaginas=numPag;
	}
	//Viene de la clase Madre ItemMultimedia
	@Override
	public void reproducir() {
		System.out.println("Reproduciento libro: " + this.titulo);
		
	}

	//Las dos siguientes vienen de la interfaz Contenido Descargable
	@Override
	public void descargar() {
		System.out.println("Descargando libro " + this.titulo + " de tamaño: " + this.obtenerTamanioEnBytes()/1024 + "MB.");
		
	}

	@Override
	public long obtenerTamanioEnBytes() {
		// TODO Auto-generated method stub
		return this.tamanioEnBytes;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Libro");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Número de páginas: " + this.numeroPaginas;
	}
	

}
