package com.examenes.examenv2.ejercicio2.estudiantes;

public class Registro {
/*
 * Atributos:
- int horasEstudio
- int horasOcio

Métodos:
- Constructor, getters y calcularHorasTotales()
*/
	
	private int horasEstudio;
	private int horasOcio;
	
	public Registro(int horasEstudio, int horasOcio) {
		this.horasEstudio = horasEstudio;
		this.horasOcio = horasOcio;
	}
	public int getHorasEstudio() {
		return horasEstudio;
	}
	
	public int getHorasOcio() {
		return horasOcio;
	}
	public int calcularHorasTotales() {
		return this.horasEstudio + this.horasOcio;
	}
	
}
