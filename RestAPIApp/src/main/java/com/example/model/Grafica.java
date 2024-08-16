package com.example.model;

import java.io.Serializable;

public class Grafica implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2721828394409974788L;
	String Nombre;
	long Total;
	
	public Grafica() {

	}
	
	public Grafica(String nombre, long total) {
		super();
		Nombre = nombre;
		Total = total;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public long getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	
	
}
