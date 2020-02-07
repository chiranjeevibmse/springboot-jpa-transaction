package com.chiru.jpatrans.address;

import java.util.List;

import com.chiru.jpatrans.person.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AddressService
 */
@Service
public class AddressService {

    @Autowired
    private IAddressRepo repo;

    public Address createAddress(AddressModel address){
        Address ad = new Address();
        ad.setAddress(address.getAddress());
        ad.setCity(address.getCity());
        ad.setCountry(address.getCountry());
        ad.setState(address.getState());
        ad.setZipcode(address.getZipcode());
        return this.repo.save(ad);
    }

	public List<Address> getAllAddress() {
		 return (List<Address>)this.repo.findAll();
	}
    
}