package com.ejud3.ej5;

public class Principal {

	public static void main(String args []) {
		
		Empleado e1 = new Empleado ("11223344A","Antonio Lopez","Programador",1800.0f);
		Empleado e2 = new Empleado ("99887766Z","Francisco Perez","Analista",2100.0f);
		
		GestorEmpleados ge = new GestorEmpleados();
		ge.agregarEmpleado(e1);
		ge.agregarEmpleado(e2);
		ge.mostrarEmpleados();
		//Llamada al método estático
		GestorEmpleados.calcularTotalSalarios();
			
	}
}
