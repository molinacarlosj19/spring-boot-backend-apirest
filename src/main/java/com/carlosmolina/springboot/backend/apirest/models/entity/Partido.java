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
@Table(name="partidos")
public class Partido implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message ="no puede estar vacio")
	@Size(min=4, max=12, message="el tamaño tiene que estar entre 4 y 12")
	@Column(nullable=false)
	private String local;
	
	@NotEmpty(message ="no puede estar vacio")
	private String visitante;
	
	@NotEmpty(message ="no puede estar vacio")
	//@resultado(message="no es una dirección de correo bien formada")
	@Column(nullable=false)
	private String resultado;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getlocal() {
		return local;
	}

	public void setlocal(String local) {
		this.local = local;
	}

	public String getvisitante() {
		return visitante;
	}

	public void setvisitante(String visitante) {
		this.visitante = visitante;
	}

	public String getresultado() {
		return resultado;
	}

	public void setresultado(String resultado) {
		this.resultado = resultado;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	private static final long serialVersionUID = 1L;
}
