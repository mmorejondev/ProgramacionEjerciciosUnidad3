package com.examenes.examen.ejercicio2.main;

import com.examenes.examen.ejercicio2.clientes.Cliente;
import com.examenes.examen.ejercicio2.clientes.Datos;
import com.examenes.examen.ejercicio2.procesamiento.ProcesadorClientes;

public class AppClientes {

	public static void main(String[] args) {

		double[][] datosClientes = {
				{101, 12.5, 30.75},
				{102, 8.2, 15.50},
				{103, 20.1, 50.00},
				{104, 24.1, 51.00},
				{105, 27.1, 57.00}
			};
		
		ProcesadorClientes.procesarClientes(datosClientes);
	}

}
