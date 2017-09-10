package com.yogop.wms.customer;

import lombok.Data;

@Data
public class Customer {

    private long id;
    private String name;

    public Customer() {
    }

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
