package com.chiru.jpatrans.person;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private IPersonRepo repo;

    @Transactional(readOnly = true)
    public Person createAPerson(PersonCreateModel personModel) {
        Person p = new Person();
        p.setName(personModel.getName());
        return this.repo.save(p);
    }

    public Person getPerson(Integer id) {
        return this.repo.findById(id).orElse(null);
    }
   
	public List<Person> getAllPersons() {
		return (List<Person>) this.repo.findAll();
	}
}
