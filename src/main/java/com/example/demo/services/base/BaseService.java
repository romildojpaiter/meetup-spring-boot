package com.example.demo.services.base;

import java.util.List;

public interface BaseService<T> {
	
	void save(T clazz);

	void delete(T entity);

	List<T> findAll();

	T findById(Long id);
	
}