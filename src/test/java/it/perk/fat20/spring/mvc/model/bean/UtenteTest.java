package it.perk.fat20.spring.mvc.model.bean;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//Non funziona, pare per colpa di eclipse. dovrebbe funzionare dalla versione 4.7.3 di eclipse
@DisplayName(value = "UtenteTestPrimo")
class UtenteTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Prima di tutti i metodi");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Prima di ogni metodo");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Dopo ogni metodo");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Dopo tutti i metodi");
	}
	
	@Test
	@DisplayName(value = "PrimoTest")
	void primoTest() {
		System.out.println("Primo metodo di test");
	}
	
	@Test
	@DisplayName(value = "SecondoTest")
	void secondoTest() {
		System.out.println("Secondo metodo di test");
	}
	
}
