package com.examenes.examenv2.ejercicio1.main;

import com.examenes.examenv2.ejercicio1.interfaces.CapacidadPasajeros;
import com.examenes.examenv2.ejercicio1.transporte.Autobus;
import com.examenes.examenv2.ejercicio1.transporte.Taxi;
import com.examenes.examenv2.ejercicio1.transporte.Tranvia;
import com.examenes.examenv2.ejercicio1.transporte.VehiculoPublico;

public class MainTransporte {
	
	public static void main(String args []) {
		
		VehiculoPublico [] vehiculos = new VehiculoPublico[5];
		vehiculos[0] = new Autobus("1234NNM",50);
		vehiculos[1] = new Autobus("9876ABC",45);
		vehiculos[2] = new Tranvia("6767ZXY",4);
		vehiculos[3] = new Taxi("6354GBN",5);
		vehiculos[4] = new Taxi("1937OPG",5);
		
		for (VehiculoPublico vp: vehiculos) {
			vp.activar();
			vp.mostrarDetalles();
			
			/*
			if (vp.getClass() == Taxi.class) {
				System.out.println("Precio viaje: "  + ((Taxi)vp).calcularTarifa(15));
			}*/
			
			if (vp instanceof Taxi) {
				System.out.println("Precio viaje: "  + ((Taxi)vp).calcularTarifa(15));
			}
		}
		
		System.out.println("Capacidad de los distintos vehículos");
		CapacidadPasajeros [] vehiculosGrandes = new CapacidadPasajeros[3];
		vehiculosGrandes[0]=new Autobus("1234NNM",50);
		vehiculosGrandes[1]=new Autobus("9876ABC",45);
		vehiculosGrandes[2]=new Tranvia("6767ZXY",4);
		for (CapacidadPasajeros vg:vehiculosGrandes) {
			System.out.println("Capacidad del vehículo " + vg.obtenerCapacidad());
		}
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
