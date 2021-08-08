package com.carlosmolina.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlosmolina.springboot.backend.apirest.models.dao.IPartidoDao;
import com.carlosmolina.springboot.backend.apirest.models.entity.Partido;

@Service
public class PartidoServiceImpl implements IPartidoService {

	@Autowired
	private IPartidoDao partidoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Partido> findAll() {
		return (List<Partido>) partidoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Partido findById(Long id) {
		return partidoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Partido save(Partido partido) {
		return partidoDao.save(partido);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		partidoDao.deleteById(id);
	}

}
