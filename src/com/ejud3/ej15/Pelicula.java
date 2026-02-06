package com.ejud3.ej15;

/*Tendrá un atributo propio que 
 * represente la duración de la 
 * película en minutos. 
 * Sobreescribe el método mostrarInformacion.
*/
public class Pelicula extends ItemMultimedia{

	private int duracion;
	
	public Pelicula(String titulo, int anioLanzamiento, long tamanioEnBytes, int duracion) {
		super(titulo, anioLanzamiento, tamanioEnBytes);
		this.duracion=duracion;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Película");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Duración: " + duracion;
	}
	@Override
	public void reproducir() {

		System.out.println("Reproduciento película: " + this.titulo);
	}

	@Override
	public void descargar() {
		System.out.println("Descargando película " + this.titulo + " de tamaño: " + this.obtenerTamanioEnBytes() + "MB.");
	}

	@Override
	public long obtenerTamanioEnBytes() {
		/*Vamos a suponer que el tamaño es de 5MB por minuto*/
		
		return this.tamanioEnBytes/1024;
	}

	
}
