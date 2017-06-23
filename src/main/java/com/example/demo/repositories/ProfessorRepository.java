package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.domains.Professor;

// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

@RepositoryRestResource(collectionResourceRel="professor", path="professor")
public interface ProfessorRepository extends PagingAndSortingRepository<Professor, Long> {
	
	
	public List<Professor> findByNome(@Param("nome") String nome);
	
	@Query("from Professor p where lower(p.materiaPreferida) like CONCAT('%', lower(:materia), '%')")
	public List<Professor> findByMateriaPreferida(@Param("materia") String materia);

}
