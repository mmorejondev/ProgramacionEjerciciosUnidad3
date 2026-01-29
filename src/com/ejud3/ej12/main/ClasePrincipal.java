package com.ejud3.ej12.main;

import com.ejud3.ej12.tipos.*;


public class ClasePrincipal {

	public static void main (String args []) {
		Object [] objetos = new Object[6];
		
		objetos[0]= new	Persona("Juan");
		objetos[1]= new Alumno("Ana", "1º DAW");
		objetos[2]= new Profesor("Miguel", "Informática");
		objetos[3]= new Alumno("Pepe", "2º DAW");
		objetos[4] = new String("Hola"); //equivalente a objetos[4]="Hola";
		objetos[5] = 3.14;//esta clase y otras las veremos más adelante
		
		int numeroDePersonas=0;
		int numeroDeAlumnos=0;
		int numeroDeProfesores=0;
		int numeroDeOtrasClases=0;
		int numeroInstanciasDePersona=0;
		
		for (int i=0;i<objetos.length;i++) {
			
			if (objetos[i] instanceof Object) {
				numeroInstanciasDePersona++;
			}
			
			
			if (objetos[i].getClass() == Persona.class) {
				numeroDePersonas++;
			}else if (objetos[i].getClass() == Alumno.class) {
				numeroDeAlumnos++;
			}else if (objetos[i].getClass() == Profesor.class) {
				numeroDeProfesores++;
			}else {
				numeroDeOtrasClases++;
			}
			
			
				
		}
		System.out.println("Número de personas: " + numeroDePersonas);
		System.out.println("Persona o subclases: " + numeroInstanciasDePersona);
		System.out.println("Número de alumnos: " + numeroDeAlumnos);
		System.out.println("Número de profesores: " + numeroDeProfesores);
		System.out.println("Número de otras clases: " + numeroDeOtrasClases);
		
	}
	
	

}
