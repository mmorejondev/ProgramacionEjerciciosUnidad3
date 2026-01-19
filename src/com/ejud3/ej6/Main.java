package com.ejud3.ej6;

public class Main {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Manuel Lopez",19,7.8);
		e1.mostrarInformacion();
		
		Estudiante e2 = new Estudiante();
		e2.mostrarInformacion();
		e2.setNombre("Antonio Perez");
		e2.setEdad(20);
		e2.setNota(9.0);
		e2.mostrarInformacion();
		
		Curso daw1 = new Curso();
		daw1.agregarEstudiante(e1);
		daw1.agregarEstudiante(e2);
		
		daw1.mostrarInformacionEstudiantes();
		System.out.println("Número de aprobados: " + daw1.getCantidadAprobados());
		System.out.println("Número de suspensos:" + daw1.contarSuspensos());
		
		
		
		
		
	}

}
