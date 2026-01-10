package com.ejud3.ej1;

public class Rectangulo {

	//atributos
	int ancho;
	int alto;
	//Constructores
	public Rectangulo(int anc,int alt) {
		ancho=anc;
		alto=alt;
	}
		
	//metodos
	public int calcularArea() {
		int area=ancho*alto;
		return area;
		
	}
	public int calcularPerimetro() {
		int perimetro=2*ancho+2*alto;
		return perimetro;
	}

}
