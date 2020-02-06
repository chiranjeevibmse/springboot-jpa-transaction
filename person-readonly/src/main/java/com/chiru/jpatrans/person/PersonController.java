package com.chiru.jpatrans.person;

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

    @PostMapping(value="/personReadonly")
    public Person postMethodName(@RequestBody PersonCreateModel personModel) {
        return service.createAPerson(personModel);
    }
    
    
}