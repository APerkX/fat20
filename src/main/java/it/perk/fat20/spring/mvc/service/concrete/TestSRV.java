/**
 * 
 */
package it.perk.fat20.spring.mvc.service.concrete;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.stereotype.Service;

import it.perk.fat20.spring.mvc.model.entity.TestETY;

/**
 * @author Perk
 *
 */
@Service
public class TestSRV {

	/**
	 * Test di lacio per il controller
	 * 
	 * @param id
	 * @return
	 */
	public Collection<TestETY> getEntity(String id) {
		Collection<TestETY> coll = new ArrayList<>();
		
		coll.add(new TestETY("1", "Andrea", "Andreoni", "26", new Date()));
		coll.add(new TestETY("2", "Fabio", "Antonucci", "26", new Date()));
		coll.add(new TestETY("3", "Valerio", "De Vita", "26", new Date()));
		coll.add(new TestETY("4", "Stefano", "Verdelli", "26", new Date()));
		coll.add(new TestETY("5", "Jacopo", "Tomei", "26", new Date()));

		
		return coll;
	}
	
}
