package com.chiru.jpatrans.person;

import javax.management.RuntimeErrorException;

import lombok.Data;

/**
 * PersonCreateModel
 */
@Data
public class PersonCreateModel {

        private String name;
        private String address;
        private String city;
        private String state;
        private String country;
        private String zipcode;
        public void isValid() {
                if (null == this.name)
                        throw new RuntimeErrorException(null);
        }

}