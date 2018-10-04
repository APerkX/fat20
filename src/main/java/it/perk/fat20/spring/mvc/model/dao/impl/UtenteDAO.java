/**
 * 
 */
package it.perk.fat20.spring.mvc.model.dao.impl;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.perk.fat20.spring.mvc.model.dao.AbstractJpaDAO;
import it.perk.fat20.spring.mvc.model.dao.IUtenteDAO;
import it.perk.fat20.spring.mvc.model.entity.UtenteETY;
import it.perk.fat20.spring.mvc.service.concrete.UtenteSRV;

/**
 * @author Perk
 *
 */
@Repository
public class UtenteDAO extends AbstractJpaDAO<UtenteETY> implements IUtenteDAO {

	/**
	 * Logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(UtenteDAO.class.getName());
	
	
	@Override
	public UtenteETY getByUsername(String username) {
		UtenteETY u = null;
		try {
			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<UtenteETY> cq = cb.createQuery(UtenteETY.class);
			
			Root<UtenteETY> utente = cq.from(UtenteETY.class);
			Predicate userNamePredicate = cb.equal(utente.get("username"), username);
			
			cq.where(userNamePredicate);
			
			TypedQuery<UtenteETY> query = em.createQuery(cq);
			u = query.getSingleResult();

		} catch (Exception e) {
			LOGGER.info("Errore durante il recupero dell'utente Livello Dao : " + e.getMessage().toString());
		}
		
		return u;
	}
	
	@Override
	public void createEntity(UtenteETY entity) {

		try {
			if (entity != null) {
				create(entity);
			}
		} catch (Exception e) {
			LOGGER.info("Errore durante l'inserimento utente Livello Dao : " + e.getMessage().toString());
		}
		
	}

	
	

}
