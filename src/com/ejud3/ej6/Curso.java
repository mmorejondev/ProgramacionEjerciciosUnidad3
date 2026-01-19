package com.ejud3.ej6;

public class Curso {
/*
 * estudiantes (Array de Estudiante): Un array que almacene información de los estudiantes en el curso.
   cantidadAprobados (int): El número de estudiantes que aprobaron en el curso.
 */
	Estudiante[] estudiantes;
	int cantidadAprobados;
	int posicionInsercion;
	
	public Curso () {
		this.estudiantes=new Estudiante[10];
		this.cantidadAprobados=0;
		this.posicionInsercion=0;
	}
	
	public Estudiante[] getEstudiantes() {
		return this.estudiantes;
	}
	
	public int getCantidadAprobados() {
		return this.cantidadAprobados;
	}
	
	public void agregarEstudiante(Estudiante e) {
		this.estudiantes[posicionInsercion]=e;
		this.posicionInsercion++;
		if (Estudiante.aprueba(e.getNota())) {
			this.cantidadAprobados++;
		}
	}
	
	public int contarSuspensos() {
		 return this.estudiantes.length - this.cantidadAprobados;
	}
	
	
	public void mostrarInformacionEstudiantes () {
		System.out.println(">>>>>>Estudiantes del curso");
		for (int i=0;i<this.estudiantes.length;i++) {
			if (this.estudiantes[i]!=null) {
				this.estudiantes[i].mostrarInformacion();
			}
		}
	}
	
	
}
