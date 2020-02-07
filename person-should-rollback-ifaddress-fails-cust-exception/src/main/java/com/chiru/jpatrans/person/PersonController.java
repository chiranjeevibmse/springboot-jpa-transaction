package com.chiru.jpatrans.person;

import com.chiru.jpatrans.address.AddressNotCreated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PersonController
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping(value = "/personReadonly")
    public Person postMethodName(@RequestBody PersonCreateModel personModel) throws AddressNotCreated {
        return service.createAPerson(personModel);
    }
    
    
}