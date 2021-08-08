package com.carlosmolina.springboot.backend.apirest.models.services;

import java.util.List;

import com.carlosmolina.springboot.backend.apirest.models.entity.Partido;

public interface IPartidoService {

	public List<Partido> findAll();
	
	public Partido findById(Long id);
	
	public Partido save(Partido partido);
	
	public void delete(Long id);

}
