package com.chiru.jpatrans.address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Address
 */
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private int addressId;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}