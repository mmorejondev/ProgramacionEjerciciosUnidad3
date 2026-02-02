package com.ejud3.ej13.formas;

import com.ejud3.ej13.geometria.Figura;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public Triangulo(double b,double a,String n) {
		super(n);
		this.base=b;
		this.altura=a;
			
	}
	@Override
	public double calcularArea() {
		return this.base*this.altura/2;
	}
	
	
}
