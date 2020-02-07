package com.chiru.jpatrans.person;

import javax.management.RuntimeErrorException;

import lombok.Data;

/**
 * PersonCreateModel
 */
@Data
public class PersonCreateModel {

        private String name;

        public void isValid() {
                if (null == this.name)
                        throw new RuntimeErrorException(null);
        }
}