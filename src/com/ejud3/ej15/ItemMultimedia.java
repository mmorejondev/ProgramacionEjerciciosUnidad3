package com.ejud3.ej15;

public abstract class ItemMultimedia implements ContenidoDescargable{

	String titulo;
	int anioLanzamiento;
	long tamanioEnBytes;
	
	
	public ItemMultimedia(String titulo, int anioLanzamiento, long tamanioEnBytes) {
		this.titulo = titulo;
		this.anioLanzamiento = anioLanzamiento;
		this.tamanioEnBytes = tamanioEnBytes;
	}

	

	public abstract void reproducir();
	
	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		String resultado="[Titulo: " + this.titulo;
		resultado = resultado + " Año lanzamiento: " + this.anioLanzamiento;
		resultado += " Tamaño (Bytes): " + this.tamanioEnBytes + "]";
		return resultado;
	}
	
}
