package com.examenes.examen20232024.ej1;

public class GestorDePrestamos {

	public void prestarMaterial(Prestable p) {
		if (!p.estaPrestado()) {
			p.prestar();
			System.out.println("Material prestado exitosamente");
		}else {
			System.out.println("No se puede prestar el material, ya está prestado");
		}
	}
	public void devolverMaterial(Prestable p) {
		if (p.estaPrestado()) {
			p.devolver();
			System.out.println("Material devuelto exitosamente");
		}else {
			System.out.println("No se puede devolver el material, no está prestado");
		}
		
	}
	public boolean estaPrestado(Prestable p) {
		return p.estaPrestado();
	}

}
