/**
 * 
 */
package it.perk.fat20.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.perk.fat20.spring.mvc.model.bean.TestETY;
import it.perk.fat20.spring.mvc.service.concrete.TestSRV;

/**
 * @author Perk
 *
 */
@Controller
@RequestMapping("/controller")
public class TestController {

	@Autowired
	private TestSRV testSrv; 
	
	public String hello() {
		return String.valueOf("Ciao Mondo!!");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TestETY getEntityById(@PathVariable("id") String id) {
		return testSrv.getEntity(id);
	}

	@RequestMapping(value = "/entity", method = RequestMethod.GET)
	@ResponseBody
	public TestETY getEntity() {
		String id = "5";
		return testSrv.getEntity(id);
	}
	
}
