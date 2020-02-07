package com.chiru.jpatrans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.chiru.jpatrans.address.AddressService;
import com.chiru.jpatrans.person.PersonCreateModel;
import com.chiru.jpatrans.person.PersonService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonWithAddressApplicationTests {

	@Autowired
	private PersonService personService;
	@Autowired
	private AddressService addressService;
	@Test
	@DisplayName("Person should roll back because address with thow runtime exception")
	void testPersonCreate() {
		PersonCreateModel model = new PersonCreateModel();
		model.setName("Chiru");
		model.setAddress("12 , 6th main");
		model.setCity("Bangalore");
		model.setCountry("India");
		model.setState("Karnataka");
		model.setZipcode("560043");
		assertThrows(RuntimeException.class, ()->personService.createAPerson(model));
		assertEquals(personService.getAllPersons().size(),0);
		assertEquals(addressService.getAllAddress().size(),0);
	}

}
