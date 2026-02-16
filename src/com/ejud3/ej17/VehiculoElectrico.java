package com.ejud3.ej17;

public class VehiculoElectrico extends Vehiculo implements Recargable{

	private int consumo;
	private Bateria bateria;
		
	public VehiculoElectrico(String marca, String modelo, int anioFabricacion, int consumo, Bateria b) {
		super(marca, modelo, anioFabricacion);
		this.consumo=consumo;
		this.bateria=b;
	}

	@Override
	public void conducir(double distancia) { //proviene de vehiculo
		if ((consumo*(distancia/100)) < bateria.getCapacidad()) {
			bateria.mostrarInformacionBateria();
			System.out.println("El vehiculo " + this.marca + " " + this.modelo + " ha conducido " + distancia + "kms.");
			bateria.setCapacidad(bateria.getCapacidad() - consumo*(distancia/100));
			bateria.mostrarInformacionBateria();
		}else {
			System.out.println("No se puede realizar el viaje, primo. Bateria insuficiente.");
		}
	}

	@Override
	public void realizarMantenimiento() {//proviene de vehiculo
		System.out.println("Realizando mantenimiento de Vehículo Eléctrico. Combrobando batería y transmisión.");
	}

	@Override
	public void recargar() {

		this.bateria.setCapacidad(this.bateria.getCapacidadMaxima());
		System.out.println("Vehículo cargado completamente " + this.bateria.getCapacidad());
	}

	@Override
	public double obtenerAutonomiaElectrica() {
		return (this.bateria.getCapacidad()/this.consumo)*100;
	}
	
	
	@Override
	public void mostrarInformacion() {
		System.out.println(super.toString());
		System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [consumo=" + consumo + ", bateria=" + bateria + "]";
	}
	
	
	
	
	

}
