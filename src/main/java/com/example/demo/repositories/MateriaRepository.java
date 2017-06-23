package com.example.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domains.Materia;

public interface MateriaRepository extends PagingAndSortingRepository<Materia, Long> {

}
