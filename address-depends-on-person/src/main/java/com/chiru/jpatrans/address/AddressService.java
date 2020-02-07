package com.chiru.jpatrans.address;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * AddressService
 */
@Service
public class AddressService {

    @Autowired
    private IAddressRepo repo;

    @Transactional(propagation = Propagation.MANDATORY)
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