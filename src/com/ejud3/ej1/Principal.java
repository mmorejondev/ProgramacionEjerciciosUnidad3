package com.ejud3.ej1;

public class Principal {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(5,7);
		Rectangulo r2 = new Rectangulo(3,10);
		
		int areaRectangulo1 = r1.calcularArea();
		System.out.println("El área del rectángulo 1 es: " + areaRectangulo1);
		int areaRectangulo2 = r2.calcularArea();
		System.out.println("El área del rectángulo 2 es: " + areaRectangulo2);
		int perimetroRectangulo1 = r1.calcularPerimetro();
		System.out.println("El perímetro del rectángulo 1 es: " + perimetroRectangulo1);
		//sin usar variables intermedias
		System.out.println("El perímetro del rectángulo 2 es: " + r2.calcularPerimetro());
	}

}
