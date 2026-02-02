package com.ejud3.ej13.test;

import com.ejud3.ej13.formas.Circulo;
import com.ejud3.ej13.formas.Triangulo;
import com.ejud3.ej13.geometria.Figura;

public class Main {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo(3.0,5.0,"Triángulo 1");
		t1.mostrarInformacion();
		Circulo c1 = new Circulo(7.0,"Círculo 1");
		c1.mostrarInformacion();
		
	}

}
