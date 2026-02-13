package com.ejud3.ej18;

public class Principal {

	public static void main(String[] args) {

		int [] inventario = {15,6,0,50,1,7,3,17,73,11};
		GestorBiblioteca gb = new GestorBiblioteca(inventario);
	
		

			try {
				gb.registrarVenta(0, 10);
				gb.registrarVenta(0, 6);
			} catch (InventarioInsuficienteException e) {
				System.out.println(e.getMessage());
			}
		
		
		
	}

}
