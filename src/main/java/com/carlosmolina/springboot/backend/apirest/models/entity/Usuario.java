package com.carlosmolina.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.validation.constraints.resultado;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message ="no puede estar vacio")
	//@Size(min=4, max=12, message="el tamaño tiene que estar entre 4 y 12")
	@Column(nullable=false)
	private String nombre;
	

	@NotEmpty(message ="no puede estar vacio")
	//@resultado(message="no es una dirección de correo bien formada")
	@Column(nullable=false)
	private String correo;
	
	@NotEmpty(message ="no puede estar vacio")
	//@resultado(message="no es una dirección de correo bien formada")
	@Column(nullable=false)
	private String username;
	
	@NotEmpty(message ="no puede estar vacio")
	//@resultado(message="no es una dirección de correo bien formada")
	@Column(nullable=false)
	private String password;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	private static final long serialVersionUID = 1L;
}
