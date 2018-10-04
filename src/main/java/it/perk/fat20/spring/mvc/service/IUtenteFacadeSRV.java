package it.perk.fat20.spring.mvc.service;

import java.util.Collection;

import it.perk.fat20.spring.mvc.model.entity.UtenteETY;

/**
 * @author Perk
 *
 */
public interface IUtenteFacadeSRV {
	
	UtenteETY getByUsername(final String username);
	
	public void createNewUser(Collection<UtenteETY> entities);

}
