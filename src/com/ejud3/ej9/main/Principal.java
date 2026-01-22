package com.ejud3.ej9.main;

import com.ejud3.ej9.registro.empleados.Gerente;
import com.ejud3.ej9.registro.empleados.Programador;

public class Principal {

	public static void main(String args []) {
		
		Gerente g1 = new Gerente("Antonio",47,2700,"Marketing");
		g1.mostrarInformacion();
		
		Programador p1 = new Programador("Manuel",23,1900,"Java");
		p1.mostrarInformacion();
		
		System.out.println(g1.calcularBonificacion());
		System.out.println(p1.calcularBonificacion());

	}
	
}
