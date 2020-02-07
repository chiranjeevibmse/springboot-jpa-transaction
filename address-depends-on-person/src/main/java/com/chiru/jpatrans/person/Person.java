package com.chiru.jpatrans.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.chiru.jpatrans.address.Address;

import lombok.Data;

/**
 * Person
 */
@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToOne
    private Address address;
}