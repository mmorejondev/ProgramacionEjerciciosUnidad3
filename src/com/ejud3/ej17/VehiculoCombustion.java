package com.ejud3.ej17;

public class VehiculoCombustion extends Vehiculo{

	private String tipoCombustible;
	private TanqueCombustible tanque;
	private double consumo;
	
	public VehiculoCombustion(String marca, String modelo, int anioFabricacion, String tipoCombustible, TanqueCombustible t, double consumo) {
		super(marca, modelo, anioFabricacion);
		this.tipoCombustible=tipoCombustible;
		this.tanque=t;
		this.consumo=consumo;
	}

	@Override
	public void conducir(double distancia) {

		if ((consumo*(distancia/100)) < this.tanque.getCapacidad()) {
			tanque.mostrarInformacionTanque();
			System.out.println("El vehiculo " + this.marca + " " + this.modelo + " ha conducido " + distancia + "kms.");
			tanque.setCapacidad(tanque.getCapacidad() - consumo*(distancia/100));
			tanque.mostrarInformacionTanque();
		}else {
			System.out.println("No se puede realizar el viaje, primo. Combustible insuficiente.");
		}
	}

	@Override
	public void realizarMantenimiento() {
		System.out.println("Realizando mantenimiento de Vehículo de Combustión. Combrobando motor y filtros.");
		
	}
	
	public void repostar() {
		this.tanque.setCapacidad(this.tanque.getCapacidadMaxima());
		System.out.println("Se ha repostado correctamente." + this.tanque.getCapacidad() + " litros.");
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(this.toString());
		
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n>>>>> VehiculoCombustion [tipoCombustible=" + tipoCombustible + ", tanque=" + tanque + ", consumo=" + consumo
				+ "]";
	}
	
	
	

}
