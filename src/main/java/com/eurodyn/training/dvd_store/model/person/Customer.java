package com.eurodyn.training.dvd_store.model.person;

import lombok.Data;

@Data
public class Customer extends Person {

    private String username;

    private String address;

    private String phone;
}
