package com.ejud3.ej8.usuarios;

import com.ejud3.ej8.biblioteca.Libro;

public class Usuario {
/*	dni (String, privado): Almacena el DNI del usuario, longitud de exactamente 9 caracteres.
	nombre (String, privado): Almacena el nombre del usuario.
	apellidos (String, privado): Almacena los apellidos del usuario.
*/
	
	private String dni;
	private String nombre;
	private String apellidos;
	public Usuario(String dni, String nombre, String apellidos) {
		if (dni.length()==9) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}else {
			System.out.println("No se ha podido crear correctamente el objeto. DNI NO VALIDO.");
			
		}
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String d) {
		if (d!=null) {
			if (d.length()==9) {
				this.dni = d;
			}
			
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void mostrarInfo() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("_______________________________________________");
	}
	
	public void solicitarPrestamo(Libro l) {
		if (l.getDisponible()) {
			l.setDisponible(false);
			System.out.println("El libro " + l.getTitulo() + " ha sido prestado a " + this.nombre + " " + this.apellidos);
		}else {
			System.out.println("El libro " + l.getTitulo() + " no está disponible para préstamo.");

		}
		
	}
	
	public void devolverLibro(Libro l) {
		if (!l.getDisponible()) {
			l.setDisponible(true);
			System.out.println("Libro " + l.getTitulo() + " devuelto correctamente.");
		}else {
			System.out.println("El libro " + l.getTitulo() + " no estaba prestado.");
		}
	}
	
	
	
}
