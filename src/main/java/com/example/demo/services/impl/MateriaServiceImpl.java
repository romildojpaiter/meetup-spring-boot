package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domains.Materia;
import com.example.demo.repositories.MateriaRepository;
import com.example.demo.services.MateriaService;

@Service
@Transactional
public class MateriaServiceImpl implements MateriaService {
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	
	public List<Materia> getMaterias() {
		return (List<Materia>) materiaRepository.findAll();
	}

}
