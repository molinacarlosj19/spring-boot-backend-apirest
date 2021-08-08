package com.carlosmolina.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlosmolina.springboot.backend.apirest.models.entity.Partido;

public interface IPartidoDao extends CrudRepository<Partido, Long>{

}
