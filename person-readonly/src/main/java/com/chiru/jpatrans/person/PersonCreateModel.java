package com.chiru.jpatrans.person;

import javax.management.RuntimeErrorException;

import lombok.Data;

/**
 * PersonCreateModel
 */
@Data
public class PersonCreateModel {

        private String name;
        private String addressLine;
        private String country;
        private String zipCode;

        public void isValid() {
                if (null == this.name)
                        throw new RuntimeErrorException(null);
        }
}