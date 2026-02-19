package com.examenes.examen.ejercicio2.main;

import com.examenes.examen.ejercicio2.clientes.Cliente;
import com.examenes.examen.ejercicio2.clientes.Datos;

public class AppClientes {

	public static void main(String[] args) {

		double[][] datosClientes = {
				{101, 12.5, 30.75},
				{102, 8.2, 15.50},
				{103, 20.1, 50.00}
			};
		
		
		Datos datosCliente1 = new Datos(datosClientes[0][1],datosClientes[0][2]);
		Cliente cliente1 = new Cliente((int)datosClientes[0][0],datosCliente1);
	}

}
