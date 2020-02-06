package com.chiru.jpatrans.person;

import com.chiru.jpatrans.person.PersonCreateModel;
import com.chiru.jpatrans.person.PersonService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonApplicationTests {

	@Autowired
	private PersonService personService;
	
	@Test
	void testPersonCreate() {
		PersonCreateModel model = new PersonCreateModel();
		model.setName("Chiru");
		personService.createAPerson(model);
	}

}
