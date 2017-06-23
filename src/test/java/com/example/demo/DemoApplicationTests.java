package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domains.Aluno;
import com.example.demo.services.AlunoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Test
	public void recuperarAluno() {
		
		AlunoService alunoService = Mockito.mock(AlunoService.class);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Guilherme Paiter");
		
		Mockito.when(alunoService.findById(1L))
			.thenReturn(aluno);
		
		String nomeAluno = ((Aluno) alunoService.findById(1L)).getNome();
		Assert.assertEquals("Guilherme Paiter", nomeAluno);
	}

}
