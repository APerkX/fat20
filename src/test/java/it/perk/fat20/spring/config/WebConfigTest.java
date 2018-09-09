/**
 * 
 */
package it.perk.fat20.spring.config;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author Perk
 *
 */
//@RunWith( SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = WebConfig.class, //TODO:Quando sarà terminata la fase studio andrà inserita anche quella della persistenza
//					  loader = AnnotationConfigContextLoader.class)
public class WebConfigTest {
	
	/*
	 * VEDI: http://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration#overview
	 * punto 4 Test della configurazione: qui si parla di come poter testare una configurazione e nello specifico come caricare le classi adibite a 'Configurazione'. 
	 * Ma dice e mostra che la configurazione della parte Web non è inclusa perchè ha bisogno di essere lanciata in un ServletContext
	 * 
	 * Quindi al momento questa parte rimane sotto studio.
	 * 
	 */

}
