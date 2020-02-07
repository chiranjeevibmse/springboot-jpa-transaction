package com.chiru.jpatrans.address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * IAddressRepo
 */
@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer>{
}