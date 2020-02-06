package com.chiru.jpatrans.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private IPersonRepo repo;

    public Person createAPerson(PersonCreateModel personModel) {
        Person p = new Person();
        p.setName(personModel.getName());
        return this.repo.save(p);
    }

    public Person getPerson(Integer id) {
        return this.repo.findById(id).orElse(null);
    }
   
	public Iterable<Person> getAllPersons() {
		return this.repo.findAll();
	}
}
