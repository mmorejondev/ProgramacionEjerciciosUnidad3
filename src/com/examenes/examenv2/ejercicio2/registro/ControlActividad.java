package com.examenes.examenv2.ejercicio2.registro;

import com.examenes.examenv2.ejercicio2.estudiantes.Estudiante;

public class ControlActividad {

	public static void procesarEstudiantes(Estudiante[] estudiantes){
		for (Estudiante e: estudiantes) {
			e.mostrarResumen();
		}
	}

}
