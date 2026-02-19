package com.examenes.examenv2.ejercicio2.main;

import com.examenes.examenv2.ejercicio2.estudiantes.Estudiante;
import com.examenes.examenv2.ejercicio2.estudiantes.Registro;
import com.examenes.examenv2.ejercicio2.registro.ControlActividad;

public class AppRegistro {

	public static void main(String args []) {
		Registro [] semana1 = new Registro[7];
		semana1[0]=new Registro(2,3);
		semana1[1]=new Registro(4,1);
		semana1[2]=new Registro(3,2);
		semana1[3]=new Registro(2,2);
		semana1[4]=new Registro(5,1);
		semana1[5]=new Registro(2,6);
		semana1[6]=new Registro(1,1);
		
		Estudiante e1 = new Estudiante("Manolo Pérez",semana1);
		
		Registro [] semana2 = new Registro[7];
		semana2[0]=new Registro(2,4);
		semana2[1]=new Registro(4,1);
		semana2[2]=new Registro(1,2);
		semana2[3]=new Registro(2,2);
		semana2[4]=new Registro(4,1);
		semana2[5]=new Registro(2,7);
		semana2[6]=new Registro(1,1);
		
		Estudiante e2 = new Estudiante("María Gómez",semana2);
		
		Registro [] semana3 = new Registro[7];
		semana3[0]=new Registro(2,4);
		semana3[1]=new Registro(4,1);
		semana3[2]=new Registro(1,2);
		semana3[3]=new Registro(2,2);
		semana3[4]=new Registro(4,1);
		semana3[5]=new Registro(2,7);
		semana3[6]=new Registro(1,1);
		
		Estudiante e3 = new Estudiante("Francisco López",semana3);
		
		Estudiante [] estudiantes = new Estudiante[3];
		estudiantes[0]=e1;
		estudiantes[1]=e2;
		estudiantes[2]=e3;

		ControlActividad.procesarEstudiantes(estudiantes);
		
		
		
		
		
		
		
	}
}
