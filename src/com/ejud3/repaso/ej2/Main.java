package com.ejud3.repaso.ej2;

public class Main {

	public static void main(String[] args) {

		Coche c1 = new Coche ("1234ABC","Ford","Fiesta","Gasolina");
		Camion ca1 = new Camion ("9876ZXY","Volvo","RX40", 5000);

		GestorDeAlquileres ga = new GestorDeAlquileres();
		
		Vehiculo [] flota = new Vehiculo[2];
		flota[0]=c1;
		flota[1]=ca1;
		for (Vehiculo v:flota) {
			v.describirVehiculo();
		}
		
		Alquilable [] vehiculosAlquilables = new Alquilable[1];
		vehiculosAlquilables[0]=c1;
		
		for (Alquilable a:vehiculosAlquilables) {
			ga.alquilarVehiculo(a);
			if (ga.estaAlquilado(a))
				ga.devolverVehiculo(a);
		}
		 		
		
	}

}
