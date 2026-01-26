package com.ejud3.ej11.biblioteca;

public class Principal {

	public static void main(String[] args) {

		Carnet [] carnetsBiblioteca = new Carnet[4];
		carnetsBiblioteca[0]=new Carnet("12345678A", 1, "IES Alixar");
		carnetsBiblioteca[1]=new Carnet("12345678A", 37, "IES Alixar");
		carnetsBiblioteca[2]=new Carnet("87654321B", 2, "IES Alixar");
		carnetsBiblioteca[3]=new Carnet("87654321B", 2, "IES OtroCentro");
		

		for (Carnet c:carnetsBiblioteca) {
			System.out.println(c.toString());
			System.out.println(c.equals(carnetsBiblioteca[0]));
			System.out.println(c.hashCode());
		}
				
	}

}
