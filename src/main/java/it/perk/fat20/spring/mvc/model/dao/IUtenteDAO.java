/**
 * 
 */
package it.perk.fat20.spring.mvc.model.dao;

import java.util.List;

import it.perk.fat20.spring.mvc.model.entity.UtenteETY;


/**
 * @author Perk
 *
 */
public interface IUtenteDAO {
	
	UtenteETY getByUsername(final String username);
	
	UtenteETY findById(long id);

    List<UtenteETY> findAll();

    void createEntity(UtenteETY entity);

    UtenteETY update(UtenteETY entity);

    void delete(UtenteETY entity);

    void deleteById(long entityId);

}
