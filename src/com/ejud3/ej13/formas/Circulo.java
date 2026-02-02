package com.ejud3.ej13.formas;

import com.ejud3.ej13.geometria.Figura;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(double radio, String n) {
		super(n);
		this.radio=radio;
	}

	@Override
	public double calcularArea() {

		return Math.PI*Math.pow(radio,2);
	}
	
	
	

}
