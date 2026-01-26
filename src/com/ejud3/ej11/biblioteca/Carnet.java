package com.ejud3.ej11.biblioteca;

import java.util.Objects;

public class Carnet {
		
	private String dni;
	private int numeroSocio;
	private String centro;
	
	public Carnet(String dni, int numeroSocio, String centro) {
		this.dni = dni;
		this.numeroSocio = numeroSocio;
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Carnet [dni=" + dni + ", numeroSocio=" + numeroSocio + ", centro=" + centro + "]";
	}
	
	@Override
	public boolean equals(Object o) {

		boolean iguales=false;
		
		if (this == o) {
			iguales=true;
		}
		if (o == null) {
			iguales=false;
		}
		if (this.getClass() != o.getClass()) { 
			iguales=false;
		}
        Carnet temporal = (Carnet) o;
        if (this.dni.equals(temporal.dni) && this.centro.equals(temporal.centro)) {
        	iguales=true;
        }

        return iguales;
	}
	
	
	@Override 
	public int hashCode() {
		int hash = Objects.hash(this.dni,this.centro);
		return hash;
	}
	
	
	
	
}
