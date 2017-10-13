package co.edu.udea.iw.pd.dto;

import java.io.Serializable;

public class Dispositivo implements Serializable {
	private String id;
	private String nombre;
	private Categoria categoria;
	private String referencia;
	private String modelo;
	private float valor;
	private String manual;
	private EstadoDispositivo estado;
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getManual() {
		return manual;
	}
	public void setManual(String manual) {
		this.manual = manual;
	}
	public EstadoDispositivo getEstado() {
		return estado;
	}
	public void setEstado(EstadoDispositivo estado) {
		this.estado = estado;
	}
	
	
}
