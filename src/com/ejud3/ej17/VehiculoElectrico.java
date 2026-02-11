package com.ejud3.ej17;

public class VehiculoElectrico extends Vehiculo{

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
		}
	}

	@Override
	public void realizarMantenimiento() {//proviene de vehiculo
		
	}
	

}
