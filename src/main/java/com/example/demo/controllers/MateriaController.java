package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.Materia;
import com.example.demo.services.MateriaService;

@RestController
public class MateriaController {
	
	@Autowired
	private MateriaService materiaService;
	
	@RequestMapping("/materia/lista")
	public List<Materia> getMaterias() {
		return materiaService.getMaterias();
	}

}
