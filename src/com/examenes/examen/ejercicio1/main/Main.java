package com.examenes.examen.ejercicio1.main;
import com.examenes.examen.ejercicio1.dispositivos.BombillaInteligente;
import com.examenes.examen.ejercicio1.dispositivos.Humidificador;

public class Main {

	public static void main(String[] args) {

		BombillaInteligente b1 = new BombillaInteligente("B-001");
		b1.detallesDispositivo();
		b1.encender();
		b1.detallesDispositivo();
		b1.ajustar(65);
		b1.detallesDispositivo();
		b1.apagar();
		b1.detallesDispositivo();
		b1.encender();
		b1.detallesDispositivo();
		
		
		Humidificador h1 = new Humidificador("H-001",2.0);
		h1.detallesDispositivo();
		h1.encender();
		h1.detallesDispositivo();
		h1.llenarAgua(-1);
		h1.detallesDispositivo();
		h1.llenarAgua(4);
		h1.detallesDispositivo();
		h1.llenarAgua(2);
		h1.detallesDispositivo();
		

	}

}
