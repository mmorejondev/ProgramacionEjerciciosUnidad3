package com.ejud3.ej16.principal;

import com.ejud3.ej16.empleados.Autonomo;
import com.ejud3.ej16.empleados.Empleado;
import com.ejud3.ej16.empleados.Gerente;
import com.ejud3.ej16.empleados.Pagable;
import com.ejud3.ej16.empleados.Programador;

public class Principal {

	public static void main(String args []) {
		
		 // Crear objetos
        Gerente g1 = new Gerente("Laura Gómez", 1001, "Marketing");
        Programador p1 = new Programador("Carlos Pérez", 1002, "Java");
        Autonomo a1 = new Autonomo("Ana Ruiz", 1003, 12);

        // ==============================
        // ARRAY DE EMPLEADOS
        // ==============================
        Empleado [] empleados = new Empleado[3];
        empleados[0]=p1;
        empleados[1]=g1;
        empleados[2]=a1;
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");

        for (Empleado e : empleados) {
          if (e != null) {
        	e.mostrarInformacion(); // Polimorfismo
            System.out.println("------------------------");
          }
          
        }

        // ==============================
        // ARRAY DE PAGABLES
        // ==============================
        /* Podríamos usar un array de la interfaz Pagable
         * si sólo tuvierámos que hacer uso de los métodos de la intefaz
         * (calcularSalario en este caso)*/
        Pagable[] pagables = new Pagable[3];
        pagables[0]=g1;
        pagables[1]=p1;
        pagables[2]=a1;
        
        System.out.println("\n=== SALARIOS DE EMPLEADOS ===");

        for (Pagable p : pagables) {
            System.out.println("Salario: " +  p.calcularSalario() + " €");
        }
        
        /*Otra forma para hacer la llamada a los métodos propios
         * de los objetos y a aquellos provenientes de la interfaz
         * */
        System.out.println("Recorriendo el array de empleados y llamando a los metodos de los objetos\n y de la interfaz");
        for (int i=0;i<empleados.length;i++) {
        	empleados[i].mostrarInformacion();
        	System.out.println("Salario: " + empleados[i].calcularSalario());
        }
	
	
	}
		
		
}

