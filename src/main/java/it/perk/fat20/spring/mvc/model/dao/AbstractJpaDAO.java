package it.perk.fat20.spring.mvc.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author Perk
 *
 * @param <T>
 */
public abstract class AbstractJpaDAO<T extends Serializable> {
	
	private Class<T> clazz;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public T findById(final long id) {
		return entityManager.find(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("FROM " + clazz.getName()).getResultList();
	}
	
	public void create(final T entity) {
		entityManager.persist(entity);
	}
	
	public T update(final T entity) {
		return entityManager.merge(entity);
	}
	
	public void delete(final T entity) {
		entityManager.remove(entity);
	}
	
	public void deleteById(final long entityId) {
		final T entity = findById(entityId);
		delete(entity);
	}
}
