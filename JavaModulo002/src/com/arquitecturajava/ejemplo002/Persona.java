package com.arquitecturajava.ejemplo002;

public class Persona {

	//Solo acceso desde la propia clase
	private String nombre;
	private int edad;
	
	//Asignacion
	void setEdad(int nuevaEdad) {
		if(nuevaEdad>120) {
			edad=120;
		}else {
			edad=nuevaEdad;
		}
	}
	
	void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	//Lectura
	int getEdad() {
		return edad;
	}
	
	String getNombre() {
		return nombre;
	}
}
