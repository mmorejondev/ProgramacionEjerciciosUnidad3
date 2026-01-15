package com.ejud3.ej5;

public class GestorEmpleados {

	static Empleado [] plantilla = new Empleado[10];
	static int numeroEmpleados=0;
	
	
	public void agregarEmpleado(Empleado nuevoEmpleado) {
		plantilla[numeroEmpleados]=nuevoEmpleado;
		numeroEmpleados++;
	}
	
	public void mostrarEmpleados() {
		System.out.println("Empleados de la empresa");
		System.out.println("_______________________________________");
		for (int i=0;i<plantilla.length;i++) {
			if (plantilla[i]!=null) {
				plantilla[i].mostrarInfo();
			}
		}
	}
	
	public static void calcularTotalSalarios () {
		
		float totalSalarios=0;
		for (int i=0;i<plantilla.length;i++) {
			if (plantilla[i]!=null) {
				totalSalarios += plantilla[i].salario;
			}
				
		}
		
		System.out.println("El total de salarios es: " + totalSalarios);
		
	}
	
	
	
}
