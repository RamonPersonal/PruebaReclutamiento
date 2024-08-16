package com.example.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table (name = "Encuesta")
public class Encuesta{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String Email;
	private String NombreGenero;
	
	
	public Encuesta() {
	}
	public Encuesta(String email, String nombreGenero) {
		super();
		Email = email;
		NombreGenero = nombreGenero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNombreGenero() {
		return NombreGenero;
	}
	public void setNombreGenero(String nombreGenero) {
		NombreGenero = nombreGenero;
	}
	
	
}