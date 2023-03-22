package com.amit.customer_service.controllers;

import com.amit.customer_service.entities.Account;
import com.amit.customer_service.entities.Customer;
import com.amit.customer_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return this.userService.addCustomer(customer);
    }

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") String customerId){
            //return this.userService.getCustomer(customerId);
            Customer customer = this.userService.getCustomer(customerId);
//           url: (localhost:9001/account/getaccount/id)
            Account acc = this.restTemplate.getForObject("localhost:9001/account/getaccount/1", Account.class);
            customer.setUserAccount(acc);
            return customer;
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomer(){
        return this.userService.getAllCustomer();
    }

    @DeleteMapping("/{customerId}")
    public Customer deleteCustomer(@PathVariable("customerId")String customerId){
        return this.userService.deleteCustomer(customerId);
    }



    @PutMapping("/update/{customerId}")
    public Customer updateCustomer(@PathVariable String customerId,@RequestBody Customer customer){
        return this.userService.updateCustomer(customer,customerId);

    }

}
