package com.amit.customer_service.services;

import com.amit.customer_service.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImplementation implements UserService{
    // fake service to work as data base
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    @Override
    public Customer addCustomer(Customer newCustomer){
        if(customerList.size()==0){
            customerList.add(newCustomer);
            return newCustomer;
        }

        boolean isPresent = false;
        for(Customer customer: customerList){
            if(customer.getCustomerId().equals(newCustomer.getCustomerId())){
                isPresent = true;
                return null;
            }
        }
        if(!isPresent){
            customerList.add(newCustomer);
            return newCustomer;
        }
//        System.out.println(newCustomer.getCustomerId());
//        System.out.println(customerList.stream().filter(customer -> customer.getCustomerId().equals(newCustomer.getCustomerId())).findAny().get());

//        try {
//            if (customerList.stream().filter(customer -> customer.getCustomerId().equals(newCustomer.getCustomerId())).findAny().get()==null) {
//                customerList.add(newCustomer);
//                System.out.println(newCustomer);
//                return newCustomer;
//            }
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
        return null;
    }

    @Override
    public Customer getCustomer(String id) {

        return customerList.stream().filter(customer -> customer.getCustomerId().equals(id)).findAny().orElseThrow();
        //customerList.stream();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerList;
    }

    @Override
    public Customer deleteCustomer(String id) {
//      Customer toBeDeleted = customerList.stream().filter(customer -> customer.getCustomerId().equals(id)).findAny().orElseThrow();
        Customer toBeDeleted = customerList.stream().filter(customer -> customer.getCustomerId().equals(id)).findAny().get();
        customerList.remove(toBeDeleted);
        return null;
    }

    @Override
    public Customer updateCustomer(Customer updatedCustomer, String id) {
//      System.out.println(updatedCustomer.getCustomerId());
//      System.out.println((customerList.stream().filter(customer -> customer.getCustomerId().equals(id)).findAny().get()));
        int index = customerList.indexOf(customerList.stream().filter(customer -> customer.getCustomerId().equals(id)).findAny().get());
        customerList.set( index, updatedCustomer );
        return updatedCustomer;
    }
}
