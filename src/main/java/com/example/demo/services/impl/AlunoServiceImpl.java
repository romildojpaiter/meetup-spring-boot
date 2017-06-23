package com.example.demo.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domains.Aluno;
import com.example.demo.services.AlunoService;
import com.example.demo.services.impl.base.BaseServiceImpl;

@Service
@Transactional
@SuppressWarnings("unchecked")
public class AlunoServiceImpl extends BaseServiceImpl<Aluno> implements AlunoService<Aluno> {

//	@Override
//	public List<Aluno> listAll() {
//		EntityManager entityManager = this.getEm();
//		Query query = entityManager.createQuery("SELECT l FROM Aluno l");
//		return query.getResultList();
//	}

}
