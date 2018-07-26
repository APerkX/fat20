/**
 * 
 */
package it.perk.fat20.spring.mvc.service.concrete;

import java.util.Date;

import org.springframework.stereotype.Service;

import it.perk.fat20.spring.mvc.model.bean.TestETY;

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
	public TestETY getEntity(String id) {
		TestETY ety = new TestETY("Andrea", "Perquoti", 26, new Date());
		return ety;
	}
	
}
