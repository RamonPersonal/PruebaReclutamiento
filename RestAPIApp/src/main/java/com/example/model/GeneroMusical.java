package com.example.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "GeneroMusical")
public class GeneroMusical{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGeneroM;
	private String Nombre;
	
	public GeneroMusical() {

	}
	public GeneroMusical(int idGeneroM, String nombre) {
		super();
		this.idGeneroM = idGeneroM;
		Nombre = nombre;
	}

	public int getIdGeneroM() {
		return idGeneroM;
	}

	public void setIdGeneroM(int idGeneroM) {
		this.idGeneroM = idGeneroM;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	
	
}
