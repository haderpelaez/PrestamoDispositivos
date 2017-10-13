package co.edu.udea.iw.pd.dto;

import java.io.Serializable;

public class EstadoUsuario implements Serializable {
	private int id;
	private String descripcion;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
