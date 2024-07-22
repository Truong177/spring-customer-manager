package com.example.customermanager.services;

import com.example.customermanager.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);

    void update(int id, Customer customer);
}
