package com.ejud3.ej16.principal;

public class Principal {

	public static void main(String args []) {
		
		 // Crear objetos
        Gerente gerente = new Gerente("Laura Gómez", 1001, "Marketing");
        Programador programador = new Programador("Carlos Pérez", 1002, "Java");
        Autonomo autonomo = new Autonomo("Ana Ruiz", 1003, 12);

        // ==============================
        // ARRAY DE EMPLEADOS
        // ==============================
        Empleado[] empleados = {gerente, programador, autonomo};

        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");

        for (Empleado e : empleados) {
            e.mostrarInformacion();  // Polimorfismo
            System.out.println("------------------------");
        }

        // ==============================
        // ARRAY DE PAGABLES
        // ==============================
        Pagable[] pagables = {gerente, programador, autonomo};

        System.out.println("\n=== SALARIOS DE EMPLEADOS ===");

        for (Pagable p : pagables) {
            System.out.println("Salario: " + p.calcularSalario() + " €");
        }
    }
		
		
	}
}
