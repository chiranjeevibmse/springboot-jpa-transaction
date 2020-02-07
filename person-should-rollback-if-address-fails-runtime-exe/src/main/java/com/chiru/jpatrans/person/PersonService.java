package com.chiru.jpatrans.person;

import java.util.List;

import com.chiru.jpatrans.address.AddressModel;
import com.chiru.jpatrans.address.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private IPersonRepo repo;

    @Autowired
    private AddressService addressService;

    @Transactional(propagation = Propagation.REQUIRED)
    public Person createAPerson(PersonCreateModel personModel) {
        Person p = new Person();
        p.setName(personModel.getName());
        Person createdPerson = this.repo.save(p);
        AddressModel add = new AddressModel();
        add.setAddress(personModel.getAddress());
        add.setCity(personModel.getCity());
        add.setState(personModel.getState());
        add.setCountry(personModel.getCountry());
        add.setZipcode(personModel.getZipcode());
        addressService.createAddress(add,createdPerson);
        return createdPerson;
    }

    public Person getPerson(Integer id) {
        return this.repo.findById(id).orElse(null);
    }
   
	public List<Person> getAllPersons() {
		return (List<Person>) this.repo.findAll();
	}
}
