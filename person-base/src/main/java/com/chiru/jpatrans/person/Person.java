package com.chiru.jpatrans.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}