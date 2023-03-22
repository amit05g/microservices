package com.amit.customer_service.entities;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Account userAccount;
    private String phoneNumber;

    public Customer() {
    }
    public Customer(String customerId, String firstName, String lastName,
                    String email,String phoneNumber){
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Customer(String customerId, String firstName, String lastName,
                    String email,String phoneNumber, Account userAccount
                    ) {

        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userAccount = userAccount;
        this.phoneNumber= phoneNumber;
    }


    // getter and setter

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserAccount(Account userAccount) {
        this.userAccount = userAccount;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
