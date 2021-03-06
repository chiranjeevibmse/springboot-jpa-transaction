package com.chiru.jpatrans.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.chiru.jpatrans.person.PersonCreateModel;
import com.chiru.jpatrans.person.PersonService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonApplicationTests {

	@Autowired
	private PersonService personService;
	
	@Test
	@DisplayName("Create a Person with name")
	void testPersonCreate() {
		PersonCreateModel model = new PersonCreateModel();
		model.setName("Chiru");
		personService.createAPerson(model);
		assertEquals(personService.getAllPersons().size(),1);
	}

}
