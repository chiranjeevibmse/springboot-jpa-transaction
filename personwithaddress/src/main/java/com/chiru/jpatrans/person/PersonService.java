package com.chiru.jpatrans.person;

import java.util.List;

import com.chiru.jpatrans.address.AddressModel;
import com.chiru.jpatrans.address.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private IPersonRepo repo;

    @Autowired
    private AddressService addressService;

    public Person createAPerson(PersonCreateModel personModel) {
        Person p = new Person();
        p.setName(personModel.getName());
        AddressModel add = new AddressModel();
        add.setAddress(personModel.getAddress());
        add.setCity(personModel.getCity());
        add.setState(personModel.getState());
        add.setCountry(personModel.getCountry());
        add.setZipcode(personModel.getZipcode());
        p.setAddress(addressService.createAddress(add));
        return this.repo.save(p);
    }

    public Person getPerson(Integer id) {
        return this.repo.findById(id).orElse(null);
    }
   
	public List<Person> getAllPersons() {
		return (List<Person>) this.repo.findAll();
	}
}
