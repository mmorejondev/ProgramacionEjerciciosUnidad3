package com.examenes.examen.ejercicio2.procesamiento;

import com.examenes.examen.ejercicio2.clientes.Cliente;
import com.examenes.examen.ejercicio2.clientes.Datos;

public class ProcesadorClientes {

	/*
	 * Método manual. Salvavidas para un examen, pero poco prrro.
	Datos datosCliente1 = new Datos(datosClientes[0][1],datosClientes[0][2]);
	Cliente cliente1 = new Cliente((int) datosClientes[0][0],datosCliente1);
	
	Datos datosCliente2 = new Datos(datosClientes[1][1],datosClientes[1][2]);
	Cliente cliente2 = new Cliente((int) datosClientes[1][0],datosCliente2);
	
	Datos datosCliente3 = new Datos(datosClientes[2][1],datosClientes[2][2]);
	Cliente cliente3 = new Cliente((int) datosClientes[2][0],datosCliente3);
	 */
	public static void procesarClientes(double[][] datosClientes) {
		Cliente [] objetosCliente = new Cliente[datosClientes.length];
		for (int i=0;i<datosClientes.length;i++) {
			Datos dc = new Datos(datosClientes[i][1],datosClientes[i][2]);
			Cliente c = new Cliente((int)datosClientes[i][0],dc);
			objetosCliente[i]=c;
		}
		
		for (Cliente f: objetosCliente) {
			f.mostrarInformacion();
		}
		
	}

}
