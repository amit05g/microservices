package com.amit.customer_service.entities;
public class Account {
//    private String id;
//    private String accountHolderfirstName;
//    private String getAccountHolderlastName;
//    private double remainingBalance;
//    private String userId;

    private String accountId;
    private double remainingBalance;
    private String customerId;

    public Account(/*String id, double remainingBalance,String userId*/){
//        this.accountId = id;
//        this.customerId = userId;
//        this.remainingBalance = remainingBalance;
    }

    public Account(String accountId, double remainingBalance, String customerId) {
        this.customerId = customerId;
        this.remainingBalance = remainingBalance;
        this.accountId = accountId;
    }
}
