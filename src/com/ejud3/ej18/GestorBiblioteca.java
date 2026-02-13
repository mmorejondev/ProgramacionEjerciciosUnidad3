package com.ejud3.ej18;

public class GestorBiblioteca {

	/*Cada posición del array representa un libro, por ejemplo,
	 * la posición 0 representa a "El Señor de los Anillos".
	 * Cada casilla representa la cantidad de unidades que tenemos
	 * del libro que indica la posición. Por ejemplo, si queremos 
	 * indicar que tenemos 15 unidades de "El Señor de los Anillos"
	 * inventario[0] contendría el número 15
	 * */
	int [] inventario = new int[10];
	
	public GestorBiblioteca(int [] inv) {
		this.inventario=inv;
	}
	
	
	 public void comprobarExistencias(int idLibro, int cantidadSolicitada) throws InventarioInsuficienteException {
		 
		 if (inventario[idLibro]<cantidadSolicitada) {
			 /*No hay suficientes existencias*/
			 throw new InventarioInsuficienteException("Cantidad Insuficiente en Inventario para el libro solicitado " + idLibro);
		 }
	
	 }

	 private void actualizarInventario(int idLibro, int cantidadSolicitada) {

		 inventario[idLibro]=inventario[idLibro]-cantidadSolicitada;
		 System.out.println("Inventario actualizado correctamente.");
		 System.out.println(">>>>>>Para el libro " + idLibro + " quedan " + inventario[idLibro] + " unidades. ");
	 }
	 
	 public void registrarVenta(int idLibro, int cantidadSolicitada) throws InventarioInsuficienteException{
		 
		comprobarExistencias(idLibro,cantidadSolicitada);
		System.out.println("Venta registrada correctamente.");
		actualizarInventario(idLibro, cantidadSolicitada);
		 
	 }
	 
	 
	
}
