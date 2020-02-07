package com.chiru.jpatrans;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	@DisplayName("Person with Address")
	void testPersonCreate() {
		PersonCreateModel model = new PersonCreateModel();
		model.setName("Chiru");
		model.setAddress("12 , 6th main");
		model.setCity("Bangalore");
		model.setCountry("India");
		model.setState("Karnataka");
		model.setZipcode("560043");
		personService.createAPerson(model);
		assertEquals(personService.getAllPersons().size(),1);
		assertEquals(addressService.getAllAddress().size(),1);
	}

}
