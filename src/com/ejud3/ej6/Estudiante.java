package com.ejud3.ej6;

public class Estudiante {

	/*
	 * nombre (String): El nombre del estudiante.
edad (int): La edad del estudiante (no puede ser negativa)
nota (double): La calificación del estudiante (no puede ser menor que 0)
*/
	String nombre;
	int edad;
	double nota;
	
	/*Constructor*/
	public Estudiante(String n,int e,double nota) {
		this.nombre=n;
		this.edad=e;
		this.nota=nota;
	}
	
	public Estudiante() {}
	
	/*Getters y Setters*/
	
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public double getNota() {
		return this.nota;
	}
	
	public void setNombre(String nuevoNombre) {
		if (nuevoNombre!=null) {
			if (nuevoNombre.length()<255) {
				this.nombre=nuevoNombre;
			}
		}
	}
	
	public void setEdad(int edad) {
		if (edad>=0) {
			this.edad=edad;
		}else {
			System.out.println("La edad no puede ser negativa.");
		}
	}
	
	public void setNota(double nuevaNota) {
		if (nuevaNota>=0.0) {
			this.nota=nuevaNota;
		}else {
			System.out.println("La nota no puede ser negativa.");
		}
	}
	
	public void mostrarInformacion() {
		
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Nota: " + this.nota);
	}
	
	public static boolean aprueba(double nota) {
		boolean aprueba=false;
		if (nota>=5) {
			aprueba=true;
		}
		return aprueba;
	}
	
	
	public static boolean esMenorDeEdad(int edad) {
		boolean esMenor=false;
		if (edad<18) {
			esMenor=true;
		}
		return esMenor;
		
	}
	
}
