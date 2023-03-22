package com.amit.customer_service.services;

import com.amit.customer_service.entities.Customer;

import java.util.List;

public interface UserService {


    public Customer getCustomer(String id);
    public List<Customer> getAllCustomer();
//    public Customer addCustomer(String id, String fn, String ln, String em, String ph);
    public Customer addCustomer(Customer customer);
    public Customer deleteCustomer(String id);
    public Customer updateCustomer(Customer customer,String customerId);

}
