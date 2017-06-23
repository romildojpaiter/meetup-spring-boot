package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.Aluno;
import com.example.demo.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Aluno> getListaAluno() {
		return alunoService.findAll(); 
	}
	
	@RequestMapping(value = "/{alunoId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Aluno getAluno(@PathVariable("alunoId") Integer idAluno) {
		return (Aluno) alunoService.findById(idAluno.longValue()); 
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK, reason = "Registro incluido com Sucesso....!!")
	public void postAluno(@Valid @RequestBody Aluno aluno) {
		alunoService.save(aluno); 
	}
	
	@DeleteMapping(value = "/{alunoId}")
	@ResponseStatus(value = HttpStatus.OK, reason = "Registro deletado com Sucesso....!!")
	public void postAluno(@PathVariable("alunoId") Integer idAluno) {
		Aluno aluno = (Aluno) alunoService.findById(idAluno.longValue());
		alunoService.delete(aluno); 
	}

}
