package com.Angel;

import java.util.List;

import com.Angel.Customer;

public interface CustomerService {
    List < Customer > getAllCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomerById(long id);
    void deleteCustomerById(long id);
}
