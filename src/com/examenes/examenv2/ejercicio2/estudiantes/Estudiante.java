package com.examenes.examenv2.ejercicio2.estudiantes;

public class Estudiante {

	private String nombre;
	private Registro [] semana;

	public Estudiante(String nombre, Registro[] semana) {
		this.nombre = nombre;
		this.semana = semana;
	}
	
	public void mostrarResumen() {
		System.out.println("Nombre: " + this.nombre);
		for (int i=0;i<this.semana.length;i++) {
			System.out.println(">> Día " + (i+1));
			System.out.println(">>> Horas Estudio: " + this.semana[i].getHorasEstudio());
			System.out.println(">>> Horas Ocio: " + this.semana[i].getHorasOcio());
			System.out.println(">>>>> Horas totales: " + this.semana[i].calcularHorasTotales() );
		}
		
		
		
		
	}
	
	
}
