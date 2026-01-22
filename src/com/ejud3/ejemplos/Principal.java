package com.ejud3.ejemplos;

public class Principal {

	public static void main(String[] args) {

		/*Gato g = new Gato("Paco",3,7);
		g.hacerSonido();
		Perro p = new Perro("Enrique",5,"Dogo");
		p.hacerSonido();
		*/
		Animal a = new Gato("Manolo",2,6);
		//a.hacerSonido();
		Animal a2 = new Gato("Miguel",12,5);
		//a2.hacerSonido();
		Animal a3 = new Gato("Alejandro",2,4);
		//a3.hacerSonido();
		
		
		Animal [] zoologico = new Animal[3];
		
		zoologico[0] = a;
		zoologico[1] = a2;
		zoologico[2] = a3;
		
		for (int i=0;i<zoologico.length;i++) {
			System.out.println(zoologico[i].toString());
			zoologico[i].hacerSonido();
			
		}
		
		int [] numeros = new int[10];
		
		
		for (Animal anim : zoologico) {
			System.out.println(anim);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
