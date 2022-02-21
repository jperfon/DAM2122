package Futbolistas;

public class Futbolista implements Comparable<Futbolista>{


	private String dni;
	private int edad;
	private String nombre;
	private int numGoles;
	
	public Futbolista(String dni, int edad,String nombre, int numGoles) {
		this.dni=dni;
		this.edad=edad;
		this.nombre=nombre;
		this.numGoles=numGoles;
	}
	
	
	public String toString() {
		String cadena="";
		cadena="DNI:"+dni+"\nEDAD:"+edad+"\nNOMBRE: "+nombre+"\nNUMERO GOLES: "+numGoles+"\n___________________________________";
		
		return cadena;
	}
	
	public boolean equals(Futbolista otroFutbolista) {

		return this.getDni().equals(otroFutbolista.getDni());
	}
	
	public int compareTo(Futbolista otroFutbolista) {
		//>0 si el invocante es mayor
		//0 si son iguales
		//<0 si el objeto del parámetro es mayor
		
		return this.getDni().compareToIgnoreCase(otroFutbolista.getDni());		
	}
	
	
	
	
	

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumGoles() {
		return numGoles;
	}


	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}
}
