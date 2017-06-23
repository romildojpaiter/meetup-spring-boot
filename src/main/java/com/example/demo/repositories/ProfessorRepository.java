package com.example.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.domains.Professor;

@RepositoryRestResource(collectionResourceRel="professor", path="professor")
public interface ProfessorRepository extends PagingAndSortingRepository<Professor, Long> {

}
