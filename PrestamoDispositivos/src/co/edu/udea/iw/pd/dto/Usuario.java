package co.edu.udea.iw.pd.dto;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String id;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String email;
	private String usuario;
	private String contrasena;
	private EstadoUsuario idEstado;
	
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public EstadoUsuario getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(EstadoUsuario idEstado) {
		this.idEstado = idEstado;
	}
	
}
