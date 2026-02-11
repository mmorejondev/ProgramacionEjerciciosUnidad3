package com.ejud3.ej17;

public abstract class Vehiculo {

	/*
	 * marca (String): La marca del vehículo. (Ahora es común para ambos tipos de vehículo.)
modelo (String): El modelo del vehículo.
anioFabricacion (int): Año de fabricación.
*/
	protected String marca;
	protected String modelo;
	protected int anioFabricacion;
	
	public Vehiculo(String marca, String modelo, int anioFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}
	/*
	 * Métodos abstractos:
conducir(double distancia): Método que, al conducir, verifica si hay suficiente energía (o combustible) para cubrir la distancia solicitada y, de ser posible, resta a la autonomía el consumo correspondiente.
realizarMantenimiento(): Método para simular el mantenimiento del vehículo. Muestra un mensaje por pantalla.
Método no abstracto:
mostrarInformacion(): Muestra la información básica del vehículo (marca, modelo, año, etc.).

	 * */
	public abstract void conducir(double distancia);
	public abstract void realizarMantenimiento();

	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + "]";
	}
	
	
}
