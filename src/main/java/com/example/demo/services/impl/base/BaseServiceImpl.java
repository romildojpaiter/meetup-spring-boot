package com.example.demo.services.impl.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.example.demo.services.base.BaseService;

import paiter.tech.system.domains.base.BaseEntity;

@Transactional
@SuppressWarnings({"unchecked", "rawtypes"})
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}
	
	private Class<T> getParameterizedClass() {
		return (Class<T>)
				   ((ParameterizedType)getClass().getGenericSuperclass())
				      .getActualTypeArguments()[0];
	}
	
	@Override
	public void save(T t) {
		if (t.getId() == null)
			em.persist(t);
		else
			em.merge(t);
	}

	@Override
	public void delete(T entity) {
		em.remove(entity);
	}

	@Override
	public List<T> findAll() {
		List objects = null;
		System.out.println(getParameterizedClass().getName());
        try {
            Query query = em.createQuery("from " + getParameterizedClass().getName());
            objects = query.getResultList();
        } catch (Exception e) {
			e.printStackTrace();
		}
        return objects;
	}

	@Override
	public T findById(Long id) {
		return em.find(getParameterizedClass(), id);
	}

}
