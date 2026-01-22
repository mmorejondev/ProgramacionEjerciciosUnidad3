package com.ejud3.ej8.principal;
import com.ejud3.ej8.usuarios.Usuario;
import com.ejud3.ej8.biblioteca.Libro;

public class Principal {

	public static void main(String[] args) {

		Usuario u1 = new Usuario("11223344A","Antonio","Gonzalez Lopez");
		u1.mostrarInfo();
		u1.setDni("99766B");//DNI INCORRECTO
		u1.mostrarInfo(); //LA INFORMACION DEL USUARIO ES LA MISMA
		Libro l1= new Libro ("El principito","Antoine de Saint-Exupery",1950);
		u1.solicitarPrestamo(l1);//PRESTAMO CORRECTO
		u1.solicitarPrestamo(l1);//PRESTAMO INCORRECTO POR ESTAR PRESTADO
		u1.devolverLibro(l1);//DEVOLUCION CORRECTA
		u1.devolverLibro(l1);//DEVOLUCION INCORRECTA
		
		
	}

}
