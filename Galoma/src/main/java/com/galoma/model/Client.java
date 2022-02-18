package com.galoma.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {

    private String name;
    private String email;
    private Address address;

    public Client(String name, String email) {
        this(name, email, new Address());
    }

    public Client(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
