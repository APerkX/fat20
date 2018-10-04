/**
 * 
 */
package it.perk.fat20.spring.mvc.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.perk.fat20.spring.mvc.model.entity.TestETY;
import it.perk.fat20.spring.mvc.model.entity.UtenteETY;
import it.perk.fat20.spring.mvc.service.IUtenteFacadeSRV;
import it.perk.fat20.spring.mvc.service.concrete.TestSRV;

/**
 * @author Perk
 *
 */
//Annotazione che permette il consumo di queste api da parte di un client Angular che gira su un differente server (CORS)
//commentare o rimuovere nel caso venga impostato un proxy lato client
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
@RequestMapping("/controller")
public class TestController {

	@Autowired
	private TestSRV testSrv; 
	
	@Autowired
	private IUtenteFacadeSRV utenteSRV;
	
	public String hello() {
		return String.valueOf("Ciao Mondo!!");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TestETY getEntityById(@PathVariable("id") String id) {
//		return testSrv.getEntity(id);
		return new TestETY("5", "Claudio", "Claudioni", id, new Date());
	}

	@RequestMapping(value = "/entity", method = RequestMethod.GET)
	@ResponseBody
	public Collection<TestETY> getEntity() {
		
		return testSrv.getEntity("0");
//		return testSrv.getEntity(id);
	}

	@RequestMapping(value = "/jpa", method = RequestMethod.GET)
	@ResponseBody
	public UtenteETY getJpaEntity() {

		return utenteSRV.getByUsername("andrea.perquoti");
//		return testSrv.getEntity(id);
	}
	
	@RequestMapping(value = "/newuser", method = RequestMethod.GET)
	@ResponseBody
	public void setNewEntity() {
		
		Collection<UtenteETY> u = new ArrayList<>();
		u.add(new UtenteETY(null, "pdfglm76g89h789u", "fabio", "anto", null, null, "test@mail.it", null, "fabio.anto"));
		u.add(new UtenteETY(null, "prqndr92d28h501e", "andrea", "perk", null, null, "test2@mail.it", null, "andrea.perquoti"));
		
		utenteSRV.createNewUser(u);
//		return testSrv.getEntity(id);
	}
	
}
