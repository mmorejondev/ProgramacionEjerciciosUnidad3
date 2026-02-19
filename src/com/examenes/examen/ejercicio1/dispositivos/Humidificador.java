package com.examenes.examen.ejercicio1.dispositivos;

public class Humidificador extends DispositivoInteligente{

	private double cantidadAgua;

	public Humidificador(String id, double cantidad) {
		super(id);
		
		if (cantidad<0) {
			this.cantidadAgua=0;
		}else if (cantidad>5) {
			this.cantidadAgua=5;
		}else {
			this.cantidadAgua=cantidad;
		}
	}
	
	public void llenarAgua(double cantidad) {
		if (this.getEncendido()==false) {
			System.out.println("HUMIDIFICADOR APAGADO. NO SE PUEDE RELLENAR EL AGUA.");
		}else {//está encendido
			if (cantidad<0) {
				System.out.println("CANTIDAD DE AGUA INCORRECTA. NO SE PUEDE RELLENAR EL AGUA.");
			}else {
				if (this.cantidadAgua+cantidad > 5) {
					System.out.println("NO SE PUEDE AÑADIR LA CANTIDAD INDICADA. SE SUPERA EL MÁXIMO DE 5 LITROS.");
				}else {
					this.cantidadAgua=this.cantidadAgua+cantidad;
					System.out.println("SE HA AÑADIDO AGUA. CANTIDAD ACTUAL " + this.cantidadAgua + " LITROS.");
					
				}
			}
			
		}
		
		
		
	}

	@Override
	public void detallesDispositivo() {

		String estado = "APAGADO";
		if (this.getEncendido())
			estado="ENCENDIDO";
	
		System.out.println("HUMIDIFICADOR " + this.getId() + " - " + estado + " - Cantidad de Agua: " + this.cantidadAgua);
	}

	

}
