package com.yogop.wms.customer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(1, "Delmonte"),
            new Customer(2, "Universal Robina"),
            new Customer(3, "San Miguel")
    ));

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(long id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().get();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(long id, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer c =  customers.get(i);
            if (c.getId() == id) {
                customers.set(i, customer);
                return;
            }
        }
    }

    public void deleteCustomer(long id) {
        customers.removeIf(c -> c.getId() == id);
    }
}
