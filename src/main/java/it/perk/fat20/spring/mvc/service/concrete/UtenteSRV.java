/**
 * 
 */
package it.perk.fat20.spring.mvc.service.concrete;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.perk.fat20.spring.mvc.model.dao.IUtenteDAO;
import it.perk.fat20.spring.mvc.model.entity.UtenteETY;
import it.perk.fat20.spring.mvc.service.AbstractSRV;
import it.perk.fat20.spring.mvc.service.IUtenteFacadeSRV;

/**
 * @author Perk
 *
 */
@Service
@Transactional
public class UtenteSRV extends AbstractSRV implements IUtenteFacadeSRV{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7000545873899591244L;
	
	/**
	 * Logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(UtenteSRV.class.getName());
	
	@Autowired
	private IUtenteDAO utenteDao;
	
	
	@Override
	public UtenteETY getByUsername(String username) {
		UtenteETY u = null;
		
		try {
			
			u = utenteDao.getByUsername(username);
			
		} catch (Exception e) {
			LOGGER.info("Errore durante il recupero dell'utente Livello Service : " + e.getMessage().toString());
		}
		
		return u;
	}
	
	@Override
	public void createNewUser(Collection<UtenteETY> entities) {
		
		try {
			if (!entities.isEmpty()) {
				for (UtenteETY entity : entities) {
					utenteDao.createEntity(entity);
				}
			}
			
		} catch (Exception e) {
			LOGGER.info("Errore durante l'inserimento degli utenti Livello Service : " + e.getMessage().toString());
		}
		
	}

}
