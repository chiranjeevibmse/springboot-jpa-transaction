package com.chiru.jpatrans.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PersonApplicationTests {

	@Autowired
	private PersonService personService;
	
	@Test
	@DisplayName("Which should not create person")
	void testPersonCreate() {
		PersonCreateModel model = new PersonCreateModel();
		model.setName("Chiru");
		personService.createAPerson(model);
		assertEquals(personService.getAllPersons().size(),0);
	}
	@Test
	@EnabledOnOs(OS.MAC)
	void testPersonDisabledCreate() {
		PersonCreateModel model = new PersonCreateModel();
		model.setName("Chiru");
		personService.createAPerson(model);
		assertEquals(personService.getAllPersons().size(),0);
	}
}
